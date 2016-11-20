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
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("name");
        String password = request.getParameter("password");
        Users u=new Users(nombre,password);
        Singleton.getInstance().addUser(nombre,password);
        response.setContentType("application/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("OK");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nombre = request.getParameter("name");
        String password = request.getParameter("password");
        Users sol= Singleton.getInstance().getUser(nombre);
        String res;
        if (sol.getPassword().equals(password)) {
            res = "Acceso autorizado: " + nombre;
        } else {
            res = "no aceptado";
        }

        response.setContentType("application/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(res);




    }
}
