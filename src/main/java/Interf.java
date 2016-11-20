
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Alberto on 18/11/2016.
 */
public interface Interf {

        void addUser(String nombre,String password);
        Users getUser(String nombre);
        void addPokemon(Users u, Pokemon p);
        void updateUser(String name,String newname);
        String infoUsuario(String nombre);
        List<Pokemon> returnPokemon(Users u);
        ArrayList<Users> listaUsuarios();


}

