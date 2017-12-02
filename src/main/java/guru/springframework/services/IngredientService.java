package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by ujwal-mac on 12/1/17.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
