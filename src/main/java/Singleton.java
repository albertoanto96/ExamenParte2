import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.List;


public class Singleton implements Interf {

    private static Singleton instance;
    private HashMap<String,Users> usuarios;

    final static Logger logger = Logger.getLogger(Singleton.class);

    public  Singleton(){

        usuarios=new HashMap<String,Users>();
        logger.info("se crea hashmap usuarios");

    }
    public  static  Singleton getInstance(){
        if (instance==null) instance=new Singleton();
        return instance;
    }


    public void addUser(String ID, Users u) {

        usuarios.put(ID,u);
        logger.info("se añade usuario");
    }

    public void addPokemon(Users u, Pokemon p) {
        u.añadirPokemon(p);
        logger.info("se añade pokemon");

    }

    public void updateUser(int ID, String name) {

    }

    public List<Users> returnUsers() {
        return null;
    }

    public List<Pokemon> returnPokemon() {
        return null;
    }
}



