public class ComandoImprimir implements Comando {
    private Impressora impressora;
    private String documento;

    public ComandoImprimir(Impressora impressora) {
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        impressora.imprimir(documento);
    }

    @Override
    public void cancelar() {
        impressora.cancelarImpressao(documento);
    }
}