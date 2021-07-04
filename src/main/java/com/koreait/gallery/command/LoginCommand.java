package com.koreait.gallery.command;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.gallery.dao.GalleryDAO;
import com.koreait.gallery.dto.GalleryMember;

public class LoginCommand implements GalleryCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		  Map<String, Object> map  = model.asMap();
		  HttpServletResponse response = (HttpServletResponse) map.get("response");
		  HttpServletRequest request = (HttpServletRequest) map.get("request");
		  GalleryMember member = new GalleryMember();
		  member.setId(request.getParameter("id"));
		  member.setPw(request.getParameter("pw"));
		  
		  GalleryDAO galleryDAO = sqlSession.getMapper(GalleryDAO.class);
		  GalleryMember loginUser =  galleryDAO.login(member);
		  System.out.println(loginUser);
		   
		   
		  response.setContentType("text/html; charset=utf-8");
		   if(loginUser == null) {
			    try {
					response.getWriter().println("<script>");
					response.getWriter().println("alert('회원이 없습니다')");
					response.getWriter().println("location.href='loginPage.do'");
					response.getWriter().println("</script>");
			    } catch (IOException e) {
			    	
			    	e.printStackTrace();
			    }
		   }else {
			  
					request.getSession().setAttribute("loginUser", loginUser);
					try {
						response.getWriter().println("<script>");
						response.getWriter().println("alert('반갑습니다')");
						response.getWriter().println("location.href='selectGalleryList.do'");
						response.getWriter().println("</script>");
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		   }
		   
		   
		   
					
		  
		    
			
	}

}
