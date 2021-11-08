package Actividad4;

public class agendaTelefonica_Main {

    static adminAgenda contactos = new adminAgenda();
    
    public static void main(String[] args) {
        contactos.load();
        contactos.list();
        contactos.create();
        contactos.list();
        contactos.actualizarContactosFile();
        contactos.delete();
        contactos.list();
        contactos.actualizarContactosFile2();
        contactos.createContact();
        contactos.list();
        contactos.actualizarContactosFile3();
        contactos.deletContact();
        contactos.list();
        contactos.actualizarContactosFile4();
    }
    
}
