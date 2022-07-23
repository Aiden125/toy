package com.toy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.toy.service.MService;
import com.toy.service.ResultService;
import com.toy.service.Service;
import com.toy.service.LodingService;
import com.toy.service.StartService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String comm = uri.substring(conPath.length());
		String pageNumber = comm.substring(5, comm.lastIndexOf("."));
		String result = request.getParameter("mbti");
		Service service = null;
		String viewPage =  null;
		// 시작
		if(comm.equals("/main.do")) {
			service = new StartService();
			service.execute(request, response);
			viewPage = "main.jsp";
		}
		// 페이지1~12로
		else if(comm.equals("/page"+pageNumber+".do")) {
			service = new MService();
			service.execute(request, response);
			viewPage = "page"+pageNumber+".jsp";
		}
		// 결과 로딩 페이지로
		else if(comm.equals("/loding.do")) {
			service = new LodingService();
			service.execute(request, response);
			viewPage = "loding.jsp";
		}
		// 결과 페이지로
		else if(comm.equals("/result.do")) {
			service = new ResultService();
			service.execute(request, response);
			viewPage = "mbti/MBTI.jsp";
		}

				 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
