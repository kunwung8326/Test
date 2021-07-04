package com.koreait.gallery.command;

import java.util.Map;


import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public class LogOutCommand implements GalleryCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		Map<String, Object> map = model.asMap();
		HttpSession session = (HttpSession) map.get("session");
		
		if(session != null) {
			session.invalidate();
			
		}
		

	}

}
