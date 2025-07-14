package desafioObserver;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();

        Usuario maria = new Usuario(Arrays.asList(Categoria.TECNOLOGIA, Categoria.POLITICA));

        Usuario joao = new Usuario(Arrays.asList(Categoria.ESPORTE));

        canal.adicionar(maria);
        canal.adicionar(joao);

        System.out.println("=== Notificação 1 ===");
        canal.notificar("Nova tecnologia lançada!", Categoria.TECNOLOGIA);

        System.out.println("=== Notificação 2 ===");
        canal.notificar("Time X venceu o campeonato", Categoria.ESPORTE);

        System.out.println("=== Notificação 3 ===");
        canal.notificar("Nova lei foi aprovada", Categoria.POLITICA);
    }
}
