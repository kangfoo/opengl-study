package org.jzy3d.demos.browser;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public abstract class CellRenderer<T>
  implements ListCellRenderer
{
  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new a(this, paramObject, paramBoolean1, paramJList);
  }
  
  public abstract String a(T paramT);
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\CellRenderer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */