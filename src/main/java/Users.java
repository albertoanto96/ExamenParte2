import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 18/11/2016.
 */
public class Users {
    String name;
    String password;
    ArrayList<Pokemon> pokemons =new ArrayList<Pokemon>();
    public Users(String name,String password){
        this.password=password;
        this.name=name;
    }
    public void añadirPokemon(Pokemon p){
        pokemons.add(p);
    }
    public List<Pokemon> returnPokemon(){
        return this.pokemons;
    }
    public String getName(){return this.name;}
    public String getPassword(){return this.password;}
    public void setName(String name){this.name=name;}
    public int numeroPokemon(){return pokemons.size();}
}
