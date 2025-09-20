public class Client {
    public static void main(String[] args) {
        BrandASmartDeviceFactory brandAFactory = new BrandASmartDeviceFactory();
        BrandABulbProduct brandABulbProduct = (BrandABulbProduct) brandAFactory.createBulbProduct();
        BrandALockProduct brandALockProduct = (BrandALockProduct) brandAFactory.createLockProduct();


        BrandBSmartDeviceFactory brandBFactory = new BrandBSmartDeviceFactory();
        BrandBLockProduct brandBLockProduct = (BrandBLockProduct) brandBFactory.createLockProduct();
        BrandBBulbProduct brandBBulbProduct = (BrandBBulbProduct) brandBFactory.createBulbProduct();

        System.out.println("`brandABulbProduct`: " + brandABulbProduct.toString());
        System.out.println("`brandBBulbProduct`: " + brandBBulbProduct.toString());
        System.out.println("`brandALockProduct`: " + brandALockProduct.toString());
        System.out.println("`brandBLockProduct`: " + brandBLockProduct.toString());

        System.out.println(brandABulbProduct.getBrandName());
        System.out.println(brandBBulbProduct.getBrandName());
        System.out.println(brandALockProduct.getBrandName());
        System.out.println(brandBLockProduct.getBrandName());
    }
}
