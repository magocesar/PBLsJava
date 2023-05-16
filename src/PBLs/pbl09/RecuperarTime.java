package PBLs.pbl09;

import java.io.IOException;

public class RecuperarTime {
    public static void main(String[] args){
        try{
            time time = (time) serializador.ler("time.ser");
            time.exibir();
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
