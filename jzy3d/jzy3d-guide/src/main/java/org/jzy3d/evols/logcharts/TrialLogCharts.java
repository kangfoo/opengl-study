package org.jzy3d.evols.logcharts;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.CompileableComposite;
import org.jzy3d.plot3d.primitives.axes.AxeBox;
import org.jzy3d.plot3d.primitives.log.AxeTransformablePoint;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.transform.space.SpaceTransformLog;
import org.jzy3d.plot3d.transform.space.SpaceTransformer;

public class TrialLogCharts
{
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new a();
    Object localObject1 = new Range(0.1F, 10.0F);
    Object localObject2 = new Range(0.1F, 50.0F);
    SpaceTransformer localSpaceTransformer = new SpaceTransformer(null, null, new SpaceTransformLog());
    (paramArrayOfString = Builder.buildOrthonormalBigLog(new OrthonormalGrid((Range)localObject1, 200, (Range)localObject2, 200), paramArrayOfString, localSpaceTransformer)).setColorMapper(new ColorMapper(new ColorMapRainbow(), paramArrayOfString.getBounds().getZmin(), paramArrayOfString.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    paramArrayOfString.setFaceDisplayed(true);
    paramArrayOfString.setWireframeDisplayed(false);
    paramArrayOfString.setWireframeColor(Color.BLACK);
    (localObject1 = new AxeTransformablePoint(localSpaceTransformer)).setData(new Coord3d(1.0F, 1.0F, 1.0F));
    ((AxeTransformablePoint)localObject1).setColor(new Color(1, 0, 0));
    ((AxeTransformablePoint)localObject1).setWidth(10.0F);
    (localObject2 = new AxeTransformablePoint(localSpaceTransformer)).setData(new Coord3d(2.0F, 3.0F, 3.0F));
    ((AxeTransformablePoint)localObject2).setColor(new Color(0, 1, 0));
    ((AxeTransformablePoint)localObject2).setWidth(10.0F);
    AxeTransformablePoint localAxeTransformablePoint;
    (localAxeTransformablePoint = new AxeTransformablePoint(localSpaceTransformer)).setData(new Coord3d(3.0F, 4.0F, 2.0F));
    localAxeTransformablePoint.setColor(new Color(0, 0, 1));
    localAxeTransformablePoint.setWidth(10.0F);
    Chart localChart;
    AxeBox localAxeBox;
    (localAxeBox = (AxeBox)(localChart = AWTChartComponentFactory.chart(Quality.Advanced, "awt")).getView().getAxe()).setSpaceTransformer(localSpaceTransformer);
    localChart.addDrawable((AbstractDrawable)localObject1);
    localChart.addDrawable((AbstractDrawable)localObject2);
    localChart.addDrawable(localAxeTransformablePoint);
    localChart.addDrawable(paramArrayOfString);
    localChart.getView().setSpaceTransformer(localSpaceTransformer);
    ChartLauncher.openChart(localChart);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\evols\logcharts\TrialLogCharts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */