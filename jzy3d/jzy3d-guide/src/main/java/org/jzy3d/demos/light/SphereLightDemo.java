package org.jzy3d.demos.light;

import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.SwingChartLauncher;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;

public class SphereLightDemo
  extends AbstractLightDemo
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new SphereLightDemo()).init();
    SwingChartLauncher.openChart(paramArrayOfString = paramArrayOfString.getChart(), new Rectangle(400, 0, 900, 900), "Light Demo");
    SwingChartLauncher.openLightEditors(paramArrayOfString);
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Intermediate);
    this.chart.getView().setBackgroundColor(Color.WHITE);
    this.chart.getView().getAxe().getLayout().setMainColor(Color.GRAY);
    this.chart.getView().getAxe().getLayout().setFaceDisplayed(false);
    this.chart.getView().setSquared(false);
    a(this.chart, new Coord3d());
    int i = 100;
    float f = 50.0F;
    Chart localChart;
    a(localChart = this.chart, new Coord3d(-100.0F, -100.0F, -50.0F), 50.0F, 100);
    a(localChart, new Coord3d(100.0F, -100.0F, -50.0F), 50.0F, 100);
    a(localChart, new Coord3d(100.0F, 100.0F, -50.0F), 50.0F, 100);
    a(localChart, new Coord3d(-100.0F, 100.0F, -50.0F), 50.0F, 100);
    a(localChart, new Coord3d(-100.0F, -100.0F, 50.0F), 50.0F, 100);
    a(localChart, new Coord3d(100.0F, -100.0F, 50.0F), 50.0F, 100);
    a(localChart, new Coord3d(100.0F, 100.0F, 50.0F), 50.0F, 100);
    a(localChart, new Coord3d(-100.0F, 100.0F, 50.0F), 50.0F, 100);
    a(localChart, new Coord3d(-200.0F, -200.0F, 0.0F), 50.0F, 100);
    this.chart.getCanvas().addKeyController(new AWTLightKeyController(this.chart, 0));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\light\SphereLightDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */