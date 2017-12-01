package univ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import univ.service.HomeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    private final HomeService homeService;
    private static List<String> list = new ArrayList<>();

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
    public String home() {
        return "weblLab4";
    }

    @GetMapping(value = "/add")
    public String add() {
        return "add";
    }

    @GetMapping(value = "/subtract")
    public String subtract() {
        return "subtract";
    }

    @GetMapping(value = "/multiply")
    public String multiply() {
        return "multiply";
    }

    @GetMapping(value = "/divide")
    public String divide() {
        return "divide";
    }

    @PostMapping(value = "/add")
    public String resultForAdd(@RequestParam("first") Integer first,
                               @RequestParam("second") Integer second,ModelMap model) {
        model.addAttribute("result", first+second);
        return "result";
    }

    @PostMapping(value = "/subtract")
    public String resultForSubtract(@RequestParam("first") Integer first,
                                    @RequestParam("second") Integer second,ModelMap model) {
        model.addAttribute("result", first-second);
        return "result";
    }

    @PostMapping(value = "/multiply")
    public String resultForMultiply(@RequestParam("first") Integer first,
                                    @RequestParam("second") Integer second,ModelMap model) {
        model.addAttribute("result", first*second);
        return "result";
    }

    @PostMapping(value = "/divide")
    public String resultForDivide(@RequestParam("first") Integer first,
                                  @RequestParam("second") Integer second,ModelMap model) {
        model.addAttribute("result", first/second);
        return "result";
    }
    @GetMapping(value = "/massage")
    public String viewChat(ModelMap model){
        model.addAttribute("lists", list);
        return "chat";
    }

    @PostMapping(value = "/massage")
    public String chat(@RequestParam("massage") String massage,ModelMap model){
        list.add(massage);
        model.addAttribute("lists", list);
        return "chat";
    }

    @GetMapping(value = "/date")
    public String getPageForDate() {
        return "date";
    }

    @PostMapping(value = "/date")
    public String getDateForDatePage(ModelMap model) {
        model.addAttribute("date", new Date());
        return "date";
    }
}
