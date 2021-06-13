package tn.essat.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essat.dao.GestionDaoImpl;
import tn.essat.dao.IGestionDao;
import tn.essat.model.Reservation;

/**
 * Servlet implementation class ListeReservation
 */
@WebServlet("/ListeReservation")
public class ListeReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		IGestionDao dao = new GestionDaoImpl();
		List<Reservation> liste1 = dao.getAllReservationByVoitureId(id);
		List<Reservation> liste2 = dao.getAllReservationByUserID(id);
		List<Reservation> liste3 = dao.getAllReservation();
		request.setAttribute("resv", liste1);
		request.setAttribute("resu", liste2);
		request.setAttribute("res", liste3);
		request.getRequestDispatcher("listeReservation.jsp").forward(request, response);

		
		
		
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
