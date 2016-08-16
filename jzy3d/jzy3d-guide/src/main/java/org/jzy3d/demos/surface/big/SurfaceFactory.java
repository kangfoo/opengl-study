package org.jzy3d.demos.surface.big;

import org.jzy3d.maths.Range;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.CompileableComposite;

public class SurfaceFactory
{
  public static CompileableComposite a(Rectangle paramRectangle, Mapper paramMapper, int paramInt1, int paramInt2)
  {
    int i = paramRectangle.width - 1;
    int j = paramRectangle.height - 1;
    Range localRange = new Range(paramRectangle.x, paramRectangle.x + i);
    paramRectangle = new Range(paramRectangle.y, paramRectangle.y + j);
    paramInt1 = paramInt1 == -1 ? i : paramInt1;
    paramInt2 = paramInt2 == -1 ? j : paramInt2;
    return Builder.buildOrthonormalBig(paramRectangle = new OrthonormalGrid(localRange, paramInt1, paramRectangle, paramInt2), paramMapper);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\big\SurfaceFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */