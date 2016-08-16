package org.jzy3d.concave;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class Concave
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new Concave());
  }
  
  public void init()
  {
    Object localObject1 = "data/ivan/polygon.txt";
    localObject1 = new CSVReader(new FileReader((String)localObject1), ' ');
    Object localObject3 = new ArrayList();
    while ((localObject2 = ((CSVReader)localObject1).readNext()) != null)
    {
      int i;
      if ((i = localObject2.length) > 0)
      {
        System.out.print(i + " elements : ");
        Float[] arrayOfFloat = new Float[i];
        for (int j = 0; j < i; j++)
        {
          String str = localObject2[j].trim();
          System.out.print(str + " ");
          arrayOfFloat[j] = Float.valueOf(Float.parseFloat(str));
        }
        ((List)localObject3).add(arrayOfFloat);
        System.out.println();
      }
    }
    ((CSVReader)localObject1).close();
    localObject1 = localObject3;
    Object localObject2 = new Polygon();
    localObject1 = ((List)localObject1).iterator();
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      float f2 = (localObject3 = (Float[])((Iterator)localObject1).next())[0].floatValue();
      float f1 = localObject3[1].floatValue();
      localObject4 = new Coord3d(f2, f1, 0.0F);
      ((Polygon)localObject2).add(new Point((Coord3d)localObject4));
    }
    (localObject1 = new ArrayList()).add(localObject2);
    (localObject4 = new Shape((List)localObject1)).setWireframeDisplayed(true);
    ((Shape)localObject4).setWireframeColor(Color.BLACK);
    this.chart = new Chart(getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject4);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\concave\Concave.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */