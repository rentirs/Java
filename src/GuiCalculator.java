import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCalculator implements ActionListener {
    JFrame frame = new JFrame("Калькулятор");
    JTextField text = new JTextField();
    JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_plus, btn_minus, btn_multiply, btn_divide, btn_equals, btn_rst;
    int operation = 0, sum = 0, num_1 = 0, num_2 = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiCalculator();
            }
        });
    }

    GuiCalculator() {
        frame.setSize(240, 270);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setVisible(true);

        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");
        btn_6 = new JButton("6");
        btn_7 = new JButton("7");
        btn_8 = new JButton("8");
        btn_9 = new JButton("9");
        btn_0 = new JButton("0");
        btn_plus = new JButton("+");
        btn_minus = new JButton("-");
        btn_multiply = new JButton("*");
        btn_divide = new JButton("/");
        btn_equals = new JButton("=");
        btn_rst = new JButton("C");


        text.setBounds(5, 10, 215, 40);

        btn_7.setBounds(5, 50, 50, 40);
        btn_8.setBounds(60, 50, 50, 40);
        btn_9.setBounds(115, 50, 50, 40);
        btn_divide.setBounds(170, 50, 50, 40);

        btn_4.setBounds(5, 95, 50, 40);
        btn_5.setBounds(60, 95, 50, 40);
        btn_6.setBounds(115, 95, 50, 40);
        btn_multiply.setBounds(170, 95, 50, 40);

        btn_1.setBounds(5, 140, 50, 40);
        btn_2.setBounds(60, 140, 50, 40);
        btn_3.setBounds(115, 140, 50, 40);
        btn_plus.setBounds(170, 140, 50, 40);

        btn_0.setBounds(5, 185, 50, 40);
        btn_minus.setBounds(60, 185, 50, 40);
        btn_equals.setBounds(115, 185, 50, 40);
        btn_rst.setBounds(170, 185, 50, 40);

        frame.add(text);
        frame.add(btn_7);
        frame.add(btn_8);
        frame.add(btn_9);
        frame.add(btn_divide);
        frame.add(btn_4);
        frame.add(btn_5);
        frame.add(btn_6);
        frame.add(btn_multiply);
        frame.add(btn_1);
        frame.add(btn_2);
        frame.add(btn_3);
        frame.add(btn_plus);
        frame.add(btn_0);
        frame.add(btn_minus);
        frame.add(btn_equals);
        frame.add(btn_rst);

        btn_1.addActionListener(this);
        btn_2.addActionListener(this);
        btn_3.addActionListener(this);
        btn_4.addActionListener(this);
        btn_5.addActionListener(this);
        btn_6.addActionListener(this);
        btn_7.addActionListener(this);
        btn_8.addActionListener(this);
        btn_9.addActionListener(this);
        btn_0.addActionListener(this);
        btn_plus.addActionListener(this);
        btn_minus.addActionListener(this);
        btn_multiply.addActionListener(this);
        btn_divide.addActionListener(this);
        btn_rst.addActionListener(this);
        btn_equals.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent q) {
        if (q.getSource() == btn_1)
            text.setText("1");
        if (q.getSource() == btn_2)
            text.setText("2");
        if (q.getSource() == btn_3)
            text.setText("3");
        if (q.getSource() == btn_4)
            text.setText("4");
        if (q.getSource() == btn_5)
            text.setText("5");
        if (q.getSource() == btn_6)
            text.setText("6");
        if (q.getSource() == btn_7)
            text.setText("7");
        if (q.getSource() == btn_8)
            text.setText("8");
        if (q.getSource() == btn_9)
            text.setText("9");
        if (q.getSource() == btn_0)
            text.setText("0");
        if (q.getSource() == btn_plus) {
            num_1 = Integer.parseInt(text.getText());
            operation = 1;
            text.setText("+");
        }
        if (q.getSource() == btn_minus) {
            num_1 = Integer.parseInt(text.getText());
            operation = 2;
            text.setText("-");
        }
        if (q.getSource() == btn_multiply) {
            num_1 = Integer.parseInt(text.getText());
            operation = 3;
            text.setText("*");
        }
        if (q.getSource() == btn_divide) {
            num_1 = Integer.parseInt(text.getText());
            operation = 4;
            text.setText("/");
        }
        if (q.getSource() == btn_rst)
            text.setText(" ");

        if (q.getSource() == btn_equals) {

            num_2 = Integer.parseInt(text.getText());

            switch (operation) {
                case 1:
                    sum = num_1 + num_2;
                    break;
                case 2:
                    sum = num_1 - num_2;
                    break;
                case 3:
                    sum = num_1 * num_2;
                    break;
                case 4:
                    sum = num_1 / num_2;
                    break;
                default:
                    sum = 0;
            }
            text.setText("" + sum);
        }
    }
}