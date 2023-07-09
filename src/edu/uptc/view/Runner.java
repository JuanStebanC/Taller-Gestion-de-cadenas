package edu.uptc.view;

import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		
	}
    private static void mainMenu() {
        String menu = "<<<<<<<MENU PRINCIPAL>>>>>>>\n"
        		+ "\n 1. Numero Romano"
                + "\n 2. Factores Primos"
                + "\n 3. Borrar Espacios"
                + "\n 4. Números Ególatras"
                + "\n 5. Número Mágico"
                + "\n 6. Fechas"
                + "\n 7. Salir";

        char option = 0;
        do{
            option = JOptionPane.showInputDialog( menu ).charAt(0);

            switch( option ){
                case '1' :
                	
                	break;
                case '2' :
                	
                	break;
                case '3' :
                	
                	break;
                case '4' :
                	
                	break;
                case '5':
                	
                	break;
                case '6':
                	
                	break;
                case '7':
                	
                	break;
                default:
                	
            }
            
        }while( true );
    }

}
