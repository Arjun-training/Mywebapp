package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req) {
	 * HttpSession session=req.getSession(); String name=req.getParameter("name");
	 * session.setAttribute("name", name); System.out.println("Hi" +name); return
	 * "home"; }
	 */
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name") String
	 * name1) {
	 * 
	 * ModelAndView mv=new ModelAndView(); mv.addObject("name", name1);
	 * mv.setViewName("home"); System.out.println("Hi" +name1); return mv; }
	 */
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		System.out.println("Hi" +alien);
		return mv;
	}

}
 