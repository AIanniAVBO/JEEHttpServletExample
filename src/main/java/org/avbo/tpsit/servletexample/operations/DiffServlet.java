package org.avbo.tpsit.servletexample.operations;

import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class diff
 */
public class DiffServlet extends OperationBaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see OperationBaseServlet#OperationBaseServlet()
     */
    public DiffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected int executeOp(int op1, int op2) {
		return op1 - op2;
	}

}
