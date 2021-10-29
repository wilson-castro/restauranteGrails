package restaurante

class Pedido {

    Date dataHora
    Double valorTotal

    Cliente cliente

    static hasMany = [itens:ItemPedido]

    static constraints = {
        valorTotal min: new Double(0);
        cliente nullable: false;
    }

    static mapping = {
        table name:"pedidos";
        cliente column:"id_cliente"
    }
}
