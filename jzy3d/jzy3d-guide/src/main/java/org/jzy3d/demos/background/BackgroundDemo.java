package org.jzy3d.demos.background;

import java.awt.image.BufferedImage;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.io.FileImage;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.legends.ILegend;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.AWTView;
import org.jzy3d.plot3d.rendering.view.View;

public class BackgroundDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new BackgroundDemo(), new Rectangle(0, 0, 400, 400));
  }
  
  public void init()
  {
    Object localObject1 = FileImage.load("data/bg-demo.jpg");
    Object localObject2 = new a(this);
    Range localRange = new Range(-150.0F, 150.0F);
    (localObject2 = Builder.buildOrthonormal(new OrthonormalGrid(localRange, 50, localRange, 50), (Mapper)localObject2)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject2).getBounds().getZmin(), ((Shape)localObject2).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject2).setFaceDisplayed(true);
    ((Shape)localObject2).setWireframeDisplayed(true);
    ((Shape)localObject2).setWireframeColor(Color.BLACK);
    this.chart = initializeChart(Quality.Intermediate);
    ((AWTView)this.chart.getView()).setBackgroundImage((BufferedImage)localObject1);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject2);
    localObject1 = new AWTColorbarLegend((AbstractDrawable)localObject2, this.chart.getView().getAxe().getLayout());
    ((Shape)localObject2).setLegend((ILegend)localObject1);
    ((Shape)localObject2).setLegendDisplayed(true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\background\BackgroundDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */