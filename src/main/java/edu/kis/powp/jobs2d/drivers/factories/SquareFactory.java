package edu.kis.powp.jobs2d.drivers.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class SquareFactory {

    public static void drawRectangle(Job2dDriver driver) {
        ComplexCommand commands = new ComplexCommand();

        commands.addTask(new SetPositionCommand(0,0));
        commands.addTask(new OperateToCommand(100,0));

        commands.addTask(new SetPositionCommand(100,0));
        commands.addTask(new OperateToCommand(100,-100));

        commands.addTask(new SetPositionCommand(100,-100));
        commands.addTask(new OperateToCommand(0,-100));

        commands.addTask(new SetPositionCommand(0,-100));
        commands.addTask(new OperateToCommand(0,0));

        commands.execute(driver);
    }

}
