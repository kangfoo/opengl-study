package org.jzy3d.sandbox.tripleview;

import org.jzy3d.maths.Coord2d;
import org.jzy3d.plot3d.rendering.view.View;

public class ViewCameraThreadController
  extends AbstractViewCameraController
  implements Runnable
{
  private Coord2d b;
  private Thread c = null;
  private int d = 1;
  private float e = 5.0E-4F;
  
  public ViewCameraThreadController(View paramView)
  {
    super(paramView);
  }
  
  public final void a()
  {
    if (this.c == null)
    {
      this.c = new Thread(this);
      this.c.setName("Embedded by ChartThreadController");
      this.c.start();
    }
  }
  
  public void run()
  {
    this.b = new Coord2d(this.e, 0.0F);
    while (this.c != null) {
      try
      {
        a(this.b);
        Thread.sleep(this.d);
      }
      catch (InterruptedException localInterruptedException)
      {
        this.c = null;
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\tripleview\ViewCameraThreadController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */