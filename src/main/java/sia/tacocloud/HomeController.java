package sia.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class HomeController {

    public String message = "TEST MESSAGE";

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
