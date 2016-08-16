package org.jzy3d.demos.browser;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JEntityList<T>
  extends JPanel
{
  private JList b;
  private DefaultListModel c = new DefaultListModel();
  protected T a = null;
  private List<JEntityList.IEntityActionListener<T>> d = new ArrayList();
  
  public JEntityList()
  {
    this(null, null);
  }
  
  public JEntityList(CellRenderer<T> paramCellRenderer)
  {
    this(null, paramCellRenderer);
  }
  
  private JEntityList(List<T> paramList, CellRenderer<T> paramCellRenderer)
  {
    super(new BorderLayout());
    a(null);
    this.b = new JList(this.c);
    this.b.setSelectionMode(0);
    this.b.getSelectionModel().addListSelectionListener(new f(this));
    this.b.setSelectedIndex(0);
    this.b.setVisibleRowCount(5);
    if (paramCellRenderer != null) {
      this.b.setCellRenderer(paramCellRenderer);
    }
    paramList = new JScrollPane(this.b);
    add(paramList, "Center");
  }
  
  public final void a(List<T> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Object localObject = paramList.next();
        this.c.addElement(localObject);
      }
    }
  }
  
  public final void a(JEntityList.IEntityActionListener<T> paramIEntityActionListener)
  {
    this.d.add(paramIEntityActionListener);
  }
  
  protected final void a(T paramT)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      JEntityList.IEntityActionListener localIEntityActionListener;
      (localIEntityActionListener = (JEntityList.IEntityActionListener)localIterator.next()).a(paramT);
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\JEntityList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */