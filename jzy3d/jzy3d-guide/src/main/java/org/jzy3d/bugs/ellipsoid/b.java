package org.jzy3d.bugs.ellipsoid;

import org.jzy3d.plot3d.builder.Mapper;

final class b
  extends Mapper
{
  b(Application paramApplication) {}
  
  public final double f(double paramDouble1, double paramDouble2)
  {
    if ((paramDouble1 < -25.0D) || (paramDouble1 > 25.0D) || (paramDouble2 < -Application.a(paramDouble1)) || (paramDouble2 > Application.a(paramDouble1))) {
      return NaN.0D;
    }
    return -Math.sqrt(1.0D - paramDouble1 * paramDouble1 / 625.0D - paramDouble2 * paramDouble2 / 64.0D);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\ellipsoid\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */