package org.jzy3d.junit.replay.events;

public class KeyEventLog
  extends AbstractEventLog
  implements IKeyEventLog
{
  private int b;
  private IKeyEventLog.KeyEventType c;
  
  public KeyEventLog(IKeyEventLog.KeyEventType paramKeyEventType, int paramInt, long paramLong)
  {
    this.b = paramInt;
    this.c = paramKeyEventType;
    this.a = paramLong;
  }
  
  public String toString()
  {
    return this.c + ", code:" + this.b + ", since:" + this.a;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\events\KeyEventLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */