package org.jzy3d.demos.parametric;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.parameq.ParametricAbcd;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.parameq.ParametricDrawable;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class Parametric2dDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ParamEq2dDemo());
  }
  
  public void init()
  {
    Color localColor = new Color(0.0F, 0.2509804F, 0.32941177F);
    new ParametricAbcd(80.0D, 1.0D, 1.0D, 80.0D, 3.0D, 3.0D);
    new ParametricAbcd(80.0D, 1.0D, 80.0D, 1.0D, 3.0D, 3.0D);
    new ParametricAbcd(1.0D, 80.0D, 1.0D, 80.0D, 3.0D, 3.0D);
    ParametricAbcd localParametricAbcd = new ParametricAbcd(1.0D, 100.0D, 1.0D, 50.0D, 3.0D, 3.0D);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().getGraph().add(new ParametricDrawable(localParametricAbcd, 0.0D, 6.283185307179586D, 50000, localColor));
    this.chart.getAxeLayout().setMainColor(localColor);
    this.chart.getView().setViewPositionMode(ViewPositionMode.TOP);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\parametric\Parametric2dDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */