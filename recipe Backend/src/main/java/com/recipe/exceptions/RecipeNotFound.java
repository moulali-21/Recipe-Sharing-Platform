package com.recipe.exceptions;

import lombok.Data;

public class RecipeNotFound extends Exception{
    public RecipeNotFound(String message) {
        super(message);
    }
}
