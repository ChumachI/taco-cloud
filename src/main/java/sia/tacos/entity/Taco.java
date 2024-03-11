package sia.tacos.entity;

import java.util.List;

import lombok.Data;
@Data
public class Taco {
    int id;
    List<Ingredient> ingredients;
    
}
