public class Car {
private String Color;
private int EnginePower;
private boolean Covertible;
private boolean ParkingBrake;
    public Car()
    {
        
    }
    public Car(String colour, int enginePower,boolean convertible, boolean parkingBrake )
    {
        this.Color = colour;
         this.Covertible = convertible;
         this.ParkingBrake = parkingBrake;
         this.EnginePower = enginePower;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
        System.out.println(Color);
    }

    public int getEnginePower() {
        return EnginePower;
        
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
       
    }

    public boolean isCovertible() {
        return Covertible;
    }

    public void setCovertible(boolean Covertible) {
        this.Covertible = Covertible;
        
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    public void  pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton()
    {
        System.out.println("“You have pressed the Accelerator button”");
    }
    public void output()
    {
        System.out.println(getEnginePower());
        System.out.println(getColor());
        System.out.println(isCovertible());
        System.out.println(isParkingBrake());
    }
}