package org.jzy3d.demos.overlay;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import org.jzy3d.plot3d.rendering.view.Renderer2d;

final class a
  implements Renderer2d
{
  a(OverlayDemo paramOverlayDemo) {}
  
  public final void paint(Graphics paramGraphics)
  {
    (paramGraphics = (Graphics2D)paramGraphics).setStroke(new BasicStroke(4.0F));
    paramGraphics.setColor(Color.BLACK);
    paramGraphics.drawRect(10, 50, 100, 100);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\overlay\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */