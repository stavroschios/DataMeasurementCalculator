
public class MegaBytesConverter {

    public static void main(String[] args) {
        printBytesandKilobytes(2500);


    }

    public static void printMegabytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int inMegabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            String result = kiloBytes + "KB" + "= " + inMegabytes + " MB " + "and " + remainingKilobytes + " KB ";
            System.out.println(result);
        }

    }

    public static void printBytesandKilobytes(int bytes) {
        if(bytes < 0) {
            System.out.println("Invalid Value");
        } else  {
            int kilobytes = bytes * 1000;
            int inKiloBytes = kilobytes / (1024 *  1024);
            int remainingBytes = kilobytes % (1024 * 1024);
            String result2 = bytes + "Bytes" + "= " + inKiloBytes + " KB " + "and " + remainingBytes + " Bytes ";
            System.out.println(result2);
        }
    }
}
