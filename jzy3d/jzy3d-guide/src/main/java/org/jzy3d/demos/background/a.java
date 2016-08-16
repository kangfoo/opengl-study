package org.jzy3d.demos.background;

import org.jzy3d.plot3d.builder.Mapper;

final class a
  extends Mapper
{
  a(BackgroundDemo paramBackgroundDemo) {}
  
  public final double f(double paramDouble1, double paramDouble2)
  {
    return 10.0D * Math.sin(paramDouble1 / 10.0D) * Math.cos(paramDouble2 / 20.0D) * paramDouble1;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\background\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */