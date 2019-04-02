package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pojo.UserPojo;

@Controller
public class UserController {

	@RequestMapping(value = "/login.do")
	public ModelAndView userLogin(UserPojo userPojo) {
		ModelAndView mv = new ModelAndView();
		if (userPojo.getUserName().equals("admin") && userPojo.getPassword().equals("123456")) {
			mv.addObject("userName", userPojo.getUserName());
			mv.addObject("password", userPojo.getPassword());
			mv.setViewName("welcome");
		}else {
			mv.setViewName("error");
		}
		return mv;
	}
}