import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 18/11/2016.
 */
public class Users {
    int id;
    String name;
    ArrayList<Pokemon> pokemons =new ArrayList<Pokemon>();
    public Users(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void añadirPokemon(Pokemon p){
        pokemons.add(p);
    }
    public List<Pokemon> returnPokemon(){
        return this.pokemons;
    }

}
