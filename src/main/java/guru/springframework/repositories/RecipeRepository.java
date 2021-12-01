package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Silviu_Titirca on 12/1/2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
