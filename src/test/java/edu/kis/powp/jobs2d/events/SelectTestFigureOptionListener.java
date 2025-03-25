package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.FigureAction;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.factories.SquareFactory;
import edu.kis.powp.jobs2d.drivers.factories.TriangleFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		FigureAction action = FigureAction.fromCommand(e.getActionCommand());

		switch (action) {
			case FIGURE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case FIGURE_3:
				TriangleFactory.drawTriangle(driverManager.getCurrentDriver());
			case FIGURE_4:
				SquareFactory.drawRectangle(driverManager.getCurrentDriver());
		}

	}
}
