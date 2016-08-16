package com.kangfoo.study.opengl.transformation;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class PolygonColor implements GLEventListener {
    public void init(GLAutoDrawable drawable) {

    }

    public void dispose(GLAutoDrawable drawable) {

    }

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glColor3f(1f, 0f, 0f);// red

        gl.glBegin(GL2.GL_POLYGON);
        gl.glVertex3f( 0f,0.5f,0f  );
        gl.glVertex3f( -0.5f,0.2f,0f );
        gl.glVertex3f( -0.5f,-0.2f,0f );
        gl.glVertex3f( 0f,-0.5f,0f );
        gl.glVertex3f( 0f,0.5f,0f );
        gl.glVertex3f( 0.5f,0.2f,0f );
        gl.glVertex3f(0.5f, -0.2f, 0f);
        gl.glVertex3f(0f, -0.5f, 0f);

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
        PolygonColor polygon = new PolygonColor();
        glcanvas.addGLEventListener( polygon );
        glcanvas.setSize( 400, 400 );
        //creating frame
        final JFrame frame = new JFrame( "Colored Polygon" );
        //adding canvas to frame
        frame.getContentPane().add( glcanvas );
        frame.setSize( frame.getContentPane().getPreferredSize() );
        frame.setVisible( true );
    }
}
