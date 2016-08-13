package com.kangfoo.study.opengl.shapes;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import org.apache.log4j.Logger;

import javax.swing.*;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class Line implements GLEventListener {
    private  static Logger logger = Logger.getLogger(Line.class);

    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_LINES);//static field
        gl.glVertex3f(0.50f, -0.50f, 0);
//        gl.glVertex3f(0.80f,0.10f,0);
        gl.glVertex3f(-0.50f, 0.50f, 0);
        gl.glEnd();
    }
    public void dispose(GLAutoDrawable drawable) {
        //method body
        drawable.destroy();
    }

    public void init(GLAutoDrawable arg0) {
        // method body
    }
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }

    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        Line l = new Line();
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(800, 800);
        //creating frame
        final JFrame frame = new JFrame ("straight Line");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }//end of main
}//end of classimport javax.media.opengl.GL2;