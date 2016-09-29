package net.suby.bss.login.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.suby.bss.login.dao.UserDataMapper;
import net.suby.bss.login.dao.UserReposiroty;
import net.suby.bss.login.vo.UserVO;

@Controller
public class loginController {
	@Autowired
    private UserReposiroty userReposiroty;

	@Autowired
	private UserDataMapper userDataMapper;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		UserVO userVO = userReposiroty.findByUserId("admin");
		System.out.println("aaa");
		System.out.println(userVO);
		
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("id", "admin");
		HashMap<String, String> hm = userDataMapper.findUserId(hashMap);
		System.out.println("mybatis result " + hm);
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
