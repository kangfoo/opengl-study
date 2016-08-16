package org.jzy3d.book;

import java.io.File;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapGrayscale;
import org.jzy3d.colors.colormaps.ColorMapHotCold;
import org.jzy3d.colors.colormaps.ColorMapRBG;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.colors.colormaps.ColorMapRainbowNoBorder;
import org.jzy3d.colors.colormaps.ColorMapRedAndGreen;
import org.jzy3d.colors.colormaps.ColorMapWhiteBlue;
import org.jzy3d.colors.colormaps.ColorMapWhiteGreen;
import org.jzy3d.colors.colormaps.ColorMapWhiteRed;
import org.jzy3d.colors.colormaps.IColorMap;
import org.jzy3d.plot2d.primitive.AWTColorbarImageGenerator;

public class BookColorbars
{
  public static void main(String[] paramArrayOfString)
  {
    a(new ColorMapGrayscale(), "data/book/BookColorMapGrayscale.png");
    a(new ColorMapHotCold(), "data/book/BookColorMapHotCold.png");
    a(new ColorMapRainbow(), "data/book/BookColorMapRainbow.png");
    a(new ColorMapRainbowNoBorder(), "data/book/BookColorMapRainbowNoBorder.png");
    a(new ColorMapRBG(), "data/book/BookColorMapRBG.png");
    a(new ColorMapRedAndGreen(), "data/book/BookColorMapRedAndGreen.png");
    a(new ColorMapWhiteBlue(), "data/book/BookColorMapWhiteBlue.png");
    a(new ColorMapWhiteGreen(), "data/book/BookColorMapWhiteGreen.png");
    a(new ColorMapWhiteRed(), "data/book/BookColorMapWhiteRed.png");
  }
  
  private static void a(IColorMap paramIColorMap, String paramString)
  {
    paramIColorMap.setDirection(false);
    paramIColorMap = new ColorMapper(paramIColorMap, 0.0D, 1.0D);
    ImageIO.write(paramIColorMap = (paramIColorMap = new AWTColorbarImageGenerator(paramIColorMap, null, null)).toImage(20, 300, 19), "png", new File(paramString));
    System.out.println("Dumped " + paramString);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\book\BookColorbars.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */