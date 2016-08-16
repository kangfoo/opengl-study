package org.jzy3d.demos.surface;

import org.jzy3d.plot3d.builder.Mapper;

final class c
  extends Mapper
{
  c(WireSurfaceDemo2 paramWireSurfaceDemo2) {}
  
  public final double f(double paramDouble1, double paramDouble2)
  {
    return Math.exp(-(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2) / 10.0D) * Math.abs(Math.cos(6.283185307179586D * (paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2)));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */