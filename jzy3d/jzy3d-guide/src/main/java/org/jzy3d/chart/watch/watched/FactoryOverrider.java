package org.jzy3d.chart.watch.watched;

import com.jogamp.opengl.GLCapabilities;
import java.io.PrintStream;
import org.jzy3d.bridge.IFrame;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.keyboard.camera.ICameraKeyController;
import org.jzy3d.chart.controllers.keyboard.screenshot.IScreenshotKeyController;
import org.jzy3d.chart.controllers.mouse.camera.ICameraMouseController;
import org.jzy3d.chart.factories.ChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory.Toolkit;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ordering.AbstractOrderingStrategy;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.Renderer3d;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;

public class FactoryOverrider
  extends ChartComponentFactory
{
  private IChartComponentFactory a;
  
  public FactoryOverrider(IChartComponentFactory paramIChartComponentFactory)
  {
    this.a = paramIChartComponentFactory;
  }
  
  public ICanvas newCanvas(Scene paramScene, Quality paramQuality, String paramString, GLCapabilities paramGLCapabilities)
  {
    return this.a.newCanvas(getFactory(), paramScene, paramQuality, paramString, paramGLCapabilities);
  }
  
  public ICanvas newCanvas(IChartComponentFactory paramIChartComponentFactory, Scene paramScene, Quality paramQuality, String paramString, GLCapabilities paramGLCapabilities)
  {
    return this.a.newCanvas(getFactory(), paramScene, paramQuality, paramString, paramGLCapabilities);
  }
  
  public IChartComponentFactory getFactory()
  {
    return this;
  }
  
  public IViewportLayout newViewportLayout()
  {
    return this.a.newViewportLayout();
  }
  
  public Graph newGraph(Scene paramScene, AbstractOrderingStrategy paramAbstractOrderingStrategy, boolean paramBoolean)
  {
    return this.a.newGraph(paramScene, paramAbstractOrderingStrategy, paramBoolean);
  }
  
  public Renderer3d newRenderer(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.a.newRenderer(paramView, paramBoolean1, paramBoolean2);
  }
  
  public Renderer3d newRenderer(View paramView)
  {
    return this.a.newRenderer(paramView);
  }
  
  public Camera newCamera(Coord3d paramCoord3d)
  {
    return this.a.newCamera(paramCoord3d);
  }
  
  public IAxe newAxe(BoundingBox3d paramBoundingBox3d, View paramView)
  {
    return this.a.newAxe(paramBoundingBox3d, paramView);
  }
  
  public AbstractOrderingStrategy newOrderingStrategy()
  {
    return this.a.newOrderingStrategy();
  }
  
  public ICameraMouseController newMouseController(Chart paramChart)
  {
    return this.a.newMouseController(paramChart);
  }
  
  public IScreenshotKeyController newScreenshotKeyController(Chart paramChart)
  {
    return this.a.newScreenshotKeyController(paramChart);
  }
  
  public ICameraKeyController newKeyController(Chart paramChart)
  {
    return this.a.newKeyController(paramChart);
  }
  
  public Chart newChart(Quality paramQuality, IChartComponentFactory.Toolkit paramToolkit)
  {
    return this.a.newChart(paramQuality, paramToolkit);
  }
  
  public Chart newChart(IChartComponentFactory paramIChartComponentFactory, Quality paramQuality, String paramString)
  {
    return this.a.newChart(paramIChartComponentFactory, paramQuality, paramString);
  }
  
  public Chart newChart(Quality paramQuality, String paramString)
  {
    return this.a.newChart(paramQuality, paramString);
  }
  
  public IFrame newFrame(Chart paramChart)
  {
    return this.a.newFrame(paramChart);
  }
  
  public IFrame newFrame(Chart paramChart, Rectangle paramRectangle, String paramString)
  {
    System.out.println("using delegate:" + this.a.getClass());
    return this.a.newFrame(paramChart, paramRectangle, paramString);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\FactoryOverrider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */