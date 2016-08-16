package org.jzy3d.works.chart2d;

import org.jzy3d.works.chart2d.pitch.PitchAmpliControlCharts;
import org.jzy3d.works.chart2d.pitch.PitchAmpliGenerator;
import org.jzy3d.works.chart2d.pitch.TimeChartWindow;

public class PitchAmpliLegendDemo
{
  private static float a = 15.0F;
  private static int b = 880;
  private static int c = 5;
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new PitchAmpliControlCharts(a, b, c);
    new TimeChartWindow(paramArrayOfString.a());
    new PitchAmpliGenerator().a(paramArrayOfString, a, b, 50);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\PitchAmpliLegendDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */