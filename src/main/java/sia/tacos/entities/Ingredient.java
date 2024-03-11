package sia.tacos.entities;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type Type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
