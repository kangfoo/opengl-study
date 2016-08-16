package org.jzy3d.chart.watch.watched;

import java.util.Collection;
import java.util.Iterator;
import org.jzy3d.chart2d.SerieManager;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.IBoundingPolicy;
import org.jzy3d.plot3d.rendering.ordering.AbstractOrderingStrategy;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.scene.Scene;

final class b
  extends Graph
{
  private IBoundingPolicy a = this.b.newBoundingPolicy();
  
  b(WatchedFactory paramWatchedFactory, Scene paramScene, AbstractOrderingStrategy paramAbstractOrderingStrategy, boolean paramBoolean)
  {
    super(paramScene, paramAbstractOrderingStrategy, paramBoolean);
  }
  
  public final synchronized BoundingBox3d getBounds()
  {
    BoundingBox3d localBoundingBox3d = super.getBounds();
    localBoundingBox3d = this.a.apply(localBoundingBox3d);
    Object localObject = (StickyTimeWindowBoundingPolicy)this.a;
    localObject = SerieManager.get().getSeries().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Iterator)localObject).next();
    }
    return localBoundingBox3d;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */