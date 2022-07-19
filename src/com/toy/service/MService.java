package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
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
