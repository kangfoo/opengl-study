package org.jzy3d.chart.watch.watched;

import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.IBoundingPolicy;
import org.jzy3d.maths.Range;

public class StickyTimeWindowBoundingPolicy
  implements IBoundingPolicy
{
  public double a = -1.0D;
  public double b = -1.0D;
  
  public BoundingBox3d apply(BoundingBox3d paramBoundingBox3d)
  {
    BoundingBox3d localBoundingBox3d = paramBoundingBox3d.clone();
    if ((this.a > 0.0D) && (paramBoundingBox3d.getXRange().getRange() > this.a))
    {
      double d = paramBoundingBox3d.getXmax() - this.a;
      localBoundingBox3d.setXmin((float)d);
    }
    this.b = localBoundingBox3d.getXmax();
    localBoundingBox3d.getXmin();
    return localBoundingBox3d;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\StickyTimeWindowBoundingPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */