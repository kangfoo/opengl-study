package org.jzy3d.demos.chart2d.histogram;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.Histogram;
import org.jzy3d.plot2d.primitives.Histogram2d;

public class Histogram2dPredefinedDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new Histogram2dPredefinedDemo());
  }
  
  public void init()
  {
    (localObject = new Histogram(0.0F, 1.0F, 10)).setCount(0, 3);
    ((Histogram)localObject).setCount(1, 6);
    ((Histogram)localObject).setCount(2, 8);
    ((Histogram)localObject).setCount(3, 12);
    ((Histogram)localObject).setCount(4, 13);
    ((Histogram)localObject).setCount(5, 17);
    ((Histogram)localObject).setCount(6, 15);
    ((Histogram)localObject).setCount(7, 11);
    ((Histogram)localObject).setCount(8, 9);
    ((Histogram)localObject).setCount(9, 7);
    Object localObject = new Histogram2d((Histogram)localObject);
    this.chart = initializeChart().black().view2d();
    ((Histogram2d)localObject).addTo(this.chart);
  }
  
  public String getPitch()
  {
    return "Build a 2d histogram based on the declaration of bin size and (x) value.";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\histogram\Histogram2dPredefinedDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */