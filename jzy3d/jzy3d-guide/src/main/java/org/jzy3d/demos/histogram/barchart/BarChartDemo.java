package org.jzy3d.demos.histogram.barchart;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.Settings;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class BarChartDemo
  extends AbstractAnalysis
{
  private LabeledMouseSelector a;
  private CustomMouseControl b;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new BarChartDemo());
  }
  
  public BarChartDemo()
  {
    super(new AWTChartComponentFactory());
  }
  
  public void init()
  {
    Settings.getInstance().setHardwareAccelerated(true);
    this.chart = initializeChart(Quality.Nicest);
    Object localObject = this;
    c localc2 = new c((BarChartDemo)localObject);
    ((AWTChart)((BarChartDemo)localObject).chart).addRenderer(localc2);
    localObject = this;
    this.chart.getAxeLayout().setXAxeLabel("Scattering");
    ((BarChartDemo)localObject).chart.getAxeLayout().setYAxeLabel("Feature");
    ((BarChartDemo)localObject).chart.getAxeLayout().setYTickRenderer(new d((BarChartDemo)localObject));
    ((BarChartDemo)localObject).chart.getAxeLayout().setYTickProvider(new DiscreteTickProvider());
    ((BarChartDemo)localObject).chart.getAxeLayout().setZAxeLabel("Tangling");
    ((BarChartDemo)localObject).chart.getView().setViewPositionMode(ViewPositionMode.FREE);
    localObject = this;
    this.b = new CustomMouseControl(((BarChartDemo)localObject).chart);
    ((BarChartDemo)localObject).b.a();
    localObject = this;
    this.chart.getCanvas().addKeyController(new CustomKeyboardControl(((BarChartDemo)localObject).chart));
    localObject = this;
    this.chart.getCanvas().addKeyController(new SVGKeyboardSaver(((BarChartDemo)localObject).chart));
    localObject = this;
    this.a = new LabeledMouseSelector(((BarChartDemo)localObject).chart);
    ((BarChartDemo)localObject).chart.getCanvas().addKeyController(((BarChartDemo)localObject).a);
    localObject = this;
    ((AWTChart)this.chart).addRenderer(new CustomLegendRenderer(((BarChartDemo)localObject).chart.getCanvas()));
    ChartScene localChartScene = this.chart.getScene();
    for (c localc1 = 0; localc1 < 4; localc1++) {
      for (int i = 0; i < 6; i++)
      {
        double d = Math.random() * (5.0F / (localc1 + 1) + 7.0F / (i + 1));
        int j = i;
        localc2 = localc1;
        localObject = this;
        Color localColor;
        (localColor = Color.random()).a = 1.0F;
        (localObject = new BarChartBar(((BarChartDemo)localObject).chart, "f" + j + ",c" + localc2)).a(localc2, j, (float)d, localColor);
        localChartScene.add((AbstractDrawable)localObject);
      }
    }
    this.chart.getView().setMaximized(true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\BarChartDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */