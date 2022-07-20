package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    Recipe recipe;

    @GetMapping("/recipe")
    public Recipe getRecipe() {
        return recipe;
    }

    @PostMapping("/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        this.recipe = recipe;
    }
}
