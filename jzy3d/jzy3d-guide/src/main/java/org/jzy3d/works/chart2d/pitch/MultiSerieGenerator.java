package org.jzy3d.works.chart2d.pitch;

import java.util.Iterator;
import java.util.List;
import org.jzy3d.plot2d.primitives.Serie2d;

public class MultiSerieGenerator
{
  private long a;
  
  public final void a(MultiSerieChart paramMultiSerieChart, double paramDouble1, double paramDouble2, int paramInt)
  {
    paramInt = this;
    this.a = System.nanoTime();
    while (a() < paramDouble1)
    {
      paramInt = paramMultiSerieChart.a().iterator();
      while (paramInt.hasNext())
      {
        Serie2d localSerie2d = (Serie2d)paramInt.next();
        Thread.sleep(10L);
        double d = Math.random() * paramDouble2;
        localSerie2d.add(a(), d);
      }
    }
  }
  
  private double a()
  {
    return (System.nanoTime() - this.a) / 1.0E9D;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\MultiSerieGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */