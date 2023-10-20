public class AudioDevice extends Electronics{
    private int volume;
    private boolean bluetooth;

    public AudioDevice(int id, String name, int price, int quantity, int tax, ProductType productType, int powerConsumption, int warranty, int volume, boolean bluetooth) {
        super(id, name, price, quantity, tax, productType, powerConsumption, warranty);
        this.volume = volume;
        this.bluetooth = bluetooth;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Volume: %d db, bluetooth: %s", volume,bluetooth);
    }
}
