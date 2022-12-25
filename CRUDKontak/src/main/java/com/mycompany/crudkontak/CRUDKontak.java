/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudkontak;

import com.mycompany.crudkontak.Frame.Frame_Kontak;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class CRUDKontak {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Frame_Kontak form = new Frame_Kontak();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}
