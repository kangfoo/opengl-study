package org.jzy3d.chart.watch.watched;

import com.jogamp.opengl.GLAutoDrawable;
import org.jzy3d.chart2d.SerieManager;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Timer;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.view.Renderer3d;
import org.jzy3d.plot3d.rendering.view.View;

public class WatchedRenderer3d
  extends Renderer3d
{
  public Serie2d a;
  public Serie2d b;
  private Timer c;
  private int d = 0;
  private int e = 0;
  
  private void a()
  {
    this.a = SerieManager.get().getSerie("renderer3d.width", Serie2d.Type.LINE);
    this.b = SerieManager.get().getSerie("renderer3d.height", Serie2d.Type.LINE);
    this.c = new Timer();
    this.c.start();
  }
  
  public void display(GLAutoDrawable paramGLAutoDrawable)
  {
    super.display(paramGLAutoDrawable);
    b();
  }
  
  public void reshape(GLAutoDrawable paramGLAutoDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.reshape(paramGLAutoDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    this.d = paramInt3;
    this.e = paramInt4;
    b();
  }
  
  private void b()
  {
    this.a.add(new Coord2d(this.c.elapsed(), this.d));
    this.a.getDrawable().updateBounds();
    this.b.add(new Coord2d(this.c.elapsed(), this.e));
  }
  
  public WatchedRenderer3d()
  {
    a();
  }
  
  public WatchedRenderer3d(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramView, paramBoolean1, paramBoolean2);
    a();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\WatchedRenderer3d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */