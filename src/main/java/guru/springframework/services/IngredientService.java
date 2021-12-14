package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author Silviu_Titirca on 12/13/2021
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
