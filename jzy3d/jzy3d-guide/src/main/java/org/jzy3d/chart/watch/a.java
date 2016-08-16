package org.jzy3d.chart.watch;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.PrintStream;

final class a
  implements AdjustmentListener
{
  a(WatchedChartDemo paramWatchedChartDemo) {}
  
  public final void adjustmentValueChanged(AdjustmentEvent paramAdjustmentEvent)
  {
    System.out.println(paramAdjustmentEvent.getValue());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */