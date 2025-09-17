public class BrandALockProduct extends AbstractLockProduct {
    @Override
    public String getBrandName() {
        return "Brand A";
    }

    @Override
    public String toString() {
        return "BrandALockProduct{" +
                "batteryConsumption=" + batteryConsumption +
                ", isLocked=" + isLocked +
                '}';
    }
}
