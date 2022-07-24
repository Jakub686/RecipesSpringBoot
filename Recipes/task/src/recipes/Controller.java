package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/api")
public class Controller {

    //Czy to jest Dependencie Injection?  Beanem w tym przypadku jest Object Recipe?
    @Autowired
    RecipeRepository recipeRepository;

//    @GetMapping("/recipe/wholeRecipe/{id}")
//    public Recipe getByIdWholeRecipe(@PathVariable("id") int id) {
//        return recipeRepository.getByIdWholeRecipe(id);
//    }

    @GetMapping("/recipe/{id}")
    public Recipe getById(@PathVariable("id") int id) {
        try {
            return recipeRepository.getById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/recipe/new")
    public Recipe postRecipe(@RequestBody Recipe recipe) {
        recipeRepository.add(recipe);
        return recipe;
    }
}
