package PBLs.pbl09;

public class treinador implements java.io.Serializable{
    private String nome;

    public void exibir(){
        System.out.println("Nome: " + this.nome);
    }

    public treinador(String nome){
        this.nome = nome;
    }
}
