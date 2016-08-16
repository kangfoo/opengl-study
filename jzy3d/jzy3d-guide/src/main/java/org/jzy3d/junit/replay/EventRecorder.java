package org.jzy3d.junit.replay;

import com.jogamp.opengl.util.texture.TextureIO;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jzy3d.chart.Chart;
import org.jzy3d.junit.replay.events.ComponentEventLog;
import org.jzy3d.junit.replay.events.IComponentEventLog.ComponentEventType;
import org.jzy3d.junit.replay.events.IEventLog;
import org.jzy3d.junit.replay.events.IKeyEventLog.KeyEventType;
import org.jzy3d.junit.replay.events.IMouseEventLog.MouseEventType;
import org.jzy3d.junit.replay.events.IWindowEventLog.WindowEventType;
import org.jzy3d.junit.replay.events.KeyEventLog;
import org.jzy3d.junit.replay.events.MouseEventLog;
import org.jzy3d.junit.replay.events.WindowEventLog;

public class EventRecorder
  extends Timestamped
  implements ComponentListener, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, WindowListener
{
  private int b;
  
  private void a(IEventLog paramIEventLog)
  {
    IEventLog localIEventLog = paramIEventLog;
    EventRecorder localEventRecorder = this;
    long l1 = localIEventLog.a();
    localEventRecorder = this;
    localEventRecorder = this;
    long l2 = (b() - localEventRecorder.a()) / 1000000L;
    Timestamped.a.info("-> @[" + l1 / 1000L + " s] (" + l1 + " ms): elapsed:" + l2);
    null.a(paramIEventLog);
  }
  
  private void d()
  {
    try
    {
      null.a();
      return;
    }
    catch (Exception localException)
    {
      a.error(localException);
    }
  }
  
  private String a(int paramInt)
  {
    return ScenarioFiles.a + "/" + null.b() + "/" + null.b() + "-" + paramInt + ".png";
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.f, paramMouseWheelEvent.getWheelRotation(), a(paramMouseWheelEvent), c()));
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.e, paramMouseEvent.getX(), paramMouseEvent.getY(), a(paramMouseEvent), c()));
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.d, paramMouseEvent.getX(), paramMouseEvent.getY(), a(paramMouseEvent), c()));
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.a, paramMouseEvent.getX(), paramMouseEvent.getY(), a(paramMouseEvent), c()));
  }
  
  public void mousePressed(MouseEvent paramMouseEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.b, paramMouseEvent.getX(), paramMouseEvent.getY(), a(paramMouseEvent), c()));
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    a(new MouseEventLog(IMouseEventLog.MouseEventType.c, paramMouseEvent.getX(), paramMouseEvent.getY(), a(paramMouseEvent), c()));
  }
  
  private static int a(MouseEvent paramMouseEvent)
  {
    int i = 0;
    if (paramMouseEvent.getButton() == 1) {
      i = 16;
    }
    if (paramMouseEvent.getButton() == 2) {
      i = 8;
    }
    if (paramMouseEvent.getButton() == 3) {
      i = 4;
    }
    return i;
  }
  
  public void componentHidden(ComponentEvent paramComponentEvent)
  {
    a(new ComponentEventLog(IComponentEventLog.ComponentEventType.a, c()));
  }
  
  public void componentMoved(ComponentEvent paramComponentEvent)
  {
    a(new ComponentEventLog(IComponentEventLog.ComponentEventType.d, paramComponentEvent.getComponent().getSize(), paramComponentEvent.getComponent().getBounds(), c()));
  }
  
  public void componentResized(ComponentEvent paramComponentEvent)
  {
    a(new ComponentEventLog(IComponentEventLog.ComponentEventType.b, paramComponentEvent.getComponent().getSize(), paramComponentEvent.getComponent().getBounds(), c()));
  }
  
  public void componentShown(ComponentEvent paramComponentEvent)
  {
    a(new ComponentEventLog(IComponentEventLog.ComponentEventType.c, paramComponentEvent.getComponent().getSize(), paramComponentEvent.getComponent().getBounds(), c()));
  }
  
  public void keyTyped(KeyEvent paramKeyEvent)
  {
    KeyEvent localKeyEvent;
    if (((localKeyEvent = paramKeyEvent).getKeyChar() == 's' ? 1 : 0) != 0)
    {
      try
      {
        paramKeyEvent = a(this.b);
        localKeyEvent = null;
        File localFile;
        if (!(localFile = new File(paramKeyEvent)).getParentFile().exists()) {
          localFile.mkdirs();
        }
        TextureIO.write(localKeyEvent.screenshot(), localFile);
        Logger.getLogger(EventRecorder.class).info("screenshot:" + paramKeyEvent);
      }
      catch (IOException paramKeyEvent)
      {
        Logger.getLogger(EventRecorder.class).error(a(this.b), paramKeyEvent);
      }
      this.b += 1;
      return;
    }
    if (((localKeyEvent = paramKeyEvent).getKeyChar() == 'q' ? 1 : 0) != 0)
    {
      d();
      return;
    }
    a(new KeyEventLog(IKeyEventLog.KeyEventType.c, paramKeyEvent.getKeyCode(), c()));
  }
  
  public void keyPressed(KeyEvent paramKeyEvent)
  {
    a(new KeyEventLog(IKeyEventLog.KeyEventType.a, paramKeyEvent.getKeyCode(), c()));
  }
  
  public void keyReleased(KeyEvent paramKeyEvent)
  {
    a(new KeyEventLog(IKeyEventLog.KeyEventType.b, paramKeyEvent.getKeyCode(), c()));
  }
  
  public void windowClosing(WindowEvent paramWindowEvent)
  {
    a(new WindowEventLog(IWindowEventLog.WindowEventType.b, paramWindowEvent.getWindow().getSize(), c()));
    d();
  }
  
  public void windowOpened(WindowEvent paramWindowEvent)
  {
    a(new WindowEventLog(IWindowEventLog.WindowEventType.a, paramWindowEvent.getWindow().getSize(), c()));
  }
  
  public void windowClosed(WindowEvent paramWindowEvent)
  {
    a(new WindowEventLog(IWindowEventLog.WindowEventType.c, c()));
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\junit\replay\EventRecorder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */