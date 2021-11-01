package restaurante

class ProdutoController {

    def index() {

        def lista = Produto.list()

        render(view:"/produto/index", model:[produtos:lista])
    }

    def adicionar(){
        Produto novoProduto = new Produto()
        novoProduto.preco =0
        novoProduto.estoque = new Estoque()
        novoProduto.estoque.quantidade = 0
        novoProduto.estoque.quantidadeMinima =0

        render(template:"/produto/form", model:[produto: novoProduto])
    }

    def alterar(){
        Produto produto = Produto.get(params.id)
        render(template:"/produto/form", model:[produto: produto])
    }

    def lista(){
        def lista = Produto.list()
        render(template:"/produto/lista", model:[produtos: lista])
    }

    def salvar(){
        Produto produto = null
        Estoque estoque = null
        if(params.id){
            produto = Produto.get(params.id)
            estoque = produto.estoque
        }else{
            produto = new Produto()
            estoque = new Estoque()
        }

        produto.nome = params.nome
        produto.preco = params.preco.toDouble()

        estoque.quantidade = params.quantidade.toInteger()
        estoque.quantidadeMinima = params.quantidadeMinima.toInteger()

        produto.estoque = estoque

        produto.estoque.produto = produto
        produto.estoque.save(flush:true)

        produto.validate()
        if (!produto.hasErrors()){

            //permitir o failonError
            produto.save(flush:true)
            render("Salvou com sucesso")
        }else{

            produto.errors.allErrors.each {
                println it
            }

            render("Ops... deu pau!")
        }
    }

    def excluir(){
        Produto produto = Produto.get(params.id)
        produto.delete(flush:true)

        def lista = Produto.list()
        render(template:"/produto/lista", model:[produtos: lista])

    }
}
