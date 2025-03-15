package org.model;

public class Funcionario {
    private String nome;
    private double salario;
    private int horasTrabalhadas;
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public Funcionario() {
        this.nome = "Daniel C. Silva";
        this.salario = 1000;
        this.horasTrabalhadas = 42;
    }

    public Funcionario(String nome, double salario, int horasTrabalhadas) {
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public double calcularSalarioMensal(){
        return this.salario * this.horasTrabalhadas;
    }
    public double ajustarSalario(double percentual){
        this.salario = this.salario + this.salario * percentual;
        return this.salario;
    }

}
