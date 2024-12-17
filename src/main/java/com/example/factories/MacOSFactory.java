package com.example.factories;

import com.example.buttons.Button;
import com.example.buttons.MacOSButton;
import com.example.checkboxes.Checkbox;
import com.example.checkboxes.MacOSCheckbox;

/**
 * Конкретная фабрика для MacOS.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
