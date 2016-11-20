import org.apache.log4j.Logger;

import java.util.ArrayList;
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


    public void addUser(String nombre,String password) {
        Users u=new Users(nombre,password);
        usuarios.put(nombre,u);
        logger.info("se añade usuario: "+nombre);
    }

    public Users getUser(String nombre) {
        return usuarios.get(nombre);
    }

    public void addPokemon(Users u, Pokemon p) {
        usuarios.get(u.getName()).añadirPokemon(p);
        logger.info("se añade etakemon: "+ p.getName()+" al usuario: "+u.getName());

    }

    public void updateUser(String name, String newname) {

        Users u=usuarios.get(name);
        u.setName(newname);
        usuarios.remove(name);
        usuarios.put(newname,u);
        logger.info("nombre del usuario: "+name+" cambiado a: "+newname);
    }

    public String infoUsuario(String nombre) {

        int i=usuarios.get(nombre).numeroPokemon();
        String sol= "tiene "+i+" pokemon";
        logger.info(sol);
        return sol;

    }

    public List<Pokemon> returnPokemon(Users u) {
        logger.info("Se devuelve la lista de pokemon del usuario: "+u.getName());
        return usuarios.get(u.getName()).returnPokemon() ;
    }
    public ArrayList<Users> listaUsuarios(){
        ArrayList<Users> us=new ArrayList<Users>();
        int i=0;
        for (String key: usuarios.keySet()) {
            us.add(usuarios.get(key));
            i++;
        }
        logger.info("Se devuelven "+i+ " usuarios");
        return us;
    }
}



