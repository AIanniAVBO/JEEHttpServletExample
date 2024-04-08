package org.avbo.tpsit.servletexample.operations;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class OperationBaseServlet
 */
public abstract class OperationBaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationBaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op1, op2;
		if (request.getParameter("op1") != null &&
				request.getParameter("op2") != null){
			try	{
				op1 = Integer.parseInt(request.getParameter("op1"));
				op2 = Integer.parseInt(request.getParameter("op2"));
				
				int result = executeOp(op1, op2);
				
				response.getWriter().append("" + result);
				
				return;
			} catch (Exception e) {
				response.getWriter().append("Parametri inseriti non validi: ");
				e.printStackTrace(response.getWriter());
			}
			
			
		}

		response.getWriter().append("Parametri 'op1' e/o 'op2' non trovati");
	}
	
	protected abstract int executeOp(int op1, int op2);
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
