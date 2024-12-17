package com.example;

import com.example.app.Application;
import com.example.factories.GUIFactory;
import com.example.factories.MacOSFactory;
import com.example.factories.WindowsFactory;

/**
 * Демо-класс для запуска примера.
 */
public class Demo {

    public static void main(String[] args) {
        Application app ;
        GUIFactory factory;

        // Выбор фабрики в зависимости от операционной системы
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        // Создание приложения с выбранной фабрикой
        app = new Application(factory);

        // Демонстрация работы приложения
        app.paint();
    }
}
