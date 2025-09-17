public class BrandASmartDeviceFactory implements AbstractSmartDeviceFactory {
    @Override
    public AbstractBulbProduct createBulbProduct() {
        BrandABulbProduct bulbProduct = new BrandABulbProduct();
        bulbProduct.isOn = true;
        bulbProduct.powerDraw = 5;
        return bulbProduct;
    }

    @Override
    public AbstractLockProduct createLockProduct() {
        BrandALockProduct lockProduct = new BrandALockProduct();
        lockProduct.isLocked = false;
        lockProduct.batteryConsumption = 10;
        return lockProduct;
    }
}
