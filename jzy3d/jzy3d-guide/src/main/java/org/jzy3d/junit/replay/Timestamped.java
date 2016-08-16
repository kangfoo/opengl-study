package org.jzy3d.junit.replay;

import org.apache.log4j.Logger;
import org.jzy3d.maths.TicToc;

public class Timestamped
{
  static Logger a = Logger.getLogger(Timestamped.class);
  private TicToc b = new TicToc();
  
  public final long a()
  {
    return this.b.getStart();
  }
  
  public final long b()
  {
    long l;
    return l = this.b.rawToc();
  }
  
  public final long c()
  {
    this.b.toc();
    return this.b.elapsedMilisecond();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\Timestamped.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */