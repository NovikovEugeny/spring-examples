package by.tc.test.service;

import by.tc.test.entity.Recipe;

public interface RecipeService {

    Recipe findRecipeByCode(String code);

}