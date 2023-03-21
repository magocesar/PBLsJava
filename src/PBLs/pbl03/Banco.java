package PBLs.pbl03;

public class Banco{
    
    public static void main(String[] args){

        Cliente clienteJ = new Cliente("Jandira Silva", 2500);

        Cliente clienteS = new Cliente("Sandra Rodrigues", 1800);

        Cliente clienteL = new Cliente("Luciana Teixeira", 5000);

        clienteJ.Imprimir();

        clienteS.Imprimir();

        clienteL.Imprimir();

        clienteJ.Retirar(1000);

        clienteJ.Imprimir();

        clienteS.Retirar(2000);

        clienteS.Depositar(500);

        clienteS.Imprimir();

        clienteS.Retirar(2000);

        clienteS.Imprimir();

        clienteL.Depositar(1000);

        clienteL.Imprimir();

    }
}

class Cliente{
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }

    public void Retirar(double valor){
        if((this.saldo - valor) >= 0){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void Imprimir(){
        System.out.println("-=====-");
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nSaldo: R$%.3f", this.saldo);
        System.out.println("\n-=====-");
    }
}
