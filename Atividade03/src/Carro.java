public class Carro {
    private String modelo;
    private int ano;
    private String motor;
    private String cor;

    public Carro(){
        this.modelo = "modelo";
        this.ano = 0000;
        this.motor = "motor";
        this.cor = "cor";
    }

    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getMotor() {
        return motor;
    }
    public void setAno(int ano) {
        if (ano < 2000);
        System.out.println("apenas carros depois de 2000");
        this.ano = ano;
    }
    public void setCor(String cor) {
        if (cor != "preto"){
            System.out.println("apenas carros pretos");
        }
        this.cor = cor;
    }
}
