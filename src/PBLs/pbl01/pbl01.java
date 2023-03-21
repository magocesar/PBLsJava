package PBLs.pbl01;
import java.util.Scanner;

public class pbl01{
    public static void main(String[] args){
        

        //Abre o Scanner para o Input do usuário;
        //Recebe o Primeiro Termo (a1), Razão(r) e Número de Termos(n);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Progressão Aritmética\n");

        System.out.print("Digite o valor do primeiro termo da PA: ");

        int a1 = keyboard.nextInt();

        System.out.print("Digite a razão da PA: ");

        int r = keyboard.nextInt();

        System.out.print("Digite o número de termos da PA: ");

        int n = keyboard.nextInt();

        //Calcula o último termo da razão(an) e a soma dos termos(s) seguindo as fórmulas a seguir: 

        int an = a1 + ((n - 1) * r);

        int s = ((a1 + an) * n) / 2;

        //Apresenta o resultado no console;

        System.out.printf("O último termo da PA é: %d \n", an);

        System.out.printf("A soma dos termos da PA é: %d \n", s);

        //Fecha o Scanner;

        keyboard.close();
    

    }
}