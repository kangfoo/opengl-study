package org.jzy3d.demos.browser;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

final class f
  implements ListSelectionListener
{
  f(JEntityList paramJEntityList) {}
  
  public final void valueChanged(ListSelectionEvent paramListSelectionEvent)
  {
    paramListSelectionEvent = (paramListSelectionEvent = (DefaultListSelectionModel)paramListSelectionEvent.getSource()).getMinSelectionIndex();
    JEntityList.a(this.a).getModel().getElementAt(paramListSelectionEvent);
    if (paramListSelectionEvent >= 0) {
      paramListSelectionEvent = JEntityList.a(this.a).getModel().getElementAt(paramListSelectionEvent);
    } else {
      paramListSelectionEvent = null;
    }
    if (this.a.a != paramListSelectionEvent)
    {
      this.a.a = paramListSelectionEvent;
      this.a.a(this.a.a);
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\f.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */