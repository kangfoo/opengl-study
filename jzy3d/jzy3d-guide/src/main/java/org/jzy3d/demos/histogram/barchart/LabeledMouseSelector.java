package org.jzy3d.demos.histogram.barchart;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.selection.AWTAbstractMouseSelector;
import org.jzy3d.maths.BoundingBox2d;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.IntegerCoord2d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;

public class LabeledMouseSelector
  extends AWTAbstractMouseSelector
  implements KeyListener
{
  private final Chart a;
  private boolean b = false;
  
  public LabeledMouseSelector(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  protected void processSelection(Scene paramScene, View paramView, int paramInt1, int paramInt2)
  {
    paramView.project();
    paramInt1 = null;
    paramScene = paramScene.getGraph().getAll().iterator();
    while (paramScene.hasNext()) {
      if (((paramInt2 = (AbstractDrawable)paramScene.next()) instanceof BarChartBar))
      {
        (paramInt2 = (BarChartBar)paramInt2).a(false);
        Object localObject = paramInt2.c();
        boolean bool;
        if (((bool = (localObject = new BoundingBox2d((List)localObject)).contains(new Coord2d(this.out.x, this.out.y)))) && ((paramInt1 == null) || ((paramView.getCamera().getEye().distance(paramInt1.d().getBounds().getCenter()) > paramView.getCamera().getEye().distance(paramInt2.d().getBounds().getCenter())) && (paramInt2.d().isDisplayed()))))
        {
          paramInt1 = paramInt2;
          System.out.println(paramInt2.a());
        }
      }
    }
    if (paramInt1 != null) {
      paramInt1.a(true);
    }
  }
  
  protected void drawSelection(Graphics2D paramGraphics2D, int paramInt1, int paramInt2) {}
  
  public void keyReleased(KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    case 16: 
      unregister();
    }
    this.b = false;
    this.a.render();
  }
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if (!this.b)
    {
      switch (paramKeyEvent.getKeyCode())
      {
      case 16: 
        register(this.a);
      }
      this.b = true;
      this.a.render();
    }
  }
  
  public void clearLastSelection() {}
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\LabeledMouseSelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */