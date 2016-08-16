package org.jzy3d.works.text;

import java.awt.Font;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;
import org.jzy3d.plot3d.text.DrawableTextWrapper;
import org.jzy3d.plot3d.text.ITextRenderer;
import org.jzy3d.plot3d.text.align.Halign;
import org.jzy3d.plot3d.text.drawable.DrawableTextBillboard;
import org.jzy3d.plot3d.text.drawable.DrawableTextBitmap;
import org.jzy3d.plot3d.text.drawable.DrawableTextTexture;
import org.jzy3d.plot3d.text.drawable.cells.DrawableTextCell;
import org.jzy3d.plot3d.text.drawable.cells.TextCellRenderer;
import org.jzy3d.plot3d.text.renderers.jogl.JOGLTextRenderer;
import org.jzy3d.plot3d.text.renderers.jogl.ShadowedTextStyle;

public class TextDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new TextDemo()).init();
    AnalysisLauncher.openStatic(paramArrayOfString);
    paramArrayOfString.getChart().getView().updateBounds();
  }
  
  public void init()
  {
    (localObject = Quality.Advanced).setDepthActivated(false);
    this.chart = AWTChartComponentFactory.chart((Quality)localObject);
    this.chart.getView().setAxeBoxDisplayed(true);
    this.chart.getView().setViewPositionMode(ViewPositionMode.TOP);
    this.chart.getView().setSquared(false);
    this.chart.getView().setMaximized(true);
    Object localObject = new DrawableTextTexture("DrawableTextTexture", new Coord2d(0.0F, 0.0F), new Coord2d(8.0F, 1.0F));
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    localObject = new DrawableTextTexture("blablabla", new Coord2d(0.0F, 2.0F), new Coord2d(8.0F, 1.0F));
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    localObject = new DrawableTextTexture("blablabla", new Coord2d(0.0F, 4.0F), new Coord2d(4.0D, 0.5D));
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    (localObject = new DrawableTextBitmap("DrawableTextBitmap", new Coord3d(0.0F, 6.0F, 0.0F), org.jzy3d.colors.Color.BLACK)).setHalign(Halign.RIGHT);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    (localObject = new DrawableTextBillboard("DrawableTextBillboard", new Coord3d(0.0F, 8.0F, 0.0F), org.jzy3d.colors.Color.BLACK)).setHalign(Halign.RIGHT);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    localObject = new JOGLTextRenderer(new ShadowedTextStyle(72.0F, 10, java.awt.Color.RED, java.awt.Color.CYAN));
    localObject = new DrawableTextWrapper("DrawableTextWrapper(JOGLTextRenderer(ShadowedTextStyle))", new Coord3d(0.0F, 10.0F, 0.0F), org.jzy3d.colors.Color.BLACK, (ITextRenderer)localObject);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    localObject = new JOGLTextRenderer();
    localObject = new DrawableTextWrapper("DrawableTextWrapper(JOGLTextRenderer)", new Coord3d(0.0F, 12.0F, 0.0F), org.jzy3d.colors.Color.BLACK, (ITextRenderer)localObject);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
    (localObject = new TextCellRenderer(4, "DrawableTextCell(TextCellRenderer)", new Font("Serif", 0, 16))).setHorizontalAlignement(Halign.LEFT);
    ((TextCellRenderer)localObject).setBorderDisplayed(true);
    ((TextCellRenderer)localObject).setBorderColor(java.awt.Color.red);
    localObject = new DrawableTextCell((TextCellRenderer)localObject, new Coord2d(0.0F, 14.0F), new Coord2d(7.0F, 1.0F));
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\text\TextDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */