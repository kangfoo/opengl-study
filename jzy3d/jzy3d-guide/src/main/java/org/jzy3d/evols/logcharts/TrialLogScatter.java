package org.jzy3d.evols.logcharts;

import java.util.ArrayList;
import java.util.Random;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.log.AxeTransformableConcurrentScatterMultiColorList;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.transform.space.SpaceTransformLog;
import org.jzy3d.plot3d.transform.space.SpaceTransformer;

public class TrialLogScatter
  extends AbstractAnalysis
{
  private SpaceTransformer a = new SpaceTransformer(null, null, new SpaceTransformLog());
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new TrialLogScatter());
  }
  
  public void init()
  {
    ArrayList localArrayList = new ArrayList();
    Color[] arrayOfColor = new Color[500000];
    Random localRandom;
    (localRandom = new Random()).setSeed(0L);
    for (int i = 0; i < 500000; i++)
    {
      float f1 = localRandom.nextFloat() + 0.1F;
      float f2 = localRandom.nextFloat() + 0.1F;
      float f3 = localRandom.nextFloat() + 0.1F;
      localArrayList.add(new Coord3d(f1, f2, f3));
      arrayOfColor[i] = new Color(f1, f2, f3, 0.25F);
    }
    AxeTransformableConcurrentScatterMultiColorList localAxeTransformableConcurrentScatterMultiColorList = new AxeTransformableConcurrentScatterMultiColorList(localArrayList, new ColorMapper(new ColorMapRainbow(), 0.1D, 1.1D, new Color(1.0F, 1.0F, 1.0F, 0.5F)), this.a);
    this.chart = AWTChartComponentFactory.chart(Quality.Advanced, "awt");
    this.chart.getView().getAxe().setSpaceTransformer(this.a);
    this.chart.getView().setSpaceTransformer(this.a);
    this.chart.getScene().add(localAxeTransformableConcurrentScatterMultiColorList);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\evols\logcharts\TrialLogScatter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */