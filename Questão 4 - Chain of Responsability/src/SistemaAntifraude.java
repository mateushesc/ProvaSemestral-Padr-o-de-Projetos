public class SistemaAntifraude {

    public static void main(String[] args) {
        Verificador cadeia = new VerificadorValor();
        cadeia.setProximo(new VerificadorGeo())
              .setProximo(new VerificadorHistorico())
              .setProximo(new VerificadorDispositivo());

        Transacao t1 = new Transacao(5000.0, "BR", true, true);
        System.out.println("Transação 1 Aprovada? " + cadeia.verificar(t1));

        Transacao t2 = new Transacao(15000.0, "BR", true, true);
        System.out.println("Transação 2 Aprovada? " + cadeia.verificar(t2));
    }

    static class Transacao {
        double valor;
        String localizacao;
        boolean historicoBom;
        boolean dispositivoConhecido;

        public Transacao(double valor, String localizacao, boolean historicoBom, boolean dispositivoConhecido) {
            this.valor = valor;
            this.localizacao = localizacao;
            this.historicoBom = historicoBom;
            this.dispositivoConhecido = dispositivoConhecido;
        }
    }

    static abstract class Verificador {
        protected Verificador proximo;

        public Verificador setProximo(Verificador proximo) {
            this.proximo = proximo;
            return proximo;
        }

        protected boolean verificarProximo(Transacao t) {
            if (proximo == null) {
                return true;
            }
            return proximo.verificar(t);
        }

        public abstract boolean verificar(Transacao t);
    }

    static class VerificadorValor extends Verificador {
        @Override
        public boolean verificar(Transacao t) {
            if (t.valor > 10000) {
                return false;
            }
            return verificarProximo(t);
        }
    }

    static class VerificadorGeo extends Verificador {
        @Override
        public boolean verificar(Transacao t) {
            if (!t.localizacao.equals("BR")) {
                return false;
            }
            return verificarProximo(t);
        }
    }

    static class VerificadorHistorico extends Verificador {
        @Override
        public boolean verificar(Transacao t) {
            if (!t.historicoBom) {
                return false;
            }
            return verificarProximo(t);
        }
    }

    static class VerificadorDispositivo extends Verificador {
        @Override
        public boolean verificar(Transacao t) {
            if (!t.dispositivoConhecido) {
                return false;
            }
            return verificarProximo(t);
        }
    }
}