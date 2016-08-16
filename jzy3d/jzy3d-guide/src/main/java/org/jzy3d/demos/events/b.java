package org.jzy3d.demos.events;

import java.io.PrintStream;
import org.jzy3d.events.IViewIsVerticalEventListener;
import org.jzy3d.events.ViewIsVerticalEvent;

final class b
  implements IViewIsVerticalEventListener
{
  b(EventsDemo paramEventsDemo) {}
  
  public final void viewVerticalReached(ViewIsVerticalEvent paramViewIsVerticalEvent)
  {
    System.out.println("view from top or bottom");
  }
  
  public final void viewVerticalLeft(ViewIsVerticalEvent paramViewIsVerticalEvent)
  {
    System.out.println("left top or bottom");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\events\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */