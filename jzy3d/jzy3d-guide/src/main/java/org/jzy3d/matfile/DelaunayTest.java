package org.jzy3d.matfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class DelaunayTest
  extends AbstractAnalysis
{
  private static int a = 1000;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new DelaunayTest());
  }
  
  public void init()
  {
    Object localObject1 = new File("data/britta/testPoints.csv");
    System.out.println(((File)localObject1).getAbsolutePath());
    localObject1 = new BufferedReader(new FileReader((File)localObject1));
    ArrayList localArrayList = new ArrayList(a);
    Object localObject2;
    while ((localObject2 = ((BufferedReader)localObject1).readLine()) != null)
    {
      localObject2 = ((String)localObject2).split(", ");
      if ((!b) && (localObject2.length != 3)) {
        throw new AssertionError();
      }
      Double localDouble1 = Double.valueOf(Double.parseDouble(localObject2[0]));
      Double localDouble2 = Double.valueOf(Double.parseDouble(localObject2[1]));
      localObject2 = Double.valueOf(Double.parseDouble(localObject2[2]));
      localArrayList.add(new Coord3d(localDouble1.doubleValue(), localDouble2.doubleValue(), ((Double)localObject2).doubleValue()));
    }
    ((BufferedReader)localObject1).close();
    localObject1 = localArrayList;
    this.chart = new Chart(Quality.Advanced, getCanvasType());
    localObject1 = new Scatter((Coord3d[])((List)localObject1).toArray(new Coord3d[((List)localObject1).size()]));
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\matfile\DelaunayTest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */