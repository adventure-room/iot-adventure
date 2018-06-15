package com.programyourhome.adventureroom.model.module;

import java.util.Optional;

import com.programyourhome.adventureroom.model.Adventure;
import com.programyourhome.adventureroom.model.event.Event;
import com.programyourhome.adventureroom.model.script.action.Action;

public interface AdventureModule {

    public ModuleConfig getConfig();

    public Optional<Action> parseForAction(String input, Adventure adventure);

    public default void handleEvent(Event event) {
        // Default no-op.
    }

}
