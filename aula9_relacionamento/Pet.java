package aula9_relacionamento;

public class Pet {
    String nome;
    String raca;
    int idade;

    public Pet() {
    }

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir() {
        
        return  "\n-----------------------"+
                "\n    Nome: "+nome+
                "\n    Raca: "+raca+
                "\n    Idade: "+idade;
    }
}
