package org.jzy3d.demos.vbo.scatter;

import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.vbo.builders.VBOBuilderListCoord3d;
import org.jzy3d.plot3d.primitives.vbo.drawable.ScatterVBO;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class ScatterVBODemo
  extends AbstractAnalysis
{
  private static int a = 1000000;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ScatterVBODemo());
  }
  
  public String getPitch()
  {
    return "One million point scatter plot";
  }
  
  public void init()
  {
    int i;
    ColorMapper localColorMapper = ScatterGenerator.a(localObject = ScatterGenerator.a(i = (int)(1.0F * a)));
    Object localObject = new ScatterVBO(new VBOBuilderListCoord3d((List)localObject, localColorMapper));
    this.chart = initializeChart(Quality.Advanced);
    this.chart.add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\vbo\scatter\ScatterVBODemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */