package org.jzy3d.works.peeling;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.Cylinder;
import org.jzy3d.plot3d.primitives.LineStrip;
import org.jzy3d.plot3d.primitives.ParallelepipedComposite;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ddp.DepthPeelingChart;
import org.jzy3d.plot3d.rendering.view.View;

public class PeeledStackDemo
{
  private static Color a = new Color(0.5F, 0.5F, 0.5F, 0.5F);
  private static Color b = Color.BLACK;
  private static int c = 100;
  private static int d = 10;
  private static int e = 30;
  
  public static void main(String[] paramArrayOfString)
  {
    a(paramArrayOfString = DepthPeelingChart.get(Quality.Fastest, "awt"), c, d, 0, a, b);
    a(paramArrayOfString, c, d, 20, a, b);
    Coord3d localCoord3d1 = new Coord3d(0.0D, 0.0D, -2.5D);
    Coord3d localCoord3d2 = new Coord3d(10.0F, 10.0F, 19.0F);
    a(paramArrayOfString, localCoord3d1, 5.0F, 15.0F, Color.CYAN);
    a(paramArrayOfString, localCoord3d2, 5.0F, 15.0F, Color.CYAN);
    int i = 3;
    Coord3d localCoord3d3 = localCoord3d2;
    localCoord3d2 = localCoord3d1;
    String[] arrayOfString = paramArrayOfString;
    LineStrip localLineStrip;
    (localLineStrip = new LineStrip()).add(new Point(localCoord3d2, Color.CYAN));
    localLineStrip.add(new Point(localCoord3d3, Color.CYAN));
    localLineStrip.setWidth(3.0F);
    arrayOfString.getScene().add(localLineStrip);
    paramArrayOfString.getView().setAxeBoxDisplayed(false);
    paramArrayOfString.getView().setSquared(true);
    ChartLauncher.openChart(paramArrayOfString, new Rectangle(0, 0, 600, 600), "Stack Demo");
    ChartLauncher.instructions();
  }
  
  private static void a(Chart paramChart, Coord3d paramCoord3d, float paramFloat1, float paramFloat2, Color paramColor)
  {
    (paramFloat1 = new Cylinder()).setData(paramCoord3d, 5.0F, 15.0F, e, 1, paramColor);
    paramChart.getScene().add(paramFloat1);
  }
  
  private static void a(Chart paramChart, int paramInt1, int paramInt2, int paramInt3, Color paramColor1, Color paramColor2)
  {
    paramInt1 = new BoundingBox3d(-paramInt1 / 2, paramInt1 / 2, -paramInt1 / 2, paramInt1 / 2, paramInt3 - paramInt2 / 2, paramInt3 + paramInt2 / 2);
    (paramInt1 = new ParallelepipedComposite(paramInt1)).setColor(paramColor1);
    paramInt1.setWireframeColor(paramColor2);
    paramChart.getScene().add(paramInt1);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\peeling\PeeledStackDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */