package PBLs.pbl06;
import java.util.ArrayList;

public class pbl06 {
    public static void main(String[] args) {
        empresa petrobras = new empresa("Petrobras");

        petrobras.incluir(new concursado("Joao Silva", "Engenheiro Quimico", 1998, 8000.0));

        petrobras.incluir(new comissionado("Carmem Luz",
        "Engenheiro Civil", 2007, 20000.00,
        6000.00, "Diretor Geral"));

        petrobras.incluir(new horista("Manoel de Barros",
        "Auxiliar de Limpeza", 12, 500,
        40.00));

        petrobras.incluir(new mensalista("Tereza Alves",
        "Secretaria", 24, 2500.00));

        petrobras.gerar_folha();
    }   
}

//Classe empresa
class empresa {

    //Atributos
    private String nome;
    private ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();

    //Construtor
    public empresa(String nome){
        this.nome = nome;
    }

    //Chama o método gerar_contra_cheque de cada funcionário
    public void gerar_folha(){
        for(funcionario f : funcionarios){
            System.out.println(f.gerar_contra_cheque());
        }
    }

    //Adiciona um funcionário ao ArrayList funcionarios
    public void incluir(funcionario funcionario){
        funcionarios.add(funcionario);
    }
}

//Classe funcionário
class funcionario{

    //Atributos
    protected String nome;
    protected String funcao;

    //Construtor    
    public funcionario(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }

    //Método que será sobrescrito nas classes filhas
    public String gerar_contra_cheque(){
        return "";
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}

//Classe filha de funcionário
class concursado extends funcionario{
    //Atributos
    protected int ano_ingresso;
    protected double salario_mensal;

    //Construtor
    public concursado(String nome, String funcao, int ano_ingresso, double salario_mensal){
        super(nome, funcao);
        this.ano_ingresso = ano_ingresso;
        this.salario_mensal = salario_mensal;
    }

    //Sobrescreve o método gerar_contra_cheque da classe funcionário, retornando as informações do concursado utilizando concatenação
    @Override
    public String gerar_contra_cheque(){
        //return String.valueOf(salario_mensal);
        return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(funcao) + "\nIngresso: ".concat(String.valueOf(ano_ingresso)) + "\nSalário: ".concat(String.valueOf(salario_mensal)) + "\nValor a Receber: ".concat(String.valueOf(salario_mensal)) + "\n==================================================";
    }

    //Getters e Setters
    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }
}

//Classe filha de concursado
class comissionado extends concursado{
    //Atributos
    private double comissao;
    private String cargo;

    //Construtor
    public comissionado(String nome, String funcao, int ano_ingresso, double salario_mensal, double comissao, String cargo){
        super(nome, funcao, ano_ingresso, salario_mensal);
        this.comissao = comissao;
        this.cargo = cargo;
    }

    //Sobrescreve o método gerar_contra_cheque da classe concursado, retornando as informações do comissionado utilizando concatenação
    @Override   
    public String gerar_contra_cheque(){
        //return String.valueOf(salario_mensal + comissao);
        return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(funcao) + "\nIngresso: ".concat(String.valueOf(ano_ingresso)) + "\nCargo: ".concat(cargo) + "\nSalário Mensal: ".concat(String.valueOf(salario_mensal)) + "\nComissão: ".concat(String.valueOf(comissao)) + "\nValor a Receber: ".concat(String.valueOf(salario_mensal + comissao)) + "\n==================================================";
    }

    public double getComissao() {
        return comissao;
    }

    public String getCargo() {
        return cargo;
    }
}

//Classe filha de concursado
class temporario extends funcionario{
    //Atributo
    protected int tempo_meses;

    //Construtor
    public temporario(String nome, String funcao, int tempo_meses){
        super(nome, funcao);
        this.tempo_meses = tempo_meses;
    }

    //Getters e Setters
    public int getTempo_meses() {
        return tempo_meses;
    }

    public void setTempo_meses(int tempo_meses) {
        this.tempo_meses = tempo_meses;
    }
}

//Classe filha de temporario
class horista extends temporario{
    //Atributos
    private int horas_trabalhadas;
    private double valor_da_hora;

    //Construtor
    public horista(String nome, String funcao, int tempo_meses, int horas_trabalhadas, double valor_da_hora){
        super(nome, funcao, tempo_meses);
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_da_hora = valor_da_hora;
    }

    //Sobrescreve o método gerar_contra_cheque da classe temporario / funcionario, retornando as informações do horista utilizando concatenação
    @Override
    public String gerar_contra_cheque(){
        //return String.valueOf(horas_trabalhadas * valor_da_hora);
        return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(funcao) + "\nTempo em Meses: ".concat(String.valueOf(tempo_meses)) + "\nHoras Trabalhadas: ".concat(String.valueOf(horas_trabalhadas)) + "\nValor da Hora: ".concat(String.valueOf(valor_da_hora)) + "\nValor a Receber: ".concat(String.valueOf(horas_trabalhadas * valor_da_hora)) + "\n==================================================";
    }

    //Getters e Setters
    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public double getValor_da_hora() {
        return valor_da_hora;
    }
}

//Classe filha de temporario
class mensalista extends temporario{
    //Atributo
    private double salario_mensal;

    //Construtor
    public mensalista(String nome, String funcao, int tempo_meses, double salario_mensal){
        super(nome, funcao, tempo_meses);
        this.salario_mensal = salario_mensal;
    }

    //Sobrescreve o método gerar_contra_cheque da classe temporario / funcionario, retornando as informações do mensalista utilizando concatenação
    @Override
    public String gerar_contra_cheque(){
        //return String.valueOf(salario_mensal);
        return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(funcao) + "\nTempo em Meses: ".concat(String.valueOf(tempo_meses)) + "\nSalário Mensal: ".concat(String.valueOf(salario_mensal)) + "\nValor a Receber: ".concat(String.valueOf(salario_mensal)) + "\n==================================================";
    }

    //Getters e Setters
    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }
}