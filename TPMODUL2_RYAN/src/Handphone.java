package TPMODUL2_RYAN.src;

public class Handphone extends Perangkat{
    protected boolean fingerprint;
    
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    };
    
    @Override
    public void informasi(){
        if(fingerprint == true){
            System.out.println("Handphone ini memiliki drive bermerk " + drive + " dengan RAM sebesar " + ram + " GB dan processor berkecepatan " + processor + " GHz. Selain itu, handphone ini memiliki fingerprint");
        } else {
            System.out.println("Handphone ini memiliki drive bermerk " + drive + " dengan RAM sebesar " + ram + " GB dan processor berkecepatan " + processor + " GHz. Tetapi, handphone ini TIDAK memiliki fingerprint");
        }
    };

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor " + no_hp);
    };
    
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp);
    };
    
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);
    };
};
