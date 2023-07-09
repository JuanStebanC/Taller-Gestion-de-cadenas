package edu.uptc.view;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		mainMenu();
	}
    

	private static void mainMenu() {
        String menu = "<<<<<<<MENU PRINCIPAL>>>>>>>\n"
        		+ "\n 1. Numero Romano"
                + "\n 2. Factores Primos"
                + "\n 3. Borrar Espacios"
                + "\n 4. Números Ególatras"
                + "\n 5. Número Mágico"
                + "\n 6. Fechas"
                + "\n Para salir presione enter sin ingresar ningun valor.";
        char option = 0;
        do {
            try {
                String input = JOptionPane.showInputDialog(menu);
                if (input == null || input.isEmpty()) {
                    break;
                }
                
                option = input.charAt(0);
                
                switch (option) {
                    case '1':
                        roman();
                        break;
                    case '2':
                        // Realizar acciones para la opción 2
                        break;
                    case '3':
                        // Realizar acciones para la opción 3
                        break;
                    case '4':
                        // Realizar acciones para la opción 4
                        break;
                    case '5':
                        // Realizar acciones para la opción 5
                        break;
                    case '6':
                        // Realizar acciones para la opción 6
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
                }
            } catch (StringIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Intente nuevamente.");
            }
        } while (true);
    }
    
    private static void roman() {

        try {
        	String romanNumber = JOptionPane.showInputDialog("Digite el numero romano que desea convertir");
        	int decimalNumber = convertRomanToDecimal(romanNumber);
        	JOptionPane.showMessageDialog(null, romanNumber + " en decimal es: " + decimalNumber);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
        
    }
   
    public static int convertRomanToDecimal(String romanNumber) {
        romanNumber = romanNumber.toUpperCase(); // Convertir la entrada a mayúscula
        
        int decimalNumber = 0;
        
        for (int i = 0; i < romanNumber.length(); i++) {
            char currentChar = romanNumber.charAt(i);
            
            if (!isValidRomanChar(currentChar)) {
                throw new IllegalArgumentException("Carácter romano inválido: " + currentChar);
            }
            
            int currentValue = getRomanValue(currentChar);
            
            if (i + 1 < romanNumber.length()) {
                char nextChar = romanNumber.charAt(i + 1);
                
                if (!isValidRomanChar(nextChar)) {
                    throw new IllegalArgumentException("Carácter romano inválido: " + nextChar);
                }
                
                int nextValue = getRomanValue(nextChar);
                
                if (currentValue < nextValue) {
                    decimalNumber -= currentValue;
                } else {
                    decimalNumber += currentValue;
                }
            } else {
                decimalNumber += currentValue;
            }
        }
        
        return decimalNumber;
    }
    
    public static boolean isValidRomanChar(char romanChar) {
        return romanChar == 'I' || romanChar == 'V' || romanChar == 'X' ||
               romanChar == 'L' || romanChar == 'C' || romanChar == 'D' || romanChar == 'M';
    }
    
    public static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Carácter romano inválido: " + romanChar);
        }
    }

}
