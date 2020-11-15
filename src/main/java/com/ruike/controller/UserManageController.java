package com.ruike.controller;

import java.util.List;

import com.ruike.utils.MD5Utils;
import com.ruike.utils.MapControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruike.pojo.User;
import com.ruike.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @author 吴泽胜
 * @FileName UseranageController
 * @date 2020-11-11 12:27 下午
 * @Software: IntelliJ IDEA
 */

@Controller
public class UserManageController {
	
	@Autowired
	private UserService userService;
	
	//根据id查找用户，返回Json格式数据
	@RequestMapping("/findUser_{uid}")
	@ResponseBody
	public User getUserById(@PathVariable Integer uid) throws Exception{
		User user = userService.findUserById(uid);
		return user;
	}
	//用户注册
	@RequestMapping("/user/register")
	public String register(User user) throws Exception{
		userService.addUser(user);
		return "admin/success";
	}
	//用户登录
	@RequestMapping("/user/login")
	@ResponseBody
	public Object login(User user, Model model, HttpSession httpSession) throws Exception{
		// 密码加密
		user.setPassword(new MD5Utils().getMD5(user.getPassword()));
		User u = userService.findUserByUsernameAndPassword(user);

		if(u !=null){
			String username = u.getUsername();
			model.addAttribute("username",username);
			httpSession.setAttribute("user", user);
			return MapControl.getInstance().success();
		}else{
			String error = "用户名或密码错误";
			model.addAttribute("user",error);
			return "";
		}
		
	}
	//用户名校验
	@RequestMapping(value = "/checkUsername",method = RequestMethod.POST)
	@ResponseBody
	public User checkUsername(String username) throws Exception{
		User user = userService.findUserByName(username);
		return user;
	}
	//根据用户名模糊查询用户
	@RequestMapping("/searchUser")
	@ResponseBody
	public List<User> findUserByName(String username) throws Exception{
		List<User> userListByName = userService.getUserListByName(username);
		return userListByName;
	}

}
