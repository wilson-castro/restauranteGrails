package restaurante

class Estoque {

    Integer quantidade;
    Integer quantidadeMinima;
    Produto produto;

    static constraints = {
    }

    static mapping = {
        table name:"estoques";
        produto column:"id_produto"
    }
}
