package org.jzy3d.picking;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.mouse.picking.NewtMousePickingController;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.graphs.IGraph;
import org.jzy3d.maths.graphs.StringGraphGenerator;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.graphs.impl.PointGraph2d;
import org.jzy3d.plot3d.primitives.graphs.layout.DefaultGraphFormatter;
import org.jzy3d.plot3d.primitives.graphs.layout.DefaultGraphLayout2d;
import org.jzy3d.plot3d.primitives.graphs.layout.IGraphFormatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class PickableGraphDemo
  extends AbstractAnalysis
{
  private static int a = 500;
  private static int b = 100;
  private static float c = 10.0F;
  private static float d = 10.0F;
  
  public static void main(String[] paramArrayOfString)
  {
    (paramArrayOfString = new PickableGraphDemo()).setCanvasType("newt");
    AnalysisLauncher.openStatic(paramArrayOfString);
  }
  
  public void init()
  {
    IGraph localIGraph;
    DefaultGraphLayout2d localDefaultGraphLayout2d = StringGraphGenerator.getRandomLayout(localIGraph = StringGraphGenerator.getGraph(a, b), c);
    DefaultGraphFormatter localDefaultGraphFormatter;
    (localDefaultGraphFormatter = new DefaultGraphFormatter()).setVertexColor(new Color(0.0F, 0.2509804F, 0.32941177F));
    localDefaultGraphFormatter.setVertexLabelColor(new Color(0.0F, 0.2509804F, 0.32941177F));
    localDefaultGraphFormatter.setEdgeColor(new Color(0.0F, 0.2509804F, 0.32941177F));
    localDefaultGraphFormatter.setHighlightedVertexColor(new Color(0.96862745F, 0.30980393F, 0.46666667F));
    Object localObject = Quality.Advanced;
    this.chart = AWTChartComponentFactory.chart((Quality)localObject, getCanvasType());
    this.chart.getView().setAxeBoxDisplayed(false);
    this.chart.getView().setViewPositionMode(ViewPositionMode.TOP);
    this.chart.getView().setSquared(false);
    localObject = new PointGraph2d();
    NewtMousePickingController localNewtMousePickingController;
    (localNewtMousePickingController = new NewtMousePickingController(this.chart, (int)d)).getPickingSupport().addObjectPickedListener(new a(this, (PointGraph2d)localObject));
    ((PointGraph2d)localObject).setGraphModel(localIGraph, localNewtMousePickingController.getPickingSupport());
    ((PointGraph2d)localObject).setGraphFormatter(localDefaultGraphFormatter);
    ((PointGraph2d)localObject).setGraphLayout(localDefaultGraphLayout2d);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\picking\PickableGraphDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */