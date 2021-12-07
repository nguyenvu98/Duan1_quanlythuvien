/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.ui;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String args[]) {

        JFrame frame = new JFrame();
        frame.setSize(450, 250);

        JTable table = new JTable(5, 5);

        TableColumn testColumn = table.getColumnModel().getColumn(0);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("This");
        comboBox.addItem("is");
        comboBox.addItem("a");
        comboBox.addItem("Sample program");
        testColumn.setCellEditor(new DefaultCellEditor(comboBox));

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
