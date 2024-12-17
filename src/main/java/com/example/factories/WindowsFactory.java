package com.example.factories;

import com.example.buttons.Button;
import com.example.buttons.WindowsButton;
import com.example.checkboxes.Checkbox;
import com.example.checkboxes.WindowsCheckbox;

/**
 * Конкретная фабрика для Windows.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
