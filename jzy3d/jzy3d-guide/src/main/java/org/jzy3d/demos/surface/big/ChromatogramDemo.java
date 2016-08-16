package org.jzy3d.demos.surface.big;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.BufferedImageMapper;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.CompileableComposite;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class ChromatogramDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    System.err.println("This demo may need to run with -Xmx1024m as VM arguments");
    AnalysisLauncher.open(new ChromatogramDemo());
  }
  
  public void init()
  {
    Object localObject2 = "data/chromatogram.png";
    Object localObject1 = this;
    localObject1 = a(localObject1 = new FileInputStream(new File((String)localObject2)));
    localObject2 = new BufferedImageMapper((BufferedImage)localObject1);
    localObject1 = new Rectangle(0, 0, ((BufferedImage)localObject1).getWidth(), ((BufferedImage)localObject1).getHeight());
    new SurfaceFactory();
    localObject1 = SurfaceFactory.a(((BufferedImageMapper)localObject2).getClippedViewport((Rectangle)localObject1), (Mapper)localObject2, ((Rectangle)localObject1).width / 2, ((Rectangle)localObject1).height / 2);
    System.out.println("Compilable has " + ((CompileableComposite)localObject1).size() + " polygons");
    System.out.println("------------------------------------");
    this.chart = initializeChart();
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
  }
  
  private static BufferedImage a(InputStream paramInputStream)
  {
    BufferedImage localBufferedImage = null;
    try
    {
      localBufferedImage = ImageIO.read(paramInputStream);
    }
    catch (IOException localIOException)
    {
      (paramInputStream = localIOException).printStackTrace();
    }
    return localBufferedImage;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\big\ChromatogramDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */