package org.jzy3d.bugs.mouseclick;

import com.jogamp.opengl.glu.GLU;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.camera.AbstractCameraController;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Scale;
import org.jzy3d.picking.PickingSupport;
import org.jzy3d.plot3d.rendering.canvas.CanvasAWT;
import org.jzy3d.plot3d.rendering.canvas.CanvasNewtAwt;
import org.jzy3d.plot3d.rendering.canvas.CanvasSwing;
import org.jzy3d.plot3d.rendering.view.View;

public class PlotMouseController
  extends AbstractCameraController
  implements MouseListener, MouseMotionListener, MouseWheelListener
{
  private Chart c;
  protected Coord3d a;
  protected Coord2d b;
  
  public PlotMouseController(Chart paramChart)
  {
    super(paramChart);
    new GLU();
    this.c = paramChart;
    new PickingSupport();
  }
  
  public void register(Chart paramChart)
  {
    super.register(paramChart);
    this.b = Coord2d.ORIGIN;
    ((Component)paramChart.getCanvas()).addMouseListener(this);
    ((Component)paramChart.getCanvas()).addMouseWheelListener(this);
    ((Component)paramChart.getCanvas()).addMouseMotionListener(this);
  }
  
  public void dispose()
  {
    Iterator localIterator = this.targets.iterator();
    while (localIterator.hasNext())
    {
      localIterator.next();
      ((Component)this.c.getCanvas()).removeMouseListener(this);
      ((Component)this.c.getCanvas()).removeMouseWheelListener(this);
      ((Component)this.c.getCanvas()).removeMouseMotionListener(this);
    }
    super.dispose();
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (((paramMouseEvent = (paramMouseEvent = (Chart)this.targets.get(0)).getCanvas()) instanceof CanvasSwing))
    {
      ((CanvasSwing)paramMouseEvent).requestFocus(true);
      ((CanvasSwing)paramMouseEvent).requestFocusInWindow();
    }
    if ((paramMouseEvent instanceof CanvasAWT))
    {
      ((CanvasAWT)paramMouseEvent).requestFocus();
      ((CanvasAWT)paramMouseEvent).requestFocusInWindow();
    }
    if ((paramMouseEvent instanceof CanvasNewtAwt))
    {
      ((CanvasNewtAwt)paramMouseEvent).requestFocus();
      ((CanvasNewtAwt)paramMouseEvent).requestFocusInWindow();
    }
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  public void zoomZ(float paramFloat, boolean paramBoolean)
  {
    Chart localChart;
    double d1;
    if ((d1 = (localChart = (Chart)this.targets.get(0)).getView().getBounds().getZmax() - localChart.getView().getBounds().getZmin()) <= 0.0D) {
      return;
    }
    double d2;
    double d3 = (d2 = (localChart.getView().getBounds().getZmax() + localChart.getView().getBounds().getZmin()) / 2.0F) + (localChart.getView().getBounds().getZmin() - d2) * paramFloat;
    double d4 = d2 + (localChart.getView().getBounds().getZmax() - d2) * paramFloat;
    Scale localScale = null;
    if (d3 < d4) {
      localScale = new Scale(d3, d4);
    } else if (paramFloat < 1.0F) {
      localScale = new Scale(d2, d2);
    }
    if (localScale != null)
    {
      (paramFloat = localChart.getView().getBounds()).setZmin(localScale.getMin());
      paramFloat.setZmax(localScale.getMax());
      localChart.getView().setBoundManual(paramFloat);
      if (paramBoolean) {
        localChart.render();
      }
    }
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {}
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {}
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\mouseclick\PlotMouseController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */