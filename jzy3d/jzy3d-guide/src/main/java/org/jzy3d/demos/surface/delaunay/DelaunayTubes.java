package org.jzy3d.demos.surface.delaunay;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.io.FileDataset;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class DelaunayTubes
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new DelaunayTubes());
  }
  
  public void init()
  {
    Object localObject;
    (localObject = Builder.buildDelaunay(localObject = FileDataset.loadList("./data/plotdata.txt"))).setColorMapper(new ColorMapper(new ColorMapRainbow(), ((Shape)localObject).getBounds().getZmin(), ((Shape)localObject).getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    ((Shape)localObject).setFaceDisplayed(true);
    ((Shape)localObject).setWireframeDisplayed(true);
    ((Shape)localObject).setWireframeColor(Color.BLACK);
    ((Shape)localObject).setLegendDisplayed(true);
    this.chart = initializeChart();
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\delaunay\DelaunayTubes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */