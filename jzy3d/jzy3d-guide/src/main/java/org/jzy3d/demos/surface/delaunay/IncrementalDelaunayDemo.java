package org.jzy3d.demos.surface.delaunay;

import il.ac.idc.jdt.DelaunayTriangulation;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IRunnableAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.view.View;

public class IncrementalDelaunayDemo
  extends AbstractAnalysis
  implements IRunnableAnalysis
{
  public static int a = 2500;
  private Thread e;
  protected Chart b;
  protected Shape c;
  protected DelaunayTriangulation d;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(paramArrayOfString = new IncrementalDelaunayDemo());
    paramArrayOfString.start();
  }
  
  public void init()
  {
    this.b = initializeChart(Quality.Advanced);
    this.c = new Shape();
    this.b.add(this.c);
    this.c.setLegend(new AWTColorbarLegend(this.c, this.b.getView().getAxe().getLayout()));
    this.d = new DelaunayTriangulation();
  }
  
  public String getPitch()
  {
    return "Incrementally build a delaunay surface.";
  }
  
  public Chart getChart()
  {
    return this.b;
  }
  
  public void start()
  {
    IncrementalDelaunayDemo localIncrementalDelaunayDemo = this;
    this.e = new Thread(new a(localIncrementalDelaunayDemo));
    this.e.start();
  }
  
  public void stop()
  {
    this.b.stopAnimator();
    if (this.e != null) {
      this.e.interrupt();
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\delaunay\IncrementalDelaunayDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */