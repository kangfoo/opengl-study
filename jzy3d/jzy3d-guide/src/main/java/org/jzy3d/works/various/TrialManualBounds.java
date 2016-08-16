package org.jzy3d.works.various;

import java.io.PrintStream;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.camera.NewtCameraKeyController;
import org.jzy3d.chart.controllers.mouse.camera.NewtCameraMouseController;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.chart.factories.NewtChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewBoundMode;

public class TrialManualBounds
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new TrialManualBounds(new NewtChartComponentFactory())).setCanvasType("newt");
    AnalysisLauncher.open(paramArrayOfString);
    paramArrayOfString.getChart().getView().setInitBounds(new BoundingBox3d(-1.0F, 1.0F, -1.0F, 1.0F, -1.0F, 1.0F));
    System.out.println(paramArrayOfString.getChart().getView().getBounds());
  }
  
  private TrialManualBounds(IChartComponentFactory paramIChartComponentFactory)
  {
    super(paramIChartComponentFactory);
  }
  
  public void init()
  {
    Object localObject = new g(this);
    Range localRange = new Range(-3.0F, 3.0F);
    (localObject = Builder.buildOrthonormal(new OrthonormalGrid(localRange, 80, localRange, 80), (Mapper)localObject)).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject).getBounds().getZmin(), ((Shape)localObject).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject).setFaceDisplayed(true);
    ((Shape)localObject).setWireframeDisplayed(false);
    this.chart = initializeChart(Quality.Advanced);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    this.chart.addController(new NewtCameraKeyController());
    this.chart.getView().setBoundMode(ViewBoundMode.MANUAL);
    new NewtCameraMouseController(this.chart);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\various\TrialManualBounds.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */