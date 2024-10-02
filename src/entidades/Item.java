package entidades;
// importando tudo que precisamos para usar o código
import java.util.List;
import java.util.Objects;


public class Item {
// propriedades da classe "Item"
    private String nome;
    private String descricao;
    private Double preco;
    private boolean disponivel;
    private Pedido.Estado estado;
// primeiro contrsucto vazio
    public Item() {
    }
// segundo constructor iniciliazando as propriedades
    public Item(String nome, String descricao, Double preco, boolean disponivel, Pedido.Estado estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivel = disponivel;
        this.estado = estado;
    }
// Get e Set das propriedades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Pedido.Estado getEstado() {
        return estado;
    }

    public void setEstado(Pedido.Estado estado) {
        this.estado = estado;
    }
// equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return isDisponivel() == item.isDisponivel() && Objects.equals(getNome(), item.getNome()) && Objects.equals(getDescricao(), item.getDescricao()) && Objects.equals(getPreco(), item.getPreco()) && getEstado() == item.getEstado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getPreco(), isDisponivel(), getEstado());
    }
// toString
    @Override
    public String toString() {
        return "Itens" +
                "\nNome Do Produto: " + nome + '\'' +
                "\nDescrição: " + descricao + '\'' +
                "\nPreço: " + preco + '\'' +
                "\nDisponivel: " + disponivel +
                "\nEstado do pedido:" + estado;
    }
// Método para adicionar os itens
    public Item setItem(String nome, String descricao, Double preco, Boolean disponivel, Pedido.Estado estado) {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setDisponivel(disponivel);
        setEstado(estado);
        return this;
    }
    // método para mostar os itens
    public void mostrarItens(List<Item> itens) {
        double soma = 0.0;
        for (Item item : itens) {

            if (item instanceof comida) {
                System.out.println("Prato Principal: " + ((comida) item).getNome());
            }
            else {
                System.out.println("Nome do produto: " + item.getNome());
            }
            System.out.println("Descrição: " + item.getDescricao());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("Disponivel: " + item.isDisponivel());
            System.out.println("Estado do pedido: " + item.getEstado());

            soma += item.getPreco();

            if (item instanceof bebida) {
                System.out.println("Temperatura da bebida: " + ((bebida) item).getTemperatura());
            }

            if (item instanceof comida) {
                System.out.println("Tempo de espera: " + ((comida) item).getTempoEspera());
            }

            System.out.println();
        }
        System.out.println("Soma total do pedido: " + soma);
    }

}


