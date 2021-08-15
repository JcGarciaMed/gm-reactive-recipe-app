package com.greymatter.services;

import com.greymatter.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
