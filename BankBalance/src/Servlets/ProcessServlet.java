package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BankBalanceLookup.Customer;
import BankBalanceLookup.CustomerSimpleMap;

/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/ProcessServlet")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerSimpleMap cusMap = new CustomerSimpleMap();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = (String)request.getParameter("customerid");
		
		Customer cus = cusMap.findCustomer(id);
		
		if(cus == null){
			//unknown customer
			getServletContext().getRequestDispatcher("/unknown.jsp").forward(request, response);
			
		}else{//exising customer
			request.setAttribute("cus", cus);
			
			double bal = cus.getBalance();
			if(bal < 0){
				//negative balance
				getServletContext().getRequestDispatcher("/negativebalance.jsp").forward(request, response);
				
			}else if (bal > 10000){
				//high balance
				getServletContext().getRequestDispatcher("/highbalance.jsp").forward(request, response);
				
			}else{
				//regular balance
				getServletContext().getRequestDispatcher("/regularbalance.jsp").forward(request, response);
			}
			
		}
	}

}
