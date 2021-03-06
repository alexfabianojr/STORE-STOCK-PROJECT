package Application.services;

import org.json.JSONObject;

import java.io.*;
import java.text.MessageFormat;
import java.util.InputMismatchException;

import static Application.services.PrimaryKeyNumberByLineNumberCountLogic.primaryKeyNumberByLineNumberCountLogic;


public class RegisterProductLogic {

    public static void registerProductJSONDataBaseWriteLogic(String name, String type, Double weight,
                                                             Double dimension, Double price, int quantity) {
        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("C:\\StockDataBase\\stockdatabase.txt", true));
            JSONObject jsonObject = new JSONObject();
            int primaryKey = primaryKeyNumberByLineNumberCountLogic();

            jsonObject.put("primary-key", primaryKey);
            jsonObject.put("name", name);
            jsonObject.put("type", type);
            jsonObject.put("weight", weight);
            jsonObject.put("dimension", dimension);
            jsonObject.put("price", price);
            jsonObject.put("quantity", quantity);

            bufferedWriter.append(jsonObject.toString() + System.lineSeparator());
            bufferedWriter.close();

            System.out.println(jsonObject.toString());
            System.out.println("Product Registered!");
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
        catch (IOException exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
        catch (Exception exception) {
            System.out.printf(MessageFormat.format("Error: {0}", exception));
        }
    }
}
