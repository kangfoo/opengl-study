package org.jzy3d.chart.watch.watched;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import org.jzy3d.chart2d.SerieManager;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Timer;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.ViewportConfiguration;

public class WatchedCamera
  extends Camera
{
  public Serie2d a;
  public Serie2d b;
  public Serie2d c;
  public Serie2d d;
  private Timer e;
  
  public WatchedCamera(Coord3d paramCoord3d)
  {
    super(paramCoord3d);
    paramCoord3d = this;
    this.a = SerieManager.get().getSerie("camera.screenxoffset", Serie2d.Type.LINE);
    paramCoord3d.b = SerieManager.get().getSerie("camera.screenyoffset", Serie2d.Type.LINE);
    paramCoord3d.c = SerieManager.get().getSerie("camera.screenwidth", Serie2d.Type.LINE);
    paramCoord3d.d = SerieManager.get().getSerie("camera.screenheight", Serie2d.Type.LINE);
    paramCoord3d.e = new Timer();
    paramCoord3d.e.start();
  }
  
  protected ViewportConfiguration applyViewport(GL paramGL, GLU paramGLU)
  {
    paramGL = super.applyViewport(paramGL, paramGLU);
    paramGLU = this;
    this.a.add(new Coord2d(paramGLU.e.elapsed(), paramGLU.screenXOffset));
    paramGLU.b.add(new Coord2d(paramGLU.e.elapsed(), paramGLU.screenYOffset));
    paramGLU.c.add(new Coord2d(paramGLU.e.elapsed(), paramGLU.screenWidth));
    paramGLU.d.add(new Coord2d(paramGLU.e.elapsed(), paramGLU.screenHeight));
    return paramGL;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\WatchedCamera.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */