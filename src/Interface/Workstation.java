package Interface;

public class Workstation extends Computer implements Computers {
   private String HousingType;
    private int Screensize;
    public Workstation(String HousingType, int Screensize, String[] mainBoardSpec, int memorySize, int cpuSpeed, String cpuType) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType);
        this.HousingType=HousingType;
        this.Screensize=Screensize;
    }
    public String getHousingType() {
        return HousingType;
    }
    public void setHousingType(String housingType) {
        HousingType = housingType;
    }
    public int getScreensize() {
        return Screensize;
    }
    public void setScreensize(int screensize) {
        Screensize = screensize;
    }
    void connectToNetwork(){
            }
    @Override
    public void setMainboard() {
        //super.setMainboard();
        System.out.println("Mainboard CPU Type : "+this.getMainBoardSpec()[0]);
    }
    @Override
    public void instalCPU() {
        super.instalCPU();
    }

    @Override
    public void instalMemory(int size) {
        super.instalMemory(size);
    }

    @Override
    public void setWireless() {
        System.out.println("Wireless setup completed");

    }

    @Override
    public String toString() {
        return "Workstation{" +
                "HousingType='" + HousingType + '\'' +
                ", Screensize=" + Screensize +
                '}';
    }
}
