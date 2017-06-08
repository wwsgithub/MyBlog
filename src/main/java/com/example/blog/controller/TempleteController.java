package com.example.blog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * thymeleaf
 * @author 26046
 *
 */
@Controller  
@RequestMapping("/templates")  
public class TempleteController {  
      
    @RequestMapping("/helloHtml")  
    public String helloHtml(Map<String,Object> map) {  
        map.put("nameKey", "Thymeleaf");  
        return "hello";  
    }  
}  
