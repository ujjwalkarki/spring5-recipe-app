package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by ujwal-mac on 11/21/17.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
