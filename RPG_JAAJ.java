package rpg_jaaj;

public class RPG_JAAJ {

    public static void main(String[] args) {
        Monstro monstro = new Monstro(5, 5, 5, 5, TipoElemento.FOGO, "mateus");
        System.out.println(monstro.getTipoElemento());
    }
    
}
