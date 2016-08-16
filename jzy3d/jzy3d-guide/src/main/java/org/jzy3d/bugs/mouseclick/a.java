package org.jzy3d.bugs.mouseclick;

import java.awt.event.MouseEvent;
import java.io.PrintStream;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.view.View;

final class a
  extends PlotMouseController
{
  a(Chart paramChart)
  {
    super(paramChart);
  }
  
  public final void mousePressed(MouseEvent paramMouseEvent)
  {
    this.b.x = (paramMouseEvent.getX() << 1);
    this.b.y = (paramMouseEvent.getY() << 1);
    paramMouseEvent.getX();
    paramMouseEvent.getY();
    int i = (-paramMouseEvent.getY() << 1) + ((Chart)this.targets.get(0)).getCanvas().getRendererHeight();
    System.out.println("YFLIP  " + i);
    System.out.println("HEIGHT  " + ((Chart)this.targets.get(0)).getCanvas().getRendererHeight());
    View localView = ((Chart)this.targets.get(0)).getView();
    this.a = localView.projectMouse(paramMouseEvent.getX() << 1, i);
    BugMouse2dTo3d.a(this.a);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\mouseclick\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */