package PBLs.pbl09;

import java.io.IOException;

public class CriarLiga {
    public static void main(String[] args){
        liga liga = new liga();
        time Flamengo = new time("Flamengo", new treinador("João"), new String[]{"Pedro", "Lucas"});
        time Vasco = new time("Vasco", new treinador("José"), new String[]{"João", "Lucas"});
        time Botafogo = new time("Botafogo", new treinador("Pedro"), new String[]{"João", "José"});

        liga.adicionarTime(Flamengo);
        liga.adicionarTime(Vasco);
        liga.adicionarTime(Botafogo);

        liga.exibir();

        try{
            serializador.gravar("liga.ser", liga);
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(ClassCastException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
