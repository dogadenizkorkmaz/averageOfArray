 public class Main {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};  //numbers adında bir int dizisi oluşturulur
            double harmOrt = hesaplaHarmOrt(numbers); //hesaplaHarmOrt çağırılır ve harmOrt'a atanır
            System.out.println("Dizinin Harmonik Ortalaması: " + harmOrt); // harmonik ortalama yazdır
        }
        public static double hesaplaHarmOrt ( int[] numbers) {
            double top = 0; //
            for (int numara : numbers ) { //foreach döngüsü numbers={1,2,3,4,5} değerleri numara değişkeni olarak kullan
                top += 1.0 / numara;
            }
            return  numbers.length / top;
        }
    }


