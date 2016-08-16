package org.jzy3d.sandbox.tripleview;

import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.ChartView;
import org.jzy3d.sandbox.annotation.FaceOrderingProblemSnippet;

public class TripleViewWork
  extends FaceOrderingProblemSnippet
{
  public static void main(String[] paramArrayOfString)
  {
    AnalysisLauncher.open(new TripleViewWork());
  }
  
  public void init()
  {
    super.init();
    TripleViewLayout localTripleViewLayout = new TripleViewLayout();
    ChartView localChartView;
    (localChartView = (ChartView)this.chart.getView()).setLayout(localTripleViewLayout);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\tripleview\TripleViewWork.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */