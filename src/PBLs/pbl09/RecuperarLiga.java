package PBLs.pbl09;

import java.io.IOException;

public class RecuperarLiga {
    public static void main(String[] args){
        try{
            liga liga = (liga) serializador.ler("liga.ser");
            liga.exibir();
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
