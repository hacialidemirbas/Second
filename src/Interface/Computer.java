package Interface;

public class Computer implements Computers {
    private String mainBoardSpec[];
    private int memorySize;
    private int CpuSpeed;
    private String CpuType;

    public Computer(String[] mainBoardSpec, int memorySize, int cpuSpeed, String cpuType) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        CpuSpeed = cpuSpeed;
        CpuType = cpuType;
    }

    public String[] getMainBoardSpec() {
        return mainBoardSpec;
    }

    public void setMainBoardSpec(String[] mainBoardSpec) {
        this.mainBoardSpec = mainBoardSpec;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getCpuSpeed() {
        return CpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        CpuSpeed = cpuSpeed;
    }

    public String getCpuType() {
        return CpuType;
    }

    public void setCpuType(String cpuType) {
        CpuType = cpuType;
    }

    @Override
    public void setMainboard() {

    }

    @Override
    public void instalCPU() {

    }

    @Override
    public void instalMemory(int size) {

    }

    @Override
    public void setWireless() {

    }

    public void turnOn(){
        System.out.println("Computer turned on");
    }
    public void turnOff(){
        System.out.println("Computer is turning off");
    }
    public void boot(){
        System.out.println("Computer is booting");
    }
}
