package PBLs.pbl09;

import java.io.*;

public class serializador{
    public static void gravar(String nome_arquivo, Object obj) throws IOException{
        FileOutputStream arquivo = new FileOutputStream(nome_arquivo);
        ObjectOutputStream gravador = new ObjectOutputStream(arquivo);

        gravador.writeObject(obj);

        gravador.close();
        arquivo.close();
    }

    public static Object ler(String nome_arquivo) throws IOException, ClassNotFoundException{
        FileInputStream arquivo = new FileInputStream(nome_arquivo);
        ObjectInputStream restaurador = new ObjectInputStream(arquivo);

        Object object = restaurador.readObject();

        restaurador.close();
        arquivo.close();
        return object;
    }
}