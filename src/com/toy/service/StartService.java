package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.toy.Dao.CountDao;

public class StartService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.setAttribute("E", 0);
		session.setAttribute("I", 0);
		session.setAttribute("S", 0);
		session.setAttribute("N", 0);
		session.setAttribute("F", 0);
		session.setAttribute("T", 0);
		session.setAttribute("P", 0);
		session.setAttribute("J", 0);
		
		CountDao dao = CountDao.getInstance();
		request.setAttribute("count", dao.count());
	}
}
