package org.jzy3d.bugs.joglwarning;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.LineStrip;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class SurfaceDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new SurfaceDemo());
  }
  
  public void init()
  {
    Object localObject1 = new a(this);
    Object localObject2 = new Range(-3.0F, 3.0F);
    (localObject1 = Builder.buildOrthonormal(new OrthonormalGrid((Range)localObject2, 80, (Range)localObject2, 80), (Mapper)localObject1)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject1).getBounds().getZmin(), ((Shape)localObject1).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject1).setFaceDisplayed(true);
    ((Shape)localObject1).setWireframeDisplayed(false);
    this.chart = AWTChartComponentFactory.chart(Quality.Advanced, getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    localObject1 = new Point(new Coord3d(0.0F, -2.0F, 2.0F), Color.BLUE, 5.0F);
    localObject2 = new Point(new Coord3d(0.0F, 2.0F, 2.0F), Color.RED, 5.0F);
    localObject1 = new LineStrip((Point)localObject1, (Point)localObject2);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\joglwarning\SurfaceDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */