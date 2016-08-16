package org.jzy3d.demos.contour;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.ContourChartComponentFactory;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.contour.MapperContourPictureGenerator;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.primitives.AWTScatterMultiColor;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.view.View;

public class Contour3DDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new Contour3DDemo());
  }
  
  public Contour3DDemo()
  {
    super(new ContourChartComponentFactory());
  }
  
  public void init()
  {
    Object localObject1 = new a(this);
    Object localObject2 = new Range(-100.0F, 100.0F);
    Range localRange = new Range(-100.0F, 100.0F);
    localObject1 = (localObject1 = new MapperContourPictureGenerator((Mapper)localObject1, (Range)localObject2, localRange)).getContourMatrix(1000, 1000, 40);
    localObject2 = new Coord3d[1000000];
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 1000; j++) {
        if (localObject1[i][j] > -1.7976931348623157E308D) {
          localObject2[(i * 1000 + j)] = new Coord3d(i, j, (float)localObject1[i][j]);
        } else {
          localObject2[(i * 1000 + j)] = new Coord3d(i, j, 0.0F);
        }
      }
    }
    this.chart = initializeChart();
    AWTScatterMultiColor localAWTScatterMultiColor = new AWTScatterMultiColor((Coord3d[])localObject2, new ColorMapper(new ColorMapRainbow(), -600.0D, 600.0D));
    this.chart.getScene().add(localAWTScatterMultiColor);
    localAWTScatterMultiColor.setLegend(new AWTColorbarLegend(localAWTScatterMultiColor, this.chart.getView().getAxe().getLayout().getZTickProvider(), this.chart.getView().getAxe().getLayout().getZTickRenderer()));
    localAWTScatterMultiColor.setLegendDisplayed(true);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\contour\Contour3DDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */