package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getAll(){
        return recipeRepository.getAll();
    }

    public List<Recipe> get(){
        return recipeRepository.get();
    }

    public String add(Recipe recipe){
        return recipeRepository.add(recipe);
    }


}
