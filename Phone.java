public class Phone {
   String brand;
   String model;
   int batteryPercent;


   void call() {
       System.out.println("Calling...");
   }


   void sendText() {
       System.out.println("Sending text message...");
   }


   void displayInfo() {
       System.out.println();
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Battery: " + batteryPercent + "%");
   }
}
