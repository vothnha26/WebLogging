package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
	    response.setContentType("text/html");
	    PrintWriter printWriter = response.getWriter();
	    String name="";
	    
	    //Nhận cookie
	    Cookie[] cookie = request.getCookies();
	    for (Cookie c: cookie) {
		    if(c.getName().equals("username")) {
		    name = c.getValue();}}
		    if(name.equals("")){
		    //chuyển sang trang LoginServlet
		    response.sendRedirect(request.getContextPath() + "/login");
	    }
		    //hiển thị lên trang bằng đối tượng PrintWriter()
		    printWriter.println("Xin chao " + name);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
