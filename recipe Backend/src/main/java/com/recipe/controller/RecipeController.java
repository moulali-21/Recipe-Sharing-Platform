package com.recipe.controller;

import com.recipe.entites.Recipe;
import com.recipe.exceptions.RecipeNotFound;
import com.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @QueryMapping
    public Recipe getRecipeByTitle(@Argument String title) throws RecipeNotFound {
        return recipeService.findRecipe(title);
    }

}
