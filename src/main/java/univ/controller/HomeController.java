package univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import univ.trash.Information;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @GetMapping
    public String startPage(ModelMap model) {
        List<Information> list = Arrays.asList(
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997"),
                new Information("mpz-1704","Zavertalyuk Vadym","04.07.1997")
        );
        model.addAttribute("informations", list);
        return "home";
    }
}
