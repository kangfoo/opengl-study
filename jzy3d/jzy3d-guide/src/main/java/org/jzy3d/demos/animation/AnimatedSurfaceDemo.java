package org.jzy3d.demos.animation;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IRunnableAnalysis;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.IncreaseParamRemapTask;
import org.jzy3d.plot3d.builder.SingleParameterMapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class AnimatedSurfaceDemo
  extends AbstractAnalysis
  implements IRunnableAnalysis
{
  private Shape b;
  private SingleParameterMapper c;
  protected IncreaseParamRemapTask a;
  private Thread d;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(paramArrayOfString = new AnimatedSurfaceDemo());
    paramArrayOfString.start();
  }
  
  public void init()
  {
    this.c = new b(this, 0.999D);
    Range localRange = new Range(-150.0F, 150.0F);
    this.b = Builder.buildOrthonormal(new OrthonormalGrid(localRange, 50, localRange, 50), this.c);
    this.b.setColorMapper(new ColorMapper(new ColorMapRainbow(), this.b.getBounds().getZmin(), this.b.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    this.b.setFaceDisplayed(true);
    this.b.setWireframeDisplayed(true);
    this.b.setWireframeColor(Color.BLACK);
    this.a = new IncreaseParamRemapTask(this.b, this.c);
    this.chart = initializeChart(Quality.Intermediate);
    this.chart.getScene().getGraph().add(this.b);
    ((AWTChart)this.chart).addRenderer(new c(this));
  }
  
  public void start()
  {
    this.d = new Thread(this.a);
    this.d.start();
  }
  
  public void stop()
  {
    if (this.d != null) {
      this.d.interrupt();
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\animation\AnimatedSurfaceDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */