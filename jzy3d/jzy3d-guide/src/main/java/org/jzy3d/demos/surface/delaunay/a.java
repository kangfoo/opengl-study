package org.jzy3d.demos.surface.delaunay;

import il.ac.idc.jdt.DelaunayTriangulation;
import il.ac.idc.jdt.Triangle;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.jzy3d.chart.Chart;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.builder.delaunay.JDTConverter;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewBoundMode;

final class a
  implements Runnable
{
  a(IncrementalDelaunayDemo paramIncrementalDelaunayDemo) {}
  
  public final void run()
  {
    Random localRandom = new Random();
    int i = 0;
    while (i < IncrementalDelaunayDemo.a)
    {
      double d1 = localRandom.nextDouble() * 2.0D * 3.141592653589793D;
      double d2 = Math.sqrt(localRandom.nextDouble()) * 8.0D;
      double d3 = Math.cos(d1) * d2;
      double d4 = Math.sin(d1) * d2;
      double d5 = Math.sqrt(Math.pow(d3, 2.0D) + Math.pow(d4, 2.0D));
      double d6 = Math.sqrt(Math.pow(d3 - 2.0D, 2.0D) + Math.pow(d4 + 2.0D, 2.0D));
      double d7 = Math.sqrt(Math.pow(d3 - 4.0D, 2.0D) + Math.pow(d4 - 5.0D, 2.0D));
      double d8 = Math.sqrt(Math.pow(d3 + 4.0D, 2.0D) + Math.pow(d4 + 2.0D, 2.0D));
      double d9 = Math.sin(Math.atan2(d3, d4) + d5);
      double d10 = 6.0D / (1.0D + Math.abs(d9)) - 2.0D / (1.0D + Math.abs(d5)) - 10.0D / (1.0D + Math.abs(d6)) + 10.0D / (1.0D + Math.abs(d7)) + 8.0D / (1.0D + Math.abs(d8)) + 0.5D * (Math.cos(d3) + Math.sin(d4));
      this.a.d.insertPoint(new il.ac.idc.jdt.Point(d3, d4, d10));
      i++;
      ArrayList localArrayList = new ArrayList(this.a.d.trianglesSize());
      Iterator localIterator = this.a.d.trianglesIterator();
      while (localIterator.hasNext())
      {
        Object localObject;
        if (!(localObject = (Triangle)localIterator.next()).isHalfplane())
        {
          Coord3d localCoord3d1 = JDTConverter.toJzyCoord(((Triangle)localObject).getA());
          Coord3d localCoord3d2 = JDTConverter.toJzyCoord(((Triangle)localObject).getB());
          localObject = JDTConverter.toJzyCoord(((Triangle)localObject).getC());
          Polygon localPolygon;
          (localPolygon = new Polygon()).add(new org.jzy3d.plot3d.primitives.Point(localCoord3d1));
          localPolygon.add(new org.jzy3d.plot3d.primitives.Point(localCoord3d2));
          localPolygon.add(new org.jzy3d.plot3d.primitives.Point((Coord3d)localObject));
          localArrayList.add(localPolygon);
        }
      }
      this.a.c.clear();
      this.a.c.add(localArrayList);
      this.a.c.setFaceDisplayed(true);
      this.a.c.setWireframeDisplayed(true);
      this.a.c.setWireframeColor(Color.BLACK);
      this.a.c.setColorMapper(new ColorMapper(new ColorMapRainbow(), this.a.c.getBounds().getZmin(), this.a.c.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.75F)));
      this.a.b.getView().setBoundMode(ViewBoundMode.AUTO_FIT);
      this.a.b.getView().updateBounds();
      try
      {
        Thread.sleep(1L);
      }
      catch (InterruptedException localInterruptedException)
      {
        System.err.println("I have caught an interrupted exception!:" + localInterruptedException.getMessage());
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\delaunay\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */