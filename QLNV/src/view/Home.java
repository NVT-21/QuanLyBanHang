package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.UserSession;
import view.QuanLyNhanVien;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setTextUser();
        
        setTitle("Quản Lý Của Hàng");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (UserSession.getChucVu()==null||UserSession.getChucVu().equals("Quản Lý"))
        		{
        			dispose();
                    QuanLyNhanVien qlnv=new QuanLyNhanVien();
                    qlnv.setVisible(true);
        		}
        		else {
        			JOptionPane.showMessageDialog(Home.this, "Bạn không có quyền truy cập vào chức năng này ");
        		}
        		
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 dispose();
                 CapNhapDonHang cndh=new CapNhapDonHang();
                 cndh.setVisible(true);
        	}
        });
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (UserSession.getChucVu()==null||UserSession.getChucVu().equals("Quản Lý"))
        		{
        			dispose();
        			QuanLySanPham qlsp=new QuanLySanPham();
            		qlsp.setVisible(true);
        		}
        		else {
        			JOptionPane.showMessageDialog(Home.this, "Bạn không có quyền truy cập vào chức năng này ");
        		}
        		
        		
        		
        	};
        	
        });
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (UserSession.getChucVu()==null||UserSession.getChucVu().equals("Quản Lý"))
        		{
        			dispose();
            		ThongKe tk=new ThongKe();
            		tk.setVisible(true);
        		}
        		else {
        			JOptionPane.showMessageDialog(Home.this, "Bạn không có quyền truy cập vào chức năng này ");
        		}
        		

        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Quản Lý Cửa Hàng");

        jButton1.setText("Quản lý Nhân Viên");

        jButton2.setText("Cập Nhập Đơn Hàng");

        jButton3.setText("Cập Nhập Sản Phẩm");

        jButton4.setText("Thống Kê Doanh Thu");
        
        txtUser = new JLabel();
        txtUser.setFont(new Font("Segoe UI", Font.BOLD, 22));
        
        txtCV = new JLabel();
        txtCV.setFont(new Font("Segoe UI", Font.BOLD, 22));
        
        btnngXut = new JButton();
        btnngXut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Login login=new Login();
        		login.setVisible(true);
        		dispose();
        	}
        });
        btnngXut.setText("Đăng Xuất ");
        
        JButton btnngKTi = new JButton();
        btnngKTi.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (UserSession.getChucVu()==null||UserSession.getChucVu().equals("Quản Lý"))
        		{
        			dispose();
                    userNV user=new userNV();
                    user.setVisible(true);
        		}
        		else {
        			JOptionPane.showMessageDialog(Home.this, "Bạn không có quyền truy cập vào chức năng này ");
        		}
        	}
        });
        btnngKTi.setText("Đăng Ký Tài Khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton1)
        							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
        							.addComponent(jButton2)
        							.addGap(42)
        							.addComponent(jButton3)))
        					.addGap(38))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtCV, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE))
        					.addGap(144)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnngXut)
        				.addComponent(jButton4))
        			.addGap(43))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(267)
        			.addComponent(btnngKTi, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(24)
        					.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
        					.addComponent(txtCV, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnngXut, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1)
        			.addGap(38)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
        			.addGap(35)
        			.addComponent(btnngKTi, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        			.addGap(25))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private JLabel txtUser;
    private JLabel txtCV;
    private JButton btnngXut;
    // End of variables declaration 
    // dung de lay tt User
    public void setTextUser() {
    	
    String nameUser=UserSession.getTen();
    System.out.println(nameUser);
    txtUser.setText("NhânViên:"+ nameUser);
    txtCV.setText("Chức Vụ:"+UserSession.getChucVu());
    }
}
