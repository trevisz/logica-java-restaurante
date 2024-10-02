package entidades;

import java.util.List;
import java.util.Objects;

public class bebida  extends cardapio {
    //Atributos da classe bebida (está extendendo do cardapio)
    private String temperatura;
// construtor vazio
    public bebida() {
    }
// constutor iniciliazando as propriedades
    public bebida(String temperatura) {
        this.temperatura = temperatura;
    }

    public bebida(List<Item> itens, String temperatura) {
        super(itens);
        this.temperatura = temperatura;
    }
// get e set
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
// equals e hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        bebida bebida = (bebida) o;
        return Objects.equals(temperatura, bebida.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperatura);
    }
// toString
    @Override
    public String toString() {
        return
                "Temperatura da bebida: " + temperatura + '\'';
    }
    public bebida setBebida(String nome, String descricao, Double preco, Boolean disponivel, String temperatura, Pedido.Estado estado) {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setDisponivel(disponivel);
        setTemperatura(temperatura);
        setEstado(estado);
        return this;
    }
}
