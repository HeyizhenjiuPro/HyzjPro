package com.nancdx.hyzj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Try {

    @RequestMapping(value = "/{pageName2}")
    public ModelAndView toPage(@PathVariable("pageName2") String pageName2) {
        ModelAndView mv = new ModelAndView(pageName2);
        return mv;
    }
}
