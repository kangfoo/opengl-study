package org.jzy3d.works.chart2d.pitch;

import java.util.ArrayList;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.providers.PitchTickProvider;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.PitchTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.works.chart2d.legend.AWTSerieLegend;

public class PitchAmpliControlCharts
{
  private Chart2d c;
  private Chart2d d;
  public Serie2d a;
  public Serie2d b;
  
  public PitchAmpliControlCharts(float paramFloat, int paramInt1, int paramInt2)
  {
    int j = paramInt2;
    int i = paramInt1;
    paramInt2 = paramFloat;
    paramInt1 = this;
    this.c = new Chart2d(new b(), Quality.Nicest);
    paramInt1.c.asTimeChart(paramInt2, 0.0F, i, "Time", "Frequency");
    paramInt1.a = paramInt1.c.getSerie("frequency", Serie2d.Type.LINE);
    paramInt1.a.setColor(Color.BLUE);
    (paramInt2 = new AWTSerieLegend(paramInt1.a)).setMinimumSize(new Dimension(150, 600));
    (paramInt1 = paramInt1.c.getAxeLayout()).setYTickProvider(new PitchTickProvider(j));
    paramInt1.setYTickRenderer(new PitchTickRenderer());
    paramInt2 = paramFloat;
    paramInt1 = this;
    this.d = new Chart2d(new b(), Quality.Nicest);
    paramInt1.d.asTimeChart(paramInt2, 0.0F, 1.0F, "Time", "Amplitude");
    paramInt1.b = paramInt1.d.getSerie("amplitude", Serie2d.Type.LINE);
    paramInt1.b.setColor(Color.RED);
    AWTSerieLegend localAWTSerieLegend;
    (localAWTSerieLegend = new AWTSerieLegend(paramInt1.b)).setMinimumSize(new Dimension(150, 600));
  }
  
  public final List<Chart> a()
  {
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add(this.c);
    localArrayList.add(this.d);
    return localArrayList;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\pitch\PitchAmpliControlCharts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */