package com.koreait.gallery.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.gallery.dao.GalleryDAO;
import com.koreait.gallery.dto.GalleryMember;


public class JoinCommand implements GalleryCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model ) {
		
		  Map<String, Object> map  = model.asMap();
		  HttpServletRequest request = (HttpServletRequest) map.get("request");
		  
		  String id = request.getParameter("id");
		  String pw = request.getParameter("pw");
		  String name = request.getParameter("name");
		  String addr = request.getParameter("addr");
		  String phone = request.getParameter("phone");
		  String email = request.getParameter("email");
		  
		  GalleryMember member = new GalleryMember();
		  member.setId(id);
		  member.setPw(pw);
		  member.setName(name);
		  member.setAddr(addr);
		  member.setPhone(phone);
		  member.setEmail(email);
		  
		  System.out.println(member);
		  
		  GalleryDAO galleryDAO  = sqlSession.getMapper(GalleryDAO.class);
		  
		  int count = galleryDAO.join(member);
		
//		  if (count > 0) {
//				HttpSession session = request.getSession();
//				GalleryMember loginUser = (Member)session.getAttribute("loginUser");
//				loginUser.setName(name);
//				loginUser.setEmail(email);
//			}
//			
		  
		  

	}

}
