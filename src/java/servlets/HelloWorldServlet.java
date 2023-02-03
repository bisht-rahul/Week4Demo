package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Person;

/**
 *
 * @author Rahul Bisht
 */
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String firstname = request.getParameter("firstname");
       String lastname = request.getParameter("lastname");
       
      
       
       if (firstname == null || firstname.equals("") || lastname ==null || lastname.equals(""))
       {
           request.setAttribute("firstname", firstname);
           request.setAttribute("lastname", lastname);
           
           request.setAttribute("message", "Invalid Entry. Please enter both your fristname and lastnames.");
           
           getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm,jsp")
                   .forward(request, response);
           
           return;
       }
       
       
       Person person = new Person(firstname, lastname);
       //need to import models.person
       
       request.setAttribute("person", person); //perosn is available for this JSP
       
       
       getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
    }

}
