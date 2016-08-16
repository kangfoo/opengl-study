package org.jzy3d.works.various;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartLauncher;
import org.jzy3d.chart.ChartScene;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.chart.factories.IChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.CompositeColorMapperUpdatePolicy;
import org.jzy3d.colors.OrderingStrategyScoreColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.colors.colormaps.IColorMap;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.builder.concrete.OrthonormalTessellator;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.primitives.axes.layout.IAxeLayout;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.FixedDecimalTickRenderer;
import org.jzy3d.plot3d.primitives.axes.layout.renderers.ScientificNotationTickRenderer;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.legends.colorbars.AWTColorbarLegend;
import org.jzy3d.plot3d.rendering.scene.Graph;
import org.jzy3d.plot3d.rendering.view.AWTView;
import org.jzy3d.plot3d.rendering.view.View;
import org.jzy3d.plot3d.rendering.view.annotation.CameraEyeOverlayAnnotation;

public class TrialFaceOrdering
{
  static double a = 100.0D;
  private IColorMap b;
  private ColorMapper c;
  private AWTColorbarLegend d;
  private Shape e;
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = paramArrayOfString = new TrialFaceOrdering();
    Object localObject1 = new AWTChartComponentFactory();
    (localObject1 = new Chart((IChartComponentFactory)localObject1, Quality.Advanced, "awt")).getAxeLayout().setZTickRenderer(new ScientificNotationTickRenderer(1));
    ((Chart)localObject1).getAxeLayout().setYTickRenderer(new FixedDecimalTickRenderer(1));
    ((Chart)localObject1).getAxeLayout().setXTickRenderer(new FixedDecimalTickRenderer(1));
    Object localObject4 = ((Chart)localObject1).getAxeLayout();
    Object localObject3 = ((Chart)localObject1).getScene().getGraph();
    Object localObject2 = ((Chart)localObject1).getView();
    paramArrayOfString = paramArrayOfString;
    Object localObject5 = new a(paramArrayOfString);
    Object localObject6 = new Range(-150.0F, 150.0F);
    localObject6 = new OrthonormalGrid((Range)localObject6, 50, (Range)localObject6, 50);
    b localb = new b(paramArrayOfString);
    paramArrayOfString.e = ((Shape)localb.build(((OrthonormalGrid)localObject6).apply((Mapper)localObject5)));
    localObject5 = localObject4;
    localObject4 = localObject3;
    localObject3 = localObject2;
    localObject2 = paramArrayOfString.e;
    paramArrayOfString = paramArrayOfString;
    localObject6 = new Color(1.0F, 1.0F, 1.0F, 0.75F);
    paramArrayOfString.b = new ColorMapRainbow();
    paramArrayOfString.b.setDirection(false);
    paramArrayOfString.c = new OrderingStrategyScoreColorMapper(paramArrayOfString.b, new CompositeColorMapperUpdatePolicy(), (Graph)localObject4, (Color)localObject6);
    ((Shape)localObject2).setColorMapper(paramArrayOfString.c);
    ((Shape)localObject2).setWireframeDisplayed(true);
    paramArrayOfString.d = new AWTColorbarLegend((AbstractDrawable)localObject2, (IAxeLayout)localObject5);
    ((Shape)localObject2).setLegend(paramArrayOfString.d);
    ((View)localObject3).addViewPointChangedListener(new c(paramArrayOfString));
    ((Graph)localObject4).add((AbstractDrawable)localObject2);
    ((AWTView)((Chart)localObject1).getView()).addRenderer2d(new CameraEyeOverlayAnnotation(((Chart)localObject1).getView()));
    ChartLauncher.openChart((Chart)localObject1);
  }
  
  public final void a()
  {
    this.c.preDraw(this.e);
  }
  
  public TrialFaceOrdering()
  {
    new double[] { -1.0D, 1.0D, 0.0D, 0.0D }[4] = 0.0D;
    new double[] { 0.0D, 0.0D, -1.0D, 1.0D }[4] = 0.0D;
    new double[] { 1799635.862225038D, 2778958.3605334656D, 2308941.6737486282D, 2791418.430038142D }[4] = 2778052.031336538D;
    { "17", "18", " 19", "20" }[4] = "27";
    new double[] { -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D, 1.0D, -1.0D, -0.9D, -0.8D, -0.7D, -0.6D, -0.5D, -0.4D, -0.3D, -0.2D, -0.1D, 0.0D, 0.1D, 0.2D, 0.3D, 0.4D, 0.5D, 0.6D, 0.7D, 0.8D, 0.9D }['Ƹ'] = 1.0D;
    new double[] { -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -1.0D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.9D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.8D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.7D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.6D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.5D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.4D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.3D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.2D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, -0.1D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.1D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.2D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.3D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.4D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.7D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.8D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 0.9D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D }['Ƹ'] = 1.0D;
    new double[] { 1648446.8D, 1691895.4D, 1732207.9D, 1769384.4D, 1803424.9D, 1834329.2D, 1862097.6D, 1886729.9D, 1908226.1D, 1926586.4D, 1941810.5D, 1953898.6D, 1962850.8D, 1968666.8D, 1971346.8D, 1970890.6D, 1967298.5D, 1960570.4D, 1950706.1D, 1937705.9D, 1921569.6D, 1761433.5D, 1805073.4D, 1845577.0D, 1882944.8D, 1917176.2D, 1948271.9D, 1976231.4D, 2001054.9D, 2022742.4D, 2041293.8D, 2056709.1D, 2068988.4D, 2078131.6D, 2084138.9D, 2087010.0D, 2086745.1D, 2083344.1D, 2076807.1D, 2067134.1D, 2054325.1D, 2038380.0D, 1866066.5D, 1909897.5D, 1950592.4D, 1988151.2D, 2022574.0D, 2053860.8D, 2082011.5D, 2107026.2D, 2128904.8D, 2147647.2D, 2163253.8D, 2175724.2D, 2185058.8D, 2191257.2D, 2194319.5D, 2194245.8D, 2191036.0D, 2184690.2D, 2175208.2D, 2162590.5D, 2146836.5D, 1962345.9D, 2006368.0D, 2047254.1D, 2085004.1D, 2119618.0D, 2151096.0D, 2179438.0D, 2204643.8D, 2226713.5D, 2245647.2D, 2261445.0D, 2274106.8D, 2283632.2D, 2290021.8D, 2293275.2D, 2293392.8D, 2290374.2D, 2284219.5D, 2274929.0D, 2262502.2D, 2246939.5D, 2050271.5D, 2094484.8D, 2135562.0D, 2173503.2D, 2208308.5D, 2239977.5D, 2268510.5D, 2293907.5D, 2316168.5D, 2335293.5D, 2351282.2D, 2364135.2D, 2373852.0D, 2380432.8D, 2383877.5D, 2384186.0D, 2381358.8D, 2375395.2D, 2366295.8D, 2354060.2D, 2338688.5D, 2129843.5D, 2174248.0D, 2215516.2D, 2253648.8D, 2288645.0D, 2320505.2D, 2349229.5D, 2374817.8D, 2397270.0D, 2416586.0D, 2432766.0D, 2445810.0D, 2455718.0D, 2462490.0D, 2466125.8D, 2466625.8D, 2463989.5D, 2458217.2D, 2449308.8D, 2437264.5D, 2422084.0D, 2201061.8D, 2245657.2D, 2287117.0D, 2325440.5D, 2360628.0D, 2392679.5D, 2421594.8D, 2447374.2D, 2470017.5D, 2489524.8D, 2505896.0D, 2519131.2D, 2529230.5D, 2536193.5D, 2540020.5D, 2540711.5D, 2538266.5D, 2532685.5D, 2523968.2D, 2512115.0D, 2497125.8D, 2263926.2D, 2308713.0D, 2350363.8D, 2388878.5D, 2424257.2D, 2456499.8D, 2485606.5D, 2511577.0D, 2534411.5D, 2554110.0D, 2570672.2D, 2584098.8D, 2594389.0D, 2601543.2D, 2605561.5D, 2606443.8D, 2604189.8D, 2598800.0D, 2590274.0D, 2578612.0D, 2563814.0D, 2318437.0D, 2363415.0D, 2405257.0D, 2443962.8D, 2479532.8D, 2511966.5D, 2541264.2D, 2567426.0D, 2590451.8D, 2610341.2D, 2627095.0D, 2640712.5D, 2651194.0D, 2658539.5D, 2662748.8D, 2663822.2D, 2661759.5D, 2656560.8D, 2648226.0D, 2636755.2D, 2622148.2D, 2364594.0D, 2409763.2D, 2451796.2D, 2490693.5D, 2526454.5D, 2559079.5D, 2588568.5D, 2614921.2D, 2638138.2D, 2658219.0D, 2675163.8D, 2688972.5D, 2699645.2D, 2707181.8D, 2711582.5D, 2712847.0D, 2710975.5D, 2705968.0D, 2697824.2D, 2686544.8D, 2672129.0D, 2402397.5D, 2447757.8D, 2489982.0D, 2529070.5D, 2565022.5D, 2597838.8D, 2627519.0D, 2654063.0D, 2677471.0D, 2697743.0D, 2714879.0D, 2728879.0D, 2739742.8D, 2747470.5D, 2752062.2D, 2753518.0D, 2751837.8D, 2747021.2D, 2739069.0D, 2727980.5D, 2713756.0D, 2431847.0D, 2477398.8D, 2519814.2D, 2559093.5D, 2595237.0D, 2628244.2D, 2658115.8D, 2684851.0D, 2708450.2D, 2728913.2D, 2746240.5D, 2760431.5D, 2771486.5D, 2779405.5D, 2784188.5D, 2785835.5D, 2784346.2D, 2779721.0D, 2771959.8D, 2761062.5D, 2747029.2D, 2452943.0D, 2498685.8D, 2541292.5D, 2580763.2D, 2617097.8D, 2650296.2D, 2680358.8D, 2707285.2D, 2731075.5D, 2751730.0D, 2769248.2D, 2783630.5D, 2794876.8D, 2802986.8D, 2807961.0D, 2809799.0D, 2808501.0D, 2804067.0D, 2796497.0D, 2785791.0D, 2771948.8D, 2465685.5D, 2511619.2D, 2554417.2D, 2594079.0D, 2630604.8D, 2663994.5D, 2694248.0D, 2721365.8D, 2745347.2D, 2766192.8D, 2783902.2D, 2798475.8D, 2809913.0D, 2818214.5D, 2823379.8D, 2825409.0D, 2824302.2D, 2820059.2D, 2812680.5D, 2802165.5D, 2788514.5D, 2470074.0D, 2516199.0D, 2559188.0D, 2599041.0D, 2635758.0D, 2669339.0D, 2699783.8D, 2727092.5D, 2751265.2D, 2772302.0D, 2790202.8D, 2804967.2D, 2816595.8D, 2825088.2D, 2830444.8D, 2832665.2D, 2831749.8D, 2827698.0D, 2820510.2D, 2810186.5D, 2796726.8D, 2466108.8D, 2512425.0D, 2555605.2D, 2595649.5D, 2632557.5D, 2666329.8D, 2696965.8D, 2724465.8D, 2748829.5D, 2770057.5D, 2788149.2D, 2803105.0D, 2814924.8D, 2823608.5D, 2829156.2D, 2831567.8D, 2830843.2D, 2826982.8D, 2819986.2D, 2809853.8D, 2796585.2D, 2453790.0D, 2500297.5D, 2543668.8D, 2583904.2D, 2621003.5D, 2654966.8D, 2685794.0D, 2713485.0D, 2738040.2D, 2759459.2D, 2777742.2D, 2792889.2D, 2804900.2D, 2813775.0D, 2819513.8D, 2822116.5D, 2821583.2D, 2817914.0D, 2811108.8D, 2801167.2D, 2788089.8D, 2433117.5D, 2479816.0D, 2523378.5D, 2563805.2D, 2601095.5D, 2635250.0D, 2666268.5D, 2694150.8D, 2718897.0D, 2740507.2D, 2758981.5D, 2774319.5D, 2786521.8D, 2795587.8D, 2801517.8D, 2804311.8D, 2803969.8D, 2800491.5D, 2793877.2D, 2784127.2D, 2771241.0D, 2404091.2D, 2450981.0D, 2494734.8D, 2535352.5D, 2572834.0D, 2607179.8D, 2638389.2D, 2666462.8D, 2691400.2D, 2713201.8D, 2731867.0D, 2747396.2D, 2759789.5D, 2769046.8D, 2775168.0D, 2778153.2D, 2778002.2D, 2774715.2D, 2768292.2D, 2758733.2D, 2746038.2D, 2366711.2D, 2413792.2D, 2457737.2D, 2498546.0D, 2536218.8D, 2570755.5D, 2602156.2D, 2630421.0D, 2655549.8D, 2677542.2D, 2696398.8D, 2712119.2D, 2724703.8D, 2734152.2D, 2740464.5D, 2743641.0D, 2743681.2D, 2740585.5D, 2734353.5D, 2724985.8D, 2712481.8D, 2320977.5D, 2368249.8D, 2412385.8D, 2453386.0D, 2491249.8D, 2525977.8D, 2557569.8D, 2586025.5D, 2611345.5D, 2633529.2D, 2652577.0D, 2668488.8D, 2681264.2D, 2690903.8D, 2697407.5D, 2700775.0D, 2701006.2D, 2698101.8D, 2692061.2D, 2682884.5D }['Ƹ'] = 2670571.8D;
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\works\various\TrialFaceOrdering.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */