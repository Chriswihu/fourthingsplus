package dat.backend.control;

import com.mysql.cj.Session;
import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.Item;
import dat.backend.model.entities.User;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.ItemFacade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "addItem", value = "/additem")
public class addItem extends HttpServlet
{
    private static ConnectionPool connectionPool = ApplicationStart.getConnectionPool();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        String name = request.getParameter("name");
        String username = user.getUsername();

        ItemFacade.addItem(name, username, connectionPool);

        try{
//            int newItemId = ItemFacade.getItems(connectionPool);
            List<Item> itemList = ItemFacade.getItems(connectionPool);
            request.setAttribute("itemList", itemList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request, response);
    }
}
