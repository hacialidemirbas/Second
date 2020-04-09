package Interface;

public class Laptop implements Computers {
    protected String mainBoardSpec;
    protected int memorySize;
    protected int CpuSpeed;
    protected String CpuType;
    protected int batteryPercentage;

    public Laptop(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, int batteryPercentage) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        CpuSpeed = cpuSpeed;
        CpuType = cpuType;
        this.batteryPercentage = batteryPercentage;
    }
    public void setMainboard() {
if (this.mainBoardSpec.contains("Intel")){
    System.out.println("Intel MainBoard is Set");
}
else{
    System.out.println("AMD MainBoard is Set");
}
    }
    public void instalCPU() {
    }

    @Override
    public void instalMemory(int size) {
        System.out.println(size+"  GB Memory istalled");
    }

    @Override
    public void setWireless() {

    }

    public void ChargeBattery(){
        System.out.println("Battery Charging");
        this.batteryPercentage++;
    }
    public void showBatteryPercentage(){
        System.out.println(batteryPercentage);

    }
}
