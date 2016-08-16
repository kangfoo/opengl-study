package com.kangfoo.study.opengl._3dgraphics;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class Edge1 implements GLEventListener {
    private GLU glu = new GLU();

    public void display(GLAutoDrawable drawable) {
        // TODO Auto-generated method stub
        final GL2 gl = drawable.getGL().getGL2();
        gl.glTranslatef(0f, 0f, -2.5f);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.75f,0f,0);
        gl.glVertex3f(0f,-0.75f, 0);
        gl.glEnd();
        //3d line
        gl.glBegin(GL2.GL_LINES);
        //3 units in to the window
        gl.glVertex3f(-0.75f,0f,3f);
        gl.glVertex3f(0f,-0.75f,3f);
        gl.glEnd();
        //top
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.75f,0f,0);
        gl.glVertex3f(-0.75f,0f,3f);
        gl.glEnd();
        //bottom
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(0f,-0.75f, 0);
        gl.glVertex3f(0f,-0.75f,3f);
        gl.glEnd();
    }

    public void dispose(GLAutoDrawable arg0) {
        //method body
    }

    public void init(GLAutoDrawable arg0) {
        // method body
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();
        if(height <=0)
            height =1;
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Edge1 b = new Edge1();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(1400, 1400);
        //creating frame
        final JFrame frame = new JFrame (" 3d edge");
        //adding canvas to it
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}//end of class