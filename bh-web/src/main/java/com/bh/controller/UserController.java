package com.bh.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bh.model.User;
import com.bh.service.UserService;

 


@Controller
@RequestMapping("/")
public class UserController{

	
	@Resource
	private UserService  userService;
	
	
   @RequestMapping("index")
   public String index(){
	   System.out.println("jj");
       return "index";
   }
   
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){  
       int state = Integer.parseInt(request.getParameter("state"));  
       String nickname   = request.getParameter("nickname"); 
       User user=new User();
       user.setState(state);
       user.setNickname(nickname);
       int count = this.userService.insertUser(user);
       System.out.println(count);
       return "showUser"; 
   }
}