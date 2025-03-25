package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> commands = null;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public void addTask(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : commands) {
            command.execute(driver);
        }
    }
}
