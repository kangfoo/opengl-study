package org.jzy3d.demos.offscreen;

import java.io.File;
import java.io.PrintStream;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.SwingChartLauncher;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.AWTRenderer3d;

public class WireSurfaceOffscreenDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new WireSurfaceOffscreenDemo()).init();
  }
  
  public WireSurfaceOffscreenDemo()
  {
    this.canvasType = "offscreen,400,400";
  }
  
  public void init()
  {
    this.chart = initializeChart();
    Object localObject1 = this;
    Object localObject2 = new a((WireSurfaceOffscreenDemo)localObject1);
    localObject1 = new Range(-150.0F, 150.0F);
    (localObject1 = Builder.buildOrthonormal(new OrthonormalGrid((Range)localObject1, 50, (Range)localObject1, 50), (Mapper)localObject2)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject1).getBounds().getZmin(), ((Shape)localObject1).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject1).setFaceDisplayed(true);
    ((Shape)localObject1).setWireframeDisplayed(true);
    ((Shape)localObject1).setWireframeColor(Color.BLACK);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    localObject2 = this.chart.getCanvas();
    localObject1 = this;
    if (!(localObject1 = new File("./data/screenshots", localObject1.getClass().getSimpleName() + ".png")).getParentFile().exists()) {
      ((File)localObject1).mkdirs();
    }
    ((ICanvas)localObject2).screenshot((File)localObject1);
    System.out.println("Dumped screenshot in: " + localObject1);
    localObject1 = this;
    this.chart.screenshot();
    SwingChartLauncher.openImagePanel(localObject1 = (localObject2 = (AWTRenderer3d)((WireSurfaceOffscreenDemo)localObject1).chart.getCanvas().getRenderer()).getLastScreenshotImage(), new Rectangle(600, 0, 400, 400));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\offscreen\WireSurfaceOffscreenDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */