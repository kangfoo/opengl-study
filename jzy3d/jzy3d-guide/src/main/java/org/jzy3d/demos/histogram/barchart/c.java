package org.jzy3d.demos.histogram.barchart;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import org.jzy3d.chart.Chart;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.view.Renderer2d;

final class c
  implements Renderer2d
{
  c(BarChartDemo paramBarChartDemo) {}
  
  public final void paint(Graphics paramGraphics)
  {
    paramGraphics.setColor(Color.BLUE);
    paramGraphics.setFont(paramGraphics.getFont().deriveFont(1, 16.0F));
    paramGraphics.drawString("Chart", (int)(15.0D + 0.05D * BarChartDemo.a(this.a).getCanvas().getRendererWidth()), (int)(15.0D + 0.05D * BarChartDemo.b(this.a).getCanvas().getRendererHeight()));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */