package org.example;

public class Main {
    public static void main(String[] args) {
        // untuk testing soal no 1, komen function soal no 2 karena log nya akan tertimpa soal no 2
        System.out.println("Soal No 1");
        cetakPolaAngka(1, 100);
        System.out.println("Soal No 2");
        createPolaHuruf();
    }

    private static void cetakPolaAngka(int mulai, int akhir) {
        StringBuilder pola = new StringBuilder();

        for (int i = mulai; i <= akhir; i++) {
            for(int x = 1; x<= 5; x++){
                if (i > akhir) {
                    break;
                }
                pola.append(i);
                i++;
            }
            if (i >= akhir) {
                break;
            }
                pola.append("*");
            for(int x = 1; x<= 3; x++){
                if (i > akhir) {
                    break;
                }
                pola.append(i);
                i++;
            }
            if (i >= 100) {
                break;
            }
            pola.append("*");
            i--;
        }

        System.out.println(pola);
    }

    private static void createPolaHuruf(){
        String kata = "AAAAAAAAAA000";
        char[] array = kata.toCharArray();
        for (char huruf1 = 'A'; huruf1 <= 'Z'; huruf1++) {
            array[0] = huruf1;
            for (char huruf2 = 'A'; huruf2 <= 'Z'; huruf2++) {
                array[1] = huruf2;
                for (char huruf3 = 'A'; huruf3 <= 'Z'; huruf3++) {
                    array[2] = huruf3;
                    for (char huruf4 = 'A'; huruf4 <= 'Z'; huruf4++) {
                        array[3] = huruf4;
                        for (char huruf5 = 'A'; huruf5 <= 'Z'; huruf5++) {
                            array[4] = huruf5;
                            for (char huruf6 = 'A'; huruf6 <= 'Z'; huruf6++) {
                                array[5] = huruf6;
                                for (char huruf7 = 'A'; huruf7 <= 'Z'; huruf7++) {
                                    array[6] = huruf7;
                                    for (char huruf8 = 'A'; huruf8 <= 'Z'; huruf8++) {
                                        array[7] = huruf8;
                                        for (char huruf9 = 'A'; huruf9 <= 'Z'; huruf9++) {
                                            array[8] = huruf9;
                                            for (char huruf10 = 'A'; huruf10 <= 'Z'; huruf10++) {
                                                array[9] = huruf10;
                                                for (char huruf11 = '0'; huruf11 <= '9'; huruf11++) {
                                                    array[10] = huruf11;
                                                    for (char huruf12 = '0'; huruf12 <= '9'; huruf12++) {
                                                        array[11] = huruf12;
                                                        for (char huruf13 = '0'; huruf13 <= '9'; huruf13++) {
                                                            array[12] = huruf13;
                                                            String kataBaru = new String(array);
                                                            System.out.println(kataBaru);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}