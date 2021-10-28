package restaurante

class Cliente {

    String nome;
    String email;
    String senha;

    static hasMany = [pedidos:Pedido, produtosPreferidos:Produto]

    static constraints = {
    }
}
