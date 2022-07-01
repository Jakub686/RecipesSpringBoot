package recipes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(method= RequestMethod.GET, path = "/api/recipe")
    public String helloWorld(){
        return "Hello world";
    }
}
