class Tv implements HomeService {
    @Override
    public void TurnOn() {
        System.out.println("Tv is switched ON.");
    }

    @Override
    public void TurnOff() {
        System.out.println("Tv is switched OFF.");
    }
}