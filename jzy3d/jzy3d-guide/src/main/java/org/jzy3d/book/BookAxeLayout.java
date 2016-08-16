package org.jzy3d.book;

import java.util.Date;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapWhiteRed;
import org.jzy3d.maths.Utils;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.FlatLine2d;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.DateTickRenderer;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.ScientificNotationTickRenderer;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class BookAxeLayout
  extends AbstractAnalysis
{
  private static int a = 15;
  
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    AnalysisLauncher.open(paramArrayOfString = new BookAxeLayout());
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/" + BookAxeLayout.class.getSimpleName() + ".png");
  }
  
  public void init()
  {
    Object localObject = new float[a];
    float[] arrayOfFloat = new float[a];
    Date localDate = new Date();
    Random localRandom = new Random();
    for (int i = 0; i < localObject.length; i++)
    {
      localObject[i] = ((float)Utils.dat2num(localDate));
      arrayOfFloat[i] = (localRandom.nextFloat() / 1000.0F);
      localDate = localDate;
      (localDate = new Date(localDate.getTime())).setMonth(localDate.getMonth() + 1);
      localDate = localDate;
    }
    (localObject = new FlatLine2d((float[])localObject, arrayOfFloat, 10.0F)).setColorMapper(new ColorMapper(new ColorMapWhiteRed(), 0.0D, 0.0010000000474974513D));
    ((FlatLine2d)localObject).setWireframeDisplayed(true);
    ((FlatLine2d)localObject).setWireframeColor(Color.BLACK);
    this.chart = AWTChartComponentFactory.chart(getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    this.chart.getAxeLayout().setXAxeLabelDisplayed(false);
    this.chart.getAxeLayout().setXTickLabelDisplayed(false);
    this.chart.getAxeLayout().setYAxeLabel("Date");
    this.chart.getAxeLayout().setYTickRenderer(new DateTickRenderer("dd/MM/yyyy"));
    this.chart.getAxeLayout().setZAxeLabel("Value");
    this.chart.getAxeLayout().setZTickRenderer(new ScientificNotationTickRenderer(2));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookAxeLayout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */