package org.jzy3d.chart.watch.watched;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.chart2d.View2d;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.ViewportConfiguration;

final class a
  extends View2d
{
  a(WatchedFactory paramWatchedFactory, IChartComponentFactory paramIChartComponentFactory, Scene paramScene, ICanvas paramICanvas, Quality paramQuality)
  {
    super(paramIChartComponentFactory, paramScene, paramICanvas, paramQuality);
  }
  
  public final void renderScene(GL paramGL, GLU paramGLU, ViewportConfiguration paramViewportConfiguration)
  {
    updateQuality(paramGL);
    BoundingBox3d localBoundingBox3d = computeScaledViewBounds();
    updateCamera(paramGL, paramGLU, paramViewportConfiguration, localBoundingBox3d);
    renderAxeBox(paramGL, paramGLU);
    renderSceneGraph(paramGL, paramGLU);
    renderAnnotations(paramGL, paramGLU);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\chart\watch\watched\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */