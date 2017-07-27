package by.tc.test.repository;

import by.tc.test.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {

    Recipe findRecipeByCode(String code);

}