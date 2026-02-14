public class MainPhone {
   public static void main(String[] args) {
       Phone myPhone1 = new Phone();
       //phone 1
       myPhone1.brand = "Samsung";
       myPhone1.model = "Galaxy S23";
       myPhone1.batteryPercent = 85;


       //phone 2
       Phone myPhone2 = new Phone();
       myPhone2.brand = "Iphone";
       myPhone2.model = "Iphone 17 Pro Max";
       myPhone2.batteryPercent = 100;


       //display information 1
       myPhone1.displayInfo();
       myPhone1.call();
       myPhone1.sendText();


       //display information 2
       myPhone2.displayInfo();
       myPhone2.call();
       myPhone2.sendText();
   }
}
