import java.io.*;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;*/


public class Main {
    public static void main(String[] args) throws Exception {
        
        String filePathForWindows = "C:\\Users\\HUAWEI\\Desktop\\Groceries.txt";
        String fileToWrite = "C:\\Users\\HUAWEI\\Desktop\\GroceriesFormatted.txt";

        String [] array = new String[4];
        String id;
        String itemName;
        String quantity;
        double price;
        //String temp = "";
        String separator = ",";
        double total = 0;

        FileReader fileReader = new FileReader(filePathForWindows);
        FileWriter fileWriter = new FileWriter(fileToWrite);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        System.out.println("\n"+"********************************************");
        System.out.println("\n"+"ID# Item Quantity Price(€)");


        String line;

        while((line = reader.readLine()) !=null){

            array = line.split(separator);

            price = Double.parseDouble(array[3]);

            total += price;

            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        System.out.println("\n"+"********************************************");
        writer .write("********************************************");
        System.out.println("Total price of groceries: " + Math.round(total));
        writer .write("\n"+"Total price of groceries: " + Math.round(total));
        System.out.println("********************************************");
        writer .write("********************************************");

        reader.close();

        writer.flush();
        writer.close();
        }
}
