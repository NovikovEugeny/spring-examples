package com.epam.hotelbooking.controller.command;

import com.epam.hotelbooking.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandProvider {

    private final static String NOT_FOUND = "not found";

    private final static CommandProvider INSTANCE = new CommandProvider();

    private final Map<String, Command> commandRepository = new HashMap<>();

    public static CommandProvider getInstance() {
        return INSTANCE;
    }

    private boolean test(String regExp, String str) {
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    private CommandProvider() {
        commandRepository.put(URIPattern.SHOW_APARTMENTS, new ShowApartments());
        commandRepository.put(URIPattern.SHOW_FREE_APARTMENTS, new ShowFreeApartments());
        commandRepository.put(URIPattern.SHOW_FREE_APARTMENTS_BY_CLASS, new ShowFreeApartmentsByClass());
        commandRepository.put(URIPattern.SHOW_FREE_APARTMENTS_BY_ROOM_QUANTITY, new ShowFreeApartmentsByRoomQuantity());
        commandRepository.put(NOT_FOUND, new ForwardTo404());
    }

    public Command getCommand(String uri) {
        for (String uriPattern : commandRepository.keySet()) {
            if (test(uriPattern, uri)) {
                return commandRepository.get(uriPattern);
            }
        }
        return commandRepository.get(NOT_FOUND);
    }
}