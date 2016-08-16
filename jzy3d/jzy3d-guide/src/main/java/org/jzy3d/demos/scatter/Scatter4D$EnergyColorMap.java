package org.jzy3d.demos.scatter;

import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.IColorMappable;
import org.jzy3d.colors.colormaps.AbstractColorMap;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.colors.colormaps.IColorMap;

public class Scatter4D$EnergyColorMap
  extends AbstractColorMap
  implements IColorMap
{
  private boolean a = true;
  private ColorMapper b = new ColorMapper(new ColorMapRainbow(), this.e, this.f);
  private Color c;
  private float d;
  private float e = -1.0F;
  private float f = 1.0F;
  private double g = 0.06283185307179587D;
  
  public void setDirection(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public boolean getDirection()
  {
    return this.a;
  }
  
  public Color getColor(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    this.d = ((float)(Math.sin(paramDouble1 * this.g) * Math.sin(paramDouble2 * this.g) * Math.sin(paramDouble3 * this.g)));
    this.c = this.b.getColor(this.d);
    this.c.alphaSelf((float)Math.abs(this.d / 5.0D));
    return this.c;
  }
  
  public Color getColor(IColorMappable paramIColorMappable, double paramDouble)
  {
    this.c = this.b.getColor(paramDouble);
    return this.c;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\Scatter4D$EnergyColorMap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */