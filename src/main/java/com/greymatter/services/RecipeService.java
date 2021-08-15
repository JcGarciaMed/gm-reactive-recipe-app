package com.greymatter.services;

import com.greymatter.commands.RecipeCommand;
import com.greymatter.domain.Recipe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);

    //
}
