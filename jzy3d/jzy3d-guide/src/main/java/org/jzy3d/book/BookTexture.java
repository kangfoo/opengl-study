package org.jzy3d.book;

import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.demos.textures.TextureDemo;

public class BookTexture
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    AnalysisLauncher.open(paramArrayOfString = new TextureDemo());
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/BookTexture.png");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookTexture.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */