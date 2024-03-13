package sia.tacos.repositories;

import java.util.Optional;

import sia.tacos.entities.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
