package PBLs.pbl09;

public class CriarTime {
    public static void main(String[] args){
        treinador treinador = new treinador("João");
        String[] jogadores = {"Pedro", "Lucas"};
        time time = new time("Flamengo", treinador, jogadores);

        time.exibir();
        
        try{
            serializador.gravar("time.ser", time);
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

