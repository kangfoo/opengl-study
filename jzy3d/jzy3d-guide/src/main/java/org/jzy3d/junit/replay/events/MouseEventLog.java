package org.jzy3d.junit.replay.events;

import org.jzy3d.maths.IntegerCoord2d;

public class MouseEventLog
  extends AbstractEventLog
  implements IMouseEventLog
{
  private IMouseEventLog.MouseEventType b;
  private IntegerCoord2d c;
  private int d;
  private int e = 16;
  
  public MouseEventLog(IMouseEventLog.MouseEventType paramMouseEventType, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    this.b = paramMouseEventType;
    this.e = paramInt3;
    this.a = paramLong;
    this.c = new IntegerCoord2d(paramInt1, paramInt2);
  }
  
  public MouseEventLog(IMouseEventLog.MouseEventType paramMouseEventType, int paramInt1, int paramInt2, long paramLong)
  {
    this.b = paramMouseEventType;
    this.e = paramInt2;
    this.d = paramInt1;
    this.a = paramLong;
  }
  
  public String toString()
  {
    if (this.c != null) {
      return this.b + ", x:" + this.c.x + ", y:" + this.c.y + ", bt:" + this.e + ", since:" + this.a;
    }
    return this.b + ", v:" + this.d + ", bt:" + this.e + ", since:" + this.a;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\events\MouseEventLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */