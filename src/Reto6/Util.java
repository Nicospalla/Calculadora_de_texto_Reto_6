package Reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
        - Enunciado: El objetivo es crear una calculadora de texto. Le podrás dar instrucciones del siguiente estilo:
        - suma dos y dos
        - multiplica tres y cuatro
        - resta seis y tres
        - divide seis y dos (la división siempre dará un resultado entero)
        El resultado será también en texto. Los números que recibirá irán del cero al nueve.
        - Ampliación: Añade una operación extra después de la primera operación. Ejemplo:
        - suma dos y dos y multiplícalo por seis
        - multiplica tres y cuatro y súmale dos
        - Consideraciones: si no se reconoce un número o una operación, se debe lanzar una
           excepción (una diferente en cada caso).
*/
public class Util {
    static int a;
    static int b;
    static int c;
    static int resultado;
    static List<String> listPartOne = new ArrayList<>();
    static List<String> listPartTwo = new ArrayList<>();


    public static void divisorStr(String ingreso) {
        ingreso = ingreso.toLowerCase(Locale.ROOT);
        String[] ingresoSplit = ingreso.split(" ");
        ArrayList<String> ingresoSplitList = new ArrayList<>(List.of(ingresoSplit));
        ingresoSplitList.remove("por");
        ingresoSplitList.remove("y");
        ingresoSplitList.remove("y");
        try {
            a = Listas.searchInt(ingresoSplitList.get(1));
            b = Listas.searchInt(ingresoSplitList.get(2));
            c = Listas.searchInt(ingresoSplitList.get(4));
        }catch (NumberFormatException e){
            throw new NumberFormatException("Error en el formato ingresado.");
        }

        if (ingresoSplitList.size() == 3) {
            resultado = operType(ingresoSplitList);
            Listas.imprimeResultado(resultado);
        } else if (ingresoSplitList.size() == 5) {
            listPartOne = ingresoSplitList.subList(0, 3);
            a = operType(listPartOne);
            b = c;
            listPartTwo = ingresoSplitList.subList(3, 5);
            resultado = operType(listPartTwo);
            Listas.imprimeResultado(resultado);
        } else {
            throw new NumberFormatException("Se ha producido un error en el ingreso de la cadena de texto");
        }
    }
    public static int operType(List<String> list) {
        if (list.contains("suma") || list.contains("sumalo")) {
            resultado = a + b;
        }
        if (list.contains("resta") || list.contains("restalo")) {
            resultado = a - b;
        }
        if(list.contains("multiplica") || list.contains("multiplicalo") ) {
            resultado = a * b;
        }
        if(list.contains("divide") || list.contains("dividelo") )
            resultado = a / b;

    return resultado;
    }
}