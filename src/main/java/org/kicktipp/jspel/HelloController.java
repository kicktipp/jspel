package org.kicktipp.jspel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String jsp(ModelMap modelMap) {
        return "hello";
    }
}
