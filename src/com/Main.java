package com;



// import java.lang.reflect.Array;
// import java.text.BreakIterator;
// import java.util.Arrays;

// import javax.crypto.ExemptionMechanismException;
// import javax.sql.rowset.spi.SyncFactory;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner inputData = new Scanner(System.in);
//         System.out.println("======> Calculate the area of a rectalage <=======");
//         System.out.println("rumus of rectalage ====> panjang x lebar ");

//         System.out.print("input sequare lenght ==>>");
//         int lenght = inputData.nextInt();
//         System.out.print("input sequare wide ==>>");
//         int wide = inputData.nextInt();
//         int result = lenght * wide;

//         System.out.print("the answear is ===>>> " + result + " <<<====" );

//     }
// }
// // => operator bitseice

//         byte a = 0;
//         String a_byte;
//         a_byte = String.format("%8s ", Integer.toBinaryString(a));
//         String mm = "lalalla";
//         mm.replace("lalalla", "mhew,hew,hew");
//         System.out.println(mm);
//         System.out.printf(" %s = %d ",a_byte,a);

// public class Main {
//     public static void main(String[] args) {
//         //konfersi integer

//         int a = 10;
//         int b = 4;
//         float c = (float)a / b;
//         System.out.printf(" %d : %d = %f\n", a, b, c);

//         if (true) {
//             System.out.println("lalalal");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner inputUser = new Scanner(System.in);

//         System.out.println("masukan nilai tebakan kamu:) : ");
//         System.out.print("Masukan Nilai tebakan kamu ====> ");
//         int nilaiTebakan = inputUser.nextInt();
//         int nilaiConm = 8;
//         boolean hasil = (nilaiTebakan == nilaiConm);
//         System.out.println("hasilnya adalah ===>> " + hasil);

//         System.out.println("Tebak angka diantar 4 sampai 10");

//         System.out.print("Masukan tebakan anfa ====> ");
//         nilaiTebakan = inputUser.nextInt();
//         hasil = (nilaiTebakan > 4) && (nilaiTebakan < 10);
//         System.out.print("jawaban kamu ==> " + hasil);

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int angka = 3;
//         boolean status = true;
//         if (status == true) {

//             if (angka > 6) {
//                 System.out.print("ni percabangan bersarang 2");
//             } else {920146046
//                 System.out.print("ni percabanganbersarang 2 klo false");
//             }
//         } else {
//             System.out.println("ini percabangan 1 klo false");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner inpurUser = new Scanner(System.in);
//         System.out.print("Masukan nilai : ");
//         int angka = inpurUser.nextInt();

//         int hasil = (angka == 10) ? (angka * 2) : (angka / 2);
//         System.out.print("Hasil ====>> " + hasil);

//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int angka = 0;
//         while (angka <= 10) {
//             System.out.println("ini angka yang ke " + angka);
//             angka++;
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int index = 0;
//         do {
//             System.out.println("ini dowhile yg ke => " + index);
//             index++;
//         } while (index <= 10);
//     }
// }

//  + hasil);

// public class Main {

//     public static void main(String[] args) {
//         for (int i = 0; i <= 10; i++){
//             System.out.println("ini perulangan for dengan index ke ==>> " + i);
//         }
//     }
// }
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner inputUser = new Scanner(System.in);
//         System.out.println("ini akan menjumlahkan rentan nilai EXAMPLE  nilai awal 1 nilai akhir 5\n makan (1 + 2 + 3 + 4 + 5)");
//         int nilaiAwal, NilaiAkhir ,total;
//         System.out.print("masukan nilai awal ==>> ");
//         nilaiAwal = inputUser.nextInt();
//         System.out.print("masukan nilai akhir ==>> ");
//         NilaiAkhir = inputUser.nextInt();

//         total = 0;
//         while (nilaiAwal <= NilaiAkhir) {
//             total = total + nilaiAwal;
//             System.out.println(" Hasilnya adalah ==> " + total);
//             nilaiAwal++;
//         }

//     }
// }

// FIBONACI PROGRAM
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // nilai fibonaci
//         int f_n, f_n1, f_n2, n;
//         Scanner inputUser = new Scanner(System.in);
//         System.out.println("Menghitung deret fubonaci\n");
//         System.out.print("masukan nilai fibonaci ke ==>> ");
//         n = inputUser.nextInt();
//         f_n2 = 0;
//         f_n1 = 1;
//         f_n = 1;
//         for (int i = 0; i < n ; i++) {
//             System.out.println("ilai ke  " + i + " adalah " + f_n);
//             f_n = f_n1 + f_n1;
//             f_n2 = f_n1;
//             f_n1 = f_n;
//         }

//     }
// }

// kalkulator java

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {

//         Scanner inputUser = new Scanner(System.in);
//         int angkaPertama, angkaTerakhir;
//         String Operator;

//         System.out.println("=====> INI ADALAH KALKULATOR SEDERHANA DENGAN JAVA <========");
//         System.out.print("masukan angka ------->>>");
//         angkaPertama = inputUser.nextInt();
//         System.out.println("PILIH OIPERATOR ARITMATIKA YANG MAU DIGUNAKAN (X / - + )");
//         System.out.print("masukan Operator yang diinginkan ------>>>> ");
//         Operator = inputUser.next();
//         System.out.print("masukan angaka ------>>>");
//         angkaTerakhir = inputUser.nextInt();

//         int Hasil;

//         if (Operator.equalsIgnoreCase("X") || Operator.equalsIgnoreCase("x")) {
//             Hasil = (angkaPertama * angkaTerakhir);
//             System.out.println("hasil nya adalah  = " + Hasil);
//         }else if( Operator.equalsIgnoreCase("/")){
//             Hasil = (angkaPertama / angkaTerakhir);
//             System.out.println("hasil nya adalah  = " + Hasil);
//         }else if(Operator.equalsIgnoreCase("+")){
//              Hasil = (angkaPertama + angkaTerakhir);
//             System.out.println("hasil nya adalah  = " + Hasil);
//         } else if (Operator.equalsIgnoreCase("-")) {
//              Hasil = (angkaPertama - angkaTerakhir);
//             System.out.println("hasil nya adalah  = " + Hasil);
//         }

//     }
// }

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {

//         for (int i = 0; i < 5; i++) {
//                 System.out.println("+"  + i +"i");

//             for (int j = 0; j < 5; j++) {
//                 System.out.println("+" + j + "j") ;
//             }
//             // System.out.println("\n");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         // menghitung nilai f(x) = (x + 2) * x
//         int x, y;
//         x = 10;
//         y = hitung(x);
//         System.out.println(y);  
//     }

//     static int hitung(int input) {

//         int hasil = (input + 2) * input;
//         return hasil;

//     }

// }

// import java.util.*;

// public class Main{

//     public static void main(String[] args) {

//         Scanner inputUser = new Scanner(System.in);

//         System.out.print("masukan panjang : ");
//         int panjang = inputUser.nextInt();
//         System.out.print("masukan lebar : ");
//         int lebar = inputUser.nextInt();

//         pola(panjang, lebar);
//        hitungLuasDanKeliling(panjang, lebar);

//     }

//     private static void hitungLuasDanKeliling(int panjang, int lebar) {

//         System.out.println("luas nya adalah : " + luas(panjang, lebar));
//         System.out.println("keliling nya adalah : " + keliling(lebar, panjang) );
//     }

//     private static int keliling(int lebar, int panjang) {
//         int hasil = (panjang + lebar) * 2;
//         return hasil;
//     }

//     private static int luas(int panjang, int lebar) {
//         int hasil = (panjang * lebar);
//         return hasil;
//     }

//     private static void pola(int panjang, int lebar) {
//         for (int i = 0; i < lebar; i++) {
//             for (int j = 0; j < panjang; j++) {
//                 System.out.print("#");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// fungsi rekursif
// public class Main {
//     public static void main(String[] args) {
//         int param = 3;
//         rekursif(param);
//         int jumlah = hitungNilai(param);

//         System.out.println("jumlah nya adalah ==>> " + jumlah);
//     }

//     private static int hitungNilai(int param) {
//         if (param == 0) {
//             return param;
//         }
//         int hasil = param + hitungNilai(param - 1);
//         return hasil;
//     }

//     private static void rekursif(int param) {
//         System.out.println("0 <->" + param);
//         if (param == 0) {
//             return;
//        }
//          param--;
//         rekursif(param);

//     }

// }

// rekursif bercabang

// import java.lang.*; 

// public class Main {
//     public static void main(String[] args) {

//         fibonacci(5, "atas");
//     }

//     private static int fibonacci(int n, String daun) {
//         System.out.println("daun => " + daun);
//         System.out.println("fobonacci ke => " + n);

//         if (n == 0 || n == 1) {
//             return 0; 
//         }
//         return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
//     }

// }

// public class Main {

//     public static void main(String[] args) {
//         // blajar method overload
//         angka(10);
//         angka(3.5f);
//         angka(3.6d);
//         System.out.println("========= PEJUMLAHAN TIPE DATA DENGAN OVERLOAD METHOD =======");
//         int hasil = penjumlahan(10, 11);
//         float hasilFloat = penjumlahan(1.6f, 4);
//         double hasilDoublle = penjumlahan(20.6d, 5);
//         System.out.println("hasill penjumlahan dengan tipe data Float : " + hasilFloat);
//         System.out.println("hasill penjumlahan dengan tipe data double : " + hasilDoublle);
//         System.out.println("hasil penjumlahan dengan tipe data integer : " + hasil);

//     }

//     private static int penjumlahan(int angka1,int angka2) {
//         return (angka1 + angka2);
//     }
//     private static float penjumlahan(Float angka1,int angka2) {
//         return (angka1 + angka2);
//     }
//     private static Double penjumlahan(Double angka1,int angka2) {
//         return (angka1 + angka2);
//     }

//     private static void angka(int angka) {
//         System.out.println("ini adalah data dengan tipe integer dengan noilai : " + angka);
//     }
//     private static void angka(Float angka) {
//         System.out.println("ini adalah data dengan tipe float dengan noilai : " + angka);
//     }
//     private static void angka(Double angka) {
//         System.out.println("ini adalah data dengan tipe double dengan noilai : " + angka);
//     }
// }

// ARRAYT DENGAN JAVA'
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] array = { 1, 2, 3, 4, 5, 6, 7, 6 ,7,8,9,1};
//         System.out.println("array dengan loopoing for ");

//         for (int i = 0; i < array.length; i++) {
//             System.out.println("ini adalah array dengan index ke " + i + " dengan angka " + array[i]);
//         }
//         System.out.println("array dengan perulangan foreich");
//         for (int valueArr : array) {
//             System.out.println("array foreich => " + valueArr);
//         }

//     }
// }

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] arrayAngka = { 1, 2, 4, 5, 6, 7, 8, 9 };
//         int[] arrayAngka2 = new int[9];
//         arrayAngka2 = arrayAngka;

//         System.out.println("ini adalah array 1 " + Arrays.toString(arrayAngka));
//         System.out.println("ini adalah array 2 " + Arrays.toString(arrayAngka2));
//     }
// }

// meng copy array
// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] Array1 = { 1, 2, 3, 4, 5 };
//         int[] Array2 = new int[5];

//         System.out.println("meng copy array\n============\n ");
//         System.out.println("\n ini adalah Array1\n " + Arrays.toString(Array1));
//         System.out.println("\n ini adalah Array2\n " + Arrays.toString(Array2));

//         System.out.println("mengcopy dengan looping");

//         for (int i = 0; i < Array1.length; i++) {
//             Array2[i] = Array1[i];
//         }
//         System.out.println(Arrays.toString(Array1));
//         System.out.println(Arrays.toString(Array2));

//         System.out.println("mengcopy dengan copyOf");

//         int[] Array3 = Arrays.copyOf(Array1, 5);
//         System.out.println(Arrays.toString(Array1));
//         System.out.println(Arrays.toString(Array3));

//         System.out.println("mengcopy dengan copyOfRange");
//         int[] Array4 = Arrays.copyOfRange(Array1, 3, 5);//parameter 3 adalah index dariu array nya
//         System.out.println(Arrays.toString(Array1));
//         System.out.println(Arrays.toString(Array4));

//         System.out.println("array dengan fell == mengisi elemen array dengan 1 nilai");
//         int[] Array5 = new int[10];
//         System.out.println("Array5 ===>> " + Arrays.toString(Array5));
//         Arrays.fill(Array5, 5);
//         System.out.println("Array5 ===>> " + Arrays.toString(Array5));

//         // komparasi Array 

//         int[] Array6 = { 1, 2, 3, 4, 5, 6 };
//         int[] Array7 = { 1, 2, 3, 4, 5, 6 };

//         // ini akan masuk ke block else karna Array di cek berdasarkan Addres memory nya
//         System.out.println("\n============\nmenggunakan if(){}");
//         if (Array6 == Array7) {
//             System.out.println("Array6 dan Array7 sama");
//         } else {
//             System.out.println("Array6 dan Array7 beda");
//         }
//         // ini akan mengecek berdasarkan value dan element Array
//         System.out.println("\n============\nmenggunakan Arrays.equals()");
//         if (Arrays.equals(Array6, Array7)) {
//             System.out.println("Array6 dan Array7 itu sama\n");
//         } else {
//             System.out.println("Array6 dan Array7 itu beda");
//         }

//         int[] IntArray1 = {1,2,3,4,5,6};

//         int[] nnn = penjumlahanArray(IntArray1);
//         System.out.println(Arrays.toString(nnn));
//     }

//     private static int[] penjumlahanArray(int[] nilaiInt1) {

//         int[] IntArray2 = Arrays.copyOf(nilaiInt1, 6);
//         for (int i = 0; i < IntArray2.length; i++) {

//         }

//     }
// }

// menjumlahkan 2 Array
// import java.util.Arrays;

// import javax.sound.midi.VoiceStatus;

// public class Main {
//     public static void main(String[] args) {
//         int[] AngkaArray1 = { 1, 2, 3, 4, 5, 6, 7, 87 };
//         int[] AngkaArray2 = { 1, 2, 3, 4, 5, 6, 7, 87 };
//         int[] ArrayAcak = {6,6,4,4,5,6,5,86,89,56,5};
//         print(AngkaArray1, "ArrayAngaka 1 => ");
//         System.out.println("hasil penjumlahan ArrayAngka 1 dan ArrayAngka2\n");

//         System.out.println("AarrayAngka1 => " + Arrays.toString(AngkaArray1));
//         System.out.println("AarrayAngka2 => " + Arrays.toString(AngkaArray2));
//         int[] result = CalculateArr(AngkaArray1, AngkaArray2);
//         System.out.println("caculate Arr1+Arr2 \n" + Arrays.toString(result));
//         System.out.println("membalikan elemen array\n");

//         reverseArray(AngkaArray1);
//         shortArray(ArrayAcak);
//     }
// // sort mengurutkan dari elemen int arany dari yang twrkecil
//     private static void shortArray(int[] Array1) {
//         print(Array1, "Array before short => ");
//         Arrays.sort(Array1);
//         print(Array1, "Array was sorted => " );
//     }
//     // reverse mengurutkan dari elemen int arany dari yang terbesar
//     public static void reverseArray(int[] Array1) {
//         int[] ArrayBuffer = Arrays.copyOf(Array1, Array1.length);
//         print(Array1, "Array before reverse => ");
//         for (int i = 0; i < Array1.length; i++) {
//             Array1[i] = ArrayBuffer[(ArrayBuffer.length - 1) - i];
//         }
//         print(Array1, "Aray was reverse => ");
//     }

//     // menjumlahkan 2 buah Array
//     private static int[] CalculateArr(int[] Array1, int[] Array2) {
//         int[] resultArr = new int[Array1.length];
//         for (int i = 0; i < Array1.length; i++) {
//             resultArr[i] = Array1[i] + Array2[i] ;
//         }
//         return resultArr;
//     }

//     private static void print( int[] ArrayAngka,String message) {
//         System.out.println(message + Arrays.toString(ArrayAngka));

//     }
// }

// array multi deminsi

// public class Main {
//     public static void main(String[] args) {
//         // array 2d
//         int[][] Arr2d = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
//         Array2d(Arr2d);
//     }

//     private static void Array2d(int[][] array) {
//         for (int[] row : array ) {
//             System.out.println(Arrays.toString(row));
//             System.out.println("\n");
//             for (int[] collumb : array) {
//                 System.out.println(Arrays.toString(collumb));
//             }
//         }
//     }
// private static void Array2d(int[][] array) {
//     for (int i = 0; i < array.length; i++) {
//         System.out.println("\n");
//         for (int j = 0; j < array[i].length; j++) {
//             System.out.println(Arrays.deepToString(array));
//         }
//         System.out.println("\n");
//     }
// }
// }

// import java.util.Arrays;
// public class Main {

//     public static void main(String[] args) {

//         int[][] matrix_a = { { 1, 2, 3, 4,5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
//         int[][] matrix_b = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
//         printArrayMultid(matrix_a);
//         printArrayMultid(matrix_b);

//         // System.out.println( Arrays.deepToString(resultArrMultid));
//         printArrayMultid(calculateArrMultid(matrix_a, matrix_b));

//     }

//     private static int[][] calculateArrMultid(int[][] Array1 ,int[][] array2) {
//         int[][] resultArrMultid = new int[Array1.length][Array1[0].length];
//         System.out.println("RESULT  ARRAY/MATRIX OF CALCULATE 2 ARRAY MULTI DIMENCY");
//         if (Array1.length == array2.length && Array1[0].length == array2[0].length) {
//             for (int i = 0; i < Array1.length; i++) {
//                 for (int j = 0; j < Array1[0].length; j++) {
//                     resultArrMultid[i][j] = (Array1[i][j] + array2[i][j]);
//                 }
//             }
//         } else {
//             System.out.println("baris atau collomb tidak sama");
//         }
//         return resultArrMultid;
//     }
//     private static void printArrayMultid(int[][] Array1) {
//         int baris = Array1.length;
//         int collumb = Array1[0].length;
//         for (int i = 0; i < baris; i++) {
//             System.out.print("[");
//             for (int j = 0; j < collumb; j++) {
//                 System.out.print(Array1[i][j]);
//                 if (j < (collumb - 1)) {
//                     System.out.print(",");
//                 } else {
//                     System.out.print("]");
//                 }
//             }
//             System.out.println("\n");
//         }
//         System.out.println("================\n");
//     }
// }

// import java.lang.StringBuilder;

// public class Main {
//     public static void main(String[] args) {
//         StringBuilder datastr = new StringBuilder("jamcomk");

//         print(datastr);
//         datastr.insert(5, " komtolodon");
//         System.out.println(datastr);
//         datastr.delete(6, 13);
//         System.out.println(datastr);

//     }

//     private static void print(StringBuilder dataStrBuilder) {
//         System.out.println("data => " + dataStrBuilder);
//         System.out.println("panjang => " + dataStrBuilder.length());
//         System.out.println("data => " + dataStrBuilder.capacity());
//         int addresbuilder = System.identityHashCode(dataStrBuilder);
//         System.out.println("addres => " + Integer.toHexString(addresbuilder) );
//     }
// }

// format string

// public class Main {
//     public static void main(String[] args) {
//         String name = "alliano";
//         int age = 18;
//         System.out.printf("my name is %s my age is %d\n", name, age);

//         // confersion f=> floating point s=> string d=> integer b=> bolean
//         // struktur format ==>> %[argumrny_index$] [flags] [width] [.precision]confersion

//         // [argument_inmdex$]

//         System.out.println("\n [argument_index$]");

//         System.out.printf("%1$s kamu ganteng kali yak:v nama mu %1$s\n", name);

//         System.out.println("\n[flags]\n");
//         int a = 3;
//         int b = 7;
//         int result = (a * b);
//         System.out.printf(" %d *  %d = %+d\n",a,b,result);
//         System.out.printf(" %d *  %d = %d\n", a, b, result);

//         System.out.println("[width]");
//         int c = 10000;
//         System.out.println("INTEGER");
//         System.out.printf("%d\n",c);
//         System.out.printf("%-5d\n",c); //flags - artinya reta kiri
//         System.out.printf("%+5d\n", c);//flags akan mengambil slot dari string literal
//         System.out.printf("%+-5d\n", c);//flags bida di gabungkan
//         System.out.printf("%10d\n", c);//akan membuat space di depanya
//         System.out.printf("%010d\n", c);//flags akan di tambahkan  leading "0" 
//         int a1 = 1000000000;
//         System.out.printf("%-,15d\n", a1);//menandakan delimiter per seribu
//         System.out.printf("\nFLOATING TO POINT\n");
//         float ac1 = 100.54f;
//         System.out.printf("%10f\n", ac1);//floating point akan mengambil width

//         // exp
//         String nama = "allia";
//         float ipk = 10.55555f;
//         // save format ke dalam setring
//         String info = String.format("\n nama: %s ,ipk %2$+5.2f \n", nama, ipk);
//         System.out.printf(info);
//     }
// }
// import java.lang.ArrayIndexOutOfBoundsException;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner indexArr = new Scanner(System.in);
//         System.out.print("cari index Array ke =>--> ");
//         int indexOf = indexArr.nextInt();
//         int[] intArr = { 1, 2, 3, 4, 5, 6 };

//         // exception biasa
//         System.out.println("\nErrhandling biasa\n");
//         try {
//             int result = intArr[indexOf];
//             System.out.println(result);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception Biasa======\n");
//             System.err.println(Errhandling);
//         }
//         System.out.println("\nErr handling with method\n");
//         ErrhandlingMethodrint(intArr, indexOf);

//         // err handling with throws
//         System.out.println("\nErrhandling with trow\n");
//         try{
//             int[] dataArray = {1,2,3,4,5,6,6,7,8};
//             int result = exceptionThrow(dataArray, indexOf);
//             System.out.println(result);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception THROWS======\n");
//             System.err.println(Errhandling);
//         }
//     }
// import java.lang.ArrayIndexOutOfBoundsException;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner indexArr = new Scanner(System.in);
//         System.out.print("cari index Array ke =>--> ");
//         int indexOf = indexArr.nextInt();
//         int[] intArr = { 1, 2, 3, 4, 5, 6 };

//         // exception biasa
//         System.out.println("\nErrhandling biasa\n");
//         try {
//             int result = intArr[indexOf];
//             System.out.println(result);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception Biasa======\n");
//             System.err.println(Errhandling);
//         }
//         System.out.println("\nErr handling with method\n");
//         ErrhandlingMethodrint(intArr, indexOf);

//         // err handling with throws
//         System.out.println("\nErrhandling with trow\n");
//         try{
//             int[] dataArray = {1,2,3,4,5,6,6,7,8};
//             int result = exceptionThrow(dataArray, indexOf);
//             System.out.println(result);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception THROWS======\n");
//             System.err.println(Errhandling);
//         }
//     }

//     private static int exceptionThrow(int[] array, int indexOf) throws Exception {
//         int result = array[indexOf];
//         return result;
//     }

//     private static void ErrhandlingMethodrint(int[] array,int indexOf) {
//         try {
//             System.out.println(array[indexOf]);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception Method======\n");
//             System.out.println(Errhandling);
//         }

//          }

// }
//     private static int exceptionThrow(int[] array, int indexOf) throws Exception {
//         int result = array[indexOf];
//         return result;
//     }

//     private static void ErrhandlingMethodrint(int[] array,int indexOf) {
//         try {
//             System.out.println(array[indexOf]);
//         } catch (Exception Errhandling) {
//             System.out.println("========= Err Exception Method======\n");
//             System.out.println(Errhandling);
//         }

//          }

// }

// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         FileInputStream fleInput = null;
//         FileOutputStream fileOutput = null;
//         //open the file
//         fleInput = new FileInputStream("data.txt");
//         // read the file
//         int data = fleInput.read();
//         while (data != -1) {
//             System.out.println((char) data);
//             data = fleInput.read();
//         }
//         // close file
//         fleInput.close();

//         // menulis file;
//         try{
//             fleInput = new FileInputStream("data.txt");//membaca file data.txt
//             fileOutput = new FileOutputStream("data2.txt");//memn=buat file baru

//             // proses penulisan file
//             int buffer = fleInput.read();

//             while (buffer != -1) {
//                 fileOutput.write(buffer);
//                 buffer = fleInput.read();
//             }
//         } finally {
//             if (fileOutput != null && fleInput != null) {
//                 fileOutput.close();
//                 fleInput.close();
//             }
//         }

//     }
// }

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.security.DrbgParameters.Reseed;

// public class Main {
//     public static void main(String[] args) throws IOException{
//         long timeStart, timeFinish;
//         FileInputStream fileInput = new FileInputStream("data.txt");
//         // read from the file 
//         System.out.println(fileInput.available());//memnghitung ada berapa banyak kaarankter pada suatu file

//         System.out.println("membaca dengan FILEINPUTSTREAM\n");
//         // calculate time read
//         timeStart = System.nanoTime();
//         System.out.println(fileInput.readAllBytes());
//         timeFinish = System.nanoTime();
//         System.err.println("waktu : " + (timeFinish - timeStart) + "\n");
//         fileInput.close();

//         // read from memory
//         System.out.println("membaca dari MEmory\n");
//         FileInputStream inputfile2 = new FileInputStream("data.txt");
//         BufferedInputStream buffer = new BufferedInputStream(inputfile2);

//         buffer.mark(200);
//         // calculate times of read
//         timeStart = System.nanoTime();
//         System.out.println(buffer.readAllBytes());
//         timeFinish = System.nanoTime();
//         System.out.println("waktu : " + (timeFinish - timeStart));

//         // try reead
//         buffer.reset();
//         byte[] data = buffer.readAllBytes();
//         String dataString = new String(data);
//         System.out.println(dataString);
//     }
// }
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.ByteArrayInputStream;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.Writer;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         // read file
//         FileReader input = new FileReader("data.txt");
//         BufferedReader bufferedReader = new BufferedReader(input);//ini akan berisi data2 dari variable input .vatiable input dapat data dari data.txt membaca dan disimpan di memori sementara
//         bufferedReader.mark(200);

//         // membaca kedalam string
//         String data = bufferedReader.readLine();//ini akan membaca isi buffer per baris
//         System.out.println(data);

//         // MEMBACA KEDALAM CAr
//         bufferedReader.reset();
//         System.out.println(bufferedReader.readLine());
//         System.out.println(bufferedReader.readLine());

//         // menulis file 
//         bufferedReader.reset();
//         FileWriter writer = new FileWriter("output.txt");//ini akan membuat file dengan nama output.txt
//         BufferedWriter BufferWriter = new BufferedWriter(writer);//ini akan membuka objek untuk menulis ke dalam file output.txt

//         String rows = bufferedReader.readLine();//membaca isi buffer perbaris
//         BufferWriter.write(rows, 0, rows.length());//menulis ini buffer ke dalam output.txt
//         BufferWriter.flush();//memulai menulis
//         BufferWriter.newLine();//menambahkan baris baru

//         String rows2 = bufferedReader.readLine();//membaca ulang per baris
//         BufferWriter.write(rows2, 300, rows2.length());//menulis 
//         BufferWriter.flush();//mulai menulis
//     }

// }
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.Scanner;
// import java.util.StringTokenizer;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         FileReader fileInput = new FileReader("data.txt");//membaca file dari data.txt
//         BufferedReader bufferedReader = new BufferedReader(fileInput);//menimpan datta ke dalam memory sebelum di tulis di suatu file 
//         Scanner scanner = new Scanner(bufferedReader);

//         //menecek masih ada kata atau tidakk jika ada ini akan bernilai truee
//         System.out.println(scanner.hasNext());
//         //menampilkan perkata
//         while (scanner.hasNext()) {
//             System.out.println(scanner.next());
//         }
//         System.out.println("\n");
//         System.out.println("==== delimiter ====");

//         // mengunakan delimiter tertentu

//         FileReader inputFile2 = new FileReader("data2.txt");
//         BufferedReader bufferedReader2 = new BufferedReader(inputFile2);//ini akan memngambil data dari fileinput dan akan disimpan di dalam memory buffer
//         bufferedReader2.mark(200);
//         Scanner Scanner2 = new Scanner(bufferedReader2);//scanner akan membaca bufferrider nya
//         Scanner2.useDelimiter(",");
//         while (Scanner2.hasNext()) {
//             System.out.println(Scanner2.next() + " =>  delimiter");
//         }
//          System.out.println("\n");
//          System.out.println("==== mengunakian string tokenizer ====");
        
//         // mengunakan string TokenNizer
//         bufferedReader2.reset();//agar memorinya kosong
//         String data = bufferedReader2.readLine();//ini akan membaca barisnya dan data string nya

//         StringTokenizer stringtokenizer = new StringTokenizer(data, ",");//delimiterr untuk setring
//         while(stringtokenizer.hasMoreTokens()){
//             System.out.println(stringtokenizer.nextToken());
//         }
        
//         System.out.println(stringtokenizer.hasMoreTokens());//ini akan menghasilkan true jika baris masih ada dan akan menghasikan false jika barisna kosong dama seperti fungsi hashNex();
//     }
// }

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;



// project CRUD

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner inputUser = new Scanner(System.in);
        // LIST FITUR
        boolean isNext = true;
        while (isNext) {
            ClearScreeen();
            System.out.println("\n ===== DATABASE IDENTYTY===== \n");
            System.out.println("1.\tList All data");
            System.out.println("2.\tSearch identyty");
            System.out.println("3.\tAdd data identyty");
            System.out.println("4.\tEdit data identyty");
            System.out.println("5.\tDelete data identyty\n");

            System.out.print("Choice ===>>>");
            String inputString = inputUser.next();

            switch (inputString) {
            case "1":
                System.out.println("\tList All data Identyty");

                showDatas();
                break;
            case "2":
                System.out.println("Search data Identyty");
                break;
            case "3":
                System.out.println("Add data Identyty");
                break;
            case "4":
                System.out.println("Edit data Identyty");
                break;
            case "5":
                System.out.println("Delete data Identyty");
                break;

            default:
                System.out.println("==========================================");
                System.out.println("kamu kek komtl masukin input kek ajg ngtd babi pepek:v");
                System.out.println("==========================================");
                break;
            }
            
            System.out.println("\n\n\t==========================================");
            isNext = getYorNo("\tlanjut apa kaga anjg ngentod --->> (Y/N)");
            


            //isNext = introgation.equalsIgnoreCase("y");//ini klo user milih y atay Y ini akan menghasilkan nilai true selain milih y akan false 
            // if (introgation.equals("y") || introgation.equals("Y")) {
            //     isNext = true;
            // } else if (introgation.equals("n") || introgation.equals("N")) {
            //     isNext = false;
            // } else {
            //     System.out.println("===============================================");
            //     System.out.println("pilih yg bner ajg ngemtod babi.. anak hasilkondom bocor:v");
            //     System.out.println("===============================================");
            // }

        }
    }

    private static void showDatas() throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try{
            fileReader = new FileReader("database.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (Exception ERRHANDLING) {
            System.err.println(ERRHANDLING);
            System.err.print("identitas yg ente cari ga ada anjg komtl");
            return;
        }

        String Data = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(Data, ",");
        System.out.println("\t==============================\n");
        System.out.printf("\t+=========================================================================================================+");
        System.out.println("\n\t| NO |\tTahun\t|\tPenulis\t                 |\t   Penerbit\t         |\tJudul buku\t  |");
        System.out.printf("\t+=========================================================================================================+\n");
        int number = 1;
        while (Data != null) {
            stringTokenizer.nextToken();
            System.out.printf("\t|%2d  ", number);
            System.out.printf("|\t%4s    ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s     ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s     ", stringTokenizer.nextToken());
            System.out.printf("|\t%s     ", stringTokenizer.nextToken() + "\t  |\n");

            stringTokenizer = new StringTokenizer(Data, ",");
            Data = bufferedReader.readLine();
            number++;
            System.out.printf("\t+---------------------------------------------------------------------------------------------------------+\n");
        }
    }
    private static Boolean getYorNo(String message) {
        Scanner introgScanner = new Scanner(System.in);
        String userChoice;
        System.out.print(message);
        userChoice = introgScanner.next();

        // klao user memilih selain y/n

        while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
            System.out.println("===============================================");
            System.out.println("pilih yg bner ajg ngemtod babi.. anak hasilkondom bocor:v");
            System.out.println("===============================================");
            introgScanner = new Scanner(System.in);
            System.out.print("Mau ualng algi apa kaga ajg:v (Y/N) -> ");
            userChoice = introgScanner.next();
        }
        return userChoice.equalsIgnoreCase("y");

    }
    
    private static void ClearScreeen() {
        try{
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        } catch (Exception Errhandling) {
            System.err.println("canot clear ClearScreeen " + Errhandling);
        }
    }
}