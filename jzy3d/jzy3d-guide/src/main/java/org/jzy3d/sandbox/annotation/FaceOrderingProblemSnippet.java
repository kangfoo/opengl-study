package org.jzy3d.sandbox.annotation;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.keyboard.camera.AWTCameraKeyController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.DefaultColorMapperUpdatePolicy;
import org.jzy3d.colors.OrderingStrategyScoreColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbowNoBorder;
import org.jzy3d.colors.colormaps.IColorMap;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.builder.concrete.OrthonormalTessellator;
import org.jzy3d.plot3d.primitives.AbstractComposite;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.legends.ILegend;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.ordering.BarycentreOrderingStrategy;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.AWTView;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.annotation.BarycenterAnnotation;
import org.jzy3d.plot3d.rendering.view.annotation.CameraDistanceAnnotation;
import org.jzy3d.plot3d.rendering.view.annotation.CameraEyeOverlayAnnotation;

public class FaceOrderingProblemSnippet
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new FaceOrderingProblemSnippet());
  }
  
  public void init()
  {
    (localObject1 = Quality.Advanced).setSmoothPoint(true);
    this.chart = AWTChartComponentFactory.chart((Quality)localObject1, getCanvasType());
    Object localObject1 = new a(this);
    Object localObject2 = new Range(0.0F, 3.0F);
    localObject2 = new OrthonormalGrid((Range)localObject2, 4, (Range)localObject2, 4);
    Object localObject3 = new b(this);
    (localObject4 = (BarycentreOrderingStrategy)this.chart.getScene().getGraph().getStrategy()).setView(this.chart.getView());
    Object localObject4 = this.chart.getScene().getGraph();
    localObject3 = this.chart.getAxeLayout();
    localObject2 = localObject1 = (Shape)((OrthonormalTessellator)localObject3).build(((OrthonormalGrid)localObject2).apply((Mapper)localObject1));
    Color localColor = new Color(1.0F, 1.0F, 1.0F, 0.75F);
    ColorMapRainbowNoBorder localColorMapRainbowNoBorder;
    (localColorMapRainbowNoBorder = new ColorMapRainbowNoBorder()).setDirection(false);
    localObject4 = new OrderingStrategyScoreColorMapper(localColorMapRainbowNoBorder, new DefaultColorMapperUpdatePolicy(), (Graph)localObject4, localColor);
    ((Shape)localObject2).setColorMapper((ColorMapper)localObject4);
    ((Shape)localObject2).setWireframeDisplayed(false);
    localObject3 = new AWTColorbarLegend((AbstractDrawable)localObject2, (IAxeLayout)localObject3);
    ((Shape)localObject2).setLegend((ILegend)localObject3);
    ((Shape)localObject1).setFaceDisplayed(true);
    ((Shape)localObject1).setWireframeDisplayed(true);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject1);
    this.chart.addController(new AWTCameraKeyController());
    this.chart.getView().getAnnotations().add(new CameraDistanceAnnotation(this.chart.getView(), Color.RED));
    this.chart.getView().getAnnotations().add(BarycenterAnnotation.annotate((AbstractComposite)localObject1));
    ((AWTView)this.chart.getView()).addRenderer2d(new CameraEyeOverlayAnnotation(this.chart.getView()));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\annotation\FaceOrderingProblemSnippet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */