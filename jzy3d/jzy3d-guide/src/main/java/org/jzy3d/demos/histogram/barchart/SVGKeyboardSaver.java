package org.jzy3d.demos.histogram.barchart;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jzy3d.chart.Chart;

public class SVGKeyboardSaver
  extends KeyAdapter
{
  private final Chart a;
  
  public SVGKeyboardSaver(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 83) && (paramKeyEvent.isControlDown()))
    {
      (paramKeyEvent = new JFileChooser(".")).setFileFilter(new FileNameExtensionFilter("PNG file", new String[] { ".png" }));
      paramKeyEvent.showSaveDialog((Component)this.a.getCanvas());
      if (paramKeyEvent.getSelectedFile() != null)
      {
        if (!paramKeyEvent.getSelectedFile().getParentFile().exists()) {
          paramKeyEvent.getSelectedFile().mkdirs();
        }
        try
        {
          this.a.screenshot(new File(paramKeyEvent.getSelectedFile().toString() + ".png"));
          return;
        }
        catch (IOException paramKeyEvent)
        {
          JOptionPane.showMessageDialog((Component)this.a.getCanvas(), "Error saving file.");
          Logger.getLogger(SVGKeyboardSaver.class.getName()).log(Level.SEVERE, null, paramKeyEvent);
        }
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\demos\histogram\barchart\SVGKeyboardSaver.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */