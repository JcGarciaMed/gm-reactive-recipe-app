package com.greymatter.repositories.reactive;

import com.greymatter.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 8/17/17.
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{

}
