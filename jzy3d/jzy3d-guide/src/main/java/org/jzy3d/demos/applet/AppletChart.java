package org.jzy3d.demos.applet;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.demos.surface.WireSurfaceDemo;

public class AppletChart
  extends Applet
{
  private static final long serialVersionUID = 597552842099218422L;
  protected Chart chart;
  
  public AppletChart()
  {
    setLayout(new BorderLayout());
  }
  
  public void start()
  {
    Object localObject = new WireSurfaceDemo();
    try
    {
      ((IAnalysis)localObject).init();
      loadDemo(((IAnalysis)localObject).getChart());
      return;
    }
    catch (Exception localException)
    {
      (localObject = localException).printStackTrace();
    }
  }
  
  public void loadDemo(String paramString)
  {
    log().info("i'll try to instantiate: " + paramString);
  }
  
  public void loadDemo(Chart paramChart)
  {
    if (this.chart != null) {
      SwingUtilities.invokeLater(new a(this, paramChart));
    }
    this.chart = paramChart;
    paramChart.addMouseController();
    SwingUtilities.invokeLater(new b(this, paramChart));
  }
  
  private Logger log()
  {
    return Logger.getLogger(AppletChart.class.getName());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\applet\AppletChart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */