package org.jzy3d.demos.browser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import net.miginfocom.swing.MigLayout;
import org.apache.log4j.Logger;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.analysis.IRunnableAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.lights.Light;
import org.jzy3d.ui.LookAndFeel;
import org.jzy3d.utils.LoggerUtils;

public class DemoBrowser
  extends JFrame
{
  private static final Logger a = Logger.getLogger(DemoBrowser.class);
  private IAnalysis b;
  private Chart c;
  private Component d;
  private JEntityList<IAnalysis> e;
  private JPanel f;
  private JTextArea g;
  private JScrollPane h;
  private static String i = "awt";
  
  public static void main(String[] paramArrayOfString)
  {
    System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
    new DemoBrowser();
  }
  
  public DemoBrowser()
  {
    LoggerUtils.maximal();
    LookAndFeel.apply();
    DemoBrowser localDemoBrowser = this;
    this.e = new JEntityList(new b(localDemoBrowser));
    localDemoBrowser.e.a(new c(localDemoBrowser));
    Object localObject = DemoList.a(i);
    localDemoBrowser.e.a((List)localObject);
    localDemoBrowser = this;
    this.g = new JTextArea();
    localDemoBrowser.g.setFont(new Font("Arial", 2, 10));
    localDemoBrowser.g.setLineWrap(true);
    localDemoBrowser.g.setWrapStyleWord(true);
    localDemoBrowser.h = new JScrollPane(localDemoBrowser.g);
    localDemoBrowser.h.setVerticalScrollBarPolicy(22);
    localDemoBrowser = this;
    this.f = new JPanel(new BorderLayout());
    localObject = BorderFactory.createLineBorder(Color.black);
    localDemoBrowser.f.setBorder((Border)localObject);
    localDemoBrowser = this;
    localObject = "[500px,grow][150px]";
    String str = "[250px][500px,grow]";
    localDemoBrowser.setLayout(new MigLayout("", str, (String)localObject));
    localDemoBrowser.e.setMinimumSize(new Dimension(200, 200));
    localDemoBrowser.add(localDemoBrowser.e, "cell 0 0, grow");
    localDemoBrowser.add(localDemoBrowser.f, "cell 1 0, grow");
    localDemoBrowser.add(localDemoBrowser.h, "cell 0 1, span, grow");
    localDemoBrowser = this;
    addWindowListener(new d(localDemoBrowser));
    localDemoBrowser = this;
    pack();
    localDemoBrowser.show();
    localDemoBrowser.setVisible(true);
  }
  
  protected final void a(IAnalysis paramIAnalysis)
  {
    if (this.f == null) {
      return;
    }
    Object localObject1 = this;
    if ((this.b != null) && ((((DemoBrowser)localObject1).b instanceof IRunnableAnalysis))) {
      ((IRunnableAnalysis)((DemoBrowser)localObject1).b).stop();
    }
    Light.resetCounter();
    this.b = paramIAnalysis;
    if ((localObject1 = paramIAnalysis).isInitialized()) {
      ((IAnalysis)localObject1).getChart().dispose();
    }
    ((IAnalysis)localObject1).init();
    this.c = paramIAnalysis.getChart();
    (localObject1 = paramIAnalysis).getChart().getCanvas().setPixelScale(null);
    if (!((IAnalysis)localObject1).hasOwnChartControllers())
    {
      ((IAnalysis)localObject1).getChart().addMouseController();
      ((IAnalysis)localObject1).getChart().addKeyController();
      ((IAnalysis)localObject1).getChart().addScreenshotKeyController();
    }
    Object localObject2 = this.g;
    localObject1 = paramIAnalysis;
    StringBuilder localStringBuilder = new StringBuilder();
    String str = ((IAnalysis)localObject1).getPitch();
    localStringBuilder.append(str);
    if (!str.equals("")) {
      localStringBuilder.append("\n------------------------------------\n");
    }
    localStringBuilder.append(ChartLauncher.makeInstruction());
    localStringBuilder.append("Canvas:" + ((IAnalysis)localObject1).getCanvasType());
    ((JTextArea)localObject2).setText(localStringBuilder.toString());
    this.c.render();
    localObject1 = this;
    if (this.d != null)
    {
      ((DemoBrowser)localObject1).f.remove(((DemoBrowser)localObject1).d);
      ((DemoBrowser)localObject1).d = null;
    }
    ((DemoBrowser)localObject1).d = ((Component)((DemoBrowser)localObject1).c.getCanvas());
    ((DemoBrowser)localObject1).f.add(((DemoBrowser)localObject1).d, "Center");
    localObject2 = paramIAnalysis;
    localObject1 = this;
    show();
    if ((localObject2 instanceof IRunnableAnalysis)) {
      ((IRunnableAnalysis)((DemoBrowser)localObject1).b).start();
    }
  }
  
  protected static void a(String paramString1, String paramString2)
  {
    (paramString1 = (paramString2 = new JOptionPane(paramString2, 0, -1)).createDialog(paramString1)).show();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\DemoBrowser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */