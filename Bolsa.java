package rpg_jaaj;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
    private ArrayList<Consumivel> consumiveis;
    
    public Bolsa(){
        consumiveis = new ArrayList<>();
    }
    
    public void addConsumivel(Consumivel consumivel){
        consumiveis.add(consumivel);
    }
    
    public void dellConsumivel(int indice){
        consumiveis.remove(consumiveis.get(indice));
    }
    
    
    /**
     * retorna o list dos consumiveis da bolsa 
     * para fazer print posteriormente
     * @return
     */
    public ArrayList<Consumivel> verConsumiveis(){
        return this.consumiveis;
    }
}
