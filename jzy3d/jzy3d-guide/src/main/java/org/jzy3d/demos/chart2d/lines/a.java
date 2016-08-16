package org.jzy3d.demos.chart2d.lines;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

final class a
  extends WindowAdapter
{
  a(Chart2dDemo.TimeChartWindow paramTimeChartWindow) {}
  
  public final void windowClosing(WindowEvent paramWindowEvent)
  {
    this.a.dispose();
    System.exit(0);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\lines\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */