package desafioObserver;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private List<Observer> observadores = new ArrayList<>();

    public void adicionar(Observer o) {
        observadores.add(o);
    }

    public void remover(Observer o) {
        observadores.remove(o);
    }

    public void notificar(String mensagem, Categoria categoria) {
        for (Observer o : observadores) {
            o.update(mensagem, categoria);
        }
    }
}
