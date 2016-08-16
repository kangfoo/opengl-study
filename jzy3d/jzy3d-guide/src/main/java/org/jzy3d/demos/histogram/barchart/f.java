package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.plot3d.primitives.axes.layout.renderers.ITickRenderer;

final class f
  implements ITickRenderer
{
  f(CustomLegendRenderer paramCustomLegendRenderer) {}
  
  public final String format(double paramDouble)
  {
    switch ((int)paramDouble)
    {
    case 0: 
      return "Single-feat.";
    case 1: 
      return "Group-feat.";
    case 2: 
      return "Infrastructural";
    }
    return "";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\f.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */