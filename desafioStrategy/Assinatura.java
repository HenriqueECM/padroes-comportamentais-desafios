import java.util.Scanner;

public class Assinatura {
    private PlanStrategy plano;

    public Assinatura(PlanStrategy plano) {
        this.plano = plano;
    }

    public void mostrarPreco(String nomePlano) {
        System.out.printf("Você escolheu o plano: ", nomePlano);
        System.out.printf("O preço do plano é: R$ %.2f", plano.calcularPreco(), " por mês");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlanStrategy plano;
        String nomePlano = "";

        System.out.println("=== Bem-vindo ao sistema de assinatura ===");
        System.out.println("1 - Plano Básico");
        System.out.println("2 - Plano Padrão");
        System.out.println("3 - Plano Premium");
        System.out.println("Escolha o plano:");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                plano = new PlanBasic();
                nomePlano = "Básico";
                break;
            case 2:
                plano = new PlanPadrao();
                nomePlano = "Padrão";
                break;
            case 3:
                plano = new PlanPremium();
                nomePlano = "Premium";
                break;
            default:
                System.out.println("Opção inválida! Tente Novamente.");
                sc.close();
                return;
        }

        Assinatura assinatura = new Assinatura(plano);
        assinatura.mostrarPreco(nomePlano);
    }
}