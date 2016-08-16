package org.jzy3d.demos.composites;

import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractComposite;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.Quad;
import org.jzy3d.plot3d.text.drawable.DrawableTextBitmap;

public class MyCustomCylinder
  extends AbstractComposite
{
  private Polygon a;
  
  public final void a(Coord3d paramCoord3d, float paramFloat1, float paramFloat2, int paramInt, Color paramColor)
  {
    this.a = new Polygon();
    for (paramFloat2 = 0; paramFloat2 < 15; paramFloat2++)
    {
      paramInt = paramFloat2 * 2.0F * 3.1415927F / 15.0F;
      float f = (paramFloat2 + 1) * 2.0F * 3.1415927F / 15.0F;
      paramInt = new Coord2d(paramInt, 7.0F).cartesian();
      Object localObject = new Coord2d(f, 7.0F).cartesian();
      Quad localQuad;
      (localQuad = new Quad()).add(new Point(new Coord3d(paramCoord3d.x + paramInt.x, paramCoord3d.y + paramInt.y, paramCoord3d.z)));
      localQuad.add(new Point(new Coord3d(paramCoord3d.x + paramInt.x, paramCoord3d.y + paramInt.y, paramCoord3d.z + paramFloat1)));
      localQuad.add(new Point(new Coord3d(paramCoord3d.x + ((Coord2d)localObject).x, paramCoord3d.y + ((Coord2d)localObject).y, paramCoord3d.z + paramFloat1)));
      localQuad.add(new Point(new Coord3d(paramCoord3d.x + ((Coord2d)localObject).x, paramCoord3d.y + ((Coord2d)localObject).y, paramCoord3d.z)));
      localQuad.setColor(paramColor);
      localQuad.setWireframeDisplayed(false);
      add(localQuad);
      localObject = new Coord3d(paramCoord3d.x + (paramInt.x + ((Coord2d)localObject).x) / 2.0F, paramCoord3d.y + (paramInt.y + ((Coord2d)localObject).y) / 2.0F, paramCoord3d.z + paramFloat1 / 2.0F);
      localObject = new DrawableTextBitmap("Face " + (paramFloat2 + 1), (Coord3d)localObject, Color.BLACK);
      add((AbstractDrawable)localObject);
      this.a.add(new Point(new Coord3d(paramCoord3d.x + paramInt.x, paramCoord3d.y + paramInt.y, paramCoord3d.z + paramFloat1)));
    }
    this.a.setColor(Color.GREEN);
    add(this.a);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\composites\MyCustomCylinder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */