package org.jzy3d.sandbox.viewport;

import java.util.Date;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
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
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.ViewportMode;

public class ViewportDemo
  extends AbstractAnalysis
{
  private static int a = 15;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ViewportDemo());
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
      arrayOfFloat[i] = localRandom.nextFloat();
      localDate = localDate;
      (localDate = new Date(localDate.getTime())).setMonth(localDate.getMonth() + 1);
      localDate = localDate;
    }
    FlatLine2d localFlatLine2d;
    (localFlatLine2d = new FlatLine2d((float[])localObject, arrayOfFloat, 10.0F)).setColorMapper(new ColorMapper(new ColorMapWhiteRed(), 0.0D, 1.0D));
    localFlatLine2d.setWireframeDisplayed(true);
    localFlatLine2d.setWireframeColor(Color.BLACK);
    this.chart = new AWTChartComponentFactory().newChart(Quality.Intermediate, getCanvasType());
    this.chart.getScene().getGraph().add(localFlatLine2d);
    this.chart.getAxeLayout().setXAxeLabelDisplayed(false);
    this.chart.getAxeLayout().setXTickLabelDisplayed(false);
    this.chart.getAxeLayout().setYAxeLabel("Date");
    this.chart.getAxeLayout().setYTickRenderer(new DateTickRenderer("dd/MM/yyyy"));
    this.chart.getAxeLayout().setZAxeLabel("Ratio");
    this.chart.getView().getCamera().setScreenGridDisplayed(true);
    this.chart.getView().getCamera().setViewportMode(ViewportMode.RECTANGLE_NO_STRETCH);
    localObject = new double[] { 0.0D, 0.5D, 1.0D };
    this.chart.getAxeLayout().setZTickProvider(new StaticTickProvider((double[])localObject));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\viewport\ViewportDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */