
import java.util.List;
/**
 * Created by Alberto on 18/11/2016.
 */
public interface Interf {

        void addUser(String ID,Users u);
        void addPokemon(Users u, Pokemon p);
        void updateUser(int ID,String name);
        List<Users> returnUsers();
        List<Pokemon> returnPokemon();


    }

