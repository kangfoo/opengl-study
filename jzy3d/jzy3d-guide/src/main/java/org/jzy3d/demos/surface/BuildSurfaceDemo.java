package org.jzy3d.demos.surface;

import java.util.ArrayList;
import java.util.List;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Point;
import org.jzy3d.plot3d.primitives.Polygon;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.scene.Graph;

public class BuildSurfaceDemo
  extends AbstractAnalysis
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(paramArrayOfString = new BuildSurfaceDemo());
  }
  
  public void init()
  {
    double[][] arrayOfDouble = { { 0.25D, 0.45D, 0.2D }, { 0.56D, 0.89D, 0.45D }, { 0.6D, 0.3D, 0.7D } };
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < arrayOfDouble.length - 1; i++) {
      for (int j = 0; j < arrayOfDouble[i].length - 1; j++)
      {
        Polygon localPolygon;
        (localPolygon = new Polygon()).add(new Point(new Coord3d(i, j, arrayOfDouble[i][j])));
        localPolygon.add(new Point(new Coord3d(i, j + 1, arrayOfDouble[i][(j + 1)])));
        localPolygon.add(new Point(new Coord3d(i + 1, j + 1, arrayOfDouble[(i + 1)][(j + 1)])));
        localPolygon.add(new Point(new Coord3d(i + 1, j, arrayOfDouble[(i + 1)][j])));
        localArrayList.add(localPolygon);
      }
    }
    Shape localShape;
    (localShape = new Shape(localArrayList)).setColorMapper(new ColorMapper(new ColorMapRainbow(), localShape.getBounds().getZmin(), localShape.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 1.0F)));
    localShape.setWireframeDisplayed(true);
    localShape.setWireframeColor(Color.BLACK);
    this.chart = initializeChart();
    this.chart.getScene().getGraph().add(localShape);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\surface\BuildSurfaceDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */