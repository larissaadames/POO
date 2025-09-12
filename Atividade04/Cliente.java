package Atividade04;

public class Cliente {
        private String nome;
        private int idade;
        private String telefone;
        private String email;
        private String CPF;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade( int idade) {
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
            this.CPF = CPF;
        }
}


