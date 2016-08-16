package org.jzy3d.demos.animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import org.jzy3d.plot3d.builder.IncreaseParamRemapTask;
import org.jzy3d.plot3d.rendering.view.Renderer2d;

final class c
  implements Renderer2d
{
  c(AnimatedSurfaceDemo paramAnimatedSurfaceDemo) {}
  
  public final void paint(Graphics paramGraphics)
  {
    (paramGraphics = (Graphics2D)paramGraphics).setColor(Color.BLACK);
    paramGraphics.drawString(this.a.a.getInfo(), 50, 50);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\animation\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */