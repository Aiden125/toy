package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		int e = (int)session.getAttribute("E");
		int i = (int)session.getAttribute("I");
		int s = (int)session.getAttribute("S");
		int n = (int)session.getAttribute("N");
		int f = (int)session.getAttribute("F");
		int t = (int)session.getAttribute("T");
		int p = (int)session.getAttribute("P");
		int j = (int)session.getAttribute("J");
		
		String mbti = request.getParameter("mbti");
		if(mbti!=null) {
			if(mbti.equals("E")) {
				session.setAttribute("E", e+1);
			}
			else if(mbti.equals("I")) {
				session.setAttribute("I", i+1);
			}
			else if(mbti.equals("S")) {
				session.setAttribute("S", s+1);
			}
			else if(mbti.equals("N")) {
				session.setAttribute("N", n+1);
			}
			else if(mbti.equals("F")) {
				session.setAttribute("F", f+1);
			}
			else if(mbti.equals("T")) {
				session.setAttribute("T", t+1);
			}
			else if(mbti.equals("P")) {
				session.setAttribute("P", p+1);
			}
			else if(mbti.equals("J")) {
				session.setAttribute("J", j+1);
			}
		}
	}

}
