package Application.panels;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Application.services.RemoveProductLogic.removeProductLogic;

public class RemoveProductPanel {

    public static void removeProductPanel() {
        try {
            Scanner sc = new Scanner(System.in);

            int primaryKey;
            int quantity;

            System.out.println("Insert product primary-key: ");
            primaryKey = sc.nextInt();
            System.out.println("Quantity of product to be remove: ");
            quantity = sc.nextInt();
            removeProductLogic(primaryKey, quantity);
        }

        catch (IllegalStateException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (IllegalArgumentException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (NullPointerException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (InputMismatchException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (Exception exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
    }
}
