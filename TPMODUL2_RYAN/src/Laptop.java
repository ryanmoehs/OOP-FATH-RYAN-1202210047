package TPMODUL2_RYAN.src;

public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, Integer ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    };

    @Override
    public void informasi(){
        if(webcam == true){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan RAM sebesar " + ram + " GB dan processor berkecepatan " + processor + " GHz. Selain itu, laptop ini juga memiliki webcam" );
        } else {
            System.out.println("Laptop ini memiliki drive tipe" + drive +  " dengan RAM sebesar " + ram + " GB dan processor berkecepatan " + processor + " GHz. Tetapi, laptop ini tidak memiliki webcam" );
        }
    };
    
    public void bukaGame(String nama_game){
        System.out.println("Laptop ini berhasil membuka game " + nama_game);
    };

    public void kirimEmail(String email){
        System.out.println("Laptop ini berhasil mengirim Email ke " + email);
    };

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop ini berhasil mengirim Email ke "+ email1 + " dan ke " + email2);
    };
};
