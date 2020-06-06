package com.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ViewController {
    @RequestMapping("{page}")
    public String test(@PathVariable("page") String page){return page;}
    @PostMapping("/userlogin")
    public String userlogin(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,String> map, HttpSession session){
        if("admin".equals(username) && "123456".equals(password)){
            session.setAttribute("username",username);
            map.put("name",username);
            return "redirect:index";
        }else{
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
    @PutMapping("emp/{id}")
    public String putEmp(@PathVariable("id") String id){
        System.out.println(id);
        return "index";
    }
}
