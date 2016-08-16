package org.jzy3d.demos.parametric;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.parameq.ParametricHelix;
import org.jzy3d.maths.parameq.ParametricTorus;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.parameq.ParametricDrawable2;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;

public class TorusDemo
  extends AbstractAnalysis
{
  private static double a = 6.283185307179586D;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new TorusDemo());
  }
  
  public void init()
  {
    Color localColor = new Color(0.0F, 0.2509804F, 0.32941177F);
    ParametricTorus localParametricTorus = new ParametricTorus(2.0D, 0.5D);
    new ParametricHelix(5.0D, 0.2D);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().getGraph().add(new ParametricDrawable2(localParametricTorus, 0.0D, a, 200, 0.0D, a, 200, localColor));
    this.chart.getView().setSquared(false);
    this.chart.getAxeLayout().setMainColor(localColor);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\parametric\TorusDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */