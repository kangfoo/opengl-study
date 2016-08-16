package org.jzy3d.demos.applet;

import com.jogamp.opengl.GLAutoDrawable;
import java.awt.Component;
import org.jzy3d.chart.Chart;

final class a
  implements Runnable
{
  private GLAutoDrawable a = (GLAutoDrawable)this.c.getCanvas();
  private Component b = (Component)this.a;
  
  a(AppletChart paramAppletChart, Chart paramChart) {}
  
  public final void run()
  {
    this.d.remove(this.b);
    this.a.destroy();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\applet\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */