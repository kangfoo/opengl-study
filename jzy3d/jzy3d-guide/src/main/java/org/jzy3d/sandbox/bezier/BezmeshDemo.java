package org.jzy3d.sandbox.bezier;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.utils.LoggerUtils;

public class BezmeshDemo
{
  public static void main(String[] paramArrayOfString)
  {
    
    Object localObject;
    (localObject = new Coord3d[4][4])[0] = new Coord3d[4];
    localObject[0][0] = new Coord3d(-1.5F, -1.5F, 4.0F);
    localObject[0][1] = new Coord3d(-0.5F, -1.5F, 2.0F);
    localObject[0][2] = new Coord3d(0.5F, -1.5F, -1.0F);
    localObject[0][3] = new Coord3d(1.5F, -1.5F, 2.0F);
    localObject[1] = new Coord3d[4];
    localObject[1][0] = new Coord3d(-1.5F, -0.5F, 1.0F);
    localObject[1][1] = new Coord3d(-0.5F, -0.5F, 3.0F);
    localObject[1][2] = new Coord3d(0.5F, -0.5F, 0.0F);
    localObject[1][3] = new Coord3d(1.5F, -0.5F, -1.0F);
    localObject[2] = new Coord3d[4];
    localObject[2][0] = new Coord3d(-1.5F, 0.5F, 4.0F);
    localObject[2][1] = new Coord3d(-0.5F, 0.5F, 0.0F);
    localObject[2][2] = new Coord3d(0.5F, 0.5F, 3.0F);
    localObject[2][3] = new Coord3d(1.5F, 0.5F, 4.0F);
    localObject[3] = new Coord3d[4];
    localObject[3][0] = new Coord3d(-1.5F, 1.5F, -2.5F);
    localObject[3][1] = new Coord3d(-0.5F, 1.5F, -2.0F);
    localObject[3][2] = new Coord3d(0.5F, 1.5F, 0.0F);
    localObject[3][3] = new Coord3d(1.5F, 1.5F, -1.0F);
    (paramArrayOfString = new Bezmesh()).a((Coord3d[][])localObject);
    paramArrayOfString.a();
    (localObject = new AWTChartComponentFactory().newChart(Quality.Intermediate, IChartComponentFactory.Toolkit.awt)).getScene().add(paramArrayOfString);
    ChartLauncher.openChart((Chart)localObject, new Rectangle(0, 200, 600, 400), "Bezier Mesh");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\bezier\BezmeshDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */