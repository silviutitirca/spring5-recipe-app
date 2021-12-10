package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author Silviu_Titirca on 12/1/2021
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
