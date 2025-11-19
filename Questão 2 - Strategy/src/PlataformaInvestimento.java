public class PlataformaInvestimento {

    public static void main(String[] args) {
        AnaliseRisco analise = new AnaliseRisco();

        analise.setEstrategia(new ModeloConservador());
        analise.calcular();

        analise.setEstrategia(new ModeloModerado());
        analise.calcular();

        analise.setEstrategia(new ModeloAgressivo());
        analise.calcular();
    }

    interface EstrategiaCalculo {
        void calcularRisco();
    }

    static class ModeloConservador implements EstrategiaCalculo {
        @Override
        public void calcularRisco() {
            System.out.println("Calculando risco: Modelo Conservador (Peso alto em segurança)");
        }
    }

    static class ModeloModerado implements EstrategiaCalculo {
        @Override
        public void calcularRisco() {
            System.out.println("Calculando risco: Modelo Moderado (Equilíbrio entre risco e retorno)");
        }
    }

    static class ModeloAgressivo implements EstrategiaCalculo {
        @Override
        public void calcularRisco() {
            System.out.println("Calculando risco: Modelo Agressivo (Foco em alta rentabilidade)");
        }
    }

    static class AnaliseRisco {
        private EstrategiaCalculo estrategia;

        public void setEstrategia(EstrategiaCalculo estrategia) {
            this.estrategia = estrategia;
        }

        public void calcular() {
            if (estrategia != null) {
                estrategia.calcularRisco();
            }
        }
    }
}