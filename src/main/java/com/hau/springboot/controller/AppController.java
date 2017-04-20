package com.hau.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hau on 20/04/2017.
 */

@Controller
public class AppController {

    @RequestMapping("/")
    String home(ModelMap modelMap) {
        modelMap.addAttribute("title", "CRUD Example");
        return "index";
    }

    @RequestMapping("/partials/{page}")
    String partialHandler(@PathVariable("page") final String page) {
        return page;
    }
}
