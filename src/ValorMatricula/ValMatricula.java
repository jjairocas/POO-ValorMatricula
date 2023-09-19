package ValorMatricula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValMatricula extends JFrame{
    private JTextField txtNumInscripcion;
    private JTextField txtNombres;
    private JTextField txtPatrimonio;
    private JTextField txtEstratoSocial;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnSALIR;
    private JPanel MainPanel;
    private JLabel lbPagMatricula2;
    private JLabel lbPagMatricula1;
    private JLabel lbPagMatricula3;
    private JLabel lbPagMatricula4;

    public ValMatricula() {
        setContentPane(MainPanel);
        setTitle("Valor Matricula");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int NumInscripcion = 0,Patrimonio = 0,EstratoSocial = 0,PagoMatricula;
                String Nombres;

                try {
                    NumInscripcion=Integer.parseInt(txtNumInscripcion.getText());
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS EN EL NUMERO DE INSCRIPCION",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                Nombres=txtNombres.getText();
                try {
                    Patrimonio=Integer.parseInt(txtPatrimonio.getText());
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS EN EL PATRIMONIO",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }

                try {
                    EstratoSocial=Integer.parseInt((txtEstratoSocial.getText()));
                }
                catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR SOLO NUMEROS EN EL ESTRATO SOCIAL",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                if((NumInscripcion == 0) || (Patrimonio == 0) ||(EstratoSocial == 0)){
                    txtNumInscripcion.setText("");
                    txtNombres.setText("");
                    txtPatrimonio.setText("");
                    txtEstratoSocial.setText("");
                    lbPagMatricula1.setText("");
                    lbPagMatricula2.setText("");
                    lbPagMatricula3.setText("");

                }
                else {


                    CalculoMatricula Estud = new CalculoMatricula(Nombres, NumInscripcion, Patrimonio, EstratoSocial);
                    PagoMatricula = Estud.CalcMatricula();

                    lbPagMatricula1.setText("El estudiante con inscripcion No: " + Estud.NumInscripcion);
                    lbPagMatricula2.setText("Y nombre: " + Estud.Nombres);
                    lbPagMatricula3.setText("Debe pagar: $" + String.valueOf(PagoMatricula));

                    JOptionPane.showMessageDialog(null,
                            "El estudiante con inscripcion No: " + Estud.NumInscripcion + " y nombre: " + Estud.Nombres + " Debe pagar: $" + PagoMatricula,
                            "Pago Matricula",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumInscripcion.setText("");
                txtNombres.setText("");
                txtPatrimonio.setText("");
                txtEstratoSocial.setText("");
                lbPagMatricula1.setText("");
                lbPagMatricula2.setText("");
                lbPagMatricula3.setText("");

            }
        });
        btnSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

}



