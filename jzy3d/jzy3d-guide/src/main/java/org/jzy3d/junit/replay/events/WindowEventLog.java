package org.jzy3d.junit.replay.events;

public class WindowEventLog
  extends AbstractEventLog
  implements IWindowEventLog
{
  private IWindowEventLog.WindowEventType b;
  private Object c;
  
  public WindowEventLog(IWindowEventLog.WindowEventType paramWindowEventType, long paramLong)
  {
    this.a = paramLong;
    this.b = paramWindowEventType;
  }
  
  public WindowEventLog(IWindowEventLog.WindowEventType paramWindowEventType, Object paramObject, long paramLong)
  {
    this.a = paramLong;
    this.b = paramWindowEventType;
    this.c = paramObject;
  }
  
  public String toString()
  {
    if (this.c != null) {
      return this.b + ", v:" + this.c + ", since:" + this.a;
    }
    return this.b + ", since:" + this.a;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\events\WindowEventLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */