package com.tecgraf.plugins.client.views;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class SampleView extends JFrame{

    public SampleView() throws HeadlessException {
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p = new JPanel(new MigLayout());

        p.add(new JSeparator(SwingConstants.HORIZONTAL), "");

        p.add(new Label("Company"), "gap para");
        p.add(new TextField(""), "span, growx, wrap");
        p.add(new Label("Contact"), "gap para");
        p.add(new TextField(10), "wrap");

        p.add(new JSeparator(SwingConstants.HORIZONTAL));

        p.add(new Label("PTI/KW"), "gap para");
        p.add(new TextField(10));
        p.add(new Label("Power/KW"), "gap para");
        p.add(new TextField(10), "wrap");
        p.add(new Label("R/mm"), "gap para");
        p.add(new TextField(10));
        p.add(new Label("D/mm"), "gap para");
        p.add(new TextField(10));

        tabbedPane.addTab("Quick Start", p);
        add(tabbedPane);


    }

    public static void main(String[] args) {
        new SampleView().setVisible(true);
    }
}
