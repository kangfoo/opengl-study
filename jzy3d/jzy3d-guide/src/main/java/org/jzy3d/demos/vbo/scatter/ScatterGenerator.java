package org.jzy3d.demos.vbo.scatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Range;

public class ScatterGenerator
{
  public static List<Coord3d> a(int paramInt)
  {
    ArrayList localArrayList = new ArrayList(paramInt);
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < paramInt; i++)
    {
      double d1 = 2.0D * localRandom.nextDouble();
      double d2 = 2.0D * localRandom.nextDouble();
      double d4;
      if ((d4 = localRandom.nextDouble()) > 0.75D)
      {
        d1 = -d1;
        d2 = -d2;
      }
      if ((d4 > 0.5D) && (d4 <= 0.75D)) {
        d1 = -d1;
      }
      if ((d4 > 0.25D) && (d4 <= 0.5D)) {
        d2 = -d2;
      }
      double d5 = Math.cos(2.0D * (d1 * d1 + d2 * d2));
      double d6 = Math.cos(d1 / 4.0D) * Math.sin(d2);
      double d7 = d1 * d1 + d2 * d2;
      double d3 = Math.pow(2.718281828459045D, -d7) * d6 * d5;
      localArrayList.add(new Coord3d(d1, d2, d3));
    }
    return localArrayList;
  }
  
  public static ColorMapper a(List<Coord3d> paramList)
  {
    paramList = Coord3d.getZRange(paramList);
    return paramList = new ColorMapper(new ColorMapRainbow(), paramList.getMin(), paramList.getMax(), new Color(1.0F, 1.0F, 1.0F, 0.5F));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\vbo\scatter\ScatterGenerator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */