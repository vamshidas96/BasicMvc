package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
@org.springframework.stereotype.Controller
@RequestMapping(value="/")
public class Hello {

@RequestMapping(value="/hi", method = RequestMethod.GET)
	public ModelAndView hi(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String v=request.getParameter("name");
		Map m=new HashMap<>();
		m.put("My", "Hi Mr."+v);
		return new ModelAndView("Hi", m);
	}

}
