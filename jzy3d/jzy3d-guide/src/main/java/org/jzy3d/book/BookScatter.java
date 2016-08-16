package org.jzy3d.book;

import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.demos.scatter.ScatterDemo;

public class BookScatter
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    AnalysisLauncher.open(paramArrayOfString = new ScatterDemo());
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/" + BookScatter.class.getSimpleName() + ".png");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookScatter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */