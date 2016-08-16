package org.jzy3d.demos.surface;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class ColorWaveDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ColorWaveDemo());
  }
  
  public void init()
  {
    Object localObject = new a(this);
    Range localRange = new Range(-3.0F, 3.0F);
    (localObject = Builder.buildOrthonormal((Mapper)localObject, localRange, 80)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject).getBounds().getZmin(), ((Shape)localObject).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject).setFaceDisplayed(true);
    ((Shape)localObject).setWireframeDisplayed(false);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    this.chart.addKeyController();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\ColorWaveDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */