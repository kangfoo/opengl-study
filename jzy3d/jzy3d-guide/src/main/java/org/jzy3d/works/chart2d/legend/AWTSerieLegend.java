package org.jzy3d.works.chart2d.legend;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import java.awt.Font;
import java.awt.image.BufferedImage;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitive.AWTImageGenerator;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.legends.AWTLegend;

public class AWTSerieLegend
  extends AWTLegend
{
  protected Serie2d a;
  
  public AWTSerieLegend(Serie2d paramSerie2d)
  {
    this(paramSerie2d.getDrawable());
    this.a = paramSerie2d;
  }
  
  private AWTSerieLegend(AbstractDrawable paramAbstractDrawable)
  {
    this(paramAbstractDrawable, Color.BLACK, Color.WHITE);
  }
  
  private AWTSerieLegend(AbstractDrawable paramAbstractDrawable, Color paramColor1, Color paramColor2)
  {
    super(paramAbstractDrawable, paramColor1, paramColor2);
    this.minimumDimension = new Dimension(100, 100);
    paramAbstractDrawable.setLegend(this);
    paramAbstractDrawable = this;
    this.imageGenerator = new a(paramAbstractDrawable);
    this.imageGenerator.setHasBackground(true);
    this.imageGenerator.setFont(new Font("Helvetica", 0, 12));
    setGeneratorColors();
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
      return this.imageGenerator.toImage(Math.max(paramInt1 - 25, 1), Math.max(paramInt2 - 25, 1));
    }
    return null;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\legend\AWTSerieLegend.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */