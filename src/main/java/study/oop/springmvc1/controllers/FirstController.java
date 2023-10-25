package study.oop.springmvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String HelloPage(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("message", name);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String CalculatorPage(@RequestParam(value = "a") int paramA,
                            @RequestParam(value = "b") int paramB,
                            @RequestParam(value = "action") String paramAction,
                            Model model) {
        double result = 0;

        switch (paramAction) {
            case "addition":
                result = paramA + paramB;
                break;
            case "subtraction":
                result = paramA - paramB;
                break;
            case "multiplication":
                result = paramA * paramB;
                break;
            case "division":
                result = paramA / (double)paramB;
                break;
        }
        model.addAttribute("result", result);
        return "first/calculator";
    }
}
