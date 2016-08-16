package org.jzy3d.demos.graphs;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.picking.IObjectPickedListener;
import org.jzy3d.picking.PickingSupport;
import org.jzy3d.plot3d.primitives.graphs.impl.TextureGraph2d;

final class c
  implements IObjectPickedListener
{
  c(TextureGraphDemo paramTextureGraphDemo, TextureGraph2d paramTextureGraph2d) {}
  
  public final void objectPicked(List<? extends Object> paramList, PickingSupport paramPickingSupport)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramPickingSupport = paramList.next();
      System.out.println("picked: " + paramPickingSupport);
      this.a.setVertexHighlighted((String)paramPickingSupport, true);
    }
    TextureGraphDemo.a(this.b).render();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\graphs\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */