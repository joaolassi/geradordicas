package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DicasDAO;
import model.Dicas;

/**
 * Servlet implementation class DicasController
 */
@WebServlet("/DicasController")
public class DicasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DicasController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo, subTitulo, autor, dica;
		
		titulo = request.getParameter("titulo");
		subTitulo = request.getParameter("subTitulo");
		autor = request.getParameter("autor");
		dica = request.getParameter("dica");
		
		Dicas dicas = new Dicas(titulo, subTitulo, autor, dica);
		// add no banco de dados
				String opcao = request.getParameter("opcao");
				
		DicasDAO dao;
		
		try {
			dao = new DicasDAO();
			if (opcao.equals("Adicionar")) {
				try {
					boolean inserir = dao.inserir(dicas);
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("dicas", dicas);
		
		RequestDispatcher ir = request.getRequestDispatcher("view/listardicas.jsp");

		ir.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
