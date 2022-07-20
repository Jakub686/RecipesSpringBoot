package recipes;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

   public List<Recipe> recipes = new ArrayList<>();

   public List<Recipe> getAll(){
      return recipes;
   }

   public List<Recipe> get(){
      return recipes;
   }

   public String add(Recipe recipe){
      recipes.add(recipe);
      return "Successfully added";
   }
}
