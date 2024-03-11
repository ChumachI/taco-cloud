package sia.tacos.entities;

import java.util.List;

import lombok.Data;
@Data
public class Taco {
    int id;
    List<Ingredient> ingredients;
    
}
