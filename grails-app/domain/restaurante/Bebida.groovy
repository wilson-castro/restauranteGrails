package restaurante

class Bebida extends Produto {

    Double liquido;
    String unidade;

    static constraints = {
        liquido min: new Double(0);
        unidade nullable: false, blank: false,
        inList: ["L","mL"];
    }

    static mapping = {
        table name:"bebidas";
        discriminator value:"BEBIDA";
    }
}
