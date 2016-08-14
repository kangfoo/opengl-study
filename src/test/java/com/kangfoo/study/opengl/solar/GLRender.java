package com.kangfoo.study.opengl.solar;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * Created by kangfoo on 2016/8/13.
 */
public class GLRender implements GLEventListener {

    GL2 gl;
    GLU glu;
    GLUT glut;
    float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};
    float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};
    float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};


    float fMoonRot = 0.0f;
    float fEarthRot = 0.0f;

    public void init(GLAutoDrawable drawable) {
        gl =  drawable.getGL().getGL2();    //��Ҫ�������﷢���仯
        glu = new GLU();
        glut=new GLUT();


        // Light values and coordinates
        gl.glEnable(GL.GL_DEPTH_TEST);  // ������Ȳ���
        gl.glFrontFace(GL.GL_CCW);      //����CCW����Ϊ�����桱��CCW��CounterClockWise����ʱ��
        gl.glEnable(GL.GL_CULL_FACE);       //��GL_CULL_FACE���ų�������glEnable������ʾ��������α����޳�����

        // ���õƹ�
        gl.glEnable(GL2.GL_LIGHTING);

        // ���õƹ�
        gl.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, whiteLight, 0);
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, sourceLight, 0);
        gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, lightPos, 0);
        gl.glEnable(GL2.GL_LIGHT0);

        // ���ò���
        gl.glEnable(GL2.GL_COLOR_MATERIAL);

        // ��������������滹�Ƿ��棬�Ի����⡢����⻹������������ɫ���١�
        //��һ����������ȡGL_FRONT��GL_BACK��GL_FRONT_AND_BACK�е�����һ�֣�
        //�ڶ�����������ȡGL_AMBIENT��GL_DIFFUSE��GL_AMBIENT_AND_DIFFUSE��GL_SPECULAR�е�����һ�֡�
        gl.glColorMaterial(GL.GL_FRONT, GL2.GL_AMBIENT_AND_DIFFUSE);

        // ��ɫ����
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);



    }

    public void display(GLAutoDrawable drawable) {



        // ��䱳��Ϊ������ɫ
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);

        // �������״̬������ת
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glPushMatrix();

        // ��ͼ���ƶ���Z��300��λ��,��Ϊ����,��Ϊ�����Ա.
        gl.glTranslatef(0.0f, 0.0f, -300.0f);

        // Set material color, Red
        // ̫��
        gl.glDisable(GL2.GL_LIGHTING);
        gl.glColor3ub((byte)255, (byte)0, (byte)0);
        glut.glutSolidSphere(15.0f, 30, 17);
        gl.glEnable(GL2.GL_LIGHTING);

        // �������õƹ⵽̫����λ��
        gl.glLightfv(GL2.GL_LIGHT0,GL2.GL_POSITION,lightPos,0);

        // Χ��Y����ת����
        gl.glRotatef(fEarthRot, 0.0f, 1.0f, 0.0f);

        // ������
        gl.glColor3ub((byte)0,(byte)200,(byte)255);
        gl.glTranslatef(105.0f,0.0f,0.0f);
        glut.glutSolidSphere(15.0f, 30, 17);


        //Χ��Y����ת����,��ǰ��ת����Ϊ����,����ת��������
        gl.glColor3ub((byte)200,(byte)200,(byte)200);
        gl.glRotatef(fMoonRot,0.0f, 1.0f, 0.0f);
        gl.glTranslatef(30.0f, 0.0f, 0.0f);
        fMoonRot+= 15.0f;
        if(fMoonRot > 360.0f)
            fMoonRot = 0.0f;

        glut.glutSolidSphere(6.0f, 30, 17);

        // ��ԭ״̬����
        gl.glPopMatrix();   // Modelview matrix


        //������ÿ��5��,��ת����
        fEarthRot += 2.0f;
        if(fEarthRot > 360.0f)
            fEarthRot = 0.0f;
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        float fAspect;

        // ��ֹΪ��
        if (height == 0) {
            height = 1;
        }

        //�ӿ�����Ϊ���ڳߴ�
        gl.glViewport(0, 0, width, height);

        fAspect = (float) width / height;

        // Reset projection matrix stack
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();



        //͸��ͶӰ �۽Ƕ�,����,������,Զ����
        glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);

        // ����ģ�͹۲�����ջ
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();

    }



    public void dispose(GLAutoDrawable arg0) {

    }
}