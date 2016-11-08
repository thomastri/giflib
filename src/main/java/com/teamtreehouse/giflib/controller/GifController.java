package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by thomas.le on 11/8/2016.
 */

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }
}
