package org.jzy3d.works.peeling;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.io.glsl.GLSLProgram.Strictness;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Dimension;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.IAxe;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.ddp.PeelingComponentFactory;
import org.jzy3d.plot3d.rendering.ddp.algorithms.PeelingMethod;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.View;

public class PeeledWireSurfaceDemo
{
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new a();
    Object localObject = new Range(-150.0F, 150.0F);
    (paramArrayOfString = Builder.buildOrthonormal(new OrthonormalGrid((Range)localObject, 50, (Range)localObject, 50), paramArrayOfString)).setColorMapper(new ColorMapper(new ColorMapRainbow(), paramArrayOfString.getBounds().getZmin(), paramArrayOfString.getBounds().getZmax(), new Color(1.0F, 1.0F, 1.0F, 0.5F)));
    paramArrayOfString.setFaceDisplayed(true);
    paramArrayOfString.setWireframeDisplayed(true);
    paramArrayOfString.setWireframeColor(Color.BLACK);
    org.jzy3d.io.glsl.GLSLProgram.DEFAULT_STRICTNESS = GLSLProgram.Strictness.CONSOLE_NO_WARN_UNIFORM_NOT_FOUND;
    new PeelingComponentFactory(PeelingMethod.F2B_PEELING_MODE);
    localObject = GLProfile.getMaxProgrammable(true);
    (localObject = new GLCapabilities((GLProfile)localObject)).setHardwareAccelerated(true);
    (localObject = new Chart(Quality.Advanced)).getScene().getGraph().add(paramArrayOfString);
    AWTColorbarLegend localAWTColorbarLegend;
    (localAWTColorbarLegend = new AWTColorbarLegend(paramArrayOfString, ((Chart)localObject).getView().getAxe().getLayout())).setMinimumSize(new Dimension(100, 600));
    paramArrayOfString.setLegend(localAWTColorbarLegend);
    ChartLauncher.openChart((Chart)localObject);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\peeling\PeeledWireSurfaceDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */