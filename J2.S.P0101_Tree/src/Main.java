
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Main extends JFrame {

    JFrame frame;
    JTextField txt;
    JTree Tlist;
    JButton btn;

    public Main() {
        frame = new JFrame();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        txt = new JTextField();
        txt.setText("");
        txt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
            }
        });

        Tlist = new JTree();

        btn = new JButton("Select node and remove its from a tree ");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove();
            }
        });

        JPanel p = (JPanel) this.getContentPane();
        p.setLayout(new BorderLayout());
        this.setSize(700, 500);

        p.add(txt, BorderLayout.NORTH);
        p.add(Tlist, BorderLayout.CENTER);
        p.add(btn, BorderLayout.SOUTH);
        this.setVisible(true);

    }
    public void add(){
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) Tlist.getSelectionPath().getLastPathComponent();
        //System.out.println(selectedNode==null);
        //System.out.println("soory");
        if(!txt.getText().isEmpty()){
            DefaultMutableTreeNode newNode= new DefaultMutableTreeNode(txt.getText());
            
            selectedNode.add(newNode);
        }else{
            JOptionPane.showMessageDialog(null, "Input something before adding into list ");
        }
        DefaultTreeModel model=(DefaultTreeModel) Tlist.getModel();
        model.reload();
    }
    
    public void remove(){
        DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) Tlist.getSelectionPath().getLastPathComponent();
        
        DefaultTreeModel model=(DefaultTreeModel) Tlist.getModel();
        
        model.removeNodeFromParent(selectedNode);
        
        model.reload();
        
    }

    public static void main(String[] args) {
        Main obj = new Main();
    }

}
