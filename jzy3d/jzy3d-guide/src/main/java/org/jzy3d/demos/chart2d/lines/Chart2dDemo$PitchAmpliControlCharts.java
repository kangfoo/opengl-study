package org.jzy3d.demos.chart2d.lines;

import java.util.ArrayList;
import java.util.List;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.colors.Color;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.providers.PitchTickProvider;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.PitchTickRenderer;

public class Chart2dDemo$PitchAmpliControlCharts
{
  private Chart2d c = new Chart2d();
  private Chart2d d;
  public Serie2d a;
  public Serie2d b;
  
  public Chart2dDemo$PitchAmpliControlCharts(float paramFloat, int paramInt1, int paramInt2)
  {
    this.c.asTimeChart(paramFloat, 0.0F, paramInt1, "Time", "Frequency");
    (paramInt1 = this.c.getAxeLayout()).setYTickProvider(new PitchTickProvider(paramInt2));
    paramInt1.setYTickRenderer(new PitchTickRenderer());
    this.a = this.c.getSerie("frequency", Serie2d.Type.LINE);
    this.a.setColor(Color.BLUE);
    this.a.getDrawable();
    this.d = new Chart2d();
    this.d.asTimeChart(paramFloat, 0.0F, 1.1F, "Time", "Amplitude");
    this.b = this.d.getSerie("amplitude", Serie2d.Type.LINE);
    this.b.setColor(Color.RED);
    this.b.getDrawable();
  }
  
  public final List<Chart> a()
  {
    ArrayList localArrayList;
    (localArrayList = new ArrayList()).add(this.c);
    localArrayList.add(this.d);
    return localArrayList;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\lines\Chart2dDemo$PitchAmpliControlCharts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */