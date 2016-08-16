package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.plot3d.primitives.axes.layout.providers.SmartTickProvider;

public class DiscreteTickProvider
  extends SmartTickProvider
{
  public double[] generateTicks(double paramDouble1, double paramDouble2)
  {
    double d2 = paramDouble2;
    double d1 = paramDouble1;
    return generateTicks(paramDouble1, paramDouble2, (int)Math.ceil((d2 - d1) / 54.0D));
  }
  
  public double[] generateTicks(double paramDouble1, double paramDouble2, int paramInt)
  {
    ;
    paramDouble2 = new double[paramInt = Math.max(0, paramInt)];
    for (??? = 0; ??? < paramInt; ???++) {
      paramDouble2[???] = (paramDouble1 + 20.0D + (??? << 1) * 27.0F);
    }
    return paramDouble2;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\DiscreteTickProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */