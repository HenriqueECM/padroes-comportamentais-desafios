public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        ComandoImprimir comando = new ComandoImprimir(impressora);

        // Define o documento a ser impresso
        comando.setDocumento("RelatórioFinal.pdf");

        System.out.println("=== Executando comando ===");
        comando.executar();

        System.out.println("=== Desfazendo comando ===");
        comando.desfazer();
    }
}
