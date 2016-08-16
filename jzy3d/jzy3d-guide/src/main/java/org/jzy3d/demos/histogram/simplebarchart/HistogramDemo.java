package org.jzy3d.demos.histogram.simplebarchart;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.HistogramBar;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;

public class HistogramDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new HistogramDemo());
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Advanced);
    ChartScene localChartScene = this.chart.getScene();
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 200; i += 50) {
      for (int j = 0; j < 200; j += 50)
      {
        double d3 = localRandom.nextDouble() * 2.0D;
        double d2 = j;
        double d1 = i;
        Color.rng.setSeed(0L);
        Color localColor;
        (localColor = Color.random()).a = 0.55F;
        HistogramBar localHistogramBar;
        (localHistogramBar = new HistogramBar()).setData(new Coord3d(d1, d2, 0.0D), (float)d3, 10.0F, localColor);
        localHistogramBar.setWireframeDisplayed(false);
        localHistogramBar.setWireframeColor(Color.BLACK);
        localChartScene.add(localHistogramBar);
      }
    }
  }
  
  public String getPitch()
  {
    return "Draws a bar chart";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\simplebarchart\HistogramDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */