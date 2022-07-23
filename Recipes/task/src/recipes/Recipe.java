package recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    private int id;
    private String name;
    private String description;
    private String ingredients;
    private String directions;


}
