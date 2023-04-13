package HW6;
public class total {
     private Integer ozy ;
     private Integer hdd;
     private String os ;
     private String color ;

     public total(Integer ozy, Integer hdd,String os, String color){
        this.ozy=ozy;
        this.hdd=hdd;
        this.os=os;
        this.color = color;

     }
     
     public String toString() {
        return String.format(", ozy: %d ГБ, hdd: %d ГБ, os: %s, color: %s" , ozy, hdd, os, color);
     }
}
