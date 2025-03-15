package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter extends DrawerAdapter {

    private ILine lineType;
    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine lineType) {
        super(drawPanelController);
        this.lineType = lineType;
    }

    @Override
    public void operateTo(int x, int y) {

        lineType.setStartCoordinates(this.startX, this.startY);
        lineType.setEndCoordinates(x, y);
        setPosition(x, y);

        drawPanelController.drawLine(lineType);

    }
}
