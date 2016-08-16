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

    public void display(GLAutoDrawable arg0) {                   //画图函数
        float red = (float) ((Math.random())*(1.0f));            //随机红
        float green = (float) ((Math.random())*(1.0f));          //随机绿
        float blue = (float) ((Math.random())*(1.0f));           //随机蓝
        GL2 gl = arg0.getGL().getGL2();                                    //从GLAutoDrawable获取GL
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);                      //填充背景颜色
        gl.glPointSize(5.0f);                                    //设置点的大小
        for (int i=0; i<50; i++) {                               //画点
            red -= .09f;                                           //红色值递减
            green -= .12f;                                         //绿色值递减
            blue -= .15f;                                          //蓝色值递减
            if (red < 0.15) red = 1.0f;
            if (green < 0.15) green = 1.0f;
            if (blue < 0.15) blue = 1.0f;
            gl.glColor3f(red, green, blue);                        //设置GL的画图颜色，也就是画刷的颜色
            gl.glBegin(GL.GL_POINTS);
            gl.glVertex2i((i*10), 150);                        //画点由glBegin(GL.GL_POINTS)开始，glEnd()结束
            gl.glEnd();
        }
    }

    public void displayChanged(GLAutoDrawable arg0, boolean arg1, boolean arg2) {

    }

    public void init(GLAutoDrawable gld) {             //初始函数
        GL2 gl = gld.getGL().getGL2();
        GLU glu = new GLU();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);       //设置背景颜色
        gl.glViewport(0, 0, 500, 300);                 //视点大小
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(0.0, 500.0, 0.0, 300.0);        //使坐标系统出现在GL里
    }

    public void dispose(GLAutoDrawable drawable) {
    }


    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,  int arg4) {
    }

}
