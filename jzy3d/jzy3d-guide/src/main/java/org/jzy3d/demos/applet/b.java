package org.jzy3d.demos.applet;

import com.jogamp.opengl.awt.GLCanvas;
import org.jzy3d.chart.Chart;

final class b
  implements Runnable
{
  b(AppletChart paramAppletChart, Chart paramChart) {}
  
  public final void run()
  {
    GLCanvas localGLCanvas = (GLCanvas)this.a.getCanvas();
    this.b.add(localGLCanvas);
    localGLCanvas.setSize(this.b.getSize());
    this.b.validate();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\applet\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */