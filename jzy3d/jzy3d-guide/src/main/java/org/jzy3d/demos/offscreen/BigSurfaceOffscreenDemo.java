package org.jzy3d.demos.offscreen;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.demos.surface.big.SurfaceFactory;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.BufferedImageMapper;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class BigSurfaceOffscreenDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    System.err.println("This demo may need to run with -Xmx1024m as VM arguments");
    (paramArrayOfString = new BigSurfaceOffscreenDemo()).init();
  }
  
  public BigSurfaceOffscreenDemo()
  {
    this.canvasType = "offscreen,400,400";
  }
  
  public void init()
  {
    Object localObject1 = null;
    try
    {
      localObject1 = ImageIO.read(BigSurfaceOffscreenDemo.class.getClassLoader().getResourceAsStream("org/jzy3d/demos/surface/big/chromatogram.png"));
    }
    catch (IOException localIOException)
    {
      (localObject3 = localIOException).printStackTrace();
    }
    Object localObject3 = new BufferedImageMapper((BufferedImage)localObject1);
    localObject1 = new Rectangle(0, 0, ((BufferedImage)localObject1).getWidth(), ((BufferedImage)localObject1).getHeight());
    new SurfaceFactory();
    localObject1 = SurfaceFactory.a(((BufferedImageMapper)localObject3).getClippedViewport((Rectangle)localObject1), (Mapper)localObject3, ((Rectangle)localObject1).width / 2, ((Rectangle)localObject1).height / 2);
    this.chart = initializeChart();
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    int i = 0;
    localObject3 = this.chart.getCanvas();
    Object localObject2 = this;
    if (!(localObject2 = new File("./data/screenshots", localObject2.getClass().getSimpleName() + "_0" + ".png")).getParentFile().exists()) {
      ((File)localObject2).mkdirs();
    }
    ((ICanvas)localObject3).screenshot((File)localObject2);
    System.out.println("Dumped screenshot in: " + localObject2);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\offscreen\BigSurfaceOffscreenDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */