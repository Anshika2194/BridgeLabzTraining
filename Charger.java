
public class Charger {
    static void plugIn(int voltage) throws Exception {
        if (voltage > 240) {
            throw new Exception("High Voltage Error: Device will burn!");
        }
        System.out.println("Charging safely at " + voltage + "V");
    }

    public static void main(String[] args) {
        try {
            plugIn(120); 
            plugIn(440); 
            
        } catch (Exception e) {
            System.out.println("Safety Switch Engaged: " + e.getMessage());
        }
    }
}