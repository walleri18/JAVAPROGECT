package computer;
import javax.swing.*;

/**
 *Документация для класса Компьютер
 * @author Туров Виталий
 */
public class Computer 
{
    //Раздел переменных
    private String name;
    
    private int ram;
    
    private int hdd;
    
    private double weight;
    
    private String admin;
    
    //Раздел главных методов

    /**
     *Стандартный конструктор
     */
    
    public Computer() {
    }
    
    /**
     *Конструктор для класса Computer с одним аргументом
     * @param name
     */
    public Computer(String name)
    {
        
    }
    
    /**
     *Конструктор для класса Computer с двумя аргументами
     * @param name
     * @param ram
     */
    public Computer(String name, int ram)
    {
        this.name = name;
        this.ram = ram;
    }

    /**
     *Конструктор для класса Computer со всеми аргументами
     * @param name
     * @param ram
     * @param hdd
     * @param weight
     * @param admin
     */
    public Computer(String name, int ram, int hdd, double weight, String admin) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.admin = admin;
    }

        public void on()
    {
        print("Я включился. Моё имя: "+name);
    }
    
    /**
     *Метод выключения компьютера
     */
    public void off()
    {
        print("Я выключился");
    }
    
    /**
     *Метод для загрузки компьютера
     */
    public void load()
    {
        print("Я загружаюсь. Объём моего диска "+hdd+"Гб");
    }
    
    private void print(String str)
    {
        JOptionPane.showMessageDialog(null, str);
    }
    //Геттеры и сеттеры

    /**
     * Геттер getWeight
     * @return 
     */
        public double getWeight()
    {
        return weight;
            
    }
    
    /** 
     * @param weight
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public String getAdmin()
    {
        return admin;
    }
    
    public void setAdmin(String newadmin)
    {
        admin = newadmin;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getRam(){
        return ram;
    }
    
    public void setRam(int newRam){
        if (newRam >= 0) {
            ram = newRam;
        } else {
            print("Переданное значение " + newRam + " не может быть отрицательным!");
        }
    }
    
    public void setHdd(int newHdd){
        if (newHdd >= 0) {
            hdd = newHdd;
        } else {
            print("Переданное значение " + newHdd + " не может быть отрицательным!");
        }
    }
}
