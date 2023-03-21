package PBLs.pbl02;
import java.util.Locale;
import java.util.Scanner;

public class pbl02 {
    public static void main(String[] args){
        
        //Abre o Scanner;

        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Regra do Trapézio Repetida");

        //Recebe o valor do intervalo [a, b], separando "a" e "b";

        System.out.print("Digite o valor de A: ");

        float a = keyboard.nextFloat();

        System.out.print("Digite o valor de B: ");

        float b  = keyboard.nextFloat();

        //Verifica a condição de existência!

        if(a <= b){

            System.out.print("Digite o valor de N: ");

            int n = keyboard.nextInt();

            //Verifica o número de repetições (n);

            if(n > 0){

                double area_total = 0;

                float x = a;

                float h = (b - a) / n;

                //y1 = f(x);
                //Calcula f(x) segundo a fórmula;

                double y1 = (2 * Math.sin(x)) + (Math.cos(x) / 3);

                int i = 0;

                //Laço(while) para calcular a área das "N" repetições

                while(i < n){

                    x = x + h;

                    //y2 = f(x);
                    //Calcula f(x) segundo a fórmula;

                    double y2 = (2 * Math.sin(x)) + (Math.cos(x) / 3);

                    double area_trapezio = ((y1 + y2) / 2) * h;

                    area_total = area_total + area_trapezio;

                    y1 = y2;

                    i = i + 1;
                }

                System.out.printf("Área Total: %f ", area_total);

            }else{

                System.out.print("Erro: O valor de Repetições deve ser maior que Zero!");

            }

        }else{

            System.out.print("Erro: O valor de n deve ser maior que Zero!");

        }

        //Fecha o Scanner

        keyboard.close();
    }
}

