import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        new PainelControle(sensor);
        new ModuloAlertas(sensor);
        new RegistroHistorico(sensor);

        sensor.setDados(25.0, 60.0, 40);
        sensor.setDados(45.0, 30.0, 120);
    }

    interface Observer {
        void update();
    }

    static class Sensor {
        private List<Observer> observers = new ArrayList<>();
        private double temperatura;
        private double umidade;
        private int poluicao;

        public void attach(Observer observer) {
            observers.add(observer);
        }

        public void setDados(double temperatura, double umidade, int poluicao) {
            this.temperatura = temperatura;
            this.umidade = umidade;
            this.poluicao = poluicao;
            notifyObservers();
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }

        public double getTemperatura() { return temperatura; }
        public double getUmidade() { return umidade; }
        public int getPoluicao() { return poluicao; }
    }

    static class PainelControle implements Observer {
        private Sensor sensor;

        public PainelControle(Sensor sensor) {
            this.sensor = sensor;
            this.sensor.attach(this);
        }

        @Override
        public void update() {
            System.out.println("Painel: Temp " + sensor.getTemperatura() + " | Umid " + sensor.getUmidade() + " | Pol " + sensor.getPoluicao());
        }
    }

    static class ModuloAlertas implements Observer {
        private Sensor sensor;

        public ModuloAlertas(Sensor sensor) {
            this.sensor = sensor;
            this.sensor.attach(this);
        }

        @Override
        public void update() {
            if (sensor.getTemperatura() > 40 || sensor.getPoluicao() > 100) {
                System.out.println("ALERTA: Valores críticos detectados!");
            }
        }
    }

    static class RegistroHistorico implements Observer {
        private Sensor sensor;

        public RegistroHistorico(Sensor sensor) {
            this.sensor = sensor;
            this.sensor.attach(this);
        }

        @Override
        public void update() {
            System.out.println("Histórico: Dados salvos no banco.");
        }
    }
}