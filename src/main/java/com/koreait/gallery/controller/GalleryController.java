package com.koreait.gallery.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.koreait.gallery.command.JoinCommand;
import com.koreait.gallery.command.LeaveCommand;
import com.koreait.gallery.command.LoginCommand;

@Controller
public class GalleryController {
	
	private SqlSession sqlSession;
	private JoinCommand joinCommand;
	private LoginCommand loginCommand;
	private LeaveCommand leaveCommand;
	
	@Autowired
	public GalleryController(SqlSession sqlSession, 
							 JoinCommand joinCommand,
							 LoginCommand loginCommand,
							 LeaveCommand leaveCommand) {
		super();
		this.sqlSession = sqlSession;
		this.joinCommand = joinCommand;
		this.loginCommand = loginCommand;
		this.leaveCommand = leaveCommand;
	}
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	 @GetMapping(value="selectGalleryList.do")
	 public String list() {
		 return "gallery/list";
	 }
	 
	 @GetMapping(value="loginPage.do")
	 public String loginPage() {
		 return "member/login";
	 }
	 @PostMapping(value="login.do")
	 public void login(HttpServletRequest request,
			 			 HttpServletResponse response,
			 			 Model model) {
		 
		 model.addAttribute("request",request);
		 model.addAttribute("response",response);
		 loginCommand.execute(sqlSession, model);
	 }
	 @GetMapping(value="joinPage.do")
	 public String joinPage() {
		 return "member/join";
	 }
	 
	 @PostMapping(value="join.do")
	 public String join(HttpServletRequest request, Model model) {
		 model.addAttribute("request", request);
	     joinCommand.execute(sqlSession, model);
		 return "redirect:loginPage.do";
	 }
	 
	 @GetMapping(value="leave.do")
	 public void leave(HttpSession session,
			 			 HttpServletResponse response,
			 			 Model model) {
		 model.addAttribute("session",session);
		 model.addAttribute("response",response);
		 leaveCommand.execute(sqlSession, model);
		 //return "redirect:selectGalleryList.do";
	 }
	 @GetMapping(value="logOut.do")
	 public String logOut(HttpSession session, 
			 			  Model model) {
		 model.addAttribute("session",session);
		 return "redirect:loginPage.do";
	 }
	 @GetMapping(value="uploadPage.do")
	 public String uploadPage() {
		 return "gallery/view";
	 }
	 @GetMapping(value="insertPage.do")
	 public String insertPage() {
		 return "gallery/insert";
	 }
	}
