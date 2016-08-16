package org.jzy3d.junit.replay;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jzy3d.io.SimpleFile;
import org.jzy3d.junit.replay.events.IEventLog;

public class Scenario
{
  private static Logger a = Logger.getLogger(Scenario.class);
  
  public final void a(IEventLog paramIEventLog)
  {
    a.info(paramIEventLog);
    null.add(paramIEventLog);
  }
  
  public final void a()
  {
    String str2 = null;
    String str1 = ScenarioFiles.a + null + "/";
    Scenario localScenario = this;
    File localFile;
    if (!(localFile = new File(str1)).exists()) {
      localFile.mkdirs();
    }
    localScenario.a(str1, str2);
  }
  
  private void a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = null.iterator();
    while (((Iterator)localObject).hasNext())
    {
      IEventLog localIEventLog = (IEventLog)((Iterator)localObject).next();
      localStringBuilder.append(localIEventLog.toString() + "\n");
    }
    paramString2 = paramString2;
    paramString1 = paramString1;
    localObject = paramString1 + paramString2 + ScenarioFiles.b;
    SimpleFile.write(localStringBuilder.toString(), (String)localObject);
    paramString1 = "saved " + null.size() + " events in " + (String)localObject;
    a.info("---------------------------------------------------");
    a.info(paramString1);
    a.info("---------------------------------------------------");
  }
  
  public final String b()
  {
    return null;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\Scenario.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */