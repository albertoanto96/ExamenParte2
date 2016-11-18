/**
 * Created by Alberto on 18/11/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {


        Users u = new Users(1, "Alberto");
        Pokemon p=new Pokemon(1,"eetac");
        Singleton.getInstance().addUser("1", u);
        Singleton.getInstance().addPokemon(u,p);

    }
}