package com.kangfoo.study.opengl.wjyjimy;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by kangfoo on 2016/8/14.
 */
public class Opengl_Bounce extends Frame implements GLEventListener, Runnable {

    float x1 = 100.0f;             //矩型的X坐标
    float y1 = 150.0f;             //矩型的y坐标
    long rsize = 50;               //为矩型宽度预留的位置或距离
    float xstep = 1.0f;            //沿X每步位移的距离,当然可以改大些
    float ystep = 1.0f;            //沿Y每步位移的距离
    float windowWidth;             //这里不是指窗体边框的的宽，而是视觉投影的右端
    float windowHeight;            //这里不是指窗体边框的的高，而是视觉投影的顶端

    GL2 gl;                         //OPENGL的主接口
    GLCanvas glcanvas;             //类似java.awt.Canvas, GLCanvas主要用来显示各种OPENGL的效果
    GLCapabilities capabilities;   //指定了一套OpenGL的功能：渲染内容必须支持，如色彩深度，以及立体是否已启用。

    Thread myThread = new Thread(this);

    public Opengl_Bounce() throws HeadlessException {
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        this.capabilities = new GLCapabilities(profile);        //实例化capabilities
        this.glcanvas = new GLCanvas(capabilities);      //实例化glcanvas
        this.glcanvas.addGLEventListener(this);          //给glcanvas添加GL事件处理
        this.add(glcanvas, BorderLayout.CENTER);         //给窗体添加一个Component:glcanvas
        this.addWindowListener(new WindowAdapter() {     //给窗体添加关闭事件
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        myThread.start();                                //主线程开始
    }

    public static void main(String[] args) {
        Opengl_Bounce f = new Opengl_Bounce();
        f.setTitle("移动的矩型");
        f.setSize(800, 600);
        f.setVisible(true);
    }

    public void display(GLAutoDrawable drawable) {
        if (x1 > windowWidth - rsize || x1 < 0) {
            xstep = -xstep;
        }

        if (y1 > windowHeight - rsize || y1 < 0) {
            ystep = -ystep;
        }

        if (x1 > windowWidth - rsize) {
            x1 = windowWidth - rsize;
        }

        if (y1 > windowHeight - rsize) {
            y1 = windowHeight - rsize;
        }

        x1 += xstep;
        y1 += ystep;

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        gl.glRectf(x1, y1, x1 + rsize, y1 + rsize);
        gl.glFlush();
        glcanvas.swapBuffers();

    }

    public void displayChanged(GLAutoDrawable drawable, boolean arg1, boolean arg2) {

    }

    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        gl.glClearColor(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public void dispose(GLAutoDrawable drawable) {

    }


    public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) {
        if (h == 0) {
            h = 1;
        }

        gl.glViewport(0, 0, w, h);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        if (w <= h) {
            this.windowWidth = 250.0f;
            this.windowHeight = 250.0f * h / w;
        } else {
            this.windowWidth = 250.0f * w / h;
            this.windowHeight = 250.0f;
        }

        gl.glOrtho(0.0f, windowWidth, 0.0f, windowHeight, 1.0f, -1.0f);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

    }

    public void run() {
        while (true) {
            glcanvas.display();                  //主线程不停调用display()
            try {
                myThread.sleep(20);             //每执行完一次休息20毫秒
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
