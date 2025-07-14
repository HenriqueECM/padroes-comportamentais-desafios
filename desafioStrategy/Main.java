public class Main {
    public static void main(String[] args) {
        PlanStrategy plano = new PlanPremium();
        Assinatura assinatura = new Assinatura(plano);

        assinatura.mostrarPreco("Premium");
    }
}
