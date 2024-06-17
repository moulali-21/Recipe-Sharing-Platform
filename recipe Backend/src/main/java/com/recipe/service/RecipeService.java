package com.recipe.service;

import com.recipe.entites.Category;
import com.recipe.entites.Recipe;
import com.recipe.entites.User;
import com.recipe.exceptions.RecipeNotFound;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class RecipeService {


    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

    @PostConstruct
    private void  RecipeService(){
        recipes.add(Recipe.builder()
                .recipeId(1)
                .title("Spaghetti Carbonara")
                .description("Classic Italian pasta dish with eggs, cheese, and pancetta.")
                .ingredients("Spaghetti, eggs, Pecorino Romano cheese, pancetta, black pepper")
                .instructions("Boil spaghetti; cook pancetta; mix eggs and cheese; combine all with cooked pasta and pepper.")
                .user(User.builder()
                        .user_id(1)
                        .userName("Sucharitha")
                        .email("suchi@gmail.com")
                        .createdAt(new Date())
                        .build())
                .category(Category.builder()
                        .category_id(1)
                        .description("Pasta omelete")
                        .name("Pasta").build())
                .build());
        recipes.add(Recipe.builder()
                .recipeId(2)
                .title("Chocolate Chip Cookies")
                .description("Classic homemade chocolate chip cookies.")
                .ingredients("Flour, butter, sugar, chocolate chips, baking soda, vanilla extract")
                .instructions("Cream butter and sugar; add dry ingredients and chocolate chips; bake at 350°F for 10-12 minutes.")
                .user(User.builder()
                        .user_id(1)
                        .userName("Jane Smith")
                        .email("JaneSmith@gmail.com")
                        .createdAt(new Date())
                        .build())
                .category(Category.builder()
                        .category_id(1)
                        .description("Dessert")
                        .name("Dessert").build())
                .build());

    }

    public Recipe findRecipe(String recipeName) throws RecipeNotFound {
         return this.recipes.stream().filter(
                recipe -> recipe.getTitle().equalsIgnoreCase(recipeName)
        ).findFirst().orElseThrow(()-> new RecipeNotFound("Recipe with "+recipeName+" not found"));
    }

}
