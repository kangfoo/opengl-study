package org.jzy3d.demos.browser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jzy3d.analysis.IAnalysis;
import org.jzy3d.demos.animation.AddRemoveElementsDemo;
import org.jzy3d.demos.animation.AnimatedSurfaceDemo;
import org.jzy3d.demos.axelayout.AxeRendererDemo;
import org.jzy3d.demos.background.BackgroundDemo;
import org.jzy3d.demos.chart2d.histogram.Histogram2dAddDemo;
import org.jzy3d.demos.chart2d.histogram.Histogram2dPredefinedDemo;
import org.jzy3d.demos.composites.CompositeDemo;
import org.jzy3d.demos.contour.Contour3DDemo;
import org.jzy3d.demos.contour.ContourPlotsDemo;
import org.jzy3d.demos.contour.FilledContoursDemo;
import org.jzy3d.demos.contour.HeightMapDemo;
import org.jzy3d.demos.contour.UserChosenContoursDemo;
import org.jzy3d.demos.histogram.barchart.BarChartDemo;
import org.jzy3d.demos.histogram.simplebarchart.HistogramDemo;
import org.jzy3d.demos.interpolation.InterpolationDemo;
import org.jzy3d.demos.light.HistogramLightDemo;
import org.jzy3d.demos.light.SphereLightDemo;
import org.jzy3d.demos.scatter.MultiColorScatterDemo;
import org.jzy3d.demos.scatter.Scatter4D;
import org.jzy3d.demos.scatter.ScatterDemo;
import org.jzy3d.demos.scatter.ScatterSphereDemo;
import org.jzy3d.demos.selectable.SelectableScatterDemo;
import org.jzy3d.demos.selectable.SelectableSphereDemo;
import org.jzy3d.demos.surface.BuildSurfaceDemo;
import org.jzy3d.demos.surface.ColorWaveDemo;
import org.jzy3d.demos.surface.WireSurfaceDemo;
import org.jzy3d.demos.surface.WireSurfaceDemo2;
import org.jzy3d.demos.surface.big.ChromatogramDemo;
import org.jzy3d.demos.surface.delaunay.DelaunayTubes;
import org.jzy3d.demos.surface.delaunay.GeneratedDelaunaySurfaceDemo;
import org.jzy3d.demos.surface.delaunay.IncrementalDelaunayDemo;
import org.jzy3d.demos.surface.delaunay.SphericDelaunaySurfaceDemo;
import org.jzy3d.demos.textures.TextureDemo;
import org.jzy3d.demos.vbo.matlab.MatlabVBODemo;
import org.jzy3d.demos.vbo.objfile.ObjFileVBODemo;
import org.jzy3d.demos.vbo.scatter.ScatterVBODemo;

public class DemoList
{
  public static List<IAnalysis> a(String paramString)
  {
    ArrayList localArrayList2;
    (localArrayList2 = new ArrayList()).add(new WireSurfaceDemo());
    localArrayList2.add(new WireSurfaceDemo2());
    localArrayList2.add(new ColorWaveDemo());
    localArrayList2.add(new BuildSurfaceDemo());
    localArrayList2.add(new ChromatogramDemo());
    localArrayList2.add(new SphericDelaunaySurfaceDemo());
    localArrayList2.add(new GeneratedDelaunaySurfaceDemo());
    localArrayList2.add(new DelaunayTubes());
    localArrayList2.add(new IncrementalDelaunayDemo());
    localArrayList2.add(new ScatterDemo());
    localArrayList2.add(new MultiColorScatterDemo());
    localArrayList2.add(new ScatterSphereDemo());
    localArrayList2.add(new Scatter4D());
    localArrayList2.add(new HistogramDemo());
    localArrayList2.add(new BarChartDemo());
    localArrayList2.add(new CompositeDemo());
    localArrayList2.add(new TextureDemo());
    localArrayList2.add(new SelectableScatterDemo());
    localArrayList2.add(new SelectableSphereDemo());
    localArrayList2.add(new InterpolationDemo());
    localArrayList2.add(new HistogramLightDemo());
    localArrayList2.add(new SphereLightDemo());
    localArrayList2.add(new Contour3DDemo());
    localArrayList2.add(new ContourPlotsDemo());
    localArrayList2.add(new FilledContoursDemo());
    localArrayList2.add(new HeightMapDemo());
    localArrayList2.add(new UserChosenContoursDemo());
    localArrayList2.add(new AxeRendererDemo());
    localArrayList2.add(new AnimatedSurfaceDemo());
    localArrayList2.add(new AddRemoveElementsDemo());
    localArrayList2.add(new BackgroundDemo());
    localArrayList2.add(new ScatterVBODemo());
    localArrayList2.add(new MatlabVBODemo(true));
    localArrayList2.add(new ObjFileVBODemo());
    localArrayList2.add(new Histogram2dAddDemo());
    localArrayList2.add(new Histogram2dPredefinedDemo());
    ArrayList localArrayList1;
    Collections.sort(localArrayList2 = localArrayList1 = localArrayList2, new e());
    if (paramString != null) {
      a(localArrayList1, paramString);
    }
    return localArrayList1;
  }
  
  private static void a(List<IAnalysis> paramList, String paramString)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      IAnalysis localIAnalysis;
      (localIAnalysis = (IAnalysis)paramList.next()).setCanvasType(paramString);
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\browser\DemoList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */