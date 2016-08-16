package org.jzy3d.demos.histogram.barchart;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.rendering.view.View;

public class CustomKeyboardControl
  extends KeyAdapter
{
  private final Chart a;
  
  public CustomKeyboardControl(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  public void keyPressed(KeyEvent paramKeyEvent)
  {
    BoundingBox3d localBoundingBox3d;
    switch (paramKeyEvent.getKeyCode())
    {
    case 49: 
      this.a.getView().setViewPoint(new Coord3d(1.0471975511965976D, 0.5235987755982988D, 0.0D), true);
      break;
    case 50: 
      this.a.getView().setViewPoint(new Coord3d(0.0F, 0.0F, 0.0F), true);
      break;
    case 51: 
      this.a.getView().setViewPoint(new Coord3d(0.0D, -3.141592653589793D, 0.0D), true);
      break;
    case 52: 
      this.a.getView().setViewPoint(new Coord3d(-1.5707963267948966D, 0.0D, 0.0D), true);
      break;
    case 38: 
      localBoundingBox3d = this.a.getView().getBounds();
      if (!paramKeyEvent.isShiftDown()) {
        this.a.getView().setBoundManual(new BoundingBox3d(localBoundingBox3d.getXmin(), localBoundingBox3d.getXmax(), localBoundingBox3d.getYmin() + 40.0F + 14.0F, localBoundingBox3d.getYmax(), localBoundingBox3d.getZmin(), localBoundingBox3d.getZmax()));
      } else {
        this.a.getView().setBoundManual(new BoundingBox3d(localBoundingBox3d.getXmin(), localBoundingBox3d.getXmax(), localBoundingBox3d.getYmin(), localBoundingBox3d.getYmax() + 40.0F + 14.0F, localBoundingBox3d.getZmin(), localBoundingBox3d.getZmax()));
      }
      this.a.getView().updateBounds();
      break;
    case 40: 
      localBoundingBox3d = this.a.getView().getBounds();
      if (!paramKeyEvent.isShiftDown()) {
        this.a.getView().setBoundManual(new BoundingBox3d(localBoundingBox3d.getXmin(), localBoundingBox3d.getXmax(), localBoundingBox3d.getYmin() - 40.0F - 14.0F, localBoundingBox3d.getYmax(), localBoundingBox3d.getZmin(), localBoundingBox3d.getZmax()));
      } else {
        this.a.getView().setBoundManual(new BoundingBox3d(localBoundingBox3d.getXmin(), localBoundingBox3d.getXmax(), localBoundingBox3d.getYmin(), localBoundingBox3d.getYmax() - 40.0F - 14.0F, localBoundingBox3d.getZmin(), localBoundingBox3d.getZmax()));
      }
      this.a.getView().updateBounds();
    }
    this.a.render();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\CustomKeyboardControl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */