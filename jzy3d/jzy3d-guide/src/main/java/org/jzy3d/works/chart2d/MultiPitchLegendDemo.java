package org.jzy3d.works.chart2d;

import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.works.chart2d.legend.AWTSeriesLegend;
import org.jzy3d.works.chart2d.pitch.MultiSerieChart;
import org.jzy3d.works.chart2d.pitch.MultiSerieGenerator;
import org.jzy3d.works.chart2d.pitch.TimeChartWindow;

public class MultiPitchLegendDemo
{
  private static float a = 15.0F;
  private static int b = 880;
  private static int c = 5;
  
  public static void main(String[] paramArrayOfString)
  {
    Chart2d localChart2d;
    (localChart2d = (paramArrayOfString = new MultiSerieChart(a, b, c)).a).getView().setBackgroundColor(Color.BLACK);
    localChart2d.getAxeLayout().setGridColor(Color.WHITE);
    localChart2d.getAxeLayout().setMainColor(Color.WHITE);
    paramArrayOfString.b.setForeground(Color.WHITE);
    paramArrayOfString.b.setBackground(Color.BLACK);
    paramArrayOfString.a("yin", Serie2d.Type.LINE, Color.MAGENTA);
    paramArrayOfString.a("mfcc", Serie2d.Type.LINE, Color.CYAN);
    paramArrayOfString.a("fft", Serie2d.Type.SCATTER_POINTS, Color.YELLOW);
    paramArrayOfString.a("vocobox", Serie2d.Type.SCATTER_POINTS, Color.GREEN);
    paramArrayOfString.b.setMinimumSize(new Dimension(100, 600));
    new TimeChartWindow(paramArrayOfString.b());
    new MultiSerieGenerator().a(paramArrayOfString, a, b, 10);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\MultiPitchLegendDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */