package com.bioseqmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class IndexController {
    @RequestMapping(value={"/","/index"})
    public String index() {
        return "index";
    }
    @RequestMapping("/t1")
    public String t1(Model model){
        model.addAttribute("msg","th:text使用");
        return "thymeleafTest/t1";
    }
    @RequestMapping("/t2")
    public String t2(Model model){
        model.addAttribute("msg","th:text使用");
        model.addAttribute("s1","abcdefg");
        model.addAttribute("s2","AbCdEfG");
        model.addAttribute("s3","abc123");
        return "thymeleafTest/t2";
    }
    @RequestMapping("/t3")
    public String t3(Model model){
        model.addAttribute("now",new Date());
        return "thymeleafTest/t3";
    }
    @RequestMapping("/t4")
    public String t4(Model model){
        model.addAttribute("sex","男");
        model.addAttribute("id",2);
        return "thymeleafTest/t4";
    }
    class User{
        private int id;
        private String username;
        private int age;

        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return this.id;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        public String getUsername() {
            return this.username;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return this.age;
        }

        public User(int id, String username, int age) {
            this.id = id;
            this.username = username;
            this.age = age;
        }
    }
    @RequestMapping("/t5")
    public String t5(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"张三",18));
        list.add(new User(2,"李四",19));
        list.add(new User(3,"王五",20));
        Map<String, User> map = new HashMap<>();
        map.put("u1", new User(1,"张三",20));
        map.put("u2", new User(2,"李四",22));
        map.put("u3", new User(3,"王五",24));
        model.addAttribute("map", map);
        model.addAttribute("list",list);
        return "thymeleafTest/t5";
    }
    @RequestMapping("/t6")
    public String t6(Model model){
        return "thymeleafTest/t6";
    }


}

