package org.jzy3d.demos.animation;

import org.jzy3d.plot3d.builder.SingleParameterMapper;

final class b
  extends SingleParameterMapper
{
  b(AnimatedSurfaceDemo paramAnimatedSurfaceDemo, double paramDouble)
  {
    super(0.999D);
  }
  
  public final double f(double paramDouble1, double paramDouble2)
  {
    return 10.0D * Math.sin(paramDouble1 * this.p) * Math.cos(paramDouble2 * this.p) * paramDouble1;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\animation\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */