package Reto6;

import java.util.HashMap;

public class Listas {
    public static HashMap<String, Integer> map = new HashMap<>();
    public static HashMap<Integer, String> reversed = new HashMap<>();

    public static int searchInt (String keyString){
        map.put("uno",1);
        map.put("dos",2);
        map.put("tres",3);
        map.put("cuatro",4);
        map.put("cinco",5);
        map.put("seis",6);
        map.put("siete",7);
        map.put("ocho",8);
        map.put("nueve",9);
        map.put("diez",10);
        map.put("once",11);
        map.put("doce",12);
        map.put("trece",13);
        map.put("catorce",14);
        map.put("quince",15);
        map.put("dieciséis",16);
        map.put("diecisiete",17);
        map.put("dieciocho",18);
        map.put("diecinueve",19);
        map.put("veinte",20);
        map.put("veintiuno",21);
        map.put("veintidós",22);
        map.put("veintitrés",23);
        map.put("veinticuatro",24);
        map.put("veinticinco",25);
        map.put("veintiséis",26);
        map.put("veintisiete",27);
        map.put("veintiocho",28);
        map.put("veintinueve",29);
        map.put("treinta",30);
        map.put("cuarenta",40);
        map.put("cincuenta",50);
        map.put("sesenta",60);
        map.put("setenta",70);
        map.put("ochenta",80);
        map.put("noventa",90);
        map.put("ciento",100);
        try {
            return map.get(keyString);
        }catch (Exception e) {
            throw new NumberFormatException("Error en el ingreso de los números, recordá que deben ser en formato Texto.");
        }
    }
    public static void imprimeResultado(int completo) {
        if (completo < 30) {
            System.out.println(searchValueString(completo));
        } else if (completo == 100) {
            System.out.println("Cien");
        } else if (completo % 10 == 0) {
            System.out.println(searchValueString(completo));
        } else if (completo < 100) {
            double count = (double) completo / 10;
            int countResult1 = (int) count * 10;
            int countResult2 = completo % 10;
            System.out.println(searchValueString(countResult1) + " y " + searchValueString(countResult2));
        } else if (completo < 200) {
            completo -= 100;
            double count = (double) completo / 10;
            int countResult1 = (int) count * 10;
            int countResult2 = completo % 10;
            System.out.println("ciento "+searchValueString(countResult1) + " y " + searchValueString(countResult2));
        }
    }

    public static String searchValueString(int a){
        for(String s : map.keySet()){
            reversed.put(map.get(s), s);
        }
        return reversed.get(a);
    }
}