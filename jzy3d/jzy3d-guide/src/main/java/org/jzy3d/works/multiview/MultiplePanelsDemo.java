package org.jzy3d.works.multiview;

import java.awt.Frame;
import java.awt.Rectangle;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.CanvasAWT;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.IScreenCanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.controllers.ViewMouseController;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class MultiplePanelsDemo
{
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new Scene(true);
    Object localObject1 = new AWTChartComponentFactory();
    a(localObject2 = new CanvasAWT((IChartComponentFactory)localObject1, paramArrayOfString, Quality.Advanced), new Rectangle(0, 0, 400, 400));
    ((CanvasAWT)localObject2).getView().setBackgroundColor(Color.WHITE);
    localObject1 = new CanvasAWT((IChartComponentFactory)localObject1, paramArrayOfString, Quality.Intermediate);
    paramArrayOfString.newView((ICanvas)localObject1, Quality.Advanced);
    a((CanvasAWT)localObject1, new Rectangle(400, 0, 400, 400));
    ((CanvasAWT)localObject1).getView().setBackgroundColor(Color.WHITE);
    ((CanvasAWT)localObject1).getView().setViewPositionMode(ViewPositionMode.TOP);
    View.STRETCH_RATIO = 0.5F;
    ViewMouseController localViewMouseController;
    (localViewMouseController = new ViewMouseController()).addTarget(((CanvasAWT)localObject2).getView());
    localViewMouseController.addTarget(((CanvasAWT)localObject1).getView());
    localViewMouseController.addMouseSource((IScreenCanvas)localObject2);
    localObject1 = new a();
    Object localObject2 = new Range(-150.0F, 150.0F);
    paramArrayOfString = 50;
    localObject1 = localObject2;
    paramArrayOfString = (String[])localObject1;
    (paramArrayOfString = Builder.buildOrthonormal(new OrthonormalGrid((Range)localObject1, 50, (Range)localObject1, 50), paramArrayOfString)).setColorMapper(new ColorMapper(new ColorMapRainbow(), paramArrayOfString.getBounds().getZmin(), paramArrayOfString.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    paramArrayOfString.setFaceDisplayed(true);
    paramArrayOfString.setWireframeDisplayed(true);
    paramArrayOfString.setWireframeColor(Color.BLACK);
    paramArrayOfString.add(paramArrayOfString);
  }
  
  private static void a(CanvasAWT paramCanvasAWT, Rectangle paramRectangle)
  {
    Frame localFrame;
    (localFrame = new Frame()).add(paramCanvasAWT);
    localFrame.pack();
    localFrame.setBounds(paramRectangle);
    localFrame.setVisible(true);
    localFrame.addWindowListener(new b());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\multiview\MultiplePanelsDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */