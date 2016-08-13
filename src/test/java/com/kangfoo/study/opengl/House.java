package com.kangfoo.study.opengl;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class House implements GLEventListener {

    public void init(GLAutoDrawable drawable) {

    }

    public void dispose(GLAutoDrawable drawable) {

    }

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        // 房子的顶层
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.3f, 0.3f , 0);
        gl.glVertex3f(0.3f, 0.3f , 0);
        gl.glEnd();

        // 房子的地面
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.3f, -0.3f, 0);
        gl.glVertex3f(0.3f, -0.3f, 0);
        gl.glEnd();

        // 房子的左边墙面
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.3f, 0.3f, 0);
        gl.glVertex3f(-0.3f, -0.3f, 0);
        gl.glEnd();

        // 房子的右边墙面
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(0.3f, 0.3f, 0);
        gl.glVertex3f(0.3f, -0.3f, 0);
        gl.glEnd();

        // 左房顶
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(0f, 0.6f, 0);
        gl.glVertex3f(-0.3f, 0.3f, 0);
        gl.glEnd();

        // 右房顶
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(0f, 0.6f, 0);
        gl.glVertex3f(0.3f, 0.3f, 0);
        gl.glEnd();

        /*门*/
        // 顶
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.05f, 0.05f, 0);
        gl.glVertex3f(0.05f, 0.05f, 0);
        gl.glEnd();

        // 左框
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(-0.05f, 0.05f, 0);
        gl.glVertex3f(-0.05f, -0.3f, 0);
        gl.glEnd();

        // 右框
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex3f(0.05f, 0.05f, 0);
        gl.glVertex3f(0.05f, -0.3f, 0);
        gl.glEnd();


        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(0.1f, 0.1f, 0);
        gl.glVertex3f(0.1f, -0.1f, 0);
        gl.glVertex3f(-0.1f, -0.1f, 0);
        gl.glVertex3f(-0.1f, 0.1f, 0);
        gl.glEnd();

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }

    public static void main( String[] args ) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        GLCapabilities capabilities = new GLCapabilities( profile );
        // The canvas
        final GLCanvas glcanvas = new GLCanvas( capabilities );
        House house = new House();
        glcanvas.addGLEventListener( house );
        glcanvas.setSize(2*400, 2*400);
        //creating frame
        final JFrame frame = new JFrame( "House" );
        //adding canvas to frame
        frame.getContentPane().add( glcanvas );
        frame.setSize( frame.getContentPane().getPreferredSize() );
        frame.setVisible( true );
    }//end of main
}
