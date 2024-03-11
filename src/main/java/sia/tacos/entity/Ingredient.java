package sia.tacos.entity;

import lombok.Data;

@Data
public class Ingredient {
    private final int id;
    private final String name;
    private final Type Type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
