package HW6;

import java.util.Scanner;

public class Laptop {
    
    public Laptop(int ozy, int hdd, String os, String color) {// почему мне это нужно было добавить , чтобы файлы связалсь ?
    }

    public static void main(String[] args) {
        Laptop lenova = new Laptop(8,256,"Windows", "black");
        Laptop asus = new Laptop(16,1024,"Linux","Grey");
        Laptop apple = new Laptop(4,512,"MacOs","White");
        Laptop acer = new Laptop(32,1024,"Windows","Black");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Как вас зовут: ");
        String name = sc.nextLine();
        System.out.print("Здравствуйте "+name+",  сейчас мы поможем подобрать вам ноубук. Скажте какие параметры вас интересуют :" +"\n"+"1- Обьем ОЗУ"+"\n"+"2-Обьем ЖД"+"\n"+"3-Операционная система"+"\n"+"4-Цвет"+"\n");
        Scanner scd = new Scanner(System.in);
        int num =scd.nextInt();
        if( num== 1){
            System.out.printf("Введите обьем ОЗУ: ");
            Scanner sc0 = new Scanner(System.in);
            int ozy = sc0.nextInt();
            if(ozy ==32){
                System.out.printf("Мы вам можем предложить "+acer.toString());
            }else if(ozy ==8 ){
                System.out.printf("Мы вам можем предложить " + lenova.toString());
            }else if(ozy == 16){
                System.out.printf( "Мы вам можем предложить "+ asus.toString());
            }else if(ozy == 4){
                System.out.printf("Мы вам можем предложить "+ apple.toString());
            }else System.out.println("Таких ноутбуков  у нас нет");

        }else if(num == 2){

            System.out.printf("Введите значение SSD: ");
            Scanner sc1 = new Scanner(System.in);
            int hdd = sc1.nextInt();
            if(hdd ==1024){
                System.out.printf("Мы вам можем предложить "+ asus.toString() + "или \n" + acer.toString());
            }else if(hdd == 512){
                System.out.printf("Мы вам можем предложить "+apple.toString());
            }else if(hdd == 256){
                System.out.printf("Мы вам можем предложить "+lenova.toString() );
            }else System.out.println("Таких ноутбуков  у нас нет");

        }else if(num == 3){

            System.out.println("Введите название OS");
            Scanner sc2 = new Scanner(System.in); 
            String os = sc2.nextLine();
            if(os.equals("Windows")){
                System.out.printf("Мы вам можем предложить "+acer.toString() + "или \n" + lenova.toString()  );
            }else if(os.equals("Linux")){
                System.out.printf("Мы вам можем предложить "+asus.toString());
            }else if(os.equals("MacOs")){
                System.out.printf("Мы вам можем предложить "+ apple.toString());
            }else System.out.println("Таких ноутбуков  у нас нет");
            
        }else if(num == 4){
            System.out.println("Напишите цвет ноутбука: ");
            Scanner sc3 = new Scanner(System.in); 
            String os = sc3.nextLine();
            if(os.equals("Black")){
                System.out.printf("Мы вам можем предложить "+acer.toString() + "или \n" + lenova.toString()  );
            }else if(os.equals("White")){
                System.out.printf("Мы вам можем предложить "+apple.toString());
            }else if(os.equals("Grey")){
                System.out.printf("Мы вам можем предложить "+ asus.toString());
            }else System.out.println("Таких ноутбуков  у нас нет");
        }
            
        sc.close();
    }   
   
}
