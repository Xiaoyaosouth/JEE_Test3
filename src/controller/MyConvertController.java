package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pojo.Pt;

/**
 * 数据类型转换控制器<p>
 * 用于处理：求几年后的年龄、点对象移动格数<p>
 */
@Controller
public class MyConvertController {
	/**
	@RequestMapping(value="/conv.do", method=RequestMethod.POST)
	public ModelAndView myConvert(int age, Pt pt) {
		ModelAndView mv = new ModelAndView();
		age = age + 10;
		pt.moveThree();
		mv.addObject("age",age);
		mv.addObject("pt",pt);
		mv.setViewName("conv");
		return mv;
	}
	*/
	@RequestMapping(value="/conv.do", method=RequestMethod.POST)
	public ModelAndView myConvert(int age,int year, Pt pt,int move) throws Exception{
		ModelAndView mv = new ModelAndView();
		age = age + year;
		pt.move(move);
		mv.addObject("year",year);
		mv.addObject("move",move);
		mv.addObject("age",age);
		mv.addObject("pt",pt);
		mv.setViewName("conv");
		return mv;
	} 
}
