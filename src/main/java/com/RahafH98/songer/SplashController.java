package com.RahafH98.songer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SplashController {
    @GetMapping("/")
    public String splash() {
        return "splash";
    }
}
