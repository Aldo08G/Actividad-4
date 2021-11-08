package Actividad4;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class adminAgenda {
    
    
    HashMap<String, String> myContact = new HashMap<>();
    String[] arrayContacto;
    
    String inputFilename = "C:\\Users\\aldo0_823vmre\\OneDrive\\Documentos\\NetBeansProjects\\Actividad_4\\src\\main\\java\\Actividad4\\input.csv";
    String outputFilename = "C:\\Users\\aldo0_823vmre\\OneDrive\\Documentos\\NetBeansProjects\\Actividad_4\\src\\main\\java\\Actividad4\\output.csv";
    
    public adminAgenda(){
        
    }
    
    public void load(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilename));
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
            
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                
                arrayContacto = line.split(",");
                myContact.put(arrayContacto[0], arrayContacto[1]);
                
            }
        }
        catch(IOException e){
            System.out.println("IOException catched while reading: " + e.getMessage());
        }
        finally {
            try {
                if (bufferedReader != null){
                    bufferedWriter.close();
                }
            }
            catch(IOException e) {
                    System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }
    }
    
    public void list(){
        System.out.println("\n¡Método List!");
        for (HashMap.Entry<String,String> entry : myContact.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(key + "," + value);
        }
    }
    
    public void create(){
        System.out.println("\n¡Método Create!");
        myContact.put("8121260658", "Cristina");
    }
    
    public void actualizarContactosFile(){
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
            
            String line;
            for (HashMap.Entry<String, String> entry : myContact.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            line = key + "," + value;
            bufferedWriter.write(line + "\n");
        }
    }
    catch (IOException e){
    System.out.println("Exception catched while reading: " + e.getMessage());
}
    finally {
    try {
        if (bufferedWriter != null){
            bufferedWriter.close();
        }
    }
    catch (IOException e){
        System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
    public void delete(){
        System.out.println("\n¡Método Delete!");
        myContact.remove("8123307169", "Monica");
    }
    
    public void actualizarContactosFile2(){
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
            
            String line;
            for (HashMap.Entry<String, String> entry : myContact.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            line = key + "," + value;
            bufferedWriter.write(line + "\n");
        }
    }
    catch (IOException e){
    System.out.println("Exception catched while reading: " + e.getMessage());
}
    finally {
    try {
        if (bufferedWriter != null){
            bufferedWriter.close();
        }
    }
    catch (IOException e){
        System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
    
    public void createContact(){
        System.out.println("\n¡Método create desde la consola!");
        Scanner s = new Scanner (System.in);
        System.out.println("\nDigite el número que desee añadir:");
        String nuevoContacto1 = s.next();
        System.out.println("\nDigite el nombre de su contacto que desee añadir:");
        String nuevoContacto2 = s.next();
        myContact.get(nuevoContacto1);
        myContact.get(nuevoContacto2);
        myContact.put(nuevoContacto1, nuevoContacto2);
}
    
        public void actualizarContactosFile3(){
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
            
            String line;
            for (HashMap.Entry<String, String> entry : myContact.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            line = key + "," + value;
            bufferedWriter.write(line + "\n");
        }
    }
    catch (IOException e){
    System.out.println("Exception catched while reading: " + e.getMessage());
}
    finally {
    try {
        if (bufferedWriter != null){
            bufferedWriter.close();
        }
    }
    catch (IOException e){
        System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
        
        public void deletContact(){
            
        System.out.println("\n¡Método delete desde la consola!");
        Scanner sc = new Scanner (System.in);
        System.out.println("\nDigite el número que desee eliminar:");
        String viejoContacto1 = sc.next();
        System.out.println("\nDigite el nombre de su contacto que desee eliminar:");
        String viejoContacto2 = sc.next();
        myContact.get(viejoContacto1);
        myContact.get(viejoContacto2);
        myContact.remove(viejoContacto1, viejoContacto2);
        }
    
        public void actualizarContactosFile4(){
        BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
            
            String line;
            for (HashMap.Entry<String, String> entry : myContact.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            
            line = key + "," + value;
            bufferedWriter.write(line + "\n");
        }
    }
    catch (IOException e){
    System.out.println("Exception catched while reading: " + e.getMessage());
}
    finally {
    try {
        if (bufferedWriter != null){
            bufferedWriter.close();
        }
    }
    catch (IOException e){
        System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
    }


    
    
    
    

