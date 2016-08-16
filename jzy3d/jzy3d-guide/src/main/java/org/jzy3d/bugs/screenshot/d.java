package org.jzy3d.bugs.screenshot;

import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.plot3d.rendering.view.Renderer3d;
import org.jzy3d.plot3d.rendering.view.View;

final class d
  extends AWTChartComponentFactory
{
  d(ScreenShotTestNewt paramScreenShotTestNewt) {}
  
  public final Renderer3d newRenderer(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new e(this, paramView, paramBoolean1, paramBoolean2);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\screenshot\d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */