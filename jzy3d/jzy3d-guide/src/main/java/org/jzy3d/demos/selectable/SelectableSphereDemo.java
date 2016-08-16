package org.jzy3d.demos.selectable;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.mouse.AWTDualModeMouseSelector;
import org.jzy3d.chart.controllers.mouse.selection.AWTSphereMouseSelector;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.plot3d.primitives.selectable.SelectableSphere;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;

public class SelectableSphereDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.openStatic(paramArrayOfString = new SelectableSphereDemo());
  }
  
  public SelectableSphereDemo()
  {
    super(new AWTChartComponentFactory());
  }
  
  public void init()
  {
    SelectableSphere localSelectableSphere = new SelectableSphere();
    Quality localQuality;
    (localQuality = Quality.Advanced).setDisableDepthBufferWhenAlpha(false);
    this.chart = initializeChart(localQuality);
    this.chart.getScene().add(localSelectableSphere);
    this.chart.getView().setMaximized(true);
    new AWTDualModeMouseSelector(this.chart, new AWTSphereMouseSelector(localSelectableSphere));
  }
  
  public boolean hasOwnChartControllers()
  {
    return true;
  }
  
  public String getPitch()
  {
    return "Selects the sphere keypoints (blue) if the selection rectangle intersects the convex hull (green) of those 2d projected points. To unselect, simply make a rectangle selection that does not intersects with the sphere. This demo uses a special dual mouse mode. See message on chart for toggling keys.";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\selectable\SelectableSphereDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */