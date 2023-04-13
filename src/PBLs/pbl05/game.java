
package PBLs.pbl05;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class game{
    public static void main(String[] args){

        ArrayList<jogador> jogadores = new ArrayList<jogador>();
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        boolean sair = false;

        while(!sair){
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Ganhar Pontos");
            System.out.println("3 - Perder Pontos");
            System.out.println("4 - Imprimir jogadores");
            System.out.println("5 - Sair");

            int opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1 - Principiante");
                    System.out.println("2 - Profissional");
                    System.out.println("3 - Senior");

                    int tipo = input.nextInt();

                    System.out.println("Nome: ");

                    String nome = input.next();

                    System.out.println("Score: ");

                    int score = input.nextInt();

                    if(tipo == 1){
                         
                        System.out.println("Bonus: ");

                        double bonus = input.nextDouble();

                        jogadores.add(new principiante(nome, score, bonus));

                        System.out.println("Principiante adicionado com sucesso!");

                        break;
                    }

                    if(tipo == 2){
                        System.out.println("Capital: ");

                        double capital = input.nextDouble();

                        jogadores.add(new profissional(nome, score, capital));

                        System.out.println("Profissional adicionado com sucesso!");

                        break;
                    }

                    if (tipo == 3){

                        System.out.println("Capital: ");

                        double capital = input.nextDouble();

                        System.out.println("Premio: ");

                        double premio = input.nextDouble();

                        jogadores.add(new senior(nome, score, capital, premio));

                        System.out.println("Senior adicionado com sucesso!");

                        break;
                    }
                
                case 2:
                    System.out.println("Nome: ");

                    String nomeGanhar = input.next();

                    System.out.println("Pontos: ");

                    int pontosGanhar = input.nextInt();

                    boolean findWin = false;

                    for(jogador j : jogadores){
                        if(j.getNome().equals(nomeGanhar)){
                            j.ganhar(pontosGanhar);
                            System.out.println("Pontos ganhos");
                            findWin = true;
                        }
                    }

                    if(!findWin){
                        System.out.println("Jogador não encontrado");
                    }

                    break;

                case 3: 
                    System.out.println("Nome: ");

                    String nomePerder = input.next();

                    System.out.println("Pontos: ");

                    int pontosPerder = input.nextInt();

                    boolean findLose = false;

                    for(jogador j : jogadores){
                        if(j.getNome().equals(nomePerder)){
                            j.perder(pontosPerder);
                            System.out.println("Pontos perdidos");
                            findLose = true;
                        }
                    }

                    if(!findLose){
                        System.out.println("Jogador não encontrado");
                    }

                    break;

                case 4:
                    for(jogador j : jogadores){
                        j.Imprimir();
                    }

                    break;

                case 5:
                    sair = true;
                    break;
            }
        }

        input.close();

    }
}


class jogador{
    private String nome;
    protected int score;

    public jogador(String nome, int score){
        this.nome = nome;
        this.score = score;
    }

    //Nome é Privado
    public String getNome(){
        return this.nome;
    }

    public void Imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Score: " + this.score);
    }

    public void ganhar(int p){}
    public void perder(int p){}
}

final class principiante extends jogador{
    private double bonus;

    public principiante(String nome, int score, double bonus){
        super(nome, score);
        this.bonus = bonus;
    }

    @Override
    public void ganhar(int p){
        score += p;
        bonus += p * 0.1;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Bonus: " + this.bonus);
    }

    @Override
    public void perder(int p){
        score -= p;
        bonus -= p * 0.1;
    }

    @Override
    public String getNome(){
        return super.getNome();
    }
}

class profissional extends jogador{
    private double capital;

    public profissional(String nome, int score, double capital){
        super(nome, score);
        this.capital = capital;
    }
    
    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Capital: " + this.capital);
    }

    @Override
    public void ganhar(int p){
        score += p;
        capital += p * 4;
    }

    @Override
    public void perder(int p){
        score -= p;
        capital -= p * 4;
    }

    @Override
    public String getNome(){
        return super.getNome();
    }
}

final class senior extends profissional{
    private double premio;

    public senior(String nome, int score, double capital, double premio){
        super(nome, score, capital);
        this.premio = premio;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Premio: " + this.premio);
    }

    @Override
    public void ganhar(int p){
        super.ganhar(p);
        premio *= 2;
    }

    @Override
    public void perder(int p){
        super.perder(p);
        premio /= 2;
    }

    @Override
    public String getNome(){
        return super.getNome();
    }
}