package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.plot3d.primitives.axes.layout.providers.AbstractTickProvider;

final class e
  extends AbstractTickProvider
{
  e(CustomLegendRenderer paramCustomLegendRenderer) {}
  
  public final double[] generateTicks(double paramDouble1, double paramDouble2, int paramInt)
  {
    return new double[] { 0.0D, 1.0D, 2.0D };
  }
  
  public final int getDefaultSteps()
  {
    return 3;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */