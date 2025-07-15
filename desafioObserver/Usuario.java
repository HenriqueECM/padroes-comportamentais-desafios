package desafioObserver;

import java.util.List;

public class Usuario implements Observer {
    private List<Categoria> categorias;

    public Usuario(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public void update(String mensagem, Categoria categoria) {
        if (categorias.contains(categoria)) {
            System.out.println("Mensagem recebida da categoria " + categoria + ": " + mensagem);
        }
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
