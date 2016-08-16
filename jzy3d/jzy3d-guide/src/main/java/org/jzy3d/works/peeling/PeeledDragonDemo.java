package org.jzy3d.works.peeling;

import java.io.PrintStream;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.io.obj.OBJFileLoader;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.vbo.drawable.DrawableVBO;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ddp.DepthPeelingChart;

public class PeeledDragonDemo
{
  public static void main(String[] paramArrayOfString)
  {
    System.err.println("May require vm argument -Xmx1024m");
    paramArrayOfString = DepthPeelingChart.get(Quality.Fastest, "awt");
    OBJFileLoader localOBJFileLoader = new OBJFileLoader("models/dragon.obj");
    paramArrayOfString.getScene().add(new DrawableVBO(localOBJFileLoader));
    ChartLauncher.openChart(paramArrayOfString, new Rectangle(0, 0, 600, 600));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\peeling\PeeledDragonDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */