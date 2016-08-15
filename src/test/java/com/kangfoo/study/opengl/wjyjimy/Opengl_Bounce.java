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

    float x1 = 100.0f;             //���͵�X����
    float y1 = 150.0f;             //���͵�y����
    long rsize = 50;               //Ϊ���Ϳ��Ԥ����λ�û����
    float xstep = 1.0f;            //��Xÿ��λ�Ƶľ���,��Ȼ���ԸĴ�Щ
    float ystep = 1.0f;            //��Yÿ��λ�Ƶľ���
    float windowWidth;             //���ﲻ��ָ����߿�ĵĿ������Ӿ�ͶӰ���Ҷ�
    float windowHeight;            //���ﲻ��ָ����߿�ĵĸߣ������Ӿ�ͶӰ�Ķ���

    GL2 gl;                         //OPENGL�����ӿ�
    GLCanvas glcanvas;             //����java.awt.Canvas, GLCanvas��Ҫ������ʾ����OPENGL��Ч��
    GLCapabilities capabilities;   //ָ����һ��OpenGL�Ĺ��ܣ���Ⱦ���ݱ���֧�֣���ɫ����ȣ��Լ������Ƿ������á�

    Thread myThread = new Thread(this);

    public Opengl_Bounce() throws HeadlessException {
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        this.capabilities = new GLCapabilities(profile);        //ʵ����capabilities
        this.glcanvas = new GLCanvas(capabilities);      //ʵ����glcanvas
        this.glcanvas.addGLEventListener(this);          //��glcanvas���GL�¼�����
        this.add(glcanvas, BorderLayout.CENTER);         //���������һ��Component:glcanvas
        this.addWindowListener(new WindowAdapter() {     //��������ӹر��¼�
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        myThread.start();                                //���߳̿�ʼ
    }

    public static void main(String[] args) {
        Opengl_Bounce f = new Opengl_Bounce();
        f.setTitle("�ƶ��ľ���");
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
            glcanvas.display();                  //���̲߳�ͣ����display()
            try {
                myThread.sleep(20);             //ÿִ����һ����Ϣ20����
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
