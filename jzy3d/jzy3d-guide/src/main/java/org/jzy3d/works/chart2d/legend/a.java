package org.jzy3d.works.chart2d.legend;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorAWT;
import org.jzy3d.colors.ISingleColorable;
import org.jzy3d.plot2d.primitive.AWTAbstractImageGenerator;
import org.jzy3d.plot2d.primitives.Serie2d;

final class a
  extends AWTAbstractImageGenerator
{
  a(AWTSerieLegend paramAWTSerieLegend) {}
  
  public final BufferedImage toImage(int paramInt1, int paramInt2)
  {
    Object localObject3 = this;
    Object localObject1 = (AWTSerieLegend.a(((a)localObject3).a) instanceof ISingleColorable) ? ((ISingleColorable)AWTSerieLegend.b(((a)localObject3).a)).getColor() : this.a.a != null ? ((a)localObject3).a.a.getColor() : null;
    localObject3 = this;
    localObject3 = this.a.a != null ? ((a)localObject3).a.a.getName() : "unknown";
    Graphics2D localGraphics2D1 = (paramInt2 = new BufferedImage(paramInt1, paramInt2, 2)).createGraphics();
    configureText(localGraphics2D1);
    drawBackground(paramInt1, 30, localGraphics2D1);
    int i = 15;
    Graphics2D localGraphics2D2 = localGraphics2D1;
    Object localObject2 = localObject3;
    if ((localObject3 = localObject1) != null)
    {
      localGraphics2D2.setColor(ColorAWT.toAWT((Color)localObject3));
      localGraphics2D2.drawLine(0, 15, 15, 15);
    }
    localGraphics2D2.drawString((String)localObject2, 20, 20);
    drawLegendBorder(localGraphics2D1, paramInt1, 30);
    return paramInt2;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\legend\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */