package org.jzy3d.demos.chart2d.histogram;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.Histogram;
import org.jzy3d.plot2d.primitives.Histogram2d;
import org.jzy3d.plot3d.primitives.AbstractComposite;

public class Histogram2dAddDemo
  extends AbstractAnalysis
{
  private static int a = 1000000;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new Histogram2dAddDemo());
  }
  
  public String getPitch()
  {
    return "Build a 2d histogram based on a random distribution of " + a + " values.\nDistribution range does not need to be known in advance.";
  }
  
  public void init()
  {
    Object localObject = this;
    (localObject = new Histogram2d(a(-10.0F, 10.0F, 70, Histogram2dAddDemo.Distribution.a, a))).getDrawable().setWireframeDisplayed(true);
    localObject = localObject;
    this.chart = initializeChart().black().view2d();
    ((Histogram2d)localObject).addTo(this.chart);
  }
  
  private static Histogram a(float paramFloat1, float paramFloat2, int paramInt1, Histogram2dAddDemo.Distribution paramDistribution, int paramInt2)
  {
    paramFloat1 = new Histogram(-10.0F, 10.0F, 70);
    if (Histogram2dAddDemo.Distribution.a.equals(paramDistribution))
    {
      paramFloat2 = new Random(0L);
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        paramFloat1.add((float)paramFloat2.nextGaussian());
      }
    }
    else if (Histogram2dAddDemo.Distribution.b.equals(paramDistribution))
    {
      paramFloat2 = new Random(0L);
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        paramDistribution = (float)(paramFloat2.nextGaussian() - Math.random() > 0.8D ? Math.random() : 1.0D);
        paramFloat1.add(paramDistribution);
      }
    }
    else if (Histogram2dAddDemo.Distribution.c.equals(paramDistribution))
    {
      for (paramFloat2 = 0; paramFloat2 < paramInt2; paramFloat2++) {
        paramFloat1.add((float)Math.random());
      }
    }
    return paramFloat1;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\histogram\Histogram2dAddDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */