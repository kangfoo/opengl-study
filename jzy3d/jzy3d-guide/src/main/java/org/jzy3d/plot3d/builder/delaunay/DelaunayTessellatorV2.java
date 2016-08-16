package org.jzy3d.plot3d.builder.delaunay;

import il.ac.idc.jdt.DelaunayTriangulation;
import il.ac.idc.jdt.Triangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.builder.Tessellator;
import org.jzy3d.plot3d.primitives.AbstractComposite;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.Shape;

public class DelaunayTessellatorV2
  extends Tessellator
{
  public AbstractComposite build(List<Coord3d> paramList)
  {
    Shape localShape;
    (localShape = new Shape()).add(a(paramList));
    return localShape;
  }
  
  private static List<Polygon> a(List<Coord3d> paramList)
  {
    Object localObject1 = new DelaunayTriangulation();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject2 = (Coord3d)paramList.next();
      ((DelaunayTriangulation)localObject1).insertPoint(JDTTypeConverter.a((Coord3d)localObject2));
    }
    paramList = new ArrayList(((DelaunayTriangulation)localObject1).trianglesSize());
    Object localObject2 = ((DelaunayTriangulation)localObject1).trianglesIterator();
    while (((Iterator)localObject2).hasNext()) {
      if (!(localObject1 = (Triangle)((Iterator)localObject2).next()).isHalfplane()) {
        paramList.add(JDTTypeConverter.a((Triangle)localObject1));
      }
    }
    return paramList;
  }
  
  public AbstractComposite build(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    throw new RuntimeException("not implemented");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\plot3d\builder\delaunay\DelaunayTessellatorV2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */