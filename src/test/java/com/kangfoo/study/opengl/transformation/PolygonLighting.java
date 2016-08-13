package com.kangfoo.study.opengl.transformation;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import javafx.scene.effect.Light;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class PolygonLighting implements GLEventListener {
    private float rpoly;

    public void display( GLAutoDrawable drawable ) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glColor3f(1f,0f,0f); //applying red
        // Clear The Screen And The Depth Buffer
        gl.glClear( GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT );
        gl.glLoadIdentity();                  // Reset The View
        gl.glRotatef( rpoly, 0.0f, 1.0f, 0.0f );
        gl.glBegin( GL2.GL_POLYGON );
        gl.glVertex3f( 0f,0.5f,0f );
        gl.glVertex3f( -0.5f,0.2f,0f );
        gl.glVertex3f( -0.5f,-0.2f,0f );
        gl.glVertex3f( 0f,-0.5f,0f );
        gl.glVertex3f( 0f,0.5f,0f );
        gl.glVertex3f( 0.5f,0.2f,0f );
        gl.glVertex3f( 0.5f,-0.2f,0f );
        gl.glVertex3f( 0f,-0.5f,0f );
        gl.glEnd();
        gl.glFlush();
        rpoly +=0.2f;  //assigning the angle
        gl.glEnable( GL2.GL_LIGHTING );
        gl.glEnable( GL2.GL_LIGHT0 );
        gl.glEnable( GL2.GL_NORMALIZE );
        float[] ambientLight = { 0.1f, 0.f, 0.f,0f }; // weak RED ambient
        gl.glLightfv( GL2.GL_LIGHT0, GL2.GL_AMBIENT, ambientLight, 0 );
        float[] diffuseLight = { 1f,2f,1f,0f }; //multi color diffuse
        gl.glLightfv( GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diffuseLight, 0 );
    }

    public void dispose( GLAutoDrawable arg0 ) {
        //method body
    }

    public void init( GLAutoDrawable arg0 ) {
        // method body
    }

    public void reshape( GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4 ) {
        // method body
    }
    public static void main( String[] args ) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        GLCapabilities capabilities = new GLCapabilities( profile );
        // The canvas
        final GLCanvas glcanvas = new GLCanvas( capabilities );
        PolygonLighting polygonlighting = new PolygonLighting();
        glcanvas.addGLEventListener( polygonlighting );
        glcanvas.setSize( 1400, 1400 );
        //creating frame
        final JFrame frame = new JFrame ( " Polygon lighting " );
        //adding canvas to it
        frame.getContentPane().add( glcanvas );
        frame.setSize( frame.getContentPane().getPreferredSize() );
        frame.setVisible( true );
        //Instantiating and Initiating Animator
        final FPSAnimator animator = new FPSAnimator(glcanvas, 300,true );
        animator.start();
    }//end of main
}//end of class