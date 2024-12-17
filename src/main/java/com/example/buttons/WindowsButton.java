package com.example.buttons;

/**
 * Кнопка для Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created a WindowsButton.");
    }
}
