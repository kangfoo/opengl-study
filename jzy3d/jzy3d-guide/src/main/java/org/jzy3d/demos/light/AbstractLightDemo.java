package org.jzy3d.demos.light;

import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.enlightables.EnlightableSphere;
import org.jzy3d.plot3d.rendering.lights.Light;

public abstract class AbstractLightDemo
  extends AbstractAnalysis
{
  private int a = 0;
  
  protected static EnlightableSphere a(Chart paramChart, Coord3d paramCoord3d, float paramFloat, int paramInt)
  {
    (paramCoord3d = new EnlightableSphere(paramCoord3d, paramFloat, paramInt, Color.WHITE)).setWireframeDisplayed(false);
    paramCoord3d.setFaceDisplayed(true);
    paramChart.getScene().add(paramCoord3d);
    return paramCoord3d;
  }
  
  protected final Light a(Chart paramChart, Coord3d paramCoord3d)
  {
    Light localLight;
    (localLight = new Light(this.a++)).setPosition(paramCoord3d);
    localLight.setAmbiantColor(Color.BLACK);
    localLight.setDiffuseColor(Color.CYAN);
    localLight.setSpecularColor(Color.CYAN);
    paramChart.getScene().add(localLight);
    return localLight;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\light\AbstractLightDemo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */