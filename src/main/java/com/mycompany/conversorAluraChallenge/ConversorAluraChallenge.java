/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversorAluraChallenge;

import javax.swing.JOptionPane;

public class ConversorAluraChallenge {

    public static void main(String[] args) {
        // Paso 1: Crear una instancia de la clase DataProvider para acceder a las opciones de menú y monedas.
        // Step 1: Create an instance of the DataProvider class to access menu and currency options.
        DataProvider dataProvider = new DataProvider();
        boolean continueProgram = true;

        while (continueProgram) {
            // Paso 2: Mostrar el menú principal y obtener la opción del usuario.
            // Step 2: Show the main menu and get the user's choice.
            String mainOption = showMainMenu(dataProvider);

            // Salir del programa si el usuario selecciona "Salir"
            // Exit the program if the user selects "Exit"
            if (mainOption.equals("Exit")) {
                showFinalMessage();
                System.exit(0);
            }

            // Paso 3: Obtener el valor de conversión ingresado por el usuario.
            // Step 3: Get the conversion value entered by the user.
            double valueConversion = getValueConversion();

            // Paso 4: Mostrar las opciones de monedas y obtener la selección del usuario.
            // Step 4: Show the currency options and get the user's selection.
            String optionCurrency = showCurrenciesOptions(dataProvider);

            // Salir del programa si el usuario selecciona "Salir"
            // Exit the program if the user selects "Exit"
            if (optionCurrency.equals("Exit")) {
                showFinalMessage();
                System.exit(0);
            }

            // Paso 5: Realizar la conversión basada en las opciones seleccionadas por el usuario.
            // Step 5: Perform the conversion based on the selected options by the user.
            double result = performConversion(mainOption, optionCurrency, valueConversion);

            // Paso 6: Mostrar el resultado de la conversión al usuario.
            // Step 6: Show the result of the conversion to the user.
            showResult(result);

            // Paso 7: Preguntar al usuario si desea continuar usando el programa.
            // Step 7: Ask the user if they want to continue using the program.
            if (!askToContinue()) {
                showFinalMessage();
                break;
            }
        }
    }

    // Paso 8: Mostrar el menú principal y obtener la opción del usuario.
    // Step 8: Show the main menu and get the user's choice.
    public static String showMainMenu(DataProvider dataProvider) {
        return JOptionPane.showInputDialog(null, "Choose an option:", "Main Menu",
                JOptionPane.PLAIN_MESSAGE, null, dataProvider.getMainOptions(), dataProvider.getMainOptions()[0]).toString();
    }

    // Paso 9: Obtener el valor de conversión ingresado por el usuario.
    // Step 9: Get the conversion value entered by the user.
    public static double getValueConversion() {
        double conversionValue = 0;
        boolean validValue = false;

        while (!validValue) {
            try {
                // Paso 10: Mostrar un cuadro de diálogo para ingresar el valor a convertir.
                // Step 10: Show a dialog to enter the value to convert.
                String input = JOptionPane.showInputDialog(null, "Enter the value to convert:",
                        "Dialog - Value Input", JOptionPane.PLAIN_MESSAGE);

                // Paso 11: Salir del programa si el usuario cancela.
                // Step 11: Exit the program if the user cancels.
                if (input == null) {
                    showFinalMessage();
                    System.exit(0);
                }

                // Paso 12: Convertir la cadena ingresada a un valor double.
                // Step 12: Convert the entered string to a double value.
                conversionValue = Double.parseDouble(input);
                validValue = true;
            } catch (NumberFormatException e) {
                // Paso 13: Mostrar un mensaje de error si el usuario ingresa un valor no válido.
                // Step 13: Show an error message if the user enters an invalid value.
                JOptionPane.showMessageDialog(null, "Error! Please enter a valid numeric value.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return conversionValue;
    }

    // Paso 14: Mostrar las opciones de monedas y obtener la selección del usuario.
    // Step 14: Show the currency options and get the user's selection.
    public static String showCurrenciesOptions(DataProvider dataProvider) {
        return JOptionPane.showInputDialog(null, "Choose the currency for conversion:",
                "Currency Options", JOptionPane.PLAIN_MESSAGE, null, dataProvider.getCoinsOptions(), dataProvider.getCoinsOptions()[0]).toString();
    }

    // Step 15: Perform the conversion based on the selected options by the user.
    public static double performConversion(String mainOption, String currencyOption, double conversionValue) {
        /* Paso 16: Agregar aquí la lógica para realizar la conversión según las opciones seleccionadas.
        Por simplicidad, este código devuelve el mismo valor ingresado sin hacer ninguna conversión real.
        Step 16: Add your conversion logic based on the selected options here.
        For simplicity, this code simply returns the same value without performing any real conversion.
         */
        return conversionValue;
    }

    // Paso 17: Mostrar el resultado de la conversión al usuario.
    // Step 17: Show the result of the conversion to the user.
    public static void showResult(double result) {
        JOptionPane.showMessageDialog(null, "The result of the conversion is: " + result,
                "Dialog - Conversion Value", JOptionPane.INFORMATION_MESSAGE);
    }

    // Paso 18: Preguntar al usuario si desea continuar usando el programa.
    // Step 18: Ask the user if they want to continue using the program.
    public static boolean askToContinue() {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
                "Dialog - Continue?", JOptionPane.YES_NO_OPTION);

        return option == JOptionPane.YES_OPTION;
    }

    // Paso 19: Mostrar mensaje final al usuario.
    // Step 19: Show the final message to the user.
    public static void showFinalMessage() {
        JOptionPane.showMessageDialog(null, "Program Terminated", "Dialog - Exit Program",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
