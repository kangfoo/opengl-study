package org.jzy3d.demos.textures;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.textured.MaskPair;
import org.jzy3d.plot3d.primitives.textured.TexturedCube;
import org.jzy3d.plot3d.primitives.textured.TexturedCylinder;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.textures.TextureFactory;
import org.jzy3d.plot3d.rendering.view.View;

public class TextureDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new TextureDemo());
  }
  
  public String getPitch()
  {
    return "Load two textures used as masks for painting a cylinder and a cube.";
  }
  
  public void init()
  {
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getView().setSquared(false);
    Color localColor = new Color(0.1F, 0.1F, 0.9F);
    Object localObject = new Coord3d(1.0D, 1.0D, 0.5D);
    MaskPair localMaskPair = new MaskPair(TextureFactory.get("data/textures/masks/arrow-bg-mask-100-100.png"), TextureFactory.get("data/textures/masks/arrow-symbol-mask-100-100.png"));
    (localObject = new TexturedCylinder((Coord3d)localObject, localColor, localColor.negative(), localMaskPair)).setAlphaFactor(0.8F);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    localColor = new Color(0.1F, 0.9F, 0.9F);
    localObject = new Coord3d(-1.0D, -1.0D, -0.5D);
    localMaskPair = new MaskPair(TextureFactory.get("data/textures/masks/sharp-bg-mask-100-100.png"), TextureFactory.get("data/textures/masks/sharp-symbol-mask-100-100.png"));
    (localObject = new TexturedCube((Coord3d)localObject, localColor, localColor.negative(), localMaskPair)).setAlphaFactor(0.8F);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\textures\TextureDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */