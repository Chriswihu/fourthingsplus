package dat.backend.control;

import dat.backend.model.config.ApplicationStart;
import dat.backend.model.entities.Item;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.ItemFacade;
import org.junit.jupiter.api.Test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebServlet(name = "addItem", value = "/additem")
class addItemTest extends HttpServlet
{
    private static ConnectionPool connectionPool = ApplicationStart.getConnectionPool();


    @Test
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ItemFacade.addItem(request.getParameter("name"), request.getRequestedSessionId(), connectionPool);
        System.out.println(request.getParameter("name"));
        System.out.println(request.getRequestedSessionId());


//        List<Item> itemList = ItemFacade.getItems(connectionPool);
//
//        request.setAttribute("itemList", itemList);
//        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request, response);
    }
}