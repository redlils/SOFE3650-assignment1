public class BrandBSmartDeviceFactory implements AbstractSmartDeviceFactory {

    @Override
    public AbstractBulbProduct createBulbProduct() {
        BrandBBulbProduct bulbProduct = new BrandBBulbProduct();
        bulbProduct.isOn = true;
        bulbProduct.powerDraw = 7;
        return bulbProduct;
    }

    @Override
    public AbstractLockProduct createLockProduct() {
        BrandBLockProduct lockProduct = new BrandBLockProduct();
        lockProduct.isLocked = true;
        lockProduct.batteryConsumption = 4;
        return lockProduct;
    }
}
