/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
//den här metoden är för att kunna spara kontakter till filen
    public void saveToFile(ArrayList<Form> list) {
        ObjectOutputStream out = null;
        try {
            //kod från press, glöm inte try catch blocket
            FileOutputStream fileOut;

            fileOut = new FileOutputStream("savedKontaktLista.ser");

            out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.flush();
            out.close();
            fileOut.close();
            
        } catch (IOException ex) {
            System.out.println("FEEEEEEEEEEEEEL");
                }
    }
//den här metoden är för att kunna hämta kontakterna från filen
    public ArrayList<Form> readFromFile() {
        ArrayList<Form> list = null;
        //kod från press, glöm inte try catch blocket
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("savedKontaktLista.ser");

            ObjectInputStream oin;

            oin = new ObjectInputStream(fileIn);

            list = (ArrayList) oin.readObject();
            oin.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("fel");
        }


return list;
  }
}
