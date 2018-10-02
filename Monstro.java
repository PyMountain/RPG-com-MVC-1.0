package rpg_jaaj;

public class Monstro extends Ser{
    private int vidaAtual;
    private int forca;
    private int vidaMaxima;
    private int esquiva;
    private TipoElemento tipoElemento;

    public Monstro(int vidaAtual, int forca, int vidaMaxima, int esquiva, TipoElemento tipoElemento, String nome) {
        super(nome);
        this.vidaAtual = vidaAtual;
        this.forca = forca;
        this.vidaMaxima = vidaMaxima;
        this.esquiva = esquiva;
        this.tipoElemento = tipoElemento;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElemento tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }
    
    
}
