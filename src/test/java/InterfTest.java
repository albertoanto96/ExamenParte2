import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alberto on 19/11/2016.
 */
public class InterfTest {
    Users u;
    Pokemon p;
    Users un;
    @Before
    public void setUp() throws Exception {
        p=new Pokemon("eetac");
        u=new Users ("alberto","123");
        un=new Users("berto","123");
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testGlobal() throws Exception{
        Singleton.getInstance().addUser("alberto","123");
        Singleton.getInstance().addPokemon(u,p);
        Singleton.getInstance().updateUser("alberto","berto");
        Singleton.getInstance().listaUsuarios();
        Singleton.getInstance().returnPokemon(un);
        Singleton.getInstance().infoUsuario("berto");
    }

}