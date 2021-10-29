package restaurante

class Estoque {
    
    Integer quantidade;
    Integer quantidadeMinima;
    Produto produto;

    static belongsTo = [Produto];

    static constraints = {
        quantidade min: 0;
        quantidadeMinima min:0;
        produto nullable: false;
    }

    static mapping = {
        table name:"estoques";
        produto column:"id_produto"
    }
}
