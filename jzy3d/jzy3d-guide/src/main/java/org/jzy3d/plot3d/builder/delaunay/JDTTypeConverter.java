package org.jzy3d.plot3d.builder.delaunay;

import il.ac.idc.jdt.Triangle;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Polygon;

public class JDTTypeConverter
{
  public static il.ac.idc.jdt.Point a(Coord3d paramCoord3d)
  {
    return new il.ac.idc.jdt.Point(paramCoord3d.x, paramCoord3d.y, paramCoord3d.z);
  }
  
  private static Coord3d a(il.ac.idc.jdt.Point paramPoint)
  {
    return new Coord3d((float)paramPoint.getX(), (float)paramPoint.getY(), (float)paramPoint.getZ());
  }
  
  public static Polygon a(Triangle paramTriangle)
  {
    Coord3d localCoord3d1 = a(paramTriangle.getA());
    Coord3d localCoord3d2 = a(paramTriangle.getB());
    paramTriangle = a(paramTriangle.getC());
    Polygon localPolygon;
    (localPolygon = new Polygon()).add(new org.jzy3d.plot3d.primitives.Point(localCoord3d1));
    localPolygon.add(new org.jzy3d.plot3d.primitives.Point(localCoord3d2));
    localPolygon.add(new org.jzy3d.plot3d.primitives.Point(paramTriangle));
    return localPolygon;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\plot3d\builder\delaunay\JDTTypeConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */