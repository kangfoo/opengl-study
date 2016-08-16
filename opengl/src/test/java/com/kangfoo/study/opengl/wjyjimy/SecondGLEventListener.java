package com.kangfoo.study.opengl.wjyjimy;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

/**
 * Created by kangfoo on 2016/8/14.
 */
public class SecondGLEventListener implements GLEventListener {

    public SecondGLEventListener() {
    }

    public void display(GLAutoDrawable arg0) {                   //��ͼ����
        float red = (float) ((Math.random())*(1.0f));            //�����
        float green = (float) ((Math.random())*(1.0f));          //�����
        float blue = (float) ((Math.random())*(1.0f));           //�����
        GL2 gl = arg0.getGL().getGL2();                                    //��GLAutoDrawable��ȡGL
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);                      //��䱳����ɫ
        gl.glPointSize(5.0f);                                    //���õ�Ĵ�С
        for (int i=0; i<50; i++) {                               //����
            red -= .09f;                                           //��ɫֵ�ݼ�
            green -= .12f;                                         //��ɫֵ�ݼ�
            blue -= .15f;                                          //��ɫֵ�ݼ�
            if (red < 0.15) red = 1.0f;
            if (green < 0.15) green = 1.0f;
            if (blue < 0.15) blue = 1.0f;
            gl.glColor3f(red, green, blue);                        //����GL�Ļ�ͼ��ɫ��Ҳ���ǻ�ˢ����ɫ
            gl.glBegin(GL.GL_POINTS);
            gl.glVertex2i((i*10), 150);                        //������glBegin(GL.GL_POINTS)��ʼ��glEnd()����
            gl.glEnd();
        }
    }

    public void displayChanged(GLAutoDrawable arg0, boolean arg1, boolean arg2) {

    }

    public void init(GLAutoDrawable gld) {             //��ʼ����
        GL2 gl = gld.getGL().getGL2();
        GLU glu = new GLU();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);       //���ñ�����ɫ
        gl.glViewport(0, 0, 500, 300);                 //�ӵ��С
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(0.0, 500.0, 0.0, 300.0);        //ʹ����ϵͳ������GL��
    }

    public void dispose(GLAutoDrawable drawable) {
    }


    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,  int arg4) {
    }

}
