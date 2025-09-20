public class Client {
    public static void main(String[] args) {
        BrandASmartDeviceFactory brandAFactory = new BrandASmartDeviceFactory();
        BrandABulbProduct brandABulbProduct = (BrandABulbProduct) brandAFactory.createBulbProduct();

        BrandBSmartDeviceFactory brandBFactory = new BrandBSmartDeviceFactory();
        BrandBLockProduct brandBLockProduct = (BrandBLockProduct) brandBFactory.createLockProduct();

        System.out.println("`brandABulbProduct`: " + brandABulbProduct.toString());
        System.out.println("`brandBLockProduct`: " + brandBLockProduct.toString());

        brandABulbProduct.getBrandName();
        brandBLockProduct.getBrandName();
    }
}
