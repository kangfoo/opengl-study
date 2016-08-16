package org.jzy3d.demos.composites;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;

public class CompositeDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new CompositeDemo());
  }
  
  public void init()
  {
    System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
    this.chart = initializeChart(Quality.Advanced);
    ChartScene localChartScene = this.chart.getScene();
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 150; i += 50) {
      for (int j = 0; j < 150; j += 50)
      {
        double d3 = localRandom.nextDouble() * 2.0D;
        double d2 = j;
        double d1 = i;
        Color localColor;
        (localColor = Color.RED).a = 0.55F;
        MyCustomCylinder localMyCustomCylinder;
        (localMyCustomCylinder = new MyCustomCylinder()).a(new Coord3d(d1, d2, 0.0D), (float)d3, 7.0F, 15, localColor);
        localMyCustomCylinder.setWireframeDisplayed(true);
        localMyCustomCylinder.setWireframeColor(Color.BLACK);
        localChartScene.add(localMyCustomCylinder);
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\composites\CompositeDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */