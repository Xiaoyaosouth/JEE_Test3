package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pojo.Age;
import pojo.Pt;

/**
 * 数据类型转换控制器
 * <p>
 * 用于处理：求几年后的年龄、点对象移动格数
 * <p>
 */
@Controller
public class MyConvertController {

	@RequestMapping(value = "/conv.do")
	public ModelAndView myConvert(Age age, Pt pt) {
		ModelAndView mv = new ModelAndView();
		age.countAge();
		pt.doMove();
		mv.addObject("year", age.getYear());
		mv.addObject("move", pt.getMove());
		mv.addObject("age", age);
		mv.addObject("pt", pt);
		mv.setViewName("conv");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
    public void exceptionHandler(Exception ex,HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException{
		ModelAndView mv = new ModelAndView();
        if(ex.getClass() == ConversionNotSupportedException.class){
        	mv.addObject("exception",ex);
        	request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").include(request, response);
        	mv.setViewName("error");
        }else{
        	mv.addObject("exception",ex);
        	mv.setViewName("error");
        }  
    }  

}
