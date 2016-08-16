package com.kangfoo.study.opengl.transformation;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class Scaling implements GLEventListener {
    public void init(GLAutoDrawable drawable) {

    }

    public void dispose(GLAutoDrawable drawable) {

    }

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glScalef( 0.50f,0.25f,0.50f );
        gl.glBegin( GL2.GL_TRIANGLES );       // Drawing Using Triangles

        gl.glColor3f( 1.0f, 0.0f, 0.0f ); //Red
        gl.glVertex3f( 0.5f,0.7f,0.0f ); // Top

        gl.glColor3f( 0.0f,1.0f,0.0f ); //blue
        gl.glVertex3f( -0.2f,-0.50f,0.0f );          // Bottom Left

        gl.glColor3f( 0.0f,0.0f,1.0f ); //green
        gl.glVertex3f( 0.5f,-0.5f,0.0f );           //Bottom Right

        gl.glEnd();
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        GLCapabilities capabilities = new GLCapabilities( profile );
        // The canvas
        final GLCanvas glcanvas = new GLCanvas( capabilities );
        Scaling scaling = new Scaling();
        glcanvas.addGLEventListener( scaling );
        glcanvas.setSize( 1400, 1400 );
        //creating frame
        final JFrame frame = new JFrame (" Dimnished Triangle (Scaling )");
        //adding canvas to it
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }
}
