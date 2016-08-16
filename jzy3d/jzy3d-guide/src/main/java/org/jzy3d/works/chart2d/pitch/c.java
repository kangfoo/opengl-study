package org.jzy3d.works.chart2d.pitch;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class c
  extends WindowAdapter
{
  c(TimeChartWindow paramTimeChartWindow) {}
  
  public final void windowClosing(WindowEvent paramWindowEvent)
  {
    this.a.dispose();
    System.exit(0);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */