package org.jzy3d.bugs.screenshot;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.util.GLReadBufferUtil;
import org.jzy3d.plot3d.rendering.view.Renderer3d;
import org.jzy3d.plot3d.rendering.view.View;

final class e
  extends Renderer3d
{
  e(d paramd, View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramView, paramBoolean1, paramBoolean2);
  }
  
  public final void display(GLAutoDrawable paramGLAutoDrawable)
  {
    paramGLAutoDrawable = paramGLAutoDrawable.getGL();
    if (this.view != null)
    {
      this.view.clear(paramGLAutoDrawable);
      this.view.render(paramGLAutoDrawable, this.glu);
      if (this.doScreenshotAtNextDisplay)
      {
        GLReadBufferUtil localGLReadBufferUtil;
        (localGLReadBufferUtil = new GLReadBufferUtil(true, true)).readPixels(paramGLAutoDrawable, false);
        this.image = localGLReadBufferUtil.getTextureData();
        this.doScreenshotAtNextDisplay = false;
      }
    }
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\bugs\screenshot\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */