package org.jzy3d.demos.histogram.barchart;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import org.jzy3d.plot3d.primitives.Quad;
import org.jzy3d.plot3d.rendering.view.Camera;

final class a
  extends Quad
{
  a(BarChartBar paramBarChartBar) {}
  
  public final void draw(GL paramGL, GLU paramGLU, Camera paramCamera)
  {
    super.draw(paramGL, paramGLU, paramCamera);
    this.a.a = paramGLU;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */