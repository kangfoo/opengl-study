package org.jzy3d.demos.histogram.barchart;

import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.rendering.view.View;

final class b
  extends Shape
{
  b(BarChartBar paramBarChartBar, List paramList)
  {
    super(paramList);
  }
  
  public final boolean isDisplayed()
  {
    BoundingBox3d localBoundingBox3d1 = BarChartBar.a(this.a).getView().getAxe().getBoxBounds();
    BoundingBox3d localBoundingBox3d2 = getBounds();
    return (localBoundingBox3d1.getXmax() >= localBoundingBox3d2.getXmax()) && (localBoundingBox3d1.getYmax() >= localBoundingBox3d2.getYmax()) && (localBoundingBox3d2.getXmin() >= localBoundingBox3d1.getXmin()) && (localBoundingBox3d2.getYmin() >= localBoundingBox3d1.getYmin());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */