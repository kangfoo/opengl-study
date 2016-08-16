package org.jzy3d.bugs.perspectivepb;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.CameraMode;

public class WireSurfaceDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new WireSurfaceDemo());
  }
  
  public void init()
  {
    Object localObject = new a(this);
    Range localRange = new Range(-150.0F, 150.0F);
    (localObject = Builder.buildOrthonormal(new OrthonormalGrid(localRange, 50, localRange, 50), (Mapper)localObject)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject).getBounds().getZmin(), ((Shape)localObject).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject).setFaceDisplayed(true);
    ((Shape)localObject).setWireframeDisplayed(true);
    ((Shape)localObject).setWireframeColor(Color.BLACK);
    this.chart = new AWTChartComponentFactory().newChart(Quality.Intermediate, IChartComponentFactory.Toolkit.awt);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    this.chart.getView().setCameraMode(CameraMode.PERSPECTIVE);
  }
  
  public String getPitch()
  {
    return "Show a simple surface based on a mathematical function";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\perspectivepb\WireSurfaceDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */