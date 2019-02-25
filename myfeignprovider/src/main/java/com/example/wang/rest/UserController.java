package com.example.wang.rest;

import com.example.wang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dell on 2019/2/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(User user , HttpServletRequest request){
        String token=request.getHeader("oauthToken");
        return "hello,"+user.getName() + ";oauthToken:" + token + ";Port:" +request.getServerPort();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser( @RequestBody User user){
        return "hello,"+user.getName();
    }

}
