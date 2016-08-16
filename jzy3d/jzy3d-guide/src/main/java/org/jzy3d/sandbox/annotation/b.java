package org.jzy3d.sandbox.annotation;

import org.jzy3d.plot3d.builder.concrete.OrthonormalTessellator;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.TesselatedPolygon;

final class b
  extends OrthonormalTessellator
{
  b(FaceOrderingProblemSnippet paramFaceOrderingProblemSnippet) {}
  
  protected final AbstractDrawable newQuad(Point[] paramArrayOfPoint)
  {
    return paramArrayOfPoint = new TesselatedPolygon(paramArrayOfPoint);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\annotation\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */