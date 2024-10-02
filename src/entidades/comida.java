package entidades;

import java.time.Instant;
import java.util.Objects;

public class comida extends Item{
    //Atributos da classe comida (extende a classe item)
    private String TempoEspera;

    // construtor vazio
    public comida() {
    }
    // construtor que iniciliaza as propriedades
    public comida(String nome, String descricao, Double preco, boolean disponivel, String tempoEspera, Pedido.Estado estado) {
        super(nome, descricao, preco, disponivel, estado);
        this.TempoEspera = tempoEspera;
    }
// get e set
    public String getTempoEspera() {
        return TempoEspera;
    }

    public void setTempoEspera(String tempoEspera) {
        TempoEspera = tempoEspera;
    }
// equals e hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        comida comida = (comida) o;
        return Objects.equals(getTempoEspera(), comida.getTempoEspera());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTempoEspera());
    }
// toString
    @Override
    public String toString() {
        return "\nPratoPrincipal: " +
                "\nTempo de espera: " + TempoEspera + '\'';
    }
    public comida setComida(String nome, String descricao, Double preco, Boolean disponivel, String tempoEspera, Pedido.Estado estado) {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setDisponivel(disponivel);
        setTempoEspera(tempoEspera);
        setEstado(estado);
        return this;
    }
}
