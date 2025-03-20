package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class SetPositionCommand implements DriverCommand {

    private int x;
    private int y;

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }

}
