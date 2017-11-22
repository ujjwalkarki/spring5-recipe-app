package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ujwal-mac on 11/20/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
