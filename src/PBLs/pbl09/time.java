package PBLs.pbl09;

public class time implements java.io.Serializable{
    private String nome;
    private treinador treinador;
    private String[] jogadores = new String[2];

    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Treinador: " + this.treinador);
        System.out.println("Jogadores: " + this.jogadores[0] + ", " + this.jogadores[1]);
    }

    public time(String nome, treinador treinador, String[] jogadores){
        this.nome = nome;
        this.treinador = treinador;
        this.jogadores = jogadores;
    }
}
