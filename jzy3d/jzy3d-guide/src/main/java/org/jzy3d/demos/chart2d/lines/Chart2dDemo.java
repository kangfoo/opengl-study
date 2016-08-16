package org.jzy3d.demos.chart2d.lines;

import java.io.PrintStream;
import org.jzy3d.plot2d.primitives.Serie2d;

public class Chart2dDemo
{
  private static float a = 60.0F;
  private static int b = 50;
  private static int c = 880;
  private static int d = 5;
  private static long e;
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new Chart2dDemo.PitchAmpliControlCharts(a, c, d);
    new Chart2dDemo.TimeChartWindow(paramArrayOfString.a());
    paramArrayOfString = paramArrayOfString;
    System.out.println("will generate approx. " + a * 1000.0F / b + " samples");
    e = System.nanoTime();
    while (a() < a)
    {
      double d1 = Math.random() * c;
      double d2 = Math.random();
      paramArrayOfString.a.add(a(), d1);
      paramArrayOfString.b.add(a(), d2);
      Thread.sleep(b);
    }
  }
  
  private static double a()
  {
    return (System.nanoTime() - e) / 1.0E9D;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\lines\Chart2dDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */