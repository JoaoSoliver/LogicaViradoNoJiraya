package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03MenuIncrementado {
	
	 public class ConsoleColors {
	        // Reset
	        public static final String RESET = "\033[0m";  // Text Reset

	        // Regular Colors
	        public static final String BLACK = "\033[0;30m"; 
	        public static final String RED = "\033[0;31m"; 
	        public static final String GREEN = "\u001B[32m";
	        public static final String YELLOW = "\033[0;33m";
	        public static final String BLUE = "\033[0;34m";
	        public static final String PURPLE = "\033[0;35m";
	        public static final String CYAN = "\033[0;36m";
	        public static final String WHITE = "\033[0;37m";

	        // High Intensity
	        public static final String BLACK_BRIGHT = "\033[0;90m";
	        public static final String RED_BRIGHT = "\033[0;91m";
	        public static final String GREEN_BRIGHT = "\033[0;92m";
	        public static final String YELLOW_BRIGHT = "\033[0;93m";
	        public static final String BLUE_BRIGHT = "\033[0;94m";
	        public static final String PURPLE_BRIGHT = "\033[0;95m";
	        public static final String CYAN_BRIGHT = "\033[0;96m";
	        public static final String WHITE_BRIGHT = "\033[0;97m";
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        float salary = 0, tax = 0, result = 0, balance = 0, deposit = 0;
	        int option = 4;
	        while (option != 0) {
	            System.out.println(ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.RESET);
	            System.out.println(ConsoleColors.CYAN_BRIGHT + "1. Calcular Imposto");
	            System.out.println(ConsoleColors.CYAN_BRIGHT + "2. Depositar salario");
	            System.out.println(ConsoleColors.CYAN_BRIGHT + "0. SAIR");
	            System.out.println(ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.RESET);
	            System.out.printf(ConsoleColors.PURPLE_BRIGHT + "-> ");
	            option = in.nextInt();
	            System.out.println(ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.RESET);
	            if (option == 1) {
	                System.out.println(ConsoleColors.GREEN_BRIGHT + "Qual é o seu salario ?");
	                System.out.printf(ConsoleColors.PURPLE_BRIGHT + "-> ");
	                salary = in.nextFloat();
	                System.out.println(ConsoleColors.GREEN_BRIGHT + "Quanto de imposto quer calcular ?");
	                System.out.printf(ConsoleColors.PURPLE_BRIGHT + "-> ");
	                tax = in.nextFloat();
	                result = (salary * tax) / 100;
	                System.out.println(ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.RESET);
	                System.out.println(result + " De imposto");
	            } else if (option == 2) {
	                System.out.println(ConsoleColors.CYAN_BRIGHT + "Seu saldo atual é: " + balance);
	                System.out.println(ConsoleColors.GREEN_BRIGHT + "\nQuanto voce quer depositar ?");
	                System.out.printf(ConsoleColors.PURPLE_BRIGHT + "-> ");
	                deposit = in.nextFloat();
	                balance = balance + deposit;
	                System.out.println(ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.PURPLE + "=" + ConsoleColors.BLUE + "=" + ConsoleColors.CYAN + "=" + ConsoleColors.GREEN + "=" + ConsoleColors.YELLOW + "=" + ConsoleColors.RED + "=" + ConsoleColors.RESET);
	                System.out.println(ConsoleColors.YELLOW_BRIGHT + "Deposito com sucesso");
	            }
	        }
	        System.out.println(ConsoleColors.RED_BRIGHT + "Finalizado com sucesso");
	    }

}
