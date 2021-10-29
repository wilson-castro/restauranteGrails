package restaurante

class Prato extends Produto {

    Integer quantidadePessoas

    static constraints = {
        quantidadePessoas min: 1;
    }

    static mapping = {
        table name:"pratos";
        discriminator value:"PRATO"
    }
}
