import java.awt.*;
import javax.swing.*;

class StripeRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value,
                index, isSelected, cellHasFocus);
       
        if(index%2 == 0) {
            label.setBackground(new Color(230,230,255));
        }
        
        label.setVerticalAlignment(SwingConstants.TOP);
        return label;
    }    
}