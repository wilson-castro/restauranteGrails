package restaurante

class Produto {

    String nome;
    Double preco;
    Estoque estoque

    static hasMany = [clientes:Cliente]

    static belongsTo = [Cliente]

    static constraints = {
    }

    static mapping = {
        table name:"produtos";
        estoque column:"id_estoque"
    }
}
