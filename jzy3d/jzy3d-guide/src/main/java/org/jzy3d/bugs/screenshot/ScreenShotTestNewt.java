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
import org.jzy3d.chart.controllers.mouse.camera.NewtCameraMouseController;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;

public class ScreenShotTestNewt
  extends JFrame
{
  private final Chart a;
  private JButton b;
  private JLabel c;
  private JPanel d;
  private JPanel e;
  
  public static void main(String[] paramArrayOfString)
  {
    EventQueue.invokeLater(new c());
  }
  
  public ScreenShotTestNewt()
  {
    ScreenShotTestNewt localScreenShotTestNewt = this;
    this.c = new JLabel();
    localScreenShotTestNewt.e = new JPanel();
    localScreenShotTestNewt.b = new JButton();
    localScreenShotTestNewt.d = new JPanel();
    localScreenShotTestNewt.setDefaultCloseOperation(3);
    localScreenShotTestNewt.setPreferredSize(new Dimension(800, 430));
    localScreenShotTestNewt.c.setHorizontalAlignment(0);
    localScreenShotTestNewt.e.setLayout(new BoxLayout(localScreenShotTestNewt.e, 0));
    localScreenShotTestNewt.b.setText("Take ScreenShot");
    localScreenShotTestNewt.b.setAlignmentX(1.0F);
    localScreenShotTestNewt.b.addActionListener(new f(localScreenShotTestNewt));
    localScreenShotTestNewt.e.add(localScreenShotTestNewt.b);
    localScreenShotTestNewt.getContentPane().add(localScreenShotTestNewt.e, "First");
    localScreenShotTestNewt.d.setBackground(new java.awt.Color(153, 204, 255));
    localScreenShotTestNewt.d.setPreferredSize(new Dimension(500, 500));
    localScreenShotTestNewt.d.setLayout(new GridLayout());
    localScreenShotTestNewt.getContentPane().add(localScreenShotTestNewt.d, "Center");
    localScreenShotTestNewt.pack();
    Coord3d[] arrayOfCoord3d = new Coord3d['✐'];
    org.jzy3d.colors.Color[] arrayOfColor = new org.jzy3d.colors.Color['✐'];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 10000; i++)
    {
      float f1 = localRandom.nextFloat() - 0.5F;
      float f2 = localRandom.nextFloat() - 0.5F;
      float f3 = localRandom.nextFloat() - 0.5F;
      arrayOfCoord3d[i] = new Coord3d(f1, f2, f3);
      arrayOfColor[i] = new org.jzy3d.colors.Color(f1, f2, f3, 1.0F);
    }
    Scatter localScatter;
    (localScatter = new Scatter(arrayOfCoord3d, arrayOfColor)).setWidth(6.0F);
    new d(this);
    this.a = d.chart(Quality.Nicest, "newt");
    this.a.addController(new NewtCameraMouseController());
    this.a.getScene().add(localScatter);
    this.d.add((Component)this.a.getCanvas());
    this.d.add(this.c);
  }
  
  public final BufferedImage a()
  {
    try
    {
      TextureIO.write(this.a.screenshot(), new File("/Users/martin/screenShot.png"));
    }
    catch (Exception localException)
    {
      System.err.println(localException);
    }
    return null;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\screenshot\ScreenShotTestNewt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */