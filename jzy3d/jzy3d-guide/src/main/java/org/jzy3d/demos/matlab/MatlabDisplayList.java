package org.jzy3d.demos.matlab;

import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.lights.AWTLightKeyController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.io.matlab.MatlabDrawableLoader;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.CompileableComposite;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Light;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;

public class MatlabDisplayList
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new MatlabDisplayList());
  }
  
  public void init()
  {
    Object localObject1 = localObject1 = (localObject1 = new MatlabDrawableLoader()).load("data/matfiles/STR1.mat");
    (localObject2 = Color.GRAY).alphaSelf(0.5F);
    Object localObject3 = Color.WHITE.clone();
    CompileableComposite localCompileableComposite;
    (localCompileableComposite = new CompileableComposite()).add((List)localObject1);
    localCompileableComposite.setFaceDisplayed(true);
    localCompileableComposite.setColor((Color)localObject3);
    localCompileableComposite.setWireframeDisplayed(false);
    localCompileableComposite.setWireframeColor((Color)localObject2);
    localObject1 = localCompileableComposite;
    this.chart = AWTChartComponentFactory.chart(Quality.Intermediate);
    this.chart.getAxeLayout().setMainColor(Color.WHITE);
    this.chart.setAxeDisplayed(false);
    this.chart.getView().setBackgroundColor(Color.BLACK);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    Object localObject2 = new Coord3d(5.0F, 5.0F, 50.0F);
    localObject1 = this.chart;
    (localObject3 = new Light()).setPosition((Coord3d)localObject2);
    ((Light)localObject3).setAmbiantColor(Color.BLUE);
    ((Light)localObject3).setDiffuseColor(Color.CYAN);
    ((Light)localObject3).setSpecularColor(Color.CYAN);
    ((Light)localObject3).setRepresentationRadius(1.0F);
    ((Chart)localObject1).getScene().add((Light)localObject3);
    ((Chart)localObject1).getCanvas().addKeyController(new AWTLightKeyController((Chart)localObject1, 0));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\matlab\MatlabDisplayList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */