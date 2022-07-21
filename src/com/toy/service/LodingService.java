package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.toy.Dao.CountDao;

public class LodingService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CountDao dao = CountDao.getInstance();
		dao.countUp();
		
		String a,b,c,d,mbtiResult;
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
			if(mbti.equals("P")) {
				session.setAttribute("P", p+1);
			}
			else if(mbti.equals("J")) {
				session.setAttribute("J", j+1);
			}
		}
		
		// E/I?
		if(e>i) {
			a = "E";
		}else {
			a = "I";
		}
		
		// S/N?
		if(s>n) {
			b = "S";
		}else {
			b = "N";
		}
		
		// F/T?
		if(f>t) {
			c = "F";
		}else {
			c = "T";
		}
		
		// P/J?
		if(p>j) {
			d = "P";
		}else {
			d = "J";
		}
		
		mbtiResult = a+b+c+d;
		request.setAttribute("mbtiResult", mbtiResult);
	}
}
