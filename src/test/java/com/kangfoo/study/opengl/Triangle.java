package com.kangfoo.study.opengl;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * 标准化设备坐标(Normalized Device Coordinates, NDC)

 一旦你的顶点坐标已经在顶点着色器中处理过，它们就应该是标准化设备坐标了，标准化设备坐标是一个x、y和z值在-1.0到1.0的一小段空间。
 任何落在范围外的坐标都会被丢弃/裁剪，不会显示在你的屏幕上。下面你会看到我们定义的在标准化设备坐标中的三角形(忽略z轴)：

 * Created by kangfoo on 2016/8/13.
 */
public class Triangle implements GLEventListener{
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin (GL2.GL_LINES);
        //drawing the base
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex3f(-0.50f, -0.50f, 0);
        gl.glVertex3f(0.50f, -0.50f, 0);
        gl.glEnd();
        //drawing the right edge
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex3f(0f, 0.50f, 0);
        gl.glVertex3f(-0.50f, -0.50f, 0);
        gl.glEnd();
        //drawing the lft edge
        gl.glBegin (GL2.GL_LINES);
        gl.glVertex3f(0f, 0.50f, 0);
        gl.glVertex3f(0.50f, -0.50f, 0);
        gl.glEnd();
        gl.glFlush();
    }
    public void dispose(GLAutoDrawable arg0) {
        //method body
    }
    public void init(GLAutoDrawable arg0) {
        // method body
    }
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,
                        int arg4) {
        // method body
    }
    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Triangle l = new Triangle();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame ("Triangle");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}//end of classimport javax.media.opengl.GL2;