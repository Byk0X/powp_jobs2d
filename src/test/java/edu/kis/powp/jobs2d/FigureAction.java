package edu.kis.powp.jobs2d;

public enum FigureAction {

    FIGURE_1("Figure Joe 1"),
    FIGURE_2("Figure Joe 2"),
    FIGURE_3("Triangle"),
    FIGURE_4("Rectangle"),;


    private final String command;

    FigureAction(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public static FigureAction fromCommand(String command) {
        for (FigureAction action : values()) {
            if (action.getCommand().equals(command)) {
                return action;
            }
        }
        throw new IllegalArgumentException("Unknown action: " + command);
    }

}
