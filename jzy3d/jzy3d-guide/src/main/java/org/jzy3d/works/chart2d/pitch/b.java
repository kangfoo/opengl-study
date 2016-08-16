package org.jzy3d.works.chart2d.pitch;

import org.jzy3d.chart2d.Chart2dComponentFactory;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;
import org.jzy3d.works.chart2d.legend.LegendViewportLayout;

final class b
  extends Chart2dComponentFactory
{
  public final IViewportLayout newViewportLayout()
  {
    return new LegendViewportLayout();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */