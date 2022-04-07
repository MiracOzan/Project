package Form;

import javax.swing.*;

public class Home {
    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setSize(200,200);




        JTextArea FrameTextArea = new JTextArea("Hello");


        JButton FrameButton = new JButton("Hello");
        FrameButton.setSize(100,100);


        Frame.getContentPane().add(FrameTextArea);
        Frame.setVisible(true);
    }
}
