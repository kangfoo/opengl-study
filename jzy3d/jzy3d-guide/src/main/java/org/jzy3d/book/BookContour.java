package org.jzy3d.book;

import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.demos.contour.FilledContoursDemo;
import org.jzy3d.demos.contour.HeightMapDemo;
import org.jzy3d.demos.contour.UserChosenContoursDemo;

public class BookContour
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    paramArrayOfString = new FilledContoursDemo();
    HeightMapDemo localHeightMapDemo = new HeightMapDemo();
    UserChosenContoursDemo localUserChosenContoursDemo = new UserChosenContoursDemo();
    AnalysisLauncher.open(paramArrayOfString);
    AnalysisLauncher.open(localHeightMapDemo);
    AnalysisLauncher.open(localUserChosenContoursDemo);
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/BookContourFilled.png");
    ChartLauncher.screenshot(localHeightMapDemo.getChart(), "data/book/BookContourHeightMap.png");
    ChartLauncher.screenshot(localUserChosenContoursDemo.getChart(), "data/book/BookContourLine.png");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookContour.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */