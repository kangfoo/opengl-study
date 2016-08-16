package org.jzy3d.chart.watch.watched;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.IBoundingPolicy;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ordering.AbstractOrderingStrategy;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.rendering.view.Renderer3d;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;
import org.jzy3d.works.chart2d.legend.LegendViewportLayout;

public class WatchedFactory
  extends FactoryOverrider
  implements IChartComponentFactory
{
  public WatchedFactory(IChartComponentFactory paramIChartComponentFactory)
  {
    super(paramIChartComponentFactory);
  }
  
  public static JFrame a(JPanel paramJPanel)
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception localException) {}
    JFrame localJFrame;
    (localJFrame = new JFrame()).add(paramJPanel);
    localJFrame.pack();
    localJFrame.setVisible(true);
    return localJFrame;
  }
  
  public IViewportLayout newViewportLayout()
  {
    return new LegendViewportLayout();
  }
  
  public View newView(Scene paramScene, ICanvas paramICanvas, Quality paramQuality)
  {
    return new a(this, this, paramScene, paramICanvas, paramQuality);
  }
  
  public Graph newGraph(Scene paramScene, AbstractOrderingStrategy paramAbstractOrderingStrategy, boolean paramBoolean)
  {
    return new b(this, paramScene, paramAbstractOrderingStrategy, paramBoolean);
  }
  
  public IBoundingPolicy newBoundingPolicy()
  {
    StickyTimeWindowBoundingPolicy localStickyTimeWindowBoundingPolicy;
    (localStickyTimeWindowBoundingPolicy = new StickyTimeWindowBoundingPolicy()).a = 20.0D;
    return localStickyTimeWindowBoundingPolicy;
  }
  
  public Renderer3d newRenderer(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new WatchedRenderer3d(paramView, paramBoolean1, paramBoolean2);
  }
  
  public Renderer3d newRenderer(View paramView)
  {
    return new WatchedRenderer3d(paramView, false, false);
  }
  
  public Camera newCamera(Coord3d paramCoord3d)
  {
    return new WatchedCamera(paramCoord3d);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\WatchedFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */