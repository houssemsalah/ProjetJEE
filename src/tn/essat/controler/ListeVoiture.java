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
import tn.essat.model.ModeleVoiture;
import tn.essat.model.Voiture;

/**
 * Servlet implementation class listeVoiture
 */
@WebServlet("/listeVoiture")
public class ListeVoiture extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeVoiture() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGestionDao dao = new GestionDaoImpl();
		List<Voiture> liste1 = dao.getAllVoiture();
		List<ModeleVoiture> liste2 = dao.getAllModeleVoiture();
		request.setAttribute("voit", liste1);
		request.setAttribute("mode", liste2);
		request.getRequestDispatcher("listeVoiture.jsp").forward(request, response);
		
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
