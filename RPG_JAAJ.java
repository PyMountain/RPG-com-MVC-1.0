package rpg_jaaj;

import java.util.ArrayList;
import java.util.List;


public class RPG_JAAJ {

    public static void main(String[] args) {
        Monstro monstro = new Monstro(5, 5, 5, 5, TipoElemento.FOGO, "mateus");
        System.out.println(monstro.getTipoElemento());
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        
        System.out.println(numeros.get(0));
        System.out.println("=====================================");
        printar();
    }
    
    /**
     * metodos exemplos para dar print de um array mostrando o indice
     * de cada elemento
     * @return 
     */
    public static List<Integer> criarArray(){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        return numeros;
    }
    
    public static void printar(){
        List<Integer> arrayTeste = criarArray();
        int contador = 0;
        System.out.println("indice-elemento");
        for(Integer numero: arrayTeste){
            System.out.println(contador + "-      " + numero);
            contador++;
        }
    }
}
