package org.jzy3d.demos.events;

import java.io.PrintStream;
import org.jzy3d.events.DrawableChangedEvent;
import org.jzy3d.events.IDrawableListener;

final class c
  implements IDrawableListener
{
  c(EventsDemo paramEventsDemo) {}
  
  public final void drawableChanged(DrawableChangedEvent paramDrawableChangedEvent)
  {
    switch (paramDrawableChangedEvent.what())
    {
    case 2: 
      System.out.println("changed color");
      return;
    case 0: 
      System.out.println("changed data");
      return;
    case 4: 
      System.out.println("changed displayed");
      return;
    case 3: 
      System.out.println("changed metadata");
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\events\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */