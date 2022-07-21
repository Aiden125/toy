package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String mbti = request.getParameter("mbti");
		HttpSession session = request.getSession();
		int e = (int)session.getAttribute("E");
		int i = (int)session.getAttribute("I");
		
		if(mbti.equals("E")) {
			session.setAttribute("E", e+1);
		}
//		else if(mbti.equals("I")) {
//			session.setAttribute("I", i+1);
//		}
		int E = (int) session.getAttribute("E");
		int I = (int) session.getAttribute("I");
		int S = (int) session.getAttribute("S");
		int N = (int) session.getAttribute("N");
		int F = (int) session.getAttribute("F");
		int T = (int) session.getAttribute("T");
		int J = (int) session.getAttribute("J");
		int P = (int) session.getAttribute("P");
		
	}

}
