public class ComandoImprimir implements Comando {
    private Impressora impressora;
    private String documento;

    public ComandoImprimir(Impressora impressora) {
        this.impressora = impressora;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void executar() {
        impressora.imprimir(documento);
    }
    
    public void desfazer() {
        impressora.cancelarImpressao(documento);
    }
}