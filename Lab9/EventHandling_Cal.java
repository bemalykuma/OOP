package Lab9;

import java.awt.event.*;

public class EventHandling_Cal implements ActionListener {
    private CalculatorSample cal;
    private String num = "";
    private double total = 0;
    private String order;
    public EventHandling_Cal(CalculatorSample cal) {
        this.cal = cal;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals((cal).getBn_plus())) {
            if ( !"".equals(num)) {
                int n = Integer.parseInt(num);
                total += n;
            }
            num = "";
            this.cal.getTxt().setText("");
            order = "+";

        }
        else if (ae.getSource().equals((cal).getBn_minus())) {
            if ( "".equals(num) ) {
                num += "-";
                return;
            }
            if ( !"".equals(num)) {
                int n = Integer.parseInt(num);
                
                if ( total == 0 ) {
                    total += n;
                }
                else {
                    total -= n;
                }
            }
            num = "";
            this.cal.getTxt().setText("");
            order = "-";
        }
        else if (ae.getSource().equals((cal).getBn_mul())) {
            if ( !"".equals(num)) {
                int n = Integer.parseInt(num);
                if ( total == 0 ) {
                    total += n;
                }
                else {
                    total *= n;
                }
            }
            num = "";
            this.cal.getTxt().setText("");
            order = "*";
        }
        else if (ae.getSource().equals((cal).getBn_div())) {
            if ( !"".equals(num)) {
                int n = Integer.parseInt(num);
                if ( total == 0 ) {
                    total += n;
                }
                else {
                    total /= n;
                }
            }
            num = "";
            this.cal.getTxt().setText("");
            order = "/";
        }
        else if (ae.getSource().equals((cal).getBn_equal())){
            int n = Integer.parseInt(num);
            if ( "+".equals(order)) {
                total += n;
            }
            else if ( "-".equals(order)) {
                total -= n;
            }
            else if ( "*".equals(order)) {
                total *= n;
            }
            else if ( "/".equals(order)) {
                total /= n;
            }
            this.cal.getTxt().setText(""+total);
            order = "";
            num = "";
        }
        else if (ae.getSource().equals((cal).getBn_clear())){
            this.cal.getTxt().setText("");
            num = "";
            total = 0;
            order = "";
        }
        else {
            this.cal.getTxt().setText(num + ae.getActionCommand());
            num += ae.getActionCommand();
        }
    }

}
