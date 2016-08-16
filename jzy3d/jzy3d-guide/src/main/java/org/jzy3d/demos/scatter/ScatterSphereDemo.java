package org.jzy3d.demos.scatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Sphere;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class ScatterSphereDemo
  extends AbstractAnalysis
{
  private static int a = 1000;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ScatterSphereDemo());
  }
  
  public String getPitch()
  {
    return "Using sphere radius allows to represent a fourth dimension. " + a + " spheres are drawn.";
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Advanced);
    int i = a;
    Object localObject1 = this;
    localObject1 = new ArrayList(i);
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    int j = 0;
    Coord3d localCoord3d = new Coord3d(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat());
    Color localColor = new Color(localCoord3d.x * localCoord3d.y, localCoord3d.y * localCoord3d.z, localCoord3d.z * localCoord3d.x, 1.0F);
    float f = 0.025F * localRandom.nextFloat();
    int k = 8;
    f = f;
    localColor = localColor;
    Object localObject2 = localCoord3d;
    (localObject2 = new Sphere((Coord3d)localObject2, f, 8, localColor)).setWireframeColor(Color.WHITE.alphaSelf(0.1F));
    ((Sphere)localObject2).setWireframeDisplayed(true);
    ((Sphere)localObject2).setWireframeWidth(0.1F);
    ((List)localObject1).add(localObject2);
    this.chart.getScene().add((List)localObject1);
    this.chart.addMouseController();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\scatter\ScatterSphereDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */