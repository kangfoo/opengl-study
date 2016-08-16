package org.jzy3d.chart.watch;

import org.jzy3d.plot3d.rendering.view.View;

final class e
  implements Runnable
{
  e(WatchedChartDemo paramWatchedChartDemo, View paramView) {}
  
  public final void run()
  {
    for (;;)
    {
      this.a.updateBounds();
      try
      {
        Thread.sleep(20L);
      }
      catch (InterruptedException localInterruptedException2)
      {
        InterruptedException localInterruptedException1;
        (localInterruptedException1 = localInterruptedException2).printStackTrace();
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */