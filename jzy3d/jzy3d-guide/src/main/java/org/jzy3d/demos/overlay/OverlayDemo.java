package org.jzy3d.demos.overlay;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jzy3d.chart.AWTChart;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.camera.AbstractCameraController;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.chart.controllers.thread.camera.CameraThreadController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;

public class OverlayDemo
  extends JFrame
{
  private int a = 500;
  private Coord3d[] b;
  private Color[] c;
  private Chart d;
  private Scatter e;
  private AWTCameraMouseController f;
  
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new OverlayDemo()).setVisible(true);
  }
  
  public OverlayDemo()
  {
    super("Overlay Demo");
    setDefaultCloseOperation(3);
    a();
    this.d = AWTChartComponentFactory.chart("awt");
    this.d.getScene().add(this.e);
    ((AWTChart)this.d).addRenderer(new a(this));
    this.f = new AWTCameraMouseController();
    Object localObject = new CameraThreadController();
    this.f.addSlaveThreadController((CameraThreadController)localObject);
    this.f.addControllerEventListener(new b(this));
    this.d.addController(this.f);
    this.d.addController((AbstractCameraController)localObject);
    (localObject = new JPanel(new BorderLayout())).add((Component)this.d.getCanvas(), "Center");
    setContentPane((Container)localObject);
    pack();
    setBounds(0, 0, 400, 400);
  }
  
  private void a()
  {
    Random localRandom = new Random();
    this.b = new Coord3d[this.a];
    this.c = new Color[this.a];
    for (int i = 0; i < this.a; i++)
    {
      this.c[i] = new Color(0.0F, 0.0F, 0.0F, 0.5F);
      float f1 = localRandom.nextFloat();
      float f2 = localRandom.nextFloat();
      float f3 = localRandom.nextFloat();
      this.b[i] = new Coord3d(f1, f2, f3);
    }
    this.e = new Scatter(this.b, this.c);
    this.e.setWidth(4.0F);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\overlay\OverlayDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */