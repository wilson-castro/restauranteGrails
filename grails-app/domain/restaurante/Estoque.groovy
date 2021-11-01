package restaurante

class Estoque {
    
    Integer quantidade;
    Integer quantidadeMinima;

    static belongsTo = [produto:Produto];

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
