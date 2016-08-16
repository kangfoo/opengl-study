package org.jzy3d.demos.browser;

import java.awt.Component;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentListener;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class EzLayout
{
  private JPanel a;
  
  public EzLayout(String paramString1, String paramString2)
  {
    this(new JPanel(), paramString1, paramString2);
  }
  
  private EzLayout(JPanel paramJPanel, String paramString1, String paramString2)
  {
    this.a = paramJPanel;
    paramJPanel.setLayout(new MigLayout("", paramString2, paramString1));
  }
  
  public final void a(int paramInt1, int paramInt2, Component paramComponent, EzLayout.Prop paramProp)
  {
    if (EzLayout.Prop.a.equals(paramProp)) {
      this.a.add(paramComponent, "cell " + paramInt2 + " " + paramInt1 + ", grow");
    }
  }
  
  public final JPanel a()
  {
    return this.a;
  }
  
  public static Scrollbar a(int paramInt1, int paramInt2, int paramInt3, AdjustmentListener paramAdjustmentListener)
  {
    (paramInt1 = new Scrollbar(0, paramInt1, 1, paramInt2, paramInt3)).addAdjustmentListener(paramAdjustmentListener);
    return paramInt1;
  }
  
  public static Scrollbar b(int paramInt1, int paramInt2, int paramInt3, AdjustmentListener paramAdjustmentListener)
  {
    (paramInt1 = new Scrollbar(1, paramInt1, 1, paramInt2, paramInt3)).addAdjustmentListener(paramAdjustmentListener);
    return paramInt1;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\EzLayout.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */