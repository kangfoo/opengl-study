package org.jzy3d.demos.histogram.barchart;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.AWTMouseUtilities;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.chart.controllers.thread.camera.CameraThreadController;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Scale;
import org.jzy3d.plot3d.rendering.view.View;

public class CustomMouseControl
  extends AWTCameraMouseController
{
  private final Chart a;
  
  public CustomMouseControl(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
  {
    if (this.threadController != null) {
      this.threadController.stop();
    }
    paramMouseWheelEvent = 1.0F + paramMouseWheelEvent.getWheelRotation() / 20.0F;
    float f = paramMouseWheelEvent;
    paramMouseWheelEvent = this;
    paramMouseWheelEvent = this.targets.iterator();
    while (paramMouseWheelEvent.hasNext())
    {
      Chart localChart;
      BoundingBox3d localBoundingBox3d = (localChart = (Chart)paramMouseWheelEvent.next()).getView().getBounds();
      localChart.getView().setBoundManual(new BoundingBox3d(localBoundingBox3d.getXmin(), localBoundingBox3d.getXmax() * f, localBoundingBox3d.getYmin(), localBoundingBox3d.getYmax() * f, localBoundingBox3d.getZmin(), localBoundingBox3d.getZmax() * f));
      localChart.getView().updateBounds();
    }
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    Coord2d localCoord2d = new Coord2d(paramMouseEvent.getX(), paramMouseEvent.getY());
    if (AWTMouseUtilities.isLeftDown(paramMouseEvent))
    {
      paramMouseEvent = localCoord2d.sub(this.prevMouse).div(150.0F);
      rotate(paramMouseEvent);
    }
    else if ((AWTMouseUtilities.isRightDown(paramMouseEvent)) && ((paramMouseEvent = localCoord2d.sub(this.prevMouse)).y != 0.0F))
    {
      Scale localScale;
      (localScale = this.a.getScale()).setMax((1.0F + paramMouseEvent.y / 100.0F) * localScale.getMax());
      this.a.setScale(localScale, true);
    }
    this.prevMouse = localCoord2d;
  }
  
  public final void a()
  {
    CameraThreadController localCameraThreadController = new CameraThreadController(this.a);
    addSlaveThreadController(localCameraThreadController);
    this.a.addController(this);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\CustomMouseControl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */