package org.jzy3d.bugs.vbo.matlab.perspective;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.chart.controllers.keyboard.lights.NewtLightKeyController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
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
import org.jzy3d.plot3d.rendering.view.modes.CameraMode;
import org.jzy3d.plot3d.transform.Rotate;
import org.jzy3d.plot3d.transform.Rotator;
import org.jzy3d.plot3d.transform.Transform;
import org.jzy3d.plot3d.transform.Transformer;
import org.jzy3d.plot3d.transform.Translate;
import org.jzy3d.utils.LoggerUtils;

public class MatlabVBOPerspective
{
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = "data/matfiles/";
    LoggerUtils.minimal();
    Object localObject1 = new DrawableVBO(new MatlabVBOLoader(paramArrayOfString + "PIP2.mat"));
    Object localObject2 = new DrawableVBO(new MatlabVBOLoader(paramArrayOfString + "STR1.mat"));
    paramArrayOfString = new DrawableVBO(new MatlabVBOLoader(paramArrayOfString + "STR2.mat"));
    ((DrawableVBO)localObject1).setColor(Color.WHITE);
    ((DrawableVBO)localObject2).setColor(Color.GREEN);
    ((DrawableVBO)localObject2).setBoundingBoxDisplayed(true);
    ((DrawableVBO)localObject2).setBoundingBoxColor(Color.WHITE);
    paramArrayOfString.setColor(Color.YELLOW);
    paramArrayOfString.setBoundingBoxDisplayed(true);
    paramArrayOfString.setBoundingBoxColor(Color.WHITE);
    localObject1 = new Rotate(25.0F, new Coord3d(0.0F, 0.0F, 1.0F));
    Object localObject3 = new Translate(new Coord3d(0.0F, 0.0F, 10.0F));
    Object localObject4;
    (localObject4 = new Transform()).add((Transformer)localObject1);
    ((Transform)localObject4).add((Transformer)localObject3);
    ((DrawableVBO)localObject2).setTransformBefore((Transform)localObject4);
    localObject1 = new Rotator(10, (Rotate)localObject1);
    (localObject3 = Quality.Intermediate).setSmoothEdge(true);
    ((Quality)localObject3).setSmoothPolygon(true);
    ((Quality)localObject3).setSmoothPoint(true);
    ((Quality)localObject3).setAlphaActivated(true);
    ((Quality)localObject3).setDisableDepthBufferWhenAlpha(false);
    (localObject3 = AWTChartComponentFactory.chart((Quality)localObject3, "newt")).getScene().getGraph().add((AbstractDrawable)localObject2);
    ((Chart)localObject3).getScene().getGraph().add(paramArrayOfString);
    localObject2 = new Coord3d(5.0F, 5.0F, 50.0F);
    paramArrayOfString = (String[])localObject3;
    (localObject4 = new Light()).setPosition((Coord3d)localObject2);
    ((Light)localObject4).setAmbiantColor(Color.BLUE);
    ((Light)localObject4).setDiffuseColor(new Color(0.8F, 0.8F, 0.8F));
    ((Light)localObject4).setSpecularColor(Color.WHITE);
    ((Light)localObject4).setRepresentationRadius(1.0F);
    paramArrayOfString.getScene().add((Light)localObject4);
    if ((paramArrayOfString.getCanvas() instanceof CanvasAWT)) {
      paramArrayOfString.getCanvas().addKeyController(new AWTLightKeyController(paramArrayOfString, (Light)localObject4));
    } else if ((paramArrayOfString.getCanvas() instanceof CanvasNewtAwt)) {
      paramArrayOfString.getCanvas().addKeyController(new NewtLightKeyController(paramArrayOfString, (Light)localObject4));
    }
    ((Chart)localObject3).getView().setBackgroundColor(Color.BLACK);
    ((Chart)localObject3).getAxeLayout().setMainColor(Color.WHITE);
    ((Chart)localObject3).setAxeDisplayed(false);
    ((Chart)localObject3).getView().setCameraMode(CameraMode.PERSPECTIVE);
    ((Chart)localObject3).getView().getCamera().setViewportMode(ViewportMode.STRETCH_TO_FILL);
    ((Chart)localObject3).addMouseController();
    ((Chart)localObject3).open("VBO and self transforms", 500, 500);
    ((Rotator)localObject1).start();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\vbo\matlab\perspective\MatlabVBOPerspective.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */