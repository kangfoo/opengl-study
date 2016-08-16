package org.jzy3d.chart.watch;

import java.awt.Component;
import java.awt.Scrollbar;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.chart.watch.watched.WatchedCamera;
import org.jzy3d.chart.watch.watched.WatchedFactory;
import org.jzy3d.chart.watch.watched.WatchedRenderer3d;
import org.jzy3d.chart2d.Chart2d;
import org.jzy3d.chart2d.Chart2dComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.demos.browser.EzLayout;
import org.jzy3d.demos.browser.EzLayout.Prop;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Dimension;
import org.jzy3d.plot2d.primitives.Serie2d;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.ElapsedTimeTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewBoundMode;
import org.jzy3d.works.chart2d.legend.AWTSeriesLegend;

public class WatchedChartDemo
{
  private Chart2d a;
  private AWTSeriesLegend b;
  private Scrollbar c;
  private Scrollbar d;
  private Scrollbar e;
  private Scrollbar f;
  private int g = 200;
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = 2000;
    paramArrayOfString = 60.0F;
    paramArrayOfString = paramArrayOfString = new WatchedChartDemo();
    Object localObject1 = new WatchedFactory(new Chart2dComponentFactory());
    int k = 2000;
    float f2 = 60.0F;
    Object localObject2 = localObject1;
    localObject1 = paramArrayOfString;
    Quality localQuality = Quality.Nicest;
    ((WatchedChartDemo)localObject1).a = new Chart2d((IChartComponentFactory)localObject2, localQuality, IChartComponentFactory.Toolkit.awt);
    ((WatchedChartDemo)localObject1).a.black();
    String str2 = "Pixels";
    String str1 = "Time";
    float f4 = k;
    float f1 = 0.0F;
    float f3 = f2;
    Object localObject5 = ((WatchedChartDemo)localObject1).a;
    Object localObject3 = localObject1;
    IAxeLayout localIAxeLayout;
    (localIAxeLayout = ((Chart)localObject5).getAxeLayout()).setYAxeLabel(str2);
    localIAxeLayout.setXAxeLabel(str1);
    localIAxeLayout.setXTickRenderer(new ElapsedTimeTickRenderer());
    (localObject5 = ((Chart)localObject5).getView()).setBoundManual(new BoundingBox3d(0.0F, f3, 0.0F, f4, -1.0F, 1.0F));
    ((View)localObject5).setBoundMode(ViewBoundMode.AUTO_FIT);
    localObject5 = localObject5;
    localObject3 = localObject3;
    new Thread(new e((WatchedChartDemo)localObject3, (View)localObject5)).start();
    int i = 150;
    int m = 15;
    int j = 60;
    (localObject4 = localObject1).c = EzLayout.a(60, 15, 150, new a((WatchedChartDemo)localObject4));
    ((WatchedChartDemo)localObject4).d = EzLayout.a(60, 15, 150, new b((WatchedChartDemo)localObject4));
    ((WatchedChartDemo)localObject4).e = EzLayout.b(60, 15, 150, new c((WatchedChartDemo)localObject4));
    ((WatchedChartDemo)localObject4).f = EzLayout.b(60, 15, 150, new d((WatchedChartDemo)localObject4));
    localObject1 = paramArrayOfString;
    paramArrayOfString.b = new AWTSeriesLegend();
    ((WatchedChartDemo)localObject1).b.setForeground(Color.WHITE);
    ((WatchedChartDemo)localObject1).b.setBackground(Color.BLACK);
    ((WatchedChartDemo)localObject1).b.setMinimumSize(new Dimension(((WatchedChartDemo)localObject1).g, 600));
    localObject1 = paramArrayOfString;
    (localObject4 = (WatchedCamera)paramArrayOfString.a.getView().getCamera()).c.setColor(Color.BLUE);
    ((WatchedCamera)localObject4).d.setColor(Color.GREEN);
    ((WatchedCamera)localObject4).a.setColor(Color.GRAY);
    ((WatchedCamera)localObject4).b.setColor(Color.WHITE);
    ((WatchedCamera)localObject4).d.setWidth(150);
    (localObject6 = (WatchedRenderer3d)((WatchedChartDemo)localObject1).a.getCanvas().getRenderer()).a.setColor(Color.MAGENTA);
    ((WatchedRenderer3d)localObject6).b.setColor(Color.CYAN);
    ((WatchedChartDemo)localObject1).a(((WatchedRenderer3d)localObject6).a);
    ((WatchedChartDemo)localObject1).a(((WatchedRenderer3d)localObject6).b);
    ((WatchedChartDemo)localObject1).a(((WatchedCamera)localObject4).c);
    ((WatchedChartDemo)localObject1).a(((WatchedCamera)localObject4).d);
    ((WatchedChartDemo)localObject1).a(((WatchedCamera)localObject4).a);
    ((WatchedChartDemo)localObject1).a(((WatchedCamera)localObject4).b);
    localObject1 = paramArrayOfString;
    Object localObject4 = "[20][300px, grow][20]";
    Object localObject6 = "[20][600px, grow][20]";
    EzLayout localEzLayout;
    (localEzLayout = new EzLayout((String)localObject4, (String)localObject6)).a(0, 1, ((WatchedChartDemo)localObject1).c, EzLayout.Prop.a);
    localEzLayout.a(1, 1, (Component)((WatchedChartDemo)localObject1).a.getCanvas(), EzLayout.Prop.a);
    localEzLayout.a(2, 1, ((WatchedChartDemo)localObject1).d, EzLayout.Prop.a);
    localEzLayout.a(1, 0, ((WatchedChartDemo)localObject1).e, EzLayout.Prop.a);
    localEzLayout.a(1, 2, ((WatchedChartDemo)localObject1).f, EzLayout.Prop.a);
    WatchedFactory.a(localEzLayout.a());
  }
  
  private void a(Serie2d paramSerie2d)
  {
    this.b.a(paramSerie2d);
    this.a.addDrawable(paramSerie2d.getDrawable());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\WatchedChartDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */