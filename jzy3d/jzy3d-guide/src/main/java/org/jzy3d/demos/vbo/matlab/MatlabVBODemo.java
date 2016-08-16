package org.jzy3d.demos.vbo.matlab;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.chart.controllers.keyboard.lights.NewtLightKeyController;
import org.jzy3d.colors.Color;
import org.jzy3d.io.matlab.MatlabVBOLoader;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.vbo.drawable.DrawableVBO;
import org.jzy3d.plot3d.rendering.canvas.CanvasAWT;
import org.jzy3d.plot3d.rendering.canvas.CanvasNewtAwt;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Light;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.ViewportMode;
import org.jzy3d.plot3d.transform.Rotate;
import org.jzy3d.plot3d.transform.Rotator;
import org.jzy3d.plot3d.transform.Transform;
import org.jzy3d.plot3d.transform.Transformer;
import org.jzy3d.plot3d.transform.Translate;
import org.jzy3d.utils.LoggerUtils;

public class MatlabVBODemo
  extends AbstractAnalysis
{
  private String a = "data/matfiles/";
  private boolean b = true;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new MatlabVBODemo(true));
  }
  
  public MatlabVBODemo(boolean paramBoolean) {}
  
  public String getPitch()
  {
    return "Load 3 Matlab .mat files to build a VBO, and use self-transforms to rotate geometries with GPU. The light can be moved using Numpad.";
  }
  
  public void init()
  {
    LoggerUtils.minimal();
    Object localObject4 = this;
    (localObject2 = new DrawableVBO(new MatlabVBOLoader(((MatlabVBODemo)localObject4).a + "STR1.mat"))).setColor(Color.GREEN);
    ((DrawableVBO)localObject2).setBoundingBoxDisplayed(true);
    ((DrawableVBO)localObject2).setBoundingBoxColor(Color.WHITE);
    Object localObject1 = localObject2;
    localObject4 = this;
    (localObject2 = new DrawableVBO(new MatlabVBOLoader(((MatlabVBODemo)localObject4).a + "STR2.mat"))).setColor(Color.YELLOW);
    ((DrawableVBO)localObject2).setBoundingBoxDisplayed(true);
    ((DrawableVBO)localObject2).setBoundingBoxColor(Color.WHITE);
    Object localObject2 = localObject2;
    localObject4 = localObject1;
    Object localObject3 = new Rotate(25.0F, new Coord3d(0.0F, 0.0F, 1.0F));
    Object localObject5 = new Translate(new Coord3d(0.0F, 0.0F, 10.0F));
    Transform localTransform;
    (localTransform = new Transform()).add((Transformer)localObject3);
    localTransform.add((Transformer)localObject5);
    ((DrawableVBO)localObject4).setTransformBefore(localTransform);
    localObject3 = localObject3 = new Rotator(10, (Rotate)localObject3);
    this.chart = initializeChart(Quality.Intermediate);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject2);
    localObject2 = new Coord3d(5.0F, 5.0F, 50.0F);
    localObject4 = this.chart;
    (localObject5 = new Light()).setPosition((Coord3d)localObject2);
    ((Light)localObject5).setAmbiantColor(Color.BLUE);
    ((Light)localObject5).setDiffuseColor(new Color(0.8F, 0.8F, 0.8F));
    ((Light)localObject5).setSpecularColor(Color.WHITE);
    ((Light)localObject5).setRepresentationRadius(1.0F);
    ((Chart)localObject4).getScene().add((Light)localObject5);
    if ((((Chart)localObject4).getCanvas() instanceof CanvasAWT)) {
      ((Chart)localObject4).getCanvas().addKeyController(new AWTLightKeyController((Chart)localObject4, (Light)localObject5));
    } else if ((((Chart)localObject4).getCanvas() instanceof CanvasNewtAwt)) {
      ((Chart)localObject4).getCanvas().addKeyController(new NewtLightKeyController((Chart)localObject4, (Light)localObject5));
    }
    this.chart.getView().setBackgroundColor(Color.BLACK);
    this.chart.getAxeLayout().setMainColor(Color.WHITE);
    this.chart.setAxeDisplayed(false);
    this.chart.getView().getCamera().setViewportMode(ViewportMode.STRETCH_TO_FILL);
    this.chart.addMouseController();
    if (this.b) {
      ((Rotator)localObject3).start();
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\vbo\matlab\MatlabVBODemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */