package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.plot3d.primitives.axes.layout.renderers.ITickRenderer;

final class d
  implements ITickRenderer
{
  d(BarChartDemo paramBarChartDemo) {}
  
  public final String format(double paramDouble)
  {
    return "f" + BarChartDemo.a(this.a, paramDouble);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */