package org.jzy3d.demos.interpolation;

import java.util.ArrayList;
import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.algorithms.interpolation.IInterpolator;
import org.jzy3d.maths.algorithms.interpolation.algorithms.BernsteinInterpolator;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.LineStripInterpolated;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class InterpolationDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new InterpolationDemo());
  }
  
  public void init()
  {
    Object localObject = new BernsteinInterpolator();
    (localObject = new ArrayList()).add(new Coord3d(0.0F, 0.0F, 0.0F));
    ((List)localObject).add(new Coord3d(1.0F, 0.0F, 1.0F));
    ((List)localObject).add(new Coord3d(1.0F, 0.0F, 2.0F));
    ((List)localObject).add(new Coord3d(1.0F, 1.0F, 2.0F));
    ((List)localObject).add(new Coord3d(0.0F, 1.0F, 2.0F));
    ((List)localObject).add(new Coord3d(3.0F, 2.0F, -1.0F));
    localObject = new LineStripInterpolated((IInterpolator)localObject, (List)localObject, 30);
    this.chart = initializeChart(Chart.DEFAULT_QUALITY);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
  
  public String getPitch()
  {
    return "Show a bernstein 3d interpolator generating 30 intermediate points (blue) between each of the control points (red)";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\interpolation\InterpolationDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */