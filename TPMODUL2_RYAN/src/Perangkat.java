package TPMODUL2_RYAN.src;

public class Perangkat {
    protected String drive;
    protected Integer ram;
    protected Float processor;

    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive bermerk " + drive + " dengan RAM sebesar " + ram + " GB dan processor berkecepatan " + processor + " GHz.");
    }    
}
