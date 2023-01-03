package com.hohltier.decompiler.window.menu.edit;

import com.hohltier.decompiler.window.utils.Language;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EditCopy extends JMenuItem implements ActionListener {

    public EditCopy() {
        setText(Language.get("edit.copy"));
        setMnemonic(KeyEvent.VK_C);
        setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        addActionListener(this);
        setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

}