package org.jzy3d.sandbox.tripleview;

import java.util.Iterator;
import java.util.Vector;
import org.jzy3d.chart.controllers.ControllerType;
import org.jzy3d.events.ControllerEvent;
import org.jzy3d.events.ControllerEventListener;
import org.jzy3d.plot3d.rendering.view.View;

public class AbstractViewController
{
  protected View a;
  private Vector<ControllerEventListener> b = new Vector(1);
  
  public AbstractViewController(View paramView)
  {
    this.a = paramView;
  }
  
  protected final void a(ControllerType paramControllerType, Object paramObject)
  {
    paramControllerType = new ControllerEvent(this, paramControllerType, paramObject);
    paramObject = this.b.iterator();
    while (((Iterator)paramObject).hasNext())
    {
      ControllerEventListener localControllerEventListener;
      (localControllerEventListener = (ControllerEventListener)((Iterator)paramObject).next()).controllerEventFired(paramControllerType);
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\tripleview\AbstractViewController.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */