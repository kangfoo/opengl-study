package org.jzy3d.junit.replay.events;

import java.util.regex.Pattern;

public class EventParser
{
  private static String a = "\\d+";
  
  static
  {
    Pattern.compile("MOUSE_MOVED, x:(" + a + "), y:(" + a + "), bt:(" + a + "), since:(" + a + ")");
    Pattern.compile("MOUSE_PRESSED, x:(" + a + "), y:(" + a + "), bt:(" + a + "), since:(" + a + ")");
    Pattern.compile("MOUSE_DRAGGED, x:(" + a + "), y:(" + a + "), bt:(" + a + "), since:(" + a + ")");
    Pattern.compile("MOUSE_RELEASED, x:(" + a + "), y:(" + a + "), bt:(" + a + "), since:(" + a + ")");
    Pattern.compile("MOUSE_WHEEL, v:(" + a + "), bt:(" + a + "), since:(" + a + ")");
    Pattern.compile("KEY_PRESS.*, code:(" + a + "), since:(" + a + ")");
    Pattern.compile("KEY_TYPED.*, code:(" + a + "), since:(" + a + ")");
    Pattern.compile("KEY_RELEASE.*, code:(" + a + "), since:(" + a + ")");
    Pattern.compile("WINDOW_OPENED.*, since:(" + a + ")");
    Pattern.compile("WINDOW_CLOSING.*, since:(" + a + ")");
    Pattern.compile("WINDOW_CLOSED.*, since:(" + a + ")");
    Pattern.compile("COMPONENT_RESIZED, size:java.awt.Dimension[width=(" + a + "),height=(" + a + ")], bounds:java.awt.Rectangle[x=(" + a + "),y=(" + a + "),width=(" + a + "),height=(" + a + ")] since:(" + a + ")");
    Pattern.compile("COMPONENT_MOVED.*, since:(" + a + ")");
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\events\EventParser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */