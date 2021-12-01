package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Silviu_Titirca on 12/1/2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
