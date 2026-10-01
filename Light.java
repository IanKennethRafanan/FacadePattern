class Light implements HomeService {
    @Override
    public void TurnOn() {
        System.out.println("Light is switched ON.");
    }
 
    @Override
    public void TurnOff() {
        System.out.println("Light is switched OFF.");
    }
} 