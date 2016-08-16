package org.jzy3d.book;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
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
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class BookViewProfile
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    ChartLauncher.SCREENSHOT_FOLDER = "./data/book/";
    AnalysisLauncher.open(paramArrayOfString = new BookViewProfile());
    ChartLauncher.screenshot(paramArrayOfString.getChart(), "data/book/" + BookViewProfile.class.getSimpleName() + ".png");
  }
  
  public void init()
  {
    Object localObject1 = new h(this);
    Object localObject2 = new Range(0.0F, 100.0F);
    (localObject1 = Builder.buildOrthonormal(new OrthonormalGrid((Range)localObject2, 50, (Range)localObject2, 50), (Mapper)localObject1)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject1).getBounds().getZmin(), ((Shape)localObject1).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject1).setFaceDisplayed(true);
    ((Shape)localObject1).setWireframeDisplayed(true);
    (localObject2 = Color.WHITE).alphaSelf(0.5F);
    ((Shape)localObject1).setWireframeColor((Color)localObject2);
    this.chart = new AWTChart(Quality.Advanced, getCanvasType());
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    this.chart.getView().setAxeBoxDisplayed(false);
    this.chart.getView().setViewPositionMode(ViewPositionMode.PROFILE);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookViewProfile.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */