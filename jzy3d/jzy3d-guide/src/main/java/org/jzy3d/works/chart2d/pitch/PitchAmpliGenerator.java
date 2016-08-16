package org.jzy3d.works.chart2d.pitch;

import org.jzy3d.plot2d.primitives.Serie2d;

public class PitchAmpliGenerator
{
  private long a;
  
  public final void a(PitchAmpliControlCharts paramPitchAmpliControlCharts, double paramDouble1, double paramDouble2, int paramInt)
  {
    paramInt = this;
    this.a = System.nanoTime();
    while (a() < paramDouble1)
    {
      double d1 = Math.random() * paramDouble2;
      double d2 = Math.random();
      paramPitchAmpliControlCharts.a.add(a(), d1);
      paramPitchAmpliControlCharts.b.add(a(), d2);
      Thread.sleep(50L);
    }
  }
  
  private double a()
  {
    return (System.nanoTime() - this.a) / 1.0E9D;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\PitchAmpliGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */