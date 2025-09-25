package Atividade04;

public class ContaBancaria {
    private float saldo;
    private String nomeCliente;
    private int idConta;

    //setters

    public void setIdConta(int idConta){
        this.idConta = idConta;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;

    }

    //getters

    public int getIdConta() {
        return this.idConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

}
