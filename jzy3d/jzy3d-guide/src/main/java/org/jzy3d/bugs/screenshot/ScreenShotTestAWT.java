package org.jzy3d.bugs.screenshot;

import com.jogamp.opengl.util.texture.TextureIO;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.AWTRenderer3d;

public class ScreenShotTestAWT
  extends JFrame
{
  private final Chart a;
  private JButton b;
  private JLabel c;
  private JPanel d;
  private JPanel e;
  
  public static void main(String[] paramArrayOfString)
  {
    EventQueue.invokeLater(new a());
  }
  
  public ScreenShotTestAWT()
  {
    ScreenShotTestAWT localScreenShotTestAWT = this;
    this.c = new JLabel();
    localScreenShotTestAWT.e = new JPanel();
    localScreenShotTestAWT.b = new JButton();
    localScreenShotTestAWT.d = new JPanel();
    localScreenShotTestAWT.setDefaultCloseOperation(3);
    localScreenShotTestAWT.setPreferredSize(new Dimension(800, 430));
    localScreenShotTestAWT.c.setHorizontalAlignment(0);
    localScreenShotTestAWT.e.setLayout(new BoxLayout(localScreenShotTestAWT.e, 0));
    localScreenShotTestAWT.b.setText("Take ScreenShot");
    localScreenShotTestAWT.b.setAlignmentX(1.0F);
    localScreenShotTestAWT.b.addActionListener(new b(localScreenShotTestAWT));
    localScreenShotTestAWT.e.add(localScreenShotTestAWT.b);
    localScreenShotTestAWT.getContentPane().add(localScreenShotTestAWT.e, "First");
    localScreenShotTestAWT.d.setBackground(new java.awt.Color(255, 0, 0));
    localScreenShotTestAWT.d.setPreferredSize(new Dimension(500, 500));
    localScreenShotTestAWT.d.setLayout(new GridLayout());
    localScreenShotTestAWT.getContentPane().add(localScreenShotTestAWT.d, "Center");
    localScreenShotTestAWT.pack();
    Coord3d[] arrayOfCoord3d = new Coord3d['Ϩ'];
    org.jzy3d.colors.Color[] arrayOfColor = new org.jzy3d.colors.Color['Ϩ'];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 1000; i++)
    {
      float f1 = localRandom.nextFloat() - 0.5F;
      float f2 = localRandom.nextFloat() - 0.5F;
      float f3 = localRandom.nextFloat() - 0.5F;
      arrayOfCoord3d[i] = new Coord3d(f1, f2, f3);
      arrayOfColor[i] = new org.jzy3d.colors.Color(f1, f2, f3, 0.2F);
    }
    Scatter localScatter;
    (localScatter = new Scatter(arrayOfCoord3d, arrayOfColor)).setWidth(15.0F);
    this.a = AWTChartComponentFactory.chart(Quality.Nicest, "awt");
    this.a.addMouseController();
    this.a.getScene().add(localScatter);
    this.d.add((Component)this.a.getCanvas());
    this.d.add(this.c);
  }
  
  public final BufferedImage a()
  {
    try
    {
      TextureIO.write(this.a.screenshot(), new File("c:/screenShot.png"));
    }
    catch (Exception localException)
    {
      System.err.println(localException);
    }
    Object localObject;
    (localObject = (AWTRenderer3d)this.a.getCanvas().getRenderer()).nextDisplayUpdateScreenshot();
    this.a.render();
    return localObject = ((AWTRenderer3d)localObject).getLastScreenshotImage();
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\screenshot\ScreenShotTestAWT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */