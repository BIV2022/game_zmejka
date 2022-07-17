import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Zmejka");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,350);
        setLocation(400, 400);
        add(new GameField());
        setVisible(true);
        setBounds(620, 160, 320, 350); //Размер и расположение игрового окна на экране
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
