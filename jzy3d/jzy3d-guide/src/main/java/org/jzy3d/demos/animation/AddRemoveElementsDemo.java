package org.jzy3d.demos.animation;

import java.util.List;
import java.util.Vector;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IRunnableAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class AddRemoveElementsDemo
  extends AbstractAnalysis
  implements IRunnableAnalysis
{
  public static int a = 1000;
  private Thread c;
  final List<AbstractDrawable> b = new Vector();
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(paramArrayOfString = new AddRemoveElementsDemo());
    paramArrayOfString.start();
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Intermediate);
  }
  
  public String getPitch()
  {
    return "Adding an removing elements dynamically. You must stop the rotation thread before closing the panel to avoid the ConcurrentModificationException in your application.";
  }
  
  public void start()
  {
    AddRemoveElementsDemo localAddRemoveElementsDemo = this;
    this.c = new Thread(new a(localAddRemoveElementsDemo));
    this.c.start();
  }
  
  public void stop()
  {
    this.chart.stopAnimator();
    if (this.c != null) {
      this.c.interrupt();
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\animation\AddRemoveElementsDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */