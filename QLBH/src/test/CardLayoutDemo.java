package test;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CardLayoutDemo extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    public CardLayoutDemo() {
        setTitle("CardLayout Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JPanel để hiển thị các trang
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Thêm các trang con của JPanel
        JPanel page1 = new JPanel();
        page1.add(new JLabel("Đây là trang 1"));

        JPanel page2 = new JPanel();
        page2.add(new JLabel("Đây là trang 2"));

        cardPanel.add(page1, "page1");
        cardPanel.add(page2, "page2");

        // Tạo nút để chuyển đổi trang
        JButton nextPageButton = new JButton("Trang tiếp theo");
        nextPageButton.addActionListener(e -> cardLayout.show(cardPanel, "page2"));

        // Thêm các thành phần vào JFrame
        getContentPane().add(cardPanel);
        getContentPane().add(nextPageButton, "South");

        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
