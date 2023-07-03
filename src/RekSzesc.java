public class RekSzesc {
    public static void main(String[] args) {
        System.out.println(obliczNtaLiczbe(5, 3));
       System.out.println(obliczNtaLiczbeDwa(2, 5));
    }

    public static int obliczNtaLiczbe ( int roznica, int pozycja){
            if (pozycja == 1) {
                return 2;
            }
            return roznica + (obliczNtaLiczbe(roznica, pozycja - 1));
        }

    public static int obliczNtaLiczbeDwa(int mnoznik, int pozycja) {
        if (pozycja == 1) {
            return 3;
        }
        return mnoznik * (obliczNtaLiczbe(mnoznik, pozycja - 1));
    }
}


