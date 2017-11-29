package univ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import univ.service.HomeService;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping(value = "/lab1")
    public String labFirst(ModelMap model) {
        model.addAttribute("informations", homeService.getFirstLab());
        return "first";
    }

    @GetMapping(value = "/lab2")
    public String labSecond(ModelMap model) {
        model.addAttribute("informations", homeService.getSecondLab());
        return "second";
    }

    @GetMapping(value = "/lab3")
    public String labThird() {
//        homeService.getThirdLab(email, title, text);
        return "third";
    }

    @GetMapping(value = "/")
    public String home(){
        return "weblLab4";
    }
    @GetMapping(value = "/add")
    public String add(){
        return "add";
    }
    @GetMapping(value = "/subtract")
    public String subtract(){
        return "subtract";
    }
    @GetMapping(value = "/multiply")
    public String multiply(){
        return "multiply";
    }
    @GetMapping(value = "/divide")
    public String divide(){
        return "divide";
    }
}
