package org.jzy3d.sandbox.tripleview;

import org.jzy3d.chart.controllers.ControllerType;
import org.jzy3d.chart.controllers.mouse.camera.ICameraMouseController;
import org.jzy3d.chart.controllers.thread.camera.CameraThreadController;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.plot3d.rendering.view.View;

public abstract class AbstractViewCameraController
  extends AbstractViewController
  implements ICameraMouseController
{
  private static boolean b = false;
  private CameraThreadController c;
  
  public AbstractViewCameraController(View paramView)
  {
    super(paramView);
  }
  
  protected final void a(Coord2d paramCoord2d)
  {
    Coord2d localCoord2d = paramCoord2d;
    paramCoord2d = this;
    this.a.rotate(localCoord2d, false);
    paramCoord2d.a(ControllerType.ROTATE, localCoord2d);
  }
  
  public void addSlaveThreadController(CameraThreadController paramCameraThreadController)
  {
    AbstractViewCameraController localAbstractViewCameraController = this;
    if (this.c != null)
    {
      localAbstractViewCameraController.c.stop();
      localAbstractViewCameraController.c = null;
    }
    this.c = paramCameraThreadController;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\tripleview\AbstractViewCameraController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */