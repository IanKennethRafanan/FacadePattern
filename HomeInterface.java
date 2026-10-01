class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new Tv();
        this.airConditioning = new AirConditioning();
    }

    public void TurnOnAll() {
        System.out.println("--- Turning On All Services ---");
        light.TurnOn();
        tv.TurnOn();
        airConditioning.TurnOn();
    }

    public void turnOffAll() {
        System.out.println("\n--- Turning Off All Services ---");
        light.TurnOff();
        tv.TurnOff();
        airConditioning.TurnOff();
    }
}