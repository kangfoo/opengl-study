package com.kangfoo.study.opengl.transformation;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;

/**
 *
 *  旋转
 对象旋转可以沿任意3轴来完成，使用GLMatrixFunc接口的void glRotatef(float angle, float x, float y, float z) 方法。需要传递的旋转以及x，y，z轴的角度作为参数传递给该方法。
 下面的步骤指导成功地旋转对象：
 清除颜色缓存和深度缓存最初使用gl.glClear（GL2.GL_COLOR_BUFFER_BIT| GL2.GL_DEPTH_BUFFER_BIT）方法。此方法擦除对象的先前状态，使视图清晰。
 复位用glLoadIdentity()方法的投影矩阵。
 实例化的动画类和使用start()方法启动动画。
 *
 * Created by kangfoo on 2016/8/13.
 */
public class TriangleRotation implements GLEventListener {
    private float rtri;  //for angle of rotation
    public void init(GLAutoDrawable drawable) {

    }


    public void dispose(GLAutoDrawable drawable) {

    }


    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glClear (GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT );
        // Clear The Screen And The Depth Buffer
        gl.glLoadIdentity();                  // Reset The View
        gl.glRotatef( rtri, 0.0f, 1.0f, 0.0f );//triangle rotation

        gl.glBegin( GL2.GL_TRIANGLES );         // Drawing Using Triangles
        gl.glColor3f( 1.0f, 0.0f, 0.0f ); //Red
        gl.glVertex3f( 0.5f,0.7f,0.0f ); // Top
        gl.glColor3f( 0.0f,1.0f,0.0f ); //blue
        gl.glVertex3f( -0.2f,-0.50f,0.0f );              // Bottom Left
        gl.glColor3f( 0.0f,0.0f,1.0f ); //green
        gl.glVertex3f( 0.5f,-0.5f,0.0f );              // Bottom Right
        gl.glEnd();
        gl.glFlush();
        rtri +=0.2f;  //assigning the angle
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }

    public static void main( String[] args ) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        GLCapabilities capabilities = new GLCapabilities( profile );
        // The canvas
        final GLCanvas glcanvas = new GLCanvas( capabilities );
        TriangleRotation triangle = new TriangleRotation();
        glcanvas.addGLEventListener( triangle );
        glcanvas.setSize( 400, 400 );
        //creating frame
        final JFrame frame = new JFrame ( "Rotating Triangle" );
        //adding canvas to it
        frame.getContentPane().add( glcanvas );
        frame.setSize( frame.getContentPane().getPreferredSize() );
        frame.setVisible( true );
        //Instantiating and Initiating Animator
//        创建一个具有给定的目标帧每秒的值，初始绘制动画，和一个标志，指示是否使用固定利率调度FPSAnimator。
        final FPSAnimator animator = new FPSAnimator( glcanvas, 300,true );
        animator.start();
    }//end of main
}
