package org.jzy3d.bugs.screenshot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

final class b
  implements ActionListener
{
  b(ScreenShotTestAWT paramScreenShotTestAWT) {}
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    ScreenShotTestAWT.a(this.a).setIcon(new ImageIcon(this.a.a()));
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\screenshot\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */