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
        super("第二个JOGL");
        final GLProfile profile = GLProfile.get( GLProfile.GL2 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化GLCapabilities
        GLCapabilities glcaps = new GLCapabilities(profile);
        canvas = new GLCanvas(glcaps);                  //初试化GLcanvas,用法参照第一章
        canvas.addGLEventListener(new SecondGLEventListener());  //GLcanvas添加GLEventListener
        getContentPane().add(canvas, BorderLayout.CENTER);       //给窗体panel添加GLcanvas
        animator=new FPSAnimator(canvas,10,true);        //本章重点，给canvas添加动画线程，每秒10帧
        setSize(500, 300);
        centerWindow(this);
    }

    public void centerWindow(Component frame) {         //把窗体居中
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
        //显示窗体
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
                        animator.start( );        //开始动画线程
                    }
                }
        );

    }

}