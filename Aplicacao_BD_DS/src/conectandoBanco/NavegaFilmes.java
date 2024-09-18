package conectandoBanco;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NavegaFilmes extends JFrame{
    private JLabel label1,label2,label3,label4,label5;
    private JTextField tfCodigo, tfTitulo, tfGenero, tfProdutora, tfdatCom;
    private JButton btProximo, btAnterior,btPrimeiro,btUltimo, btMais10,btMenos10,btSai;
    private BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public static void main(String[] args) {
        JFrame frame = new NavegaFilmes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public NavegaFilmes(){
        inicializarComponetes();
        definirEventos();
    }
}
