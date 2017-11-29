import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AC130 on 2016/12/04.
 */
public class MainForm extends JFrame{
    private JCheckBox check_poke;
    private JButton button_kill;
    private JCheckBox check_power;
    private JCheckBox check_friend;
    private JLabel number;
    private JPanel panel1;
    private JButton button_reset;


    public MainForm() {
        setTitle("努力値計算");
        number.setText("0");
        button_kill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int add = check();
                int num = Integer.parseInt(number.getText());
                up(num, add);

            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setVisible(true);


        button_reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                number.setText("0");
            }
        });
    }

    public int check(){
        int add = 1;
        if(check_power.isSelected())
            add = add + 8;

        if (check_poke.isSelected())
            add = add*2;

        if (check_friend.isSelected())
            add = add*2;

        return add;
    }

    public void up(int num,int add){
        number.setText(String.valueOf(num+add));
    }


}

