package org.jzy3d.demos.events;

import java.io.PrintStream;
import org.jzy3d.events.IViewPointChangedListener;
import org.jzy3d.events.ViewPointChangedEvent;

final class a
  implements IViewPointChangedListener
{
  a(EventsDemo paramEventsDemo) {}
  
  public final void viewPointChanged(ViewPointChangedEvent paramViewPointChangedEvent)
  {
    System.out.println("viewpoint changed to " + paramViewPointChangedEvent.getViewPoint());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\events\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */