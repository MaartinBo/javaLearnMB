public class LoopsCheck {
// 87 lekcja odwracanie tablicy

    // wypisz liczby z zakresu 1-100 podzielne przez 3
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Jestem podzielna przez 3 :" + i);
//            }
//        }
        // odwrocic elementy tablicy [1.3.5,7 ,0] > [0,7,5.3.1]
        int[] lottoNumber = new int[]{1, 3, 5, 7, 0};

        for (int i = 0; i < (lottoNumber.length/2); i++) {
            int temp = lottoNumber[i]; // dla i=0 1 i=1 3
            lottoNumber[i] = lottoNumber[lottoNumber.length-1-i];; //4 ->0 3=>7
            lottoNumber[lottoNumber.length-1-i] = temp; // 1 // numbers[3] =3
        }
        for (int i=0; i < lottoNumber.length; i++){
            System.out.println(lottoNumber[i]);
        }
    }
}
