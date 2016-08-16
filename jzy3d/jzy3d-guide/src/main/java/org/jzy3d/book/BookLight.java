package org.jzy3d.book;

import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.demos.light.HistogramLightDemo;
import org.jzy3d.maths.Rectangle;

public class BookLight
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    (paramArrayOfString = new HistogramLightDemo()).init();
    ChartLauncher.openChart(paramArrayOfString = paramArrayOfString.getChart(), new Rectangle(0, 0, 500, 500), "Light Demo");
    ChartLauncher.screenshot(paramArrayOfString, "data/book/BookLight.png");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookLight.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */