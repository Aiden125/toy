package com.toy.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.toy.Dao.CountDao;

public class ResultService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CountDao dao = CountDao.getInstance();
		dao.countUp();
		String mbti = request.getParameter("mbti");
		request.setAttribute("mbti", mbti);
	}
}
