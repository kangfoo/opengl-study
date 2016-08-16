package org.jzy3d.demos.histogram.barchart;

import java.awt.Graphics;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.plot2d.primitive.AWTColorbarImageGenerator;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.view.Renderer2d;

public class CustomLegendRenderer
  implements Renderer2d
{
  private final ICanvas a;
  
  public CustomLegendRenderer(ICanvas paramICanvas)
  {
    this.a = paramICanvas;
  }
  
  public void paint(Graphics paramGraphics)
  {
    paramGraphics = 100;
    paramGraphics = 100;
    paramGraphics = this;
    (paramGraphics = new AWTColorbarImageGenerator(new ColorMapper(new AffinityColorGen(), 0.0D, 2.0D), new e(paramGraphics), new f(paramGraphics))).setForegroundColor(Color.BLACK);
    paramGraphics.setHasBackground(false);
    paramGraphics.drawImage(paramGraphics.toImage(Math.max(75, 1), Math.max(75, 1)), this.a.getRendererWidth() - 100, 0, null);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\CustomLegendRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */