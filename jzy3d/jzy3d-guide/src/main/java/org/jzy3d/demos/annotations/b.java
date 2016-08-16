package org.jzy3d.demos.annotations;

import org.jzy3d.plot3d.builder.concrete.OrthonormalTessellator;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.TesselatedPolygon;

final class b
  extends OrthonormalTessellator
{
  b(ShowBarycenterDistance paramShowBarycenterDistance) {}
  
  protected final AbstractDrawable newQuad(Point[] paramArrayOfPoint)
  {
    if (this.a.a) {
      return new TesselatedPolygon(paramArrayOfPoint);
    }
    Polygon localPolygon = new Polygon();
    for (int i = 0; i < paramArrayOfPoint.length; i++) {
      localPolygon.add(paramArrayOfPoint[i]);
    }
    return localPolygon;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\annotations\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */