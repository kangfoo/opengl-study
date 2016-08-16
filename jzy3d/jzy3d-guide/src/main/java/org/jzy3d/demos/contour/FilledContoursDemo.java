package org.jzy3d.demos.contour;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ContourChart;
import org.jzy3d.chart.SwingChartLauncher;
import org.jzy3d.chart.factories.ContourChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.contour.DefaultContourColoringPolicy;
import org.jzy3d.contour.IContourPictureGenerator;
import org.jzy3d.contour.MapperContourPictureGenerator;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Range;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.ContourAxeBox;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.view.View;

public class FilledContoursDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new FilledContoursDemo()).init();
    SwingChartLauncher.openImagePanel(((ContourAxeBox)paramArrayOfString.getChart().getView().getAxe()).getContourImage(), new Rectangle(600, 0, 400, 400));
    AnalysisLauncher.open(paramArrayOfString);
  }
  
  public FilledContoursDemo()
  {
    super(new ContourChartComponentFactory());
  }
  
  public void init()
  {
    Object localObject = new c(this);
    Range localRange1 = new Range(50.0F, 100.0F);
    Range localRange2 = new Range(50.0F, 100.0F);
    Shape localShape = Builder.buildOrthonormal(new OrthonormalGrid(localRange1, 50, localRange2, 50), (Mapper)localObject);
    ColorMapper localColorMapper = new ColorMapper(new ColorMapRainbow(), localShape.getBounds().getZmin(), localShape.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F));
    localShape.setColorMapper(localColorMapper);
    localShape.setFaceDisplayed(true);
    localShape.setWireframeDisplayed(true);
    localShape.setWireframeColor(Color.BLACK);
    localObject = new MapperContourPictureGenerator((Mapper)localObject, localRange1, localRange2);
    this.chart = initializeChart(Quality.Intermediate);
    ContourAxeBox localContourAxeBox;
    (localContourAxeBox = (ContourAxeBox)this.chart.getView().getAxe()).setContourImg(((IContourPictureGenerator)localObject).getFilledContourImage(new DefaultContourColoringPolicy(localColorMapper), 400, 400, 10), localRange1, localRange2);
    this.chart.addDrawable(localShape);
    localShape.setLegend(new AWTColorbarLegend(localShape, this.chart.getView().getAxe().getLayout().getZTickProvider(), this.chart.getView().getAxe().getLayout().getZTickRenderer()));
    localShape.setLegendDisplayed(false);
  }
  
  public Chart initializeChart()
  {
    return new ContourChart(Quality.Advanced, getCanvasType());
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\contour\FilledContoursDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */