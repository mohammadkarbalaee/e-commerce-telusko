package mohammad.fullstack.ai.ecommercetelusko;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public static String greet() {
        return "Hello World!";
    }
}
