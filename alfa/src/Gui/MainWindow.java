package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nick on 06.10.2015.
 */
public class MainWindow {
    private JFrame window; //���� ���������
    private JPanel mainPanel;


    public MainWindow(){
        window = new JFrame("Reminder 0.0.2"); //��������� ����
        window.setBounds(100,100,800,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�������� �� ������� �� �������

        mainPanel = new JPanel(); //������� ������
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //��������� �����
        mainPanel.setLayout(new BorderLayout()); //��������� ����

        Window menu = new LeftMenu();
        Window list = new ToDoList();

        //��������� �������� � ������.
        mainPanel.add(menu.createPanel(), BorderLayout.WEST);
        mainPanel.add(list.createPanel(), BorderLayout.CENTER);

        window.add(mainPanel); //��������� �� � ����

        this.Run();
    }

    public void Run(){
        window.setVisible(true);
    }
}
