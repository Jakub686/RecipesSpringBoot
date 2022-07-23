package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    Recipe recipe;

    @GetMapping("/recipe/{id}")
    public Recipe getById(@PathVariable("id") int id) {
        return recipe.getById(id);
    }

    @PostMapping("/recipe/new")
    public void postRecipe(@RequestBody Recipe recipe) {
        this.recipe = recipe;
    }
}
