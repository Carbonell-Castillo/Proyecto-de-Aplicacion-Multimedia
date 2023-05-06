/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing.controls;

/**
 *
 * @author bruce
 */
import java.util.Calendar;
import java.util.Locale;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXMonthView;

public class CalendarForm extends javax.swing.JFrame {

    public CalendarForm() {
         initComponents();
        JXMonthView calendar = new JXMonthView();
        calendar.setFirstDisplayedDay(Calendar.getInstance().getTime()); // Establece la fecha actual como fecha inicial
        calendar.setLocale(new Locale("es", "ES")); // Cambia el idioma del calendario
        add(calendar); // Añade el componente al panel
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setPreferredSize(new java.awt.Dimension(300, 300));
    }// </edi
   

    // Variables declaration - do not modify
    
    // End of variables declaration
}
