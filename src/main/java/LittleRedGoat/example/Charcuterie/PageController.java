package LittleRedGoat.example.Charcuterie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping
    public String charcuterie(Model model)  {
        model.addAttribute("title", "Charcuterie");
        return "index";
    }
}
//test