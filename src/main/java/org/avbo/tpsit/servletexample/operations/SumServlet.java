package org.avbo.tpsit.servletexample.operations;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SumServlet
 */
public class SumServlet extends OperationBaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see OperationBaseServlet#OperationBaseServlet()
     */
    public SumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected int executeOp(int op1, int op2) {
		return op1 + op2;
	}

}
