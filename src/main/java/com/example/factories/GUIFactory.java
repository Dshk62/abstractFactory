package com.example.factories;

import com.example.buttons.Button;
import com.example.checkboxes.Checkbox;

/**
 * Абстрактная фабрика для создания кнопок и чекбоксов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
