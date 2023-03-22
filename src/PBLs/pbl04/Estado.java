package PBLs.pbl04;
import java.util.ArrayList;

public class Estado {
    
    //Cria um ArrayList para armazenar os municípios do estado;
    private ArrayList<Municipio> listMun = new ArrayList<Municipio>();
    
    //Construtor Vazio
    public Estado(){};
    
    //Soma a população de todos os municípios do estado;
    public int populacao(){
        int sum = 0;
        for(int j = 0; j < listMun.size(); j++){
            sum += listMun.get(j).populacao();
        }
        return sum;
    }
    
    //Soma a área de todos os municípios do estado.
    public double area(){
        double sum = 0;
        for(int j = 0; j < listMun.size(); j++){
            sum += listMun.get(j).area();
        }
        return sum;
    }

    //Calcula a densidade do estado chamando as funções anteriores;
    double densidade() { 
        return populacao() / area(); 
    }

    //Método para adicionar municípios no estado;
    public void AddMunicipio(Municipio municipio){
        listMun.add(municipio);
    }

}