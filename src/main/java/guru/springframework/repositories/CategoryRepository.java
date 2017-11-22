package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by ujwal-mac on 11/20/17.
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);;

}
