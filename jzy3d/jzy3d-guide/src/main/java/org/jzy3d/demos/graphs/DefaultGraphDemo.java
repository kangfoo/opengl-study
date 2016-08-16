package org.jzy3d.demos.graphs;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.controllers.mouse.picking.NewtMousePickingController;
import org.jzy3d.chart.graphs.GraphChart;
import org.jzy3d.maths.graphs.IGraph;
import org.jzy3d.maths.graphs.StringGraphGenerator;
import org.jzy3d.picking.PickingSupport;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.graphs.impl.DefaultDrawableGraph2d;
import org.jzy3d.plot3d.primitives.graphs.layout.DefaultGraphFormatter;
import org.jzy3d.plot3d.primitives.graphs.layout.DefaultGraphLayout2d;
import org.jzy3d.plot3d.primitives.graphs.layout.IGraphFormatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.modes.ViewPositionMode;

public class DefaultGraphDemo
  extends AbstractAnalysis
{
  private static int a = 100000;
  private static int b = 2000;
  private static float c = 10.0F;
  
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.openStatic(paramArrayOfString = new DefaultGraphDemo());
  }
  
  public void init()
  {
    IGraph localIGraph;
    DefaultGraphLayout2d localDefaultGraphLayout2d = StringGraphGenerator.getRandomLayout(localIGraph = StringGraphGenerator.getGraph(a, b), c);
    DefaultGraphFormatter localDefaultGraphFormatter;
    (localDefaultGraphFormatter = new DefaultGraphFormatter()).setVertexLabelsDisplayed(false);
    (localObject = Quality.Advanced).setDepthActivated(false);
    this.chart = new GraphChart((Quality)localObject, getCanvasType());
    this.chart.getView().setAxeBoxDisplayed(false);
    this.chart.getView().setViewPositionMode(ViewPositionMode.TOP);
    this.chart.getView().setSquared(false);
    Object localObject = new DefaultDrawableGraph2d();
    NewtMousePickingController localNewtMousePickingController;
    (localNewtMousePickingController = new NewtMousePickingController(this.chart)).getPickingSupport().addObjectPickedListener(new a(this, (DefaultDrawableGraph2d)localObject));
    ((DefaultDrawableGraph2d)localObject).setGraphModel(localIGraph);
    ((DefaultDrawableGraph2d)localObject).setGraphLayout(localDefaultGraphLayout2d);
    ((DefaultDrawableGraph2d)localObject).setGraphFormatter(localDefaultGraphFormatter);
    this.chart.getScene().getGraph().add((AbstractDrawable)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\graphs\DefaultGraphDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */