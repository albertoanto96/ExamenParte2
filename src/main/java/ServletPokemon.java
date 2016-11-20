import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 18/11/2016.
 */
public class ServletPokemon extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("nombre");
        String name = request.getParameter("name");
        Users u= Singleton.getInstance().getInstance().getUser(nombre);
        Pokemon p=new Pokemon(name);
        Singleton.getInstance().addPokemon(u,p);
        response.setContentType("application/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("OK añadido");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("nombre");
        Users u= Singleton.getInstance().getUser(nombre);
        List<Pokemon> mispokemon=Singleton.getInstance().returnPokemon(u);
        List<String> pokemons=new ArrayList<String>();
        for(int i=0;i<mispokemon.size();i++){
            pokemons.add(mispokemon.get(i).name);
        }
        if(mispokemon.size()==0){
            response.setContentType("application/html");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("VACIO");

        }
        else
        {
            String json = new Gson().toJson(pokemons);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }

    }
}
