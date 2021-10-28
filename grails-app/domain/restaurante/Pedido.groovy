package restaurante

class Pedido {

    Date dataHora
    Double valorTotal

    Cliente cliente

    static constraints = {
    }

    static mapping = {
        cliente column:"id_cliente"
    }
}
