package org.jzy3d.demos.browser;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JList;
import javax.swing.JPanel;

final class a
  extends JPanel
{
  a(CellRenderer paramCellRenderer, Object paramObject, boolean paramBoolean, JList paramJList) {}
  
  public final void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    String str = this.d.a(this.a);
    FontMetrics localFontMetrics = paramGraphics.getFontMetrics(paramGraphics.getFont());
    paramGraphics.setColor(this.b ? this.c.getSelectionBackground() : this.c.getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(this.b ? this.c.getSelectionForeground() : this.c.getForeground());
    paramGraphics.drawString(str, 0, localFontMetrics.getAscent());
  }
  
  public final Dimension getPreferredSize()
  {
    String str = this.d.a(this.a);
    Object localObject = (localObject = getGraphics()).getFontMetrics(((Graphics)localObject).getFont());
    return new Dimension(((FontMetrics)localObject).stringWidth(str), ((FontMetrics)localObject).getHeight());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */