package com.kangfoo.study.opengl.wjyjimy;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kangfoo on 2016/8/14.
 */
public class SecondJoglApp extends JFrame {

    public static FPSAnimator animator=null;
    public GLCanvas canvas=null;

    public SecondJoglApp() throws HeadlessException {
        super("�ڶ���JOGL");
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //��ʼ��GLCapabilities
        GLCapabilities glcaps = new GLCapabilities(profile);
        canvas = new GLCanvas(glcaps);                  //���Ի�GLcanvas,�÷����յ�һ��
        canvas.addGLEventListener(new SecondGLEventListener());  //GLcanvas���GLEventListener
        getContentPane().add(canvas, BorderLayout.CENTER);       //������panel���GLcanvas
        animator=new FPSAnimator(canvas,10,true);        //�����ص㣬��canvas��Ӷ����̣߳�ÿ��10֡
        setSize(500, 300);
        centerWindow(this);
    }

    public void centerWindow(Component frame) {         //�Ѵ������
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = frame.getSize();
        if (frameSize.width  > screenSize.width )
            frameSize.width  = screenSize.width;
        if (frameSize.height > screenSize.height)
            frameSize.height = screenSize.height;
        frame.setLocation (
                (screenSize.width  - frameSize.width ) >> 1,
                (screenSize.height - frameSize.height) >> 1
        );
    }

    public static void main(String[] args) {
        final SecondJoglApp app = new SecondJoglApp();
        //��ʾ����
        SwingUtilities.invokeLater (
                new Runnable() {
                    public void run() {
                        app.setVisible(true);
                    }
                }
        );

        SwingUtilities.invokeLater (
                new Runnable() {
                    public void run() {
                        animator.start( );        //��ʼ�����߳�
                    }
                }
        );

    }

}