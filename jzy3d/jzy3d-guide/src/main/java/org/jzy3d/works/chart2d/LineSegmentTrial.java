package org.jzy3d.works.chart2d;

import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.chart2d.Chart2dComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.plot2d.primitives.LineSerie2dSplitted;
import org.jzy3d.plot2d.primitives.Serie2d.Type;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.ElapsedTimeTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;

public class LineSegmentTrial
{
  private static float a = 1.0F;
  private IChartComponentFactory.Toolkit b = IChartComponentFactory.Toolkit.awt;
  private Quality c = Quality.Intermediate;
  private Chart2d d;
  private LineSerie2dSplitted e;
  private Color f = Color.YELLOW;
  
  public static void main(String[] paramArrayOfString)
  {
    (localObject1 = paramArrayOfString = new LineSegmentTrial()).d = Chart2dComponentFactory.chart(((LineSegmentTrial)localObject1).c, ((LineSegmentTrial)localObject1).b);
    Object localObject2;
    IAxeLayout localIAxeLayout;
    (localIAxeLayout = (localObject2 = localObject1).d.getAxeLayout()).setXTickRenderer(new ElapsedTimeTickRenderer());
    (localObject2 = ((LineSegmentTrial)localObject2).d.getView()).setBoundManual(new BoundingBox3d(0.0F, 1.0F, 0.0F, 1.0F, -1.0F, 1.0F));
    (localObject2 = localObject1).e = ((LineSerie2dSplitted)((LineSegmentTrial)localObject2).d.getSerie("splitted-linestrip", Serie2d.Type.LINE_ON_OFF));
    ((LineSegmentTrial)localObject2).e.setWidth(10);
    ((LineSegmentTrial)localObject2).e.setColor(((LineSegmentTrial)localObject2).f);
    ChartLauncher.openChart(paramArrayOfString.d);
    Object localObject1 = paramArrayOfString;
    paramArrayOfString.e.add(0.0F, 0.1F, Color.RED);
    ((LineSegmentTrial)localObject1).e.addAndSplit(0.5F, 0.5F, Color.BLUE);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\chart2d\LineSegmentTrial.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */