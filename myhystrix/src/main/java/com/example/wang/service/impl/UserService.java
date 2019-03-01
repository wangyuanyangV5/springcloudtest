package com.example.wang.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2019/2/25.
 */
@Service
public class UserService {

    @HystrixCommand(fallbackMethod = "")
    public String getUser(String username) throws Exception{
        if(username.equals("spring")){
            return "this is real user";
        }else {
           throw new Exception();
        }
    }


    public String defalutUser(String userName){
        return "The user does not exist in this system";
    }

}
