package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipesApplication {

    @Autowired
    RecipeRepository recipeRepository;

    public static void main(String[] args) {

        SpringApplication.run(RecipesApplication.class, args);

    }



}
