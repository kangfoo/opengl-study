package org.jzy3d.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class BookDelaunay
  extends AbstractAnalysis
{
  private static int a = 1000;
  
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    AnalysisLauncher.open(paramArrayOfString = new BookDelaunay());
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/" + BookDelaunay.class.getSimpleName() + ".png");
  }
  
  public void init()
  {
    Object localObject = new ArrayList(a);
    Random localRandom = new Random();
    for (int i = 0; i < a; i++)
    {
      double d1 = 2.0D * localRandom.nextDouble();
      double d2 = 2.0D * localRandom.nextDouble();
      double d4;
      if ((d4 = localRandom.nextDouble()) > 0.75D)
      {
        d1 = -d1;
        d2 = -d2;
      }
      if ((d4 > 0.5D) && (d4 <= 0.75D)) {
        d1 = -d1;
      }
      if ((d4 > 0.25D) && (d4 <= 0.5D)) {
        d2 = -d2;
      }
      double d5 = Math.cos(2.0D * (d1 * d1 + d2 * d2));
      double d6 = Math.cos(d1 / 4.0D) * Math.sin(d2);
      double d7 = d1 * d1 + d2 * d2;
      double d3 = Math.pow(2.718281828459045D, -d7) * d6 * d5;
      ((List)localObject).add(new Coord3d(d1, d2, d3));
    }
    (localObject = Builder.buildDelaunay(localObject = localObject)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject).getBounds().getZmin(), ((Shape)localObject).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject).setFaceDisplayed(true);
    ((Shape)localObject).setWireframeDisplayed(true);
    ((Shape)localObject).setWireframeColor(Color.BLACK);
    this.chart = new AWTChart(Quality.Advanced, getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookDelaunay.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */