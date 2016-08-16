package org.jzy3d.bugs.ellipsoid;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
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

public class EllipsoidDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new EllipsoidDemo());
  }
  
  public void init()
  {
    Object localObject1 = new c(this);
    Object localObject2 = new d(this, (Mapper)localObject1);
    System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
    Range localRange1 = new Range(-25.0F, 25.0F);
    Range localRange2 = new Range(-25.0F, 25.0F);
    localObject1 = Builder.buildRing(new OrthonormalGrid(localRange1, 61, localRange2, 61), (Mapper)localObject1, 0.0F, 25.0F);
    localObject2 = Builder.buildRing(new OrthonormalGrid(localRange1, 61, localRange2, 61), (Mapper)localObject2, 0.0F, 25.0F);
    ((Shape)localObject1).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject1).getBounds().getZmin(), ((Shape)localObject1).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 1.0F)));
    ((Shape)localObject1).setFaceDisplayed(true);
    ((Shape)localObject1).setWireframeDisplayed(true);
    ((Shape)localObject1).setWireframeColor(Color.BLACK);
    ((Shape)localObject1).setLegendDisplayed(false);
    ((Shape)localObject2).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject1).getBounds().getZmin(), ((Shape)localObject1).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 1.0F)));
    ((Shape)localObject2).setFaceDisplayed(true);
    ((Shape)localObject2).setWireframeDisplayed(true);
    ((Shape)localObject2).setWireframeColor(Color.BLACK);
    ((Shape)localObject2).setLegendDisplayed(false);
    this.chart = AWTChartComponentFactory.chart(Quality.Advanced, getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\ellipsoid\EllipsoidDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */