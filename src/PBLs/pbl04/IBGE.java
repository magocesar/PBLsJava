package PBLs.pbl04;


public class IBGE {
    public static void main(String args[]){
    
        //Criação de Municípios;
        Municipio curitiba = new Municipio(2400, 400);

        Municipio guarapuava = new Municipio( 200, 100);

        Municipio londrina = new Municipio( 800, 300);

        Municipio maringa = new Municipio( 600, 200);

        //Instanciação Vazia;
        Estado parana = new Estado();

        //Adicionando municípios ao estado;
        parana.AddMunicipio(curitiba);

        parana.AddMunicipio(guarapuava);

        parana.AddMunicipio(londrina);

        parana.AddMunicipio(maringa);

        //Criação de municípios;
        Municipio salvador = new Municipio(3000, 400);

        Municipio juazeiro = new Municipio( 400, 100);

        Municipio ilheus = new Municipio(280, 200);

        Municipio itabuna = new Municipio( 320, 300);

        //Instanciação Vazia
        Estado bahia = new Estado();

        bahia.AddMunicipio(salvador);

        bahia.AddMunicipio(juazeiro);

        bahia.AddMunicipio(ilheus);

        bahia.AddMunicipio(itabuna);

        //Instanciação Vazia;
        Pais brasil = new Pais();

        //Adionando estados ao país;
        brasil.addEstado(parana);

        brasil.addEstado(bahia);

        //prints
        System.out.println( curitiba.densidade() ); // quadro 1

        System.out.println( parana.densidade() ); // quadro 3

        System.out.println( bahia.area() ); // quadro 2

        System.out.println( brasil.populacao() ); // quadro 4

        System.out.println( brasil.densidade() ); // quadro 5
        
    }
}