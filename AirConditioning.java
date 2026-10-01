class AirConditioning implements HomeService {
    @Override
    public void TurnOn() {
        System.out.println("AirCoditiong is turned on.");
    }

    @Override
    public void TurnOff() {
        System.out.println("AirConditioning is turned off.");
    }
}