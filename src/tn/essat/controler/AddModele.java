package tn.essat.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tn.essat.dao.GestionDaoImpl;
import tn.essat.dao.IGestionDao;
import tn.essat.model.ModeleVoiture;


/**
 * Servlet implementation class addModele
 */
@WebServlet("/addModele")
public class AddModele extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddModele() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = request.getParameter("titre");
		String climatisation = request.getParameter("climatisation");
		int nbre_places = Integer.parseInt(request.getParameter("nbre_places"));
		String coffre = request.getParameter("coffre");
		String boite = request.getParameter("boite");
		int prix = Integer.parseInt(request.getParameter("prix"));


		IGestionDao dao = new GestionDaoImpl();
		ModeleVoiture m= new ModeleVoiture(titre, climatisation, nbre_places, coffre, boite, prix);
		dao.saveModele(m);
		request.getRequestDispatcher("ListeModele").forward(request, response);
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
