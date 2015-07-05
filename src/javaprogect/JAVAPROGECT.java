package javaprogect;

import computer.Computer;

/**
 *Главный класс программы, точка входа
 * @author Туров Виталий
 */
public class JAVAPROGECT {


    public static void main(String[] args) {
       Computer com1 = new Computer("IBM", 15, 350, 500, "Admin");
       Computer com2 = new Computer();
       /* com.setName("IBM");
       com.setRam(2048);
       com.setHdd(350);*/
       com1.on();
       com1.load();
       com1.off();
    }
    
}
