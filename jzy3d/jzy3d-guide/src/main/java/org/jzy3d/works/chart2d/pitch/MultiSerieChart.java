package org.jzy3d.works.chart2d.pitch;

import java.util.ArrayList;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.providers.PitchTickProvider;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.PitchTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.works.chart2d.legend.AWTSeriesLegend;

public class MultiSerieChart
{
  public Chart2d a;
  private List<Serie2d> c = new ArrayList();
  public AWTSeriesLegend b;
  
  public MultiSerieChart(float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = paramFloat;
    paramFloat = this;
    this.a = new Chart2d(new a(), Quality.Nicest, IChartComponentFactory.Toolkit.awt);
    paramFloat.a.asTimeChart(paramInt1, 0.0F, paramInt2, "Time", "Frequency");
    paramFloat.b = new AWTSeriesLegend();
    paramFloat.b.setMinimumSize(new Dimension(150, 600));
    (paramFloat = paramFloat.a.getAxeLayout()).setYTickProvider(new PitchTickProvider(i));
    paramFloat.setYTickRenderer(new PitchTickRenderer());
  }
  
  public final void a(String paramString, Serie2d.Type paramType, Color paramColor)
  {
    (paramString = this.a.getSerie(paramString, paramType)).setColor(paramColor);
    this.c.add(paramString);
    this.b.a(paramString);
  }
  
  public final List<Serie2d> a()
  {
    return this.c;
  }
  
  public final List<Chart> b()
  {
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add(this.a);
    return localArrayList;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\MultiSerieChart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */