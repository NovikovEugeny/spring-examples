package by.tc.test.service.impl;

import by.tc.test.entity.Recipe;
import by.tc.test.repository.RecipeRepository;
import by.tc.test.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Recipe findRecipeByCode(String code) {
        return recipeRepository.findRecipeByCode(code);
    }

}