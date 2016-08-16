package org.jzy3d.works.chart2d.legend;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorAWT;
import org.jzy3d.plot2d.primitive.AWTAbstractImageGenerator;
import org.jzy3d.plot2d.primitives.Serie2d;

final class b
  extends AWTAbstractImageGenerator
{
  b(AWTSeriesLegend paramAWTSeriesLegend) {}
  
  public final BufferedImage toImage(int paramInt1, int paramInt2)
  {
    Graphics2D localGraphics2D = (paramInt2 = new BufferedImage(paramInt1, paramInt2, 2)).createGraphics();
    configureText(localGraphics2D);
    int i = this.a.a.size();
    int j = 15;
    i = 15 * (i + 1);
    drawBackground(paramInt1, i, localGraphics2D);
    Iterator localIterator = this.a.a.iterator();
    while (localIterator.hasNext())
    {
      Object localObject3;
      Object localObject2 = (localObject3 = localObject1 = (Serie2d)localIterator.next()) != null ? ((Serie2d)localObject3).getColor() : Color.GRAY;
      Object localObject1 = (localObject3 = localObject1) != null ? ((Serie2d)localObject3).getName() : "unknown";
      int k = j;
      localObject2 = localGraphics2D;
      localObject1 = localObject1;
      if ((localObject3 = localObject2) != null)
      {
        ((Graphics2D)localObject2).setColor(ColorAWT.toAWT((Color)localObject3));
        ((Graphics2D)localObject2).drawLine(0, k, 15, k);
      }
      ((Graphics2D)localObject2).drawString((String)localObject1, 20, k + 5);
      j += 15;
    }
    drawLegendBorder(localGraphics2D, paramInt1, i);
    return paramInt2;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\legend\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */