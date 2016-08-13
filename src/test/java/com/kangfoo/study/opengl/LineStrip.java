package com.kangfoo.study.opengl;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class LineStrip implements GLEventListener {
    public void init(GLAutoDrawable drawable) {

    }

    public void dispose(GLAutoDrawable drawable) {

    }

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
//        gl.glBegin(GL2.GL_LINE_STRIP);

//        gl.glBegin(GL2.GL_LINE_LOOP);
//        gl.glVertex3f(-0.5f, -0.75f, 0);
//        gl.glVertex3f(0.7f, 0.5f, 0);
//        gl.glVertex3f(0.7f, -0.7f, 0);
//        gl.glVertex3f(0f, 0.5f, 0);
//        gl.glEnd();

        /*三角形*/
//        gl.glBegin(GL2.GL_TRIANGLES);        // Drawing Using Triangles
//        gl.glVertex3f(0.5f,0.7f,0.0f);      // Top
//        gl.glVertex3f(-0.2f,-0.50f,0.0f);  // Bottom Left
//        gl.glVertex3f(0.5f,-0.5f,0.0f);   //Bottom Right
//        gl.glEnd();

        /*三角形带*/
//        gl.glBegin (GL2.GL_TRIANGLE_STRIP);
//        gl.glVertex3f(0f,0.5f,0);
//        gl.glVertex3f(-0.50f,-0.75f,0);
//        gl.glVertex3f(0.28f,0.06f,0);
//        gl.glVertex3f(0.7f,0.5f,0);
//        gl.glVertex3f(0.7f,-0.7f,0);
//        gl.glEnd();

        /*四边形*/
//        gl.glBegin(GL2.GL_QUADS);
//        gl.glVertex3f( 0.0f,0.75f,0);
//        gl.glVertex3f(-0.75f,0f,0);
//        gl.glVertex3f(0f,-0.75f,0);
//        gl.glVertex3f(0.75f,0f,0);
//        gl.glEnd();

        /*多边形*/
        gl.glBegin(GL2.GL_POLYGON);
        gl.glVertex3f(0f,0.5f,0f);
        gl.glVertex3f(-0.5f,0.2f,0f);
        gl.glVertex3f(-0.5f,-0.2f,0f);
        gl.glVertex3f(0f,-0.5f,0f);
        gl.glVertex3f(0f,0.5f,0f);
        gl.glVertex3f(0.5f,0.2f,0f);
        gl.glVertex3f(0.5f,-0.2f,0f);
        gl.glVertex3f(0f,-0.5f,0f);
        gl.glEnd();
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        LineStrip r = new LineStrip();
        glcanvas.addGLEventListener(r);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame ("LineStrip");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}
