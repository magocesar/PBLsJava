package PBLs.pbl04;
import java.util.ArrayList;

public class Pais{
    
    //Cria um ArrayList com todos os estados do pais;
    private ArrayList<Estado> listEstado = new ArrayList<Estado>();
    
    //Construtor Vazio;
    public Pais(){};
    
    //Soma a população de todos os estados do país;
    public int populacao(){
        int sum = 0;
        for(int j = 0; j < listEstado.size(); j++){
            sum += listEstado.get(j).populacao();
        }
        return sum;
    }
    
    //Soma a área de todos os estados do país;
    public double area(){
        double sum = 0;
        for(int j = 0; j < listEstado.size(); j++){
            sum += listEstado.get(j).area();
        }
        return sum;
    }

    //Soma a área de todos os estados do país;
    public double densidade(){
        return populacao() / area(); 
    }

    //Método para adicionar estados ao país;
    public void addEstado(Estado estado){
        listEstado.add(estado);
    }

}