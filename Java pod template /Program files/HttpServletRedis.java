
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import redis.clients.jedis.Jedis;

public class HttpServletRedis extends HttpServlet {
    Jedis jedis = new Jedis();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String key = request.getParameter("key");
        try {
            String ip = jedis.get(key);
        } catch (NullPointerException n) {
            response.getWriter().write("<html><body>invalid key</body></html>");

        }

        response.getWriter().write("<html><body>ip</body></html>");
    }
}
