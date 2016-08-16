package org.jzy3d.sandbox.tripleview;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import java.io.PrintStream;
import org.jzy3d.chart.Chart;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.ViewportBuilder;
import org.jzy3d.plot3d.rendering.view.ViewportConfiguration;
import org.jzy3d.plot3d.rendering.view.ViewportMode;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class TripleViewLayout
  implements IViewportLayout
{
  private float a = 1.0F;
  private View b = null;
  private View c = null;
  private ViewportConfiguration d;
  private ViewportConfiguration e;
  private ViewportConfiguration f;
  
  public void update(Chart paramChart)
  {
    Object localObject = paramChart.getCanvas();
    this.a = 0.5F;
    new ViewportConfiguration((ICanvas)localObject);
    this.d = ViewportBuilder.column((ICanvas)localObject, 0.0F, this.a);
    this.e = ViewportBuilder.cell((ICanvas)localObject, this.a, 1.0F, 0.0F, this.a);
    this.f = ViewportBuilder.cell((ICanvas)localObject, this.a, 1.0F, this.a, 1.0F);
    System.out.println("top" + this.e);
    System.out.println("bottom" + this.f);
    localObject = paramChart;
    paramChart = this;
    if (this.b == null)
    {
      paramChart.b = ((Chart)localObject).newView();
      paramChart.b.getCamera().setViewportMode(ViewportMode.SQUARE);
      paramChart.b.getCamera().setScreenGridDisplayed(true);
      paramChart.b.setViewPositionMode(ViewPositionMode.TOP);
    }
    if (paramChart.c == null)
    {
      paramChart.c = ((Chart)localObject).newView();
      paramChart.c.getCamera().setViewportMode(ViewportMode.SQUARE);
      paramChart.c.getCamera().setScreenGridDisplayed(true);
      paramChart.c.setViewPositionMode(ViewPositionMode.TOP);
      (paramChart = new ViewCameraThreadController(paramChart.c)).a();
    }
  }
  
  public void render(GL paramGL, GLU paramGLU, Chart paramChart)
  {
    Object localObject = paramChart;
    GLU localGLU = paramGLU;
    GL localGL = paramGL;
    paramChart = this;
    (localObject = ((Chart)localObject).getView()).renderBackground(localGL, localGLU, paramChart.d);
    ((View)localObject).renderScene(localGL, localGLU, paramChart.d);
    ((View)localObject).renderOverlay(localGL, paramChart.d);
    this.b.renderScene(paramGL, paramGLU, this.e);
    this.c.renderScene(paramGL, paramGLU, this.f);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\tripleview\TripleViewLayout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */