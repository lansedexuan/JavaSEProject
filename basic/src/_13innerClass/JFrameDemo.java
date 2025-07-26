package _13innerClass;

import javax.swing.*;
import java.awt.event.*;

public class JFrameDemo {
    public static void main(String[] args){
        JFrame win = new JFrame("登录窗口");
        win.setSize(300,200);
        win.setLocationRelativeTo(null);//居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel =new JPanel();//桌布
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);

        //给按钮添加一个点击事件监听器对象，这样就可以监听用户的点击
        //btn.addActionListener(new ClickListener());
        //开发中不是我们要主动写匿名内部类，而是用别人的功能时，别人可以让我们写一个匿名内部类，我们才会写
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("成功");
            }
        });
        //btn.addActionListener(e->System.out.println("成功"));

        win.setVisible(true);
    }
}

//class ClickListener implements ActionListener {//ActionListener接口的实现类
//    public void actionPerformed(ActionEvent e)
//    {
//        System.out.println("用户点击了登录按钮");
//    }
//}
