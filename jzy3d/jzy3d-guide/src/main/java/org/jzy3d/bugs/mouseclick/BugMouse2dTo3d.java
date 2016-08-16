package org.jzy3d.bugs.mouseclick;

import java.io.PrintStream;
import java.util.Random;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.LineStrip;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class BugMouse2dTo3d
{
  private static int a = 2;
  private static Chart b;
  
  public static void main(String[] paramArrayOfString)
  {
    b = new AWTChart(Quality.Nicest);
    paramArrayOfString = new Random();
    for (int i = 0; i < a; i++)
    {
      LineStrip localLineStrip;
      (localLineStrip = new LineStrip()).add(new Point(new Coord3d(paramArrayOfString.nextInt(500), paramArrayOfString.nextInt(500), paramArrayOfString.nextInt(500)), new Color(paramArrayOfString.nextInt(), paramArrayOfString.nextInt(), paramArrayOfString.nextInt())));
      localLineStrip.add(new Point(new Coord3d(paramArrayOfString.nextInt(500), paramArrayOfString.nextInt(500), paramArrayOfString.nextInt(500)), new Color(paramArrayOfString.nextInt(), paramArrayOfString.nextInt(), paramArrayOfString.nextInt())));
      b.getScene().getGraph().add(localLineStrip);
    }
    paramArrayOfString = b;
    new a(paramArrayOfString);
    ChartLauncher.openChart(paramArrayOfString);
  }
  
  public static void a(Coord3d paramCoord3d)
  {
    System.out.println(paramCoord3d);
    new Random();
    LineStrip localLineStrip = new LineStrip();
    Coord3d localCoord3d1 = new Coord3d(paramCoord3d.x, b.getScene().getGraph().getBounds().getYmin(), paramCoord3d.z);
    localLineStrip.add(new Point(localCoord3d1, Color.GREEN));
    Coord3d localCoord3d2 = new Coord3d(paramCoord3d.x, b.getScene().getGraph().getBounds().getYmax(), paramCoord3d.z);
    localLineStrip.add(new Point(localCoord3d2, Color.YELLOW));
    b.getScene().getGraph().add(localLineStrip);
    System.out.println("start" + localCoord3d1);
    System.out.println("end" + localCoord3d2);
    (localLineStrip = new LineStrip()).add(new Point(new Coord3d(b.getScene().getGraph().getBounds().getXmin(), paramCoord3d.y, paramCoord3d.z), Color.RED));
    localLineStrip.add(new Point(new Coord3d(b.getScene().getGraph().getBounds().getXmax(), paramCoord3d.y, paramCoord3d.z), Color.CYAN));
    b.getScene().getGraph().add(localLineStrip);
    System.out.println("1start" + localLineStrip.get(0));
    System.out.println("1end" + localLineStrip.get(1));
    b.render();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\mouseclick\BugMouse2dTo3d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */