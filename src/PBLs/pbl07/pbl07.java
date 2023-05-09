package PBLs.pbl07;

public class pbl07 {
    public static void main(String args[]){

        // Instanciando os personagens
        Batman Batman = new Batman(true, 0, 0, 0, 0);
        JamesBond JamesBond = new JamesBond(true, 0, 0, 0, 0);
        Coringa Coringa = new Coringa(true, 0, 0, 0, 0);
        Pinguim Pinguim = new Pinguim(true, 0, 0, 0, 0);
        Goldfinger Goldfinger = new Goldfinger(true, 0, 0, 0, 0);
        DrNo DrNo = new DrNo(true, 0, 0, 0, 0);

        // Batman
        Batman.atirar();
        Batman.camuflar(1);
        Batman.morrer();

        // JamesBond
        JamesBond.atirar();
        JamesBond.saltar(1);
        JamesBond.morrer();

        // Coringa
        Coringa.atirar();
        Coringa.morrer();

        // Pinguim
        Pinguim.atirar();
        Pinguim.correr(1, 1);
        Pinguim.morrer();

        // Goldfinger
        Goldfinger.saltar(1);
        Goldfinger.camuflar(2);
        Goldfinger.personificar(Batman);
        Pinguim.morrer();

        // DrNo
        DrNo.atirar();
        DrNo.correr(1, 1);
        DrNo.saltar(5);
        DrNo.morrer();

    }
}

//Classe Mãe Personagem
abstract class Personagem{
    private boolean vivo;
    protected float posicao_x;
    protected float posicao_y;
    protected float posicao_z;
    protected int cor;

    //Construtor
    public Personagem(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        this.vivo = vivo;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.posicao_z = posicao_z;
        this.cor = cor;
    }

    //Metodos abstratos
    public abstract void correr();
    public abstract void saltar();
    public abstract void atirar();

    //Metodos
    public void morrer(){
        this.vivo = false;
        System.out.println("Personagem Morreu!");
    }
}

//Classe Abstrata Heroi
abstract class Heroi extends Personagem{

    //Construtor
    public Heroi(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos Vazios
    public void correr(){};
    public void saltar(){};
}

//Classe Batman que implementa a interface camuflagem
class Batman extends Heroi implements camuflagem{

    public Batman(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodo Atirar
    public void atirar(){
        System.out.println("Batman atirando...");
    }

    //Metodo da interface camuflagem
    public void camuflar(int cor){
        this.cor = cor;
        System.out.println("Batman camuflando...");
    }

}

//Classe JamesBond 
class JamesBond extends Heroi{
    
    //Construtor
    public JamesBond(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos
    public void atirar(){
        System.out.println("JamesBond atirando...");
    }

    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("JamesBond saltando...");
    }
}

//Classe abstrata Vilao
abstract class Vilao extends Personagem{

    //Construtor
    public Vilao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos vazios
    public void correr(){};
}

//Classe abstrata Ladrao
abstract class Ladrao extends Vilao{
    
    //Construtor
    public Ladrao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }
    //Metodos vazios
    public void saltar(){};
}

//Classe Coringa
class Coringa extends Ladrao{
    
    //Construtor
    public Coringa(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos
    public void atirar(){
        System.out.println("Coringa atirando...");
    }
}

//Classe Pinguim
class Pinguim extends Ladrao{

    //Construtor
    public Pinguim(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos
    public void atirar(){
        System.out.println("Pinguim atirando...");
    }

    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Pinguim correndo...");
    }
}

//Classe abstrata Terrorista
abstract class Terrorista extends Vilao{
    
    public Terrorista(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void atirar(){};
    public void saltar(){};
}

//Classe Goldfinger que implementa a interface personificacao
class Goldfinger extends Terrorista implements personificacao{
    
        //Atributos
        private Heroi heroi;

        //Construtor
        public Goldfinger(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
            super(vivo, posicao_x, posicao_y, posicao_z, cor);
        }
    
        //Metodos
        public void saltar(float z){
            this.posicao_z = z;
            System.out.println("Goldfinger saltando...");
        }
    
        //Metodos da interface personificacao
        public void personificar(Heroi heroi){
            this.heroi = heroi;
            System.out.println("Goldfinger personificando...");
        }

        public void camuflar(int cor){
            this.cor = cor;
            System.out.println("Goldfinger camuflando...");
        }
}

//Classe DrNo
class DrNo extends Terrorista{

    //Construtor
    public DrNo(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    //Metodos
    public void saltar(float z){
        this.posicao_z = z;
        System.out.println("DrNo saltando...");
    }

    public void atirar(){
        System.out.println("DrNo atirando...");
    }

    public void correr(float x, float y){
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("DrNo correndo...");
    }
}