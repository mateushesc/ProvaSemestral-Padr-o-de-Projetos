public class SistemaLogistica {

    public static void main(String[] args) {
        FabricaRelatorio fabrica1 = new FabricaRelatorioDiario();
        Relatorio relatorio1 = fabrica1.criarRelatorio();
        relatorio1.gerar();

        FabricaRelatorio fabrica2 = new FabricaRelatorioSemanal();
        Relatorio relatorio2 = fabrica2.criarRelatorio();
        relatorio2.gerar();
    }

    interface Relatorio {
        void gerar();
    }

    static class RelatorioDiario implements Relatorio {
        @Override
        public void gerar() {
            System.out.println("Gerando Relatório Diário: Análise de fluxo do dia.");
        }
    }

    static class RelatorioSemanal implements Relatorio {
        @Override
        public void gerar() {
            System.out.println("Gerando Relatório Semanal: Consolidação de métricas.");
        }
    }

    interface FabricaRelatorio {
        Relatorio criarRelatorio();
    }

    static class FabricaRelatorioDiario implements FabricaRelatorio {
        @Override
        public Relatorio criarRelatorio() {
            return new RelatorioDiario();
        }
    }

    static class FabricaRelatorioSemanal implements FabricaRelatorio {
        @Override
        public Relatorio criarRelatorio() {
            return new RelatorioSemanal();
        }
    }
}