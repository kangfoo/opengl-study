package org.jzy3d.junit.replay.events;

import java.awt.Dimension;
import java.awt.Rectangle;

public class ComponentEventLog
  extends AbstractEventLog
  implements IComponentEventLog
{
  private IComponentEventLog.ComponentEventType b;
  private Dimension c;
  private Rectangle d;
  
  public ComponentEventLog(IComponentEventLog.ComponentEventType paramComponentEventType, long paramLong)
  {
    this.b = paramComponentEventType;
    this.a = paramLong;
  }
  
  public ComponentEventLog(IComponentEventLog.ComponentEventType paramComponentEventType, Dimension paramDimension, Rectangle paramRectangle, long paramLong)
  {
    this.b = paramComponentEventType;
    this.a = paramLong;
    this.c = paramDimension;
    this.d = paramRectangle;
  }
  
  public String toString()
  {
    if ((this.c != null) || (this.d != null)) {
      return this.b + ", size:" + this.c + ", bounds:" + this.d + ", since:" + this.a;
    }
    return this.b + ", since:" + this.a;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\events\ComponentEventLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */