package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.colors.Color;
import org.jzy3d.colors.IColorMappable;
import org.jzy3d.colors.colormaps.ColorMapRedAndGreen;

public class AffinityColorGen
  extends ColorMapRedAndGreen
{
  public Color getColor(IColorMappable paramIColorMappable, double paramDouble)
  {
    if (paramDouble > 2.0D) {
      return Color.GREEN;
    }
    return new Color((float)(1.0D - paramDouble / 2.0999999046325684D), (float)(0.0010000000474974513D + paramDouble / 2.0999999046325684D), 0.1F);
  }
  
  public Color getColor(IColorMappable paramIColorMappable, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return getColor(paramIColorMappable, paramDouble3);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\AffinityColorGen.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */