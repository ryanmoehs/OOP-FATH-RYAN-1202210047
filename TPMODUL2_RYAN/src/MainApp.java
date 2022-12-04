package TPMODUL2_RYAN.src;

public class MainApp{
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata", 2, 2.40f);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 2.40f, true);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("nugashehe@gmail.com");
        laptop.kirimEmail("gegegaming@gmail.com", "nicetry@gmail.com");
        System.out.println();

        Handphone hape = new Handphone("Kingston", 4, 2.40f, false);
        hape.informasi();
        hape.telfon(62123456);
        hape.kirimSMS(621123581);
        hape.kirimSMS(62123, 11234);
        System.out.println();
    };
};