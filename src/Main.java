import entidades.Item;
import entidades.Pedido;
import entidades.bebida;
import entidades.comida;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

//Importando das entidades
public class Main {
    public static void main(String[] args) {
       //instanciando da classe item

        Item item1 = new Item();
        // no objeto item1 chamando o método setItem e passando suas propriedades
       item1.setItem("X-Burguer", "Delicioso hamburguer com cheedar", 15.00, true, Pedido.Estado.Entregue);
       // no objeto bebida1 chamando o métdo setBebida e passando suas propriedades
       bebida bebida1 = new bebida();
       bebida1.setBebida("Coca Cola", "Bebida feita de cola", 7.00, true, "Gelada", Pedido.Estado.Entregue);
        // no objeto comida1 chamando o métdo setcomida e passando suas propriedades
       comida comida1 = new comida();
       comida1.setComida("Strogonoff", "O Melhor strogonoff de frango da região!",27.00, true, "15 minutos", Pedido.Estado.Entregue);
        // criando um objeto para ter varis outros objetos e adicionando os itens nessa lista
        List<Item> Itens = new ArrayList<>();
        Itens.add(item1);
        Itens.add(bebida1);
        Itens.add(comida1);
        // instanciando pedido da classe pedido, setando nome e passando os itens no método setItens
       Pedido pedido1 = new Pedido();
       pedido1.setNome("Pedidos");
       pedido1.setItens(Itens);

       // criando novo objeto da classe item e chamando método para mostrar os pedidos
       Item mostrarItem = new Item();
       mostrarItem.mostrarItens(Itens);

    }
}
