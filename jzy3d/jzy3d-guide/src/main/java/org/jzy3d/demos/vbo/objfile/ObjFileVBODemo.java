package org.jzy3d.demos.vbo.objfile;

import java.io.File;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.chart.controllers.keyboard.lights.NewtLightKeyController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.io.IGLLoader;
import org.jzy3d.io.obj.OBJFileLoader;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.vbo.drawable.DrawableVBO;
import org.jzy3d.plot3d.rendering.canvas.CanvasAWT;
import org.jzy3d.plot3d.rendering.canvas.CanvasNewtAwt;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.lights.Light;
import org.jzy3d.plot3d.transform.Rotate;
import org.jzy3d.plot3d.transform.Transform;
import org.jzy3d.plot3d.transform.TranslateDrawable;

public class ObjFileVBODemo
  extends AbstractAnalysis
{
  private String a = "data/objfiles/dragon.obj";
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new ObjFileVBODemo());
  }
  
  public String getPitch()
  {
    return "Load a .obj file. \nIf the file is not part of the distribution, you can get it from http://download.jzy3d.org/objfiles/dragon.obj\nAlso note you have to start the program by calling -Xmx1024m";
  }
  
  public void init()
  {
    this.chart = AWTChartComponentFactory.chart(getCanvasType());
    Object localObject1 = new OBJFileLoader("file://" + new File(this.a).getAbsolutePath());
    localObject1 = new DrawableVBO((IGLLoader)localObject1);
    this.chart.getScene().add((AbstractDrawable)localObject1);
    (localObject2 = new Transform()).add(new TranslateDrawable((AbstractDrawable)localObject1, false));
    ((Transform)localObject2).add(new Rotate(90.0F, new Coord3d(1.0F, 0.0F, 0.0F)));
    ((Transform)localObject2).add(new TranslateDrawable((AbstractDrawable)localObject1, true));
    ((Transform)localObject2).add(new TranslateDrawable((AbstractDrawable)localObject1, true));
    ((Transform)localObject2).add(new TranslateDrawable((AbstractDrawable)localObject1, true));
    ((DrawableVBO)localObject1).setTransformBefore((Transform)localObject2);
    localObject1 = this.chart.addLight(new Coord3d(-0.2D, 0.2D, 0.3D), Color.BLUE, new Color(0.8F, 0.8F, 0.8F), Color.WHITE, 0.01F);
    Object localObject2 = localObject1;
    localObject1 = this;
    if ((this.chart.getCanvas() instanceof CanvasAWT))
    {
      ((ObjFileVBODemo)localObject1).chart.getCanvas().addKeyController(new AWTLightKeyController(((ObjFileVBODemo)localObject1).chart, (Light)localObject2));
      return;
    }
    if ((((ObjFileVBODemo)localObject1).chart.getCanvas() instanceof CanvasNewtAwt)) {
      ((ObjFileVBODemo)localObject1).chart.getCanvas().addKeyController(new NewtLightKeyController(((ObjFileVBODemo)localObject1).chart, (Light)localObject2));
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\vbo\objfile\ObjFileVBODemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */