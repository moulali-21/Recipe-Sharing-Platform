package com.recipe.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Recipe {

    private int recipeId;

    private String title;

    private String description;

    private String ingredients;

    private String instructions;

    private User user;

    private Category category;

}
