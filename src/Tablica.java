public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Marcin";
        imiona[1] = "Maciek";
        imiona[2] = "Michał";
//
//        System.out.println(imiona[0]);
//        System.out.println(imiona[1]);
//        System.out.println(imiona[2]);

        int[] lottoNumber = new int[] {1,2,3,4,5,6};
//        System.out.println(lottoNumber[0]);
//        System.out.println(lottoNumber[1]);
//        System.out.println(lottoNumber[2]);
//        System.out.println(lottoNumber[3]);
//        System.out.println(lottoNumber[4]);
//        System.out.println(lottoNumber[5]);
//
//        System.out.println(lottoNumber.length);

        for (int i=0; i<lottoNumber.length; i++){
            System.out.println(lottoNumber[i]);
        }
    }
}
