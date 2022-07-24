package recipes;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //to mowi springowi zeby stworzyc bean
public class RecipeRepository {

   public List<Recipe> recipes = new ArrayList<>();

   public Recipe getByIdWholeRecipe(int id){
      return recipes.get(id);
   }

   public Recipe getById(int id){
      return recipes.get(id);
   }

   public void add(Recipe recipe){
      recipes.add(recipe);

   }
}