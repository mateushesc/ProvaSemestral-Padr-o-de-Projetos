public class SistemaCorporativo {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        logger1.log("Sistema iniciado.");

        Logger logger2 = Logger.getInstancia();
        logger2.log("Auditoria: Usuário admin logado.");

        System.out.println("Mesma instância? " + (logger1 == logger2));
    }

    static class Logger {
        private static volatile Logger instancia;

        private Logger() {}

        public static Logger getInstancia() {
            if (instancia == null) {
                synchronized (Logger.class) {
                    if (instancia == null) {
                        instancia = new Logger();
                    }
                }
            }
            return instancia;
        }

        public void log(String mensagem) {
            System.out.println("[LOG]: " + mensagem);
        }
    }
}