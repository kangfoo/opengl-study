package org.jzy3d.demos.animation;

import java.util.List;
import java.util.Random;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.LineStrip;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewBoundMode;

final class a
  implements Runnable
{
  a(AddRemoveElementsDemo paramAddRemoveElementsDemo) {}
  
  public final void run()
  {
    Random localRandom = new Random();
    for (int i = 0; i < AddRemoveElementsDemo.a; i++)
    {
      LineStrip localLineStrip;
      (localLineStrip = new LineStrip()).add(new Point(new Coord3d(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat()), new Color(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat())));
      localLineStrip.add(new Point(new Coord3d(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat()), new Color(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat())));
      AddRemoveElementsDemo.a(this.a).getView().setBoundMode(ViewBoundMode.AUTO_FIT);
      AddRemoveElementsDemo.b(this.a).getScene().getGraph().add(localLineStrip);
      AddRemoveElementsDemo.c(this.a).getView().updateBounds();
      this.a.b.add(localLineStrip);
    }
    while (i > 1) {
      AddRemoveElementsDemo.d(this.a).getScene().getGraph().remove((AbstractDrawable)this.a.b.get(--i));
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\animation\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */