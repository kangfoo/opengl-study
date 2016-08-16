package org.jzy3d.demos.histogram.barchart;

import java.awt.Graphics2D;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.IntegerCoord2d;
import org.jzy3d.plot3d.rendering.tooltips.TextTooltipRenderer;

final class g
  extends TextTooltipRenderer
{
  private final BarChartBar a;
  private boolean b = false;
  
  public g(String paramString, BarChartBar paramBarChartBar)
  {
    super(paramString, new IntegerCoord2d(), paramBarChartBar.getBounds().getCenter());
    this.a = paramBarChartBar;
  }
  
  public final void render(Graphics2D paramGraphics2D)
  {
    if (this.b)
    {
      updateTargetCoordinate(this.a.getBounds().getCenter());
      IntegerCoord2d localIntegerCoord2d = this.a.b();
      updateScreenPosition(localIntegerCoord2d);
      this.text = this.a.a();
      super.render(paramGraphics2D);
    }
  }
  
  final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\g.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */