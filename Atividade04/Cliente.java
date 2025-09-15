package Atividade04;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private String email;


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
        if(idade < 18){
            System.out.println("nao pode ser um menor de idade");
        }
        else{
            this.idade = idade;
        }
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCPF(String CPF) {
        this.cpf = cpf;
    }


    //getters
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }


}
