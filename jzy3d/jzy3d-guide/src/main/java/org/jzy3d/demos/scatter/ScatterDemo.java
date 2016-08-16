package org.jzy3d.demos.scatter;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class ScatterDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new ScatterDemo()).setCanvasType("newt");
    AnalysisLauncher.open(paramArrayOfString);
  }
  
  public void init()
  {
    Coord3d[] arrayOfCoord3d = new Coord3d[500000];
    Color[] arrayOfColor = new Color[500000];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 500000; i++)
    {
      float f1 = localRandom.nextFloat() - 0.5F;
      float f2 = localRandom.nextFloat() - 0.5F;
      float f3 = localRandom.nextFloat() - 0.5F;
      arrayOfCoord3d[i] = new Coord3d(f1, f2, f3);
      arrayOfColor[i] = new Color(f1, f2, f3, 0.25F);
    }
    Scatter localScatter = new Scatter(arrayOfCoord3d, arrayOfColor);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().add(localScatter);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\ScatterDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */