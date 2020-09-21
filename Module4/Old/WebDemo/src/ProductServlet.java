import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("productDes");
        float pricce = Float.parseFloat(request.getParameter("listPrice"));
        float discount = Float.parseFloat(request.getParameter("discountPer"));

        float amount = (float) (pricce*discount*0.01);
        float disPrice = pricce - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Display Discount</h1>");
        writer.println("<h3>Product Description: "+product+"</h3>");
        writer.println("<h3>List Price: "+pricce+"</h3>");
        writer.println("<h3>Discount Percent: "+discount+"</h3>");
        writer.println("<h3>Discount Amount: "+amount+"</h3>");
        writer.println("<h3>Discount Price: "+disPrice+"</h3>");
        writer.println("<script type='text/javascript'>a("+product+");</script>");
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
