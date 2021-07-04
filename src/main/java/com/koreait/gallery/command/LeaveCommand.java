package com.koreait.gallery.command;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.gallery.dao.GalleryDAO;
import com.koreait.gallery.dto.GalleryMember;



public class LeaveCommand implements GalleryCommand {

	@Override
	public void execute(SqlSession Session, Model model)  {
	      Map<String, Object> map  = model.asMap();
	      HttpSession session = (HttpSession) map.get("session");
	      HttpServletResponse response = (HttpServletResponse) map.get("response");
	      
	      long no = ((GalleryMember)session.getAttribute("loginUser")).getNo();
	      
	      GalleryDAO galleryDAO = Session.getMapper(GalleryDAO.class);
	      int count = galleryDAO.leave(no);
	      
	      if(count != 0) {
	    	  try {
	    		    response.setCharacterEncoding("text/html; charset=utf-8");
	    		    response.getWriter().println("<script>");
					response.getWriter().println("alert('삭제 되었습니다.')");
					response.getWriter().println("location.href='loginPage.do'");
					response.getWriter().println("</script>");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  session.invalidate();
	    	  
	      }else {
	    	  try {
	    		response.setCharacterEncoding("text/html; charset=utf-8");
				response.getWriter().println("<script>");
				response.getWriter().println("alert('삭제 되지 않았습니다.')");
				response.getWriter().println("location.href='selectGalleryList.do'");
				response.getWriter().println("</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	}

}
