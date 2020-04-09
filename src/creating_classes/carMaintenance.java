package creating_classes;

public class carMaintenance {
  private  String carName;
    private  int odometerCurrent;
    private  int odometerNextOilChange;
    private  String airFilterStatus;
    private  String cabinFilterStatus;
    private  String oilFilterStatus;

    public carMaintenance(String carName, int odometerCurrent, int odometerNextOilChange, String airFilterStatus, String cabinFilterStatus, String oilFilterStatus) {
        this.carName = carName;
        this.odometerCurrent = odometerCurrent;
        this.odometerNextOilChange = odometerNextOilChange;
        this.airFilterStatus = airFilterStatus;
        this.cabinFilterStatus = cabinFilterStatus;
        this.oilFilterStatus = oilFilterStatus;
    }

    @Override
    public String toString() {
        return "carMaintenance{" +
                "carName='" + carName + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", odometerNextOilChange=" + odometerNextOilChange +
                ", airFilterStatus=" + airFilterStatus +
                ", cabinFilterStatus=" + cabinFilterStatus +
                ", oilFilterStatus=" + oilFilterStatus +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getOdometerCurrent() {
        return odometerCurrent;
    }

    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getOdometerNextOilChange() {
        return odometerNextOilChange;
    }

    public void setOdometerNextOilChange(int odometerNextOilChange) {
        this.odometerNextOilChange = odometerNextOilChange;
    }

    public String getAirFilterStatus() {
        return airFilterStatus;
    }

    public void setAirFilterStatus(String airFilterStatus) {
        this.airFilterStatus = airFilterStatus;
    }

    public String getCabinFilterStatus() {
        return cabinFilterStatus;
    }

    public void setCabinFilterStatus(String cabinFilterStatus) {
        this.cabinFilterStatus = cabinFilterStatus;
    }

    public String getOilFilterStatus() {
        return oilFilterStatus;
    }

    public void setOilFilterStatus(String oilFilterStatus) {
        this.oilFilterStatus = oilFilterStatus;
    }
    public void doOilChange() {
        if (!this.oilFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent < 5000) {
            this.oilFilterStatus = "new";
        } else {
            System.out.println("You do not need to change oil filter");
        }
        if (!this.airFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent < 5000) {
            this.airFilterStatus = "new";
        } else {
            System.out.println("You do not need to change air filter");
        }
        if (!this.cabinFilterStatus.equalsIgnoreCase("new") && this.odometerNextOilChange - this.odometerCurrent < 5000) {
            this.cabinFilterStatus = "new";
        } else {
            System.out.println("You do not need to change cabin filter");}}
            public void displayFilterStatus(){
                String status = "\t\t\tFILTER STATUS" +
                        "Air Filter   : \t" + this.airFilterStatus + "\n" +
                        "Cabin Filter : \t" + this.cabinFilterStatus + "\n" +
                        "Oil Filter   : \t\t" + this.oilFilterStatus;
                System.out.println(status);



    }}
