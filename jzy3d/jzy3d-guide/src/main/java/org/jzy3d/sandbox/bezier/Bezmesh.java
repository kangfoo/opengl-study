package org.jzy3d.sandbox.bezier;

import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import java.io.PrintStream;
import java.nio.FloatBuffer;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.BoundingBox3d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.AbstractDrawable;
import org.jzy3d.plot3d.rendering.view.Camera;
import org.jzy3d.plot3d.transform.Transform;

public class Bezmesh
  extends AbstractDrawable
{
  private boolean a = true;
  private float b;
  private float c;
  private float d;
  private float e;
  private float f;
  private float g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private float[][][] n;
  private FloatBuffer o;
  
  public void applyGeometryTransform(Transform paramTransform) {}
  
  public void updateBounds() {}
  
  public Bezmesh()
  {
    this.bbox = new BoundingBox3d();
  }
  
  public final void a(Coord3d[][] paramArrayOfCoord3d)
  {
    paramArrayOfCoord3d = 20;
    paramArrayOfCoord3d = 20;
    Coord3d[][] arrayOfCoord3d = paramArrayOfCoord3d;
    paramArrayOfCoord3d = this;
    int i5 = arrayOfCoord3d[0].length;
    int i4 = arrayOfCoord3d.length;
    int i3 = 20;
    int i2 = 20;
    arrayOfCoord3d = arrayOfCoord3d;
    paramArrayOfCoord3d = this;
    i5 = i5;
    i4 = i3;
    paramArrayOfCoord3d = 1.0F;
    paramArrayOfCoord3d = 0.0F;
    i3 = i4;
    i2 = i2;
    paramArrayOfCoord3d = 1.0F;
    paramArrayOfCoord3d = 0.0F;
    arrayOfCoord3d = arrayOfCoord3d;
    paramArrayOfCoord3d = this;
    if (arrayOfCoord3d.length <= 0) {
      throw new IllegalArgumentException("input array has an unsupported format: input.length=" + arrayOfCoord3d.length);
    }
    if (arrayOfCoord3d[0].length <= 0) {
      throw new IllegalArgumentException("input array has an unsupported format: input[0].length=" + arrayOfCoord3d[0].length);
    }
    paramArrayOfCoord3d.b = 0.0F;
    paramArrayOfCoord3d.c = 0.0F;
    paramArrayOfCoord3d.d = 1.0F;
    paramArrayOfCoord3d.e = 1.0F;
    paramArrayOfCoord3d.f = (1.0F / i2);
    paramArrayOfCoord3d.g = (1.0F / i4);
    paramArrayOfCoord3d.h = i2;
    paramArrayOfCoord3d.i = i4;
    paramArrayOfCoord3d.j = i3;
    paramArrayOfCoord3d.k = i5;
    paramArrayOfCoord3d.l = arrayOfCoord3d.length;
    paramArrayOfCoord3d.m = arrayOfCoord3d[0].length;
    paramArrayOfCoord3d.bbox.reset();
    paramArrayOfCoord3d.n = new float[paramArrayOfCoord3d.l][paramArrayOfCoord3d.m][3];
    for (i2 = 0; i2 < paramArrayOfCoord3d.l; i2++) {
      for (i3 = 0; i3 < paramArrayOfCoord3d.m; i3++)
      {
        paramArrayOfCoord3d.n[i2][i3][0] = arrayOfCoord3d[i2][i3].x;
        paramArrayOfCoord3d.n[i2][i3][1] = arrayOfCoord3d[i2][i3].y;
        paramArrayOfCoord3d.n[i2][i3][2] = arrayOfCoord3d[i2][i3].z;
        paramArrayOfCoord3d.bbox.add(arrayOfCoord3d[i2][i3]);
      }
    }
    paramArrayOfCoord3d.o = Buffers.newDirectFloatBuffer(paramArrayOfCoord3d.l * paramArrayOfCoord3d.m * 3);
    for (i2 = 0; i2 < paramArrayOfCoord3d.l; i2++) {
      for (i3 = 0; i3 < paramArrayOfCoord3d.m; i3++) {
        for (int i1 = 0; i1 < 3; i1++) {
          paramArrayOfCoord3d.o.put(paramArrayOfCoord3d.n[i2][i3][i1]);
        }
      }
    }
    paramArrayOfCoord3d.o.rewind();
  }
  
  public void draw(GL paramGL, GLU paramGLU, Camera paramCamera)
  {
    doTransform(paramGL, paramGLU, paramCamera);
    int i6 = this.k;
    float f4 = this.e;
    float f3 = this.c;
    int i3 = this.j;
    float f2 = this.d;
    float f1 = this.b;
    paramCamera = paramGL.getGL2();
    paramGLU = this;
    paramCamera.glMap2f(3511, f1, f2, 3, i3, f3, f4, paramGLU.m * 3, i6, paramGLU.o);
    paramCamera.glEnable(3511);
    int i5 = this.i;
    f3 = this.c;
    i3 = this.h;
    f2 = this.b;
    Color localColor1 = Color.RED;
    paramCamera = paramGL.getGL2();
    paramGLU = this;
    paramCamera.glColor4f(localColor1.r, localColor1.g, localColor1.b, localColor1.a);
    for (int i1 = 0; i1 <= i5; i1++)
    {
      paramCamera.glBegin(3);
      for (i6 = 0; i6 <= i3; i6++) {
        paramCamera.glEvalCoord2f(f2 + i6 * paramGLU.f, f3 + i1 * paramGLU.g);
      }
      paramCamera.glEnd();
      paramCamera.glBegin(3);
      for (i6 = 0; i6 <= i3; i6++) {
        paramCamera.glEvalCoord2f(f3 + i1 * paramGLU.g, f2 + i6 * paramGLU.f);
      }
      paramCamera.glEnd();
    }
    if (this.a)
    {
      int i2 = 3;
      Color localColor2 = Color.BLUE;
      paramCamera = paramGL.getGL2();
      paramGLU = this;
      paramCamera.glColor4f(localColor2.r, localColor2.g, localColor2.b, localColor2.a);
      paramCamera.glPointSize(3.0F);
      paramCamera.glBegin(0);
      for (i3 = 0; i3 < paramGLU.n.length; i3++) {
        for (int i4 = 0; i4 < paramGLU.n[i3].length; i4++) {
          paramCamera.glVertex3f(paramGLU.n[i3][i4][0], paramGLU.n[i3][i4][1], paramGLU.n[i3][i4][2]);
        }
      }
      paramCamera.glEnd();
    }
  }
  
  public final void a()
  {
    System.out.println("bezier parameters:");
    System.out.println(" x range: " + this.b + ", " + this.d);
    System.out.println(" y range: " + this.c + ", " + this.e);
    System.out.println(" x steps: " + this.h);
    System.out.println(" y steps: " + this.i);
    System.out.println(" x order: " + this.j);
    System.out.println(" y order: " + this.k);
  }
}


/* Location:              D:\\jzy3d-guide-1.0-demos-exe\jzy3d-guide-1.0.0-SNAPSHOT\lib\jzy3d-guide-1.0.0-SNAPSHOT.jar!\org\jzy3d\sandbox\bezier\Bezmesh.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */