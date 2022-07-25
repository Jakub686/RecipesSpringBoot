package recipes;
//presentation layer
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import java.util.Optional;


@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;


    @PostMapping("/api/recipe/new")
    public ResponseEntity<String> addRecipe(@Valid @RequestBody Recipe recipe) {
        Recipe newRecipe = recipeService.save(new Recipe(
                recipe.getId(), recipe.getName(), recipe.getDescription(),
                recipe.getIngredients(), recipe.getDirections()));
        return new ResponseEntity<>("{\"id\": " + newRecipe.getId() + "}", HttpStatus.OK);

    }

    @GetMapping("/api/recipe/{id}")
    public String getRecipe(@PathVariable long id) {
        if (recipeService.findRecipeById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } else {
            return recipeService.findRecipeById(id).toString();
        }
    }


    @DeleteMapping("/api/recipe/{id}")
    public ResponseEntity<String> deleteRecipe(@PathVariable long id) {
        Optional<Recipe> delRecipe = Optional.ofNullable(recipeService.findRecipeById(id));
        if (delRecipe.isPresent()) {
            recipeService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
