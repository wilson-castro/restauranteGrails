package restaurante

class ProdutoController {

    def index() {

        def lista = Produto.list();

        render(view:"/produto/index", model:[produtos:lista])
    }

    def adicionar(){
        Produto novoProduto = new Produto();
        novoProduto.preco =0;
        novoProduto.estoque = new Estoque();
        novoProduto.estoque.quantidade = 0;
        novoProduto.estoque.quantidadeMinima =0;

        render(template:"/produto/form", model:[produto: novoProduto]);
    }

    def salvar(){
        Produto produto = new Produto();
        produto.nome = params.nome;
        produto.preco = params.preco.toDouble();
        produto.estoque = new Estoque();
        produto.estoque.quantidade = params.quantidade.toInteger();
        produto.estoque.quantidadeMinima = params.quantidadeMinima.toInteger();

        produto.estoque.produto = produto
        produto.estoque.save()

        produto.validate()
        if (!produto.hasErrors()){

            produto.save(flush:true);
            render("Salvou com sucesso");
        }else{

            println produto.getErrors();

            render("Ops... deu pau!")
        }
    }
}
