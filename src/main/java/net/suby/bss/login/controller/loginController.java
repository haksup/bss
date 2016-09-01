package net.suby.bss.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/login/check", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginCheck(HttpServletRequest request, @RequestParam HashMap<String, String> paramMap){
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("ok", "ok222");
		return resultMap;
	}
}
