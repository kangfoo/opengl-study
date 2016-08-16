package org.jzy3d.demos.scatter;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AWTScatterMultiColor;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.view.View;

public class MultiColorScatterDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new MultiColorScatterDemo());
  }
  
  public void init()
  {
    Coord3d[] arrayOfCoord3d = new Coord3d[100000];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 100000; i++)
    {
      float f1 = localRandom.nextFloat() - 0.5F;
      float f2 = localRandom.nextFloat() - 0.5F;
      float f3 = localRandom.nextFloat() - 0.5F;
      arrayOfCoord3d[i] = new Coord3d(f1, f2, f3);
    }
    AWTScatterMultiColor localAWTScatterMultiColor = new AWTScatterMultiColor(arrayOfCoord3d, new ColorMapper(new ColorMapRainbow(), -0.5D, 0.5D));
    this.chart = initializeChart();
    this.chart.getAxeLayout().setMainColor(Color.WHITE);
    this.chart.getView().setBackgroundColor(Color.BLACK);
    this.chart.getScene().add(localAWTScatterMultiColor);
    localAWTScatterMultiColor.setLegend(new AWTColorbarLegend(localAWTScatterMultiColor, this.chart.getView().getAxe().getLayout(), Color.WHITE, null));
    localAWTScatterMultiColor.setLegendDisplayed(true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\MultiColorScatterDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */