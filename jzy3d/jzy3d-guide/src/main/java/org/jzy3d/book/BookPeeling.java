package org.jzy3d.book;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.AbstractGeometry.PolygonMode;
import org.jzy3d.plot3d.primitives.ParallelepipedComposite;
import org.jzy3d.plot3d.primitives.ParallelepipedComposite.PolygonType;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ddp.DepthPeelingChart;
import org.jzy3d.plot3d.rendering.ddp.algorithms.PeelingMethod;
import org.jzy3d.plot3d.rendering.view.View;

public class BookPeeling
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    a(paramArrayOfString = new Chart(Quality.Advanced));
    ChartLauncher.openChart(paramArrayOfString, new Rectangle(600, 0, 600, 600));
    Chart localChart;
    a(localChart = DepthPeelingChart.get(Quality.Fastest, "awt", PeelingMethod.DUAL_PEELING_MODE));
    ChartLauncher.openChart(localChart, new Rectangle(0, 0, 600, 600));
    Thread.sleep(10000L);
    ChartLauncher.screenshot(paramArrayOfString, "data/book/BookPeelingOff.png");
    ChartLauncher.screenshot(localChart, "data/book/BookPeelingOn.png");
  }
  
  private static void a(Chart paramChart)
  {
    paramChart.getView().setAxeBoxDisplayed(false);
    a(paramChart, 0.01F, 0.01F, Coord3d.ORIGIN, Color.BLUE, Color.BLACK);
    a(paramChart, 0.01F, 0.01F, new Coord3d(0.005F, 0.005F, 0.005F), new Color(1.0F, 0.0F, 0.0F, 0.5F), Color.BLACK);
    a(paramChart, 0.01F, 0.01F, new Coord3d(0.01F, 0.01F, 0.01F), new Color(0.0F, 1.0F, 0.0F, 0.5F), Color.BLACK);
  }
  
  private static void a(Chart paramChart, float paramFloat1, float paramFloat2, Coord3d paramCoord3d, Color paramColor1, Color paramColor2)
  {
    paramFloat1 = new BoundingBox3d(paramCoord3d.x - 0.005F, paramCoord3d.x + 0.005F, paramCoord3d.y - 0.005F, paramCoord3d.y + 0.005F, paramCoord3d.z - 0.005F, paramCoord3d.z + 0.005F);
    (paramFloat1 = new ParallelepipedComposite(paramFloat1, ParallelepipedComposite.PolygonType.SIMPLE)).setPolygonMode(AbstractGeometry.PolygonMode.FRONT_AND_BACK);
    paramFloat1.setPolygonOffsetFill(true);
    paramFloat1.setColor(paramColor1);
    paramFloat1.setWireframeColor(paramColor2);
    paramFloat1.setWireframeDisplayed(true);
    paramChart.getScene().add(paramFloat1);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookPeeling.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */