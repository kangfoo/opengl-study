package org.jzy3d.works.chart2d.legend;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.legends.ILegend;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.ViewportBuilder;
import org.jzy3d.plot3d.rendering.view.ViewportConfiguration;
import org.jzy3d.plot3d.rendering.view.ViewportMode;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;

public class LegendViewportLayout
  implements IViewportLayout
{
  private float a = 1.0F;
  private boolean b = true;
  private ViewportConfiguration c;
  private ViewportConfiguration d;
  
  public LegendViewportLayout()
  {
    new Rectangle(0, 0, 0, 0);
    new Rectangle(0, 0, 0, 0);
  }
  
  public void update(Chart paramChart)
  {
    Object localObject1 = paramChart.getScene();
    paramChart = paramChart.getCanvas();
    localObject1 = ((Scene)localObject1).getGraph().getLegends();
    Object localObject2 = localObject1;
    Chart localChart = paramChart;
    localObject1 = this;
    this.b = (((List)localObject2).size() > 0);
    if (((LegendViewportLayout)localObject1).b)
    {
      int i = 0;
      if ((localObject2 = ((List)localObject2).iterator()).hasNext())
      {
        localObject2 = (ILegend)((Iterator)localObject2).next();
        i = 0 + ((ILegend)localObject2).getMinimumSize().width;
      }
      ((LegendViewportLayout)localObject1).a = ((localChart.getRendererWidth() - i) / localChart.getRendererWidth());
    }
    else
    {
      ((LegendViewportLayout)localObject1).a = 1.0F;
    }
    this.c = ViewportBuilder.column(paramChart, 0.0F, 1.0F);
    this.d = new ViewportConfiguration(paramChart);
  }
  
  public void render(GL paramGL, GLU paramGLU, Chart paramChart)
  {
    View localView;
    (localView = paramChart.getView()).renderBackground(paramGL, paramGLU, this.d);
    localView.renderScene(paramGL, paramGLU, this.c);
    List localList = paramChart.getScene().getGraph().getLegends();
    if (this.b)
    {
      ICanvas localICanvas = paramChart.getCanvas();
      Object localObject = localList;
      paramGLU = 1.0F;
      float f = this.a;
      paramChart = paramGLU;
      paramGLU = paramGL;
      (localObject = (ILegend)((List)localObject).get(((List)localObject).size() - 1)).setViewportMode(ViewportMode.STRETCH_TO_FILL);
      ((ILegend)localObject).setViewPort(localICanvas.getRendererWidth(), localICanvas.getRendererHeight(), f, 1.0F);
      ((ILegend)localObject).render(paramGLU, paramChart);
    }
    localView.renderOverlay(paramGL, localView.getCamera().getLastViewPort());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\legend\LegendViewportLayout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */