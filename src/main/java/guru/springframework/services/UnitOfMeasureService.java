package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by ujwal-mac on 12/1/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
