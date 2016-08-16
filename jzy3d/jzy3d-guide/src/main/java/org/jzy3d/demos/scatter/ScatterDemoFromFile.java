package org.jzy3d.demos.scatter;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;

public class ScatterDemoFromFile
  extends AbstractAnalysis
{
  private static String a = "./data/plotdata.txt";
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ScatterDemoFromFile());
  }
  
  public void init()
  {
    Object localObject = a;
    localObject = new CSVReader(new FileReader((String)localObject));
    for (int i = 0; ((CSVReader)localObject).readNext() != null; i++) {}
    ((CSVReader)localObject).close();
    Coord3d[] arrayOfCoord3d = new Coord3d[localObject = i];
    Color[] arrayOfColor = new Color[localObject];
    CSVReader localCSVReader = new CSVReader(new FileReader(a));
    int j = 0;
    String[] arrayOfString;
    while ((arrayOfString = localCSVReader.readNext()) != null)
    {
      float f1 = Float.parseFloat(arrayOfString[0]);
      float f2 = Float.parseFloat(arrayOfString[1]);
      float f3 = Float.parseFloat(arrayOfString[2]);
      float f4 = Float.parseFloat(arrayOfString[3]);
      arrayOfCoord3d[j] = new Coord3d(f1, f2, f3);
      arrayOfColor[(j++)] = new Color(f1, f2, f3, f4);
    }
    localCSVReader.close();
    Scatter localScatter = new Scatter(arrayOfCoord3d, arrayOfColor);
    this.chart = initializeChart();
    this.chart.getScene().add(localScatter);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\ScatterDemoFromFile.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */