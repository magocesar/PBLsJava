package PBLs.pbl09;

import java.io.Serializable;
import java.util.ArrayList;

public class liga implements Serializable{
    private ArrayList<time> times = new ArrayList<time>();
    
    public void adicionarTime(time time){
        this.times.add(time);
    }

    public void exibir(){
        for(time time : this.times){
            time.exibir();
        }
    }

    
}
