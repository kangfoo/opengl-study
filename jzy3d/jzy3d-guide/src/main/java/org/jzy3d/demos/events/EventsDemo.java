package org.jzy3d.demos.events;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AWTScatterMultiColor;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.view.View;

public class EventsDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new EventsDemo());
  }
  
  public void init()
  {
    Coord3d[] arrayOfCoord3d = new Coord3d['✐'];
    for (int i = 0; i < 10000; i++)
    {
      float f1 = (float)Math.random() - 0.5F;
      float f2 = (float)Math.random() - 0.5F;
      float f3 = (float)Math.random() - 0.5F;
      arrayOfCoord3d[i] = new Coord3d(f1, f2, f3);
    }
    AWTScatterMultiColor localAWTScatterMultiColor = new AWTScatterMultiColor(arrayOfCoord3d, new ColorMapper(new ColorMapRainbow(), -0.5D, 0.5D));
    this.chart = AWTChartComponentFactory.chart(getCanvasType());
    this.chart.getAxeLayout().setMainColor(Color.WHITE);
    this.chart.getView().setBackgroundColor(Color.BLACK);
    this.chart.getScene().add(localAWTScatterMultiColor);
    localAWTScatterMultiColor.setLegend(new AWTColorbarLegend(localAWTScatterMultiColor, this.chart.getView().getAxe().getLayout(), Color.WHITE, null));
    localAWTScatterMultiColor.setLegendDisplayed(true);
    this.chart.getView().addViewPointChangedListener(new a(this));
    this.chart.getView().addViewOnTopEventListener(new b(this));
    localAWTScatterMultiColor.addDrawableListener(new c(this));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\events\EventsDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */