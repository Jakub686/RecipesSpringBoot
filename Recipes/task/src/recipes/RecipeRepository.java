package recipes;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

   public List<Recipe> recipes = new ArrayList<>();


   public Recipe getById(int id){
      return recipes.get(id);
   }

   public String add(Recipe recipe){
      recipes.add(recipe);
      return "added";
   }
}