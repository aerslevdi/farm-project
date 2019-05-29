import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FarmManager farmManager = new FarmManager();
        System.out.println("---------------------");
        System.out.println("MENU");
        System.out.println("---------------------");
        System.out.println("1. Listar animal");
        System.out.println("2. Listar animales");
        System.out.println("3. Agregar animal");
        System.out.println("4. Alimentar animal");
        System.out.println("5. Alimentar animales");
        System.out.println("6. Jugar con el animal");
        System.out.println("7. Jugar con los animales");
        System.out.println("8. Descansar animal");
        System.out.println("9. Descansar animales");
        System.out.println("---------------------");
        System.out.println("* Para salir ingrese: exit");
        System.out.println("* Para limpiar consola ingrese: clean");
        System.out.println("* Para guardar datos ingrese: save");
        System.out.println("* Para cargar datos ingrese: load");
        System.out.println("---------------------");

        System.out.println("Ingrese opcion: ");
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Nombre del animal: ");
                String listAnimal = scanner.nextLine();
                farmManager.listarAnimal(listAnimal);
            case "2":
                farmManager.listarAnimales();
            case "3":
                System.out.println("Nombre del animal: ");
                String addAnimal = scanner.nextLine();
                System.out.println("Tipo de animal");
                String addObj = scanner.nextLine();
                farmManager.agregarAnimal(addAnimal, addObj);
            case "4":
                System.out.println("Nombre del animal: ");
                String feedAnimal = scanner.nextLine();
                farmManager.alimentarAnimal(feedAnimal);
            case "5":
                farmManager.alimentarAnimales();
            case "6":
                System.out.println("Nombre del animal: ");
                String playAnimal = scanner.nextLine();
                farmManager.jugarAnimal(playAnimal);
            case "7":
                farmManager.jugarAnimales();
            case "8":
                System.out.println("Nombre del animal: ");
                String restAnimal = scanner.nextLine();
                farmManager.descansarAnimal(restAnimal);
            case "9":
                farmManager.descansarAnimales();
            case "exit":
                System.exit(0);
            case "clean":
            case "save":
            case "load":

        }


    }
}
