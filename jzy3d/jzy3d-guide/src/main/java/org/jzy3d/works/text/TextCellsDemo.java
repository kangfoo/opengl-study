package org.jzy3d.works.text;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.mouse.picking.NewtMousePickingController;
import org.jzy3d.chart.factories.NewtChartComponentFactory;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;
import org.jzy3d.plot3d.text.align.Halign;
import org.jzy3d.plot3d.text.drawable.cells.DrawableTextCell;
import org.jzy3d.plot3d.text.drawable.cells.TextCellRenderer;

public class TextCellsDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.openStatic(paramArrayOfString = new TextCellsDemo());
  }
  
  public void init()
  {
    (localObject = Quality.Advanced).setDepthActivated(false);
    this.chart = NewtChartComponentFactory.chart((Quality)localObject);
    this.chart.getView().setAxeBoxDisplayed(false);
    this.chart.getView().setViewPositionMode(ViewPositionMode.TOP);
    this.chart.getView().setSquared(false);
    Object localObject = new ArrayList();
    for (int i = 0; i < 100; i++) {
      ((List)localObject).add("item #" + i);
    }
    this.chart.getScene().getGraph().add(a((List)localObject));
    new NewtMousePickingController(this.chart);
  }
  
  private static List<DrawableTextCell> a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    Font localFont = new Font("Arial", 0, 40);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      (localObject = new TextCellRenderer(4, (String)localObject, localFont)).setHorizontalAlignement(Halign.LEFT);
      ((TextCellRenderer)localObject).setBorderDisplayed(true);
      ((TextCellRenderer)localObject).setBorderColor(Color.red);
      localObject = new DrawableTextCell(((TextCellRenderer)localObject).getImage(1.0F), new Coord2d(0.0F, i), new Coord2d(7.0F, 1.0F));
      localArrayList.add(localObject);
      i--;
    }
    return localArrayList;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\text\TextCellsDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */