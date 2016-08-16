package org.jzy3d.works.various;

import com.jogamp.opengl.GLAnimatorControl;
import java.io.PrintStream;
import java.util.ArrayList;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractComposite;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.LineStrip;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.pickable.PickablePoint;
import org.jzy3d.plot3d.rendering.canvas.CanvasAWT;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;
import org.jzy3d.plot3d.text.align.Halign;
import org.jzy3d.plot3d.text.drawable.DrawableTextBitmap;

public class TrialRotationTextTest
  extends AbstractAnalysis
{
  private static TrialRotationTextTest a;
  private AbstractComposite b;
  private ArrayList<PickablePoint> c;
  
  public static void main(String[] paramArrayOfString)
  {
    System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
    AnalysisLauncher.open(a = new TrialRotationTextTest());
    (paramArrayOfString = (CanvasAWT)a.chart.getCanvas()).setSize(600, 600);
    a.chart.getView().setViewPositionMode(ViewPositionMode.FREE);
  }
  
  public void init()
  {
    System.out.println("Creating chart! Thread: " + Thread.currentThread().getName());
    this.b = new h(this);
    this.c = new ArrayList();
    this.chart = AWTChartComponentFactory.chart(Quality.Advanced, getCanvasType());
    Object localObject1 = (CanvasAWT)this.chart.getCanvas();
    System.out.println("Animator started?: " + ((CanvasAWT)localObject1).getAnimator().isStarted());
    localObject1 = new PickablePoint(new Coord3d(0.0F, 2.0F, 2.0F), Color.GRAY, 5.0F);
    Object localObject2 = new PickablePoint(new Coord3d(2.0F, 2.0F, 2.0F), Color.GRAY, 5.0F);
    PickablePoint localPickablePoint = new PickablePoint(new Coord3d(1.0F, 5.0F, 2.0F), Color.GRAY, 5.0F);
    Object localObject3 = new PickablePoint(new Coord3d(1.0F, 3.0F, 3.0F), Color.GRAY, 5.0F);
    this.c.add(localObject1);
    this.c.add(localObject2);
    this.c.add(localPickablePoint);
    this.c.add(localObject3);
    LineStrip localLineStrip2;
    (localLineStrip2 = new LineStrip()).setWireframeColor(Color.GRAY);
    localLineStrip2.add((Point)localObject1);
    localLineStrip2.add((Point)localObject2);
    localLineStrip2.add(localPickablePoint);
    localLineStrip2.add((Point)localObject3);
    localLineStrip2.add((Point)localObject2);
    localLineStrip2.add((Point)localObject3);
    localLineStrip2.add((Point)localObject1);
    localLineStrip2.setWireframeWidth(6.0F);
    localLineStrip2.setWidth(6.0F);
    float f = (float)((PickablePoint)localObject2).xyz.distance(((PickablePoint)localObject1).xyz);
    localObject2 = ((PickablePoint)localObject2).xyz.sub(((PickablePoint)localObject1).xyz).normalizeTo((float)(f * 0.5D));
    localObject1 = ((PickablePoint)localObject1).xyz.add((Coord3d)localObject2);
    (localObject1 = new DrawableTextBitmap("edge", (Coord3d)localObject1, Color.BLACK)).setHalign(Halign.LEFT);
    this.b.add((AbstractDrawable)localObject1);
    this.b.add(localLineStrip2);
    localObject1 = this;
    (localObject2 = new LineStrip()).setWireframeColor(Color.GREEN);
    ((LineStrip)localObject2).add(new Point(new Coord3d(0.0F, 0.0F, 0.0F)));
    ((LineStrip)localObject2).add(new Point(new Coord3d(0.0F, 1.0F, 0.0F)));
    LineStrip localLineStrip1;
    (localLineStrip1 = new LineStrip()).setWireframeColor(Color.BLUE);
    localLineStrip1.add(new Point(new Coord3d(0.0F, 0.0F, 0.0F)));
    localLineStrip1.add(new Point(new Coord3d(0.3D, 0.0D, 0.0D)));
    (localObject3 = new LineStrip()).setWireframeColor(Color.RED);
    ((LineStrip)localObject3).add(new Point(new Coord3d(0.0F, 0.0F, 0.0F)));
    ((LineStrip)localObject3).add(new Point(new Coord3d(0.0D, 0.0D, 0.3D)));
    ((TrialRotationTextTest)localObject1).b.add(localLineStrip1);
    ((TrialRotationTextTest)localObject1).b.add((AbstractDrawable)localObject3);
    ((TrialRotationTextTest)localObject1).b.add((AbstractDrawable)localObject2);
    this.chart.getScene().getGraph().add(this.b, true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\various\TrialRotationTextTest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */