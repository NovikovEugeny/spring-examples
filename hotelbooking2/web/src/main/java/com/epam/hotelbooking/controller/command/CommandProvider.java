package com.epam.hotelbooking.controller.command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final static CommandProvider INSTANCE = new CommandProvider();

    private final Map<CommandName, Command> repository = new HashMap<>();

    public static CommandProvider getInstance() {
        return INSTANCE;
    }

    private CommandProvider() {

        //pages
        //repository.put(CommandName.START_PAGE, new StartPage());

    }

    public Command getCommand(String name) {

        CommandName commandName = CommandName.valueOf(name.toUpperCase());
        return repository.get(commandName);
    }

}