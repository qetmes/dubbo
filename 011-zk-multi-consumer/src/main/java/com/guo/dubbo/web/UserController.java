package com.guo.dubbo.web;


import com.guo.dubbo.model.User;
import com.guo.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id,String username){
        //根据用户标识获取用户
        User user = userService.queryUserById(id,username);
        User user2 = userService2.queryUserById(id,username);
        model.addAttribute("user",user);
        model.addAttribute("user2",user2);
        return "userDetail";
    }


}
