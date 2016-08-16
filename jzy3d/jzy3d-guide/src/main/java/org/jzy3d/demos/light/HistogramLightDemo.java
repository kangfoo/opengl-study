package org.jzy3d.demos.light;

import java.util.Random;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.SwingChartLauncher;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.chart.controllers.keyboard.lights.NewtLightKeyController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.chart.factories.NewtChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.enlightables.EnlightableBar;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;

public class HistogramLightDemo
  extends AbstractLightDemo
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new HistogramLightDemo()).init();
    SwingChartLauncher.openChart(paramArrayOfString = paramArrayOfString.getChart(), new Rectangle(400, 0, 900, 900), "Light Demo");
    SwingChartLauncher.openLightEditors(paramArrayOfString);
  }
  
  public String getPitch()
  {
    return "Renders an histogram made of tube that support lights. The light can be moved using Numpad.\nLight editor can be activated by running this demo in standalone mode.";
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Intermediate);
    this.chart.getView().setBackgroundColor(Color.WHITE);
    this.chart.getView().setSquared(true);
    this.chart.getAxeLayout().setMainColor(Color.GRAY);
    this.chart.getAxeLayout().setFaceDisplayed(false);
    a(this.chart, new Coord3d(0.0F, -100.0F, 100.0F));
    a(this.chart);
    if ((this.chart.getFactory() instanceof NewtChartComponentFactory))
    {
      this.chart.getCanvas().addKeyController(new NewtLightKeyController(this.chart, 0));
      return;
    }
    if ((this.chart.getFactory() instanceof AWTChartComponentFactory)) {
      this.chart.getCanvas().addKeyController(new AWTLightKeyController(this.chart, 0));
    }
  }
  
  private void a(Chart paramChart)
  {
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = -2; i < 2; i++) {
      for (int j = -2; j < 2; j++)
      {
        float f2 = localRandom.nextFloat() * 100.0F;
        float f1 = 50.0F;
        Object localObject = new Coord3d(i * 50.0F * 2.0F + 50.0F * i, j * 50.0F * 2.0F + 50.0F * j, 0.0F);
        Chart localChart = paramChart;
        (localObject = new EnlightableBar((Coord3d)localObject, f2, 50.0F, Color.WHITE)).setWireframeDisplayed(false);
        ((EnlightableBar)localObject).setFaceDisplayed(true);
        localChart.getScene().add((AbstractDrawable)localObject);
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\light\HistogramLightDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */