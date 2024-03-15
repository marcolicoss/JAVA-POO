
package aula11.ExercicioPessoa;


public class Funcionario extends Pessoa {
    private int numeroCracha;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public void bonificacao() {
        setSalario(getSalario()*1.1);
    }
    
    @Override
    public String toString() {
        return super.toString()
                +"\nCracha: "+numeroCracha
                +"\nSalario: "+salario;
                
    }
    
    
}
