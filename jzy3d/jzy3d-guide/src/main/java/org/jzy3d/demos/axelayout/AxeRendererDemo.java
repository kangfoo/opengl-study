package org.jzy3d.demos.axelayout;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapWhiteRed;
import org.jzy3d.maths.Utils;
import org.jzy3d.plot3d.primitives.FlatLine2d;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.providers.StaticTickProvider;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.DateTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class AxeRendererDemo
  extends AbstractAnalysis
{
  private static int a = 15;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new AxeRendererDemo());
  }
  
  public void init()
  {
    Object localObject = new float[a];
    float[] arrayOfFloat = new float[a];
    Date localDate;
    try
    {
      localDate = Utils.str2date("03/20/1980");
    }
    catch (ParseException localParseException)
    {
      throw new RuntimeException(localParseException);
    }
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < localObject.length; i++)
    {
      localObject[i] = ((float)Utils.dat2num(localDate));
      arrayOfFloat[i] = localRandom.nextFloat();
      localDate = localDate;
      (localDate = new Date(localDate.getTime())).setMonth(localDate.getMonth() + 1);
      localDate = localDate;
    }
    FlatLine2d localFlatLine2d;
    (localFlatLine2d = new FlatLine2d((float[])localObject, arrayOfFloat, 10.0F)).setColorMapper(new ColorMapper(new ColorMapWhiteRed(), 0.0D, 1.0D));
    localFlatLine2d.setWireframeDisplayed(true);
    localFlatLine2d.setWireframeColor(Color.BLACK);
    this.chart = initializeChart(Quality.Intermediate);
    this.chart.getScene().getGraph().add(localFlatLine2d);
    this.chart.getAxeLayout().setXAxeLabelDisplayed(false);
    this.chart.getAxeLayout().setXTickLabelDisplayed(false);
    this.chart.getAxeLayout().setYAxeLabel("Date");
    this.chart.getAxeLayout().setYTickRenderer(new DateTickRenderer("dd/MM/yyyy"));
    this.chart.getAxeLayout().setZAxeLabel("Ratio");
    localObject = new double[] { 0.0D, 0.5D, 1.0D };
    this.chart.getAxeLayout().setZTickProvider(new StaticTickProvider((double[])localObject));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\axelayout\AxeRendererDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */