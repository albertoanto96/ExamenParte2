import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alberto on 18/11/2016.
 */
public class MainTest {
    Users u;
    Pokemon p;
    @Before
    public void setUp() throws Exception {
     u=new Users (1,"alberto");
        p=new Pokemon(1,"eetac");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void main() throws Exception {
    Singleton.getInstance().addUser("1",u);

        Singleton.getInstance().addPokemon(u,p);
    }

}