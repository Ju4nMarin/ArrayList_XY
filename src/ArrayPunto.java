/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ArrayPunto {

    public ArrayList LPunto;
    Punto Punto;

    public ArrayPunto() {
        LPunto = new ArrayList();
        Punto = new Punto();
    }

    public int getBuscarMatricula(String id) {
        int i;
        Punto temp = null;
        for (i = 0; i < LPunto.size(); i++) {
            temp = (Punto) LPunto.get(i);
            if (temp.getID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void setAddCarro(
            JTextField X1, JTextField X2, JTextField Y1, JTextField Y2, JTextField X, String ID
    ) {

        int posB = getBuscarMatricula(ID);
        if (posB != -1) {
            JOptionPane.showMessageDialog(null,
                    "La Matricula ya esta registrada. "
                    + "Intente nuevamente!");
        } else {
            Punto info = new Punto(
                    Float.parseFloat(X1.getText()),
                    Float.parseFloat(X2.getText()),
                    Float.parseFloat(Y1.getText()),
                    Float.parseFloat(Y2.getText()),
                    Float.parseFloat(X.getText()),
                    ID
            );
            LPunto.add(info);
            JOptionPane.showMessageDialog(null,
                    "¡Nuevo Carro registrado!");
            X1.setText("");
            X2.setText("");
            Y1.setText("");
            Y2.setText("");
            X1.requestFocus();
        }
    }

    public void setPersona(
            String idEmp
    ) {
        int posB = getBuscarMatricula(idEmp);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "¡El carro a eliminar no esta registrada!");
        } else {
            LPunto.remove(posB);
            JOptionPane.showMessageDialog(null,
                    "Carro eliminado de la posición: " + posB);
        }
    }

    public void setModificarEmpleado(
            float PuntoX1, float PuntoY1, float PuntoX2, float PuntoY2, float PuntoX, String ID
    ) {
        int posB = getBuscarMatricula(ID);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "El Dato no se encuetra");
        } else {
            Punto info = new Punto(
                    PuntoX1, PuntoY1, PuntoX2, PuntoY2, PuntoX, ID
            );
            LPunto.set(posB, info);
            JOptionPane.showMessageDialog(null,
                    "Datos del Carro fue modificado!");
        }
    }

    public void setRegistrarFilaJTable(DefaultTableModel miModelo,
            int Fila, int indiceArray) {

        Punto temp = (Punto) LPunto.get(indiceArray);
        miModelo.setValueAt(temp.getID(), Fila, 5);
        miModelo.setValueAt(temp.getPuntoX1(), Fila, 0);
        miModelo.setValueAt(temp.getPuntoX2(), Fila, 1);
        miModelo.setValueAt(temp.getPuntoY1(), Fila, 2);
        miModelo.setValueAt(temp.getPuntoY2(), Fila, 3);
        miModelo.setValueAt(temp.getPuntoX(), Fila, 4);
        miModelo.setValueAt(temp.getVer_EcuacionDeRecta(), Fila, 6);
    }

    public void setLlenarJTable(JTable tab) {
        int indice = 0;
        int i = 0;
        DefaultTableModel miModelo = new DefaultTableModel();
        miModelo.addColumn("X1");
        miModelo.addColumn("X2");
        miModelo.addColumn("Y1");
        miModelo.addColumn("Y2");
        miModelo.addColumn("X");
        miModelo.addColumn("ID");
        miModelo.addColumn("Ecuación");
        while (indice < LPunto.size()) {
            miModelo.addRow(new Object[]{"", "","", "","", "",""});
            setRegistrarFilaJTable(miModelo, i, indice);
            i++;
            indice++;
        }
        tab.setModel(miModelo);
    }

    void setAddCarro2(float X1, float Y1, float X2, float Y2, float X, String ID) {

        int posB = getBuscarMatricula(ID);
        if (posB != -1) {
            JOptionPane.showMessageDialog(null,
                    "El idEmpleado ya esta registrado. "
                    + "Intente nuevamente!");
        } else {
            Punto info = new Punto(
                    X1,
                    X2,
                    Y1,
                    Y2,
                    X,
                    ID
            );
            LPunto.add(info);
            

        }
    }

    
 

}
