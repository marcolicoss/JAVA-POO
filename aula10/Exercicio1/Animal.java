
package aula10.Exercicio1;


public abstract class Animal {
    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void anda() {
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract String fala();
    
    public String imprimir() {
        return "\nNome: "+nome
                +"\nIdade: "+idade;
    }
}
