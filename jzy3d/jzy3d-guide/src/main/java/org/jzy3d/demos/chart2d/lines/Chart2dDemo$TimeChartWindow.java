package org.jzy3d.demos.chart2d.lines;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import net.miginfocom.swing.MigLayout;
import org.jzy3d.chart.Chart;
import org.jzy3d.ui.LookAndFeel;

public class Chart2dDemo$TimeChartWindow
  extends JFrame
{
  public Chart2dDemo$TimeChartWindow(List<Chart> paramList)
  {
    LookAndFeel.apply();
    String str = "[300px]";
    Object localObject1 = "[500px,grow]";
    setLayout(new MigLayout("", (String)localObject1, str));
    int i = 0;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject1 = (Chart)paramList.next();
      int j = i++;
      Object localObject2 = localObject1;
      localObject1 = this;
      JPanel localJPanel = new JPanel(new BorderLayout());
      Border localBorder = BorderFactory.createLineBorder(Color.black);
      localJPanel.setBorder(localBorder);
      localJPanel.add((Component)((Chart)localObject2).getCanvas(), "Center");
      ((TimeChartWindow)localObject1).add(localJPanel, "cell 0 " + j + ", grow");
    }
    localObject1 = this;
    addWindowListener(new a((TimeChartWindow)localObject1));
    pack();
    show();
    setVisible(true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\chart2d\lines\Chart2dDemo$TimeChartWindow.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */