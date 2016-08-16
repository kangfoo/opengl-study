package org.jzy3d.demos.selectable;

import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.mouse.AWTDualModeMouseSelector;
import org.jzy3d.chart.controllers.mouse.selection.AWTAbstractMouseSelector;
import org.jzy3d.chart.controllers.mouse.selection.AWTScatterMouseSelector;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.selectable.SelectableScatter;
import org.jzy3d.plot3d.rendering.view.View;

public class SelectableScatterDemo
  extends AbstractAnalysis
{
  private static int a = 50000;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.openStatic(new SelectableScatterDemo());
  }
  
  public SelectableScatterDemo()
  {
    super(new AWTChartComponentFactory());
  }
  
  public void init()
  {
    int i;
    Coord3d[] arrayOfCoord3d = new Coord3d[i = a];
    Color[] arrayOfColor = new Color[i];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int j = 0; j < i; j++)
    {
      arrayOfColor[j] = new Color(0.0F, 0.2509804F, 0.32941177F);
      arrayOfCoord3d[j] = new Coord3d(localRandom.nextFloat(), localRandom.nextFloat(), localRandom.nextFloat());
    }
    SelectableScatter localSelectableScatter;
    (localSelectableScatter = new SelectableScatter(arrayOfCoord3d, arrayOfColor)).setWidth(1.0F);
    localSelectableScatter.setHighlightColor(Color.YELLOW);
    Object localObject = localSelectableScatter;
    this.chart = initializeChart();
    this.chart.getScene().add((AbstractDrawable)localObject);
    this.chart.getView().setMaximized(true);
    localObject = new AWTScatterMouseSelector((SelectableScatter)localObject);
    new AWTDualModeMouseSelector(this.chart, (AWTAbstractMouseSelector)localObject);
  }
  
  public boolean hasOwnChartControllers()
  {
    return true;
  }
  
  public String getPitch()
  {
    return "Selects points that stand in a rectangle selection and turn their color to red. Selection is additive, and performed over 50.000 points. This demo uses a special dual mouse mode. See message on chart for toggling keys.";
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\selectable\SelectableScatterDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */