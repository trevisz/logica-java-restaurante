package entidades;

import java.util.List;
import java.util.Objects;

public class Pedido {
    //Atributos e lista
    private String nome;
    List<Item> Itens;

// Enumeracao de estado da entrega
    public enum Estado {
        EmPreparacaoo,
        Entregando,
        Entregue
    }
// construtor vazio
    public Pedido() {
    }
// iniciliaza as propriedades
    public Pedido(String nome, List<Item> itens) {
        this.nome = nome;
        Itens = itens;
    }
// get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return Itens;
    }

    public void setItens(List<Item> itens) {
        Itens = itens;
    }

    // equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(getNome(), pedido.getNome()) && Objects.equals(getItens(), pedido.getItens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getItens());
    }
//toString
    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + nome + '\'' +
                ", Itens=" + Itens +
                '}';
    }
}
