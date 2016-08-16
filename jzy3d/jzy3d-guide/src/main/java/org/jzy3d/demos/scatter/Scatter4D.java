package org.jzy3d.demos.scatter;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.IColorMap;
import org.jzy3d.demos.vbo.scatter.ScatterVBODemo;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AWTScatterMultiColor;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class Scatter4D
  extends AbstractAnalysis
{
  private AWTScatterMultiColor a;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new Scatter4D());
  }
  
  public void init()
  {
    Coord3d[] arrayOfCoord3d = new Coord3d[1000000];
    Color[] arrayOfColor = new Color[1000000];
    int i = 0;
    Object localObject = new Scatter4D.EnergyColorMap();
    localObject = new ColorMapper((IColorMap)localObject, -1.0D, 1.0D);
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int j = 0; j < 100; j++) {
      for (int k = 0; k < 100; k++) {
        for (int m = 0; m < 100; m++)
        {
          Coord3d localCoord3d = new Coord3d(j + localRandom.nextFloat(), k + localRandom.nextFloat(), m + localRandom.nextFloat());
          arrayOfCoord3d[(m + k * 100 + j * 100 * 100)] = localCoord3d;
          arrayOfColor[(m + k * 100 + j * 100 * 100)] = ((ColorMapper)localObject).getColor(localCoord3d);
          i++;
        }
      }
    }
    for (j = i; j < 1000000; j++)
    {
      arrayOfCoord3d[j] = new Coord3d(0.0F, 0.0F, 0.0F);
      arrayOfColor[j] = new Color(0, 0, 0, 1);
    }
    this.a = new AWTScatterMultiColor(arrayOfCoord3d, arrayOfColor, (ColorMapper)localObject);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().add(this.a);
  }
  
  public String getPitch()
  {
    return "Number of points: " + this.a.getData().length + " (see also " + ScatterVBODemo.class.getName() + " for more efficient scatter plots)";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\Scatter4D.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */