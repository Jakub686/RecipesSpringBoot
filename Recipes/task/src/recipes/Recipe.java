package recipes;

//businessLayer

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @NotBlank
    private String name;
    @Column
    @NotBlank
    private String description;
    @Column
    @NotNull
    @Size(min = 1)
    private String[] ingredients;
    @Column
    @NotNull
    @Size(min = 1)
    private String[] directions;

    public String getIngredient() {
        return ingredients.toString();
    }

    public String printArray(String[] arrays) {
        StringBuilder finish = new StringBuilder();
        for (String a:arrays) {
            finish.append("\""+a+"\",");
            finish.append(" ");
        }
        finish.trimToSize();
        finish.deleteCharAt(finish.length()-1);
        finish.deleteCharAt(finish.length()-1);
        return finish.toString();
    }

    @Override
    public String toString() {
        return "{\n" +
                "   \"name\": \""+name+"\",\n" +
                "   \"description\": \""+description+"\",\n" +
                "   \"ingredients\": ["+ printArray(ingredients) +"],\n" +
                "   \"directions\": ["+ printArray(directions) +"]\n" +
                "}";
    }
}