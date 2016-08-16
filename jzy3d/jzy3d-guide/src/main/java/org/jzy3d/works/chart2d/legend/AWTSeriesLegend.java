package org.jzy3d.works.chart2d.legend;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitive.AWTImageGenerator;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.legends.AWTLegend;

public class AWTSeriesLegend
  extends AWTLegend
{
  private int b = 25;
  protected List<Serie2d> a;
  
  public AWTSeriesLegend()
  {
    this(new ArrayList());
  }
  
  private AWTSeriesLegend(List<Serie2d> paramList)
  {
    this(paramList, Color.BLACK, Color.WHITE);
  }
  
  private AWTSeriesLegend(List<Serie2d> paramList, Color paramColor1, Color paramColor2)
  {
    super(null, paramColor1, paramColor2);
    this.a = paramList;
    this.minimumDimension = new Dimension(100, 100);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramColor1 = (Serie2d)paramList.next();
      a(paramColor1);
    }
    paramList = this;
    this.imageGenerator = new b(paramList);
    paramList.imageGenerator.setHasBackground(true);
    paramList.imageGenerator.setFont(new Font("Helvetica", 0, 12));
  }
  
  public final void a(Serie2d paramSerie2d)
  {
    paramSerie2d.getDrawable().setLegend(this);
    this.a.add(paramSerie2d);
  }
  
  public void render(GL paramGL, GLU paramGLU)
  {
    paramGL.glEnable(3042);
    super.render(paramGL, paramGLU);
  }
  
  public BufferedImage toImage(int paramInt1, int paramInt2)
  {
    if (this.imageGenerator != null)
    {
      setGeneratorColors();
      return this.imageGenerator.toImage(Math.max(paramInt1 - this.b, 1), Math.max(paramInt2 - this.b, 1));
    }
    return null;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\legend\AWTSeriesLegend.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */