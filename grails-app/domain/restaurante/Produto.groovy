package restaurante

class Produto {

    String nome;
    Double preco;

    static hasOne = [estoque:Estoque];

    static constraints = {
    }

    static mapping = {
        table name:"produtos";
        estoque column:"id_estoque"
    }
}
