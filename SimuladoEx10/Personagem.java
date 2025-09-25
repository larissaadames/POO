package SimuladoEx10;

public class Personagem {
    private String nome;
    private int vida;
    private float posX;
    private float posY;

    public Personagem(String nome, int vida, float posX, float posY) {
        this.nome = nome;
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
    }
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.posX = 50.5f;
        this.posY = 80.5f;
    }

    public void addPosX(float incremento) {
        posX += incremento;
    }
    public void addPosY(float incremento) {
        posY += incremento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }
    public void addPosX(float incremento) {
        posX += incremento;
    }
    public void addPosY(float incremento) {
        posY += incremento;
    }

}
