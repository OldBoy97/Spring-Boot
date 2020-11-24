package cc.lchao.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World! Spring-Boot!";
    }

    @GetMapping(value = "/say")
    public String say(){
        return "Say Hello World!";
    }

}
