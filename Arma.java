package rpg_jaaj;

public class Arma extends Item{
    private int dano;
    
    public Arma(int dano, String nome){
        super(nome);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
}
