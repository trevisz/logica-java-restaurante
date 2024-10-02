package entidades;

import java.util.List;
import java.util.Objects;

public class cardapio extends Item{
    //lista de itens
    private List<Item> itens;
//métodos de adicionar e remover itens da lista
    public void adicionarItem(Item item){
        itens.add(item);
    }
    public void removerItem(Item item){
        itens.remove(item);
    }
// construtor vazio
    public cardapio() {
    }

    public cardapio(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
// equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cardapio cardapio = (cardapio) o;
        return Objects.equals(itens, cardapio.itens);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(itens);
    }

    //toString
    @Override
    public String toString() {
        return "cardapio{" +
                "itens=" + itens +
                '}';
    }
}