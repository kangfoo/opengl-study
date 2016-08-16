package org.jzy3d.demos.histogram.barchart;

import com.jogamp.opengl.glu.GLU;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.IntegerCoord2d;
import org.jzy3d.plot3d.primitives.HistogramBar;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Quad;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.view.AWTView;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;

public class BarChartBar
  extends HistogramBar
{
  private g b;
  private final Chart c;
  private Shape d;
  public GLU a;
  private final String e;
  
  public final String a()
  {
    return this.e;
  }
  
  public final IntegerCoord2d b()
  {
    Object localObject = this.c.getView().getCamera().modelToScreen(this.c.getView().getCurrentGL(), this.a, getBounds().getCenter());
    return localObject = new IntegerCoord2d((int)((Coord3d)localObject).x, (int)this.c.flip(((Coord3d)localObject).y));
  }
  
  public final List<Coord2d> c()
  {
    Object localObject1 = this;
    localObject1 = this.c.getView().getCamera().modelToScreen(this.c.getView().getCurrentGL(), this.a, (Coord3d[])this.d.getBounds().getVertices().toArray(new Coord3d[0]));
    ArrayList localArrayList = new ArrayList();
    int i = (localObject1 = localObject1).length;
    for (int j = 0; j < i; j++)
    {
      Object localObject2 = localObject1[j];
      localArrayList.add(new Coord2d((int)((Coord3d)localObject2).x, (int)this.c.flip(((Coord3d)localObject2).y)));
    }
    return localArrayList;
  }
  
  public BarChartBar(Chart paramChart, String paramString)
  {
    this.c = paramChart;
    this.e = paramString;
  }
  
  public final Shape d()
  {
    return this.d;
  }
  
  public BoundingBox3d getBounds()
  {
    BarChartBar localBarChartBar = this;
    return this.d.getBounds();
  }
  
  public final void a(int paramInt1, int paramInt2, float paramFloat, Color paramColor)
  {
    paramColor = paramColor;
    paramFloat = paramFloat;
    paramInt1 = 20.0F;
    paramInt2 = new Coord3d(paramInt1 * 20.0F * 2.0F, paramInt2 * 27.0F * 2.0F, 0.0F);
    paramInt1 = this;
    Coord3d localCoord3d1 = paramInt2.clone();
    Coord3d localCoord3d2;
    (localCoord3d2 = paramInt2.clone()).z += paramFloat;
    Coord3d localCoord3d3;
    (localCoord3d3 = paramInt2.clone()).y -= 20.0F;
    Coord3d localCoord3d4;
    (localCoord3d4 = paramInt2.clone()).y += 20.0F;
    Coord3d localCoord3d5;
    (localCoord3d5 = paramInt2.clone()).x -= 20.0F;
    (paramInt2 = paramInt2.clone()).x += 20.0F;
    LinkedList localLinkedList;
    (localLinkedList = new LinkedList()).add(a(localCoord3d1, 20.0F, paramColor));
    localLinkedList.add(a(localCoord3d2, 20.0F, paramColor));
    localLinkedList.add(a(localCoord3d3, 20.0F, paramFloat, paramColor));
    localLinkedList.add(a(localCoord3d4, 20.0F, paramFloat, paramColor));
    localLinkedList.add(paramInt1.b(localCoord3d5, 20.0F, paramFloat, paramColor));
    localLinkedList.add(paramInt1.b(paramInt2, 20.0F, paramFloat, paramColor));
    this.d = new b(paramInt1, localLinkedList);
    add(this.d);
  }
  
  private static Quad a(Coord3d paramCoord3d, float paramFloat, Color paramColor)
  {
    Quad localQuad;
    (localQuad = new Quad()).add(new Point(new Coord3d(paramCoord3d.x + paramFloat, paramCoord3d.y + paramFloat, paramCoord3d.z)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x + paramFloat, paramCoord3d.y - paramFloat, paramCoord3d.z)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x - paramFloat, paramCoord3d.y - paramFloat, paramCoord3d.z)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x - paramFloat, paramCoord3d.y + paramFloat, paramCoord3d.z)));
    localQuad.setColor(paramColor);
    localQuad.setWireframeColor(Color.BLACK);
    localQuad.setWireframeDisplayed(true);
    return localQuad;
  }
  
  private static Quad a(Coord3d paramCoord3d, float paramFloat1, float paramFloat2, Color paramColor)
  {
    Quad localQuad;
    (localQuad = new Quad()).add(new Point(new Coord3d(paramCoord3d.x + paramFloat1, paramCoord3d.y, paramCoord3d.z + paramFloat2)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x + paramFloat1, paramCoord3d.y, paramCoord3d.z)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x - paramFloat1, paramCoord3d.y, paramCoord3d.z)));
    localQuad.add(new Point(new Coord3d(paramCoord3d.x - paramFloat1, paramCoord3d.y, paramCoord3d.z + paramFloat2)));
    localQuad.setColor(paramColor);
    localQuad.setWireframeColor(Color.BLACK);
    localQuad.setWireframeDisplayed(true);
    return localQuad;
  }
  
  private Quad b(Coord3d paramCoord3d, float paramFloat1, float paramFloat2, Color paramColor)
  {
    a locala;
    (locala = new a(this)).add(new Point(new Coord3d(paramCoord3d.x, paramCoord3d.y + paramFloat1, paramCoord3d.z + paramFloat2)));
    locala.add(new Point(new Coord3d(paramCoord3d.x, paramCoord3d.y + paramFloat1, paramCoord3d.z)));
    locala.add(new Point(new Coord3d(paramCoord3d.x, paramCoord3d.y - paramFloat1, paramCoord3d.z)));
    locala.add(new Point(new Coord3d(paramCoord3d.x, paramCoord3d.y - paramFloat1, paramCoord3d.z + paramFloat2)));
    locala.setColor(paramColor);
    locala.setWireframeColor(Color.BLACK);
    locala.setWireframeDisplayed(true);
    return locala;
  }
  
  final void a(boolean paramBoolean)
  {
    if (this.b == null)
    {
      this.b = new g(this.e, this);
      ((AWTView)this.c.getView()).addTooltip(this.b);
    }
    if (paramBoolean)
    {
      setWireframeWidth(3.0F);
      this.b.a(true);
      return;
    }
    setWireframeWidth(1.0F);
    this.b.a(false);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\BarChartBar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */