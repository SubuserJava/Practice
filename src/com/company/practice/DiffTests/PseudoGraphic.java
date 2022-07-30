package com.company.practice.DiffTests;

public class PseudoGraphic {

    public static void main(String[] args) {

        int widthFigure = 10;
        int valueFullEmpty = 0;
        printTriangleFilledAndEmpty(widthFigure, valueFullEmpty);
    }

    private static void printTriangleFilledAndEmpty(int widthFigure, int valueFullEmpty) {

        int arg5 = widthFigure;               // Управляющая переменная уменьшающая каждый шаг значение повторений цикла при печати
        // "наклонной" линии с правого верхнего угла в левый нижний.
        for (int arg1 = 0; arg1 < widthFigure; arg1++) {          // Цикл печати первой строки пробелами.
            System.out.print(" ");
            if (arg1 == widthFigure - 2) {                        // Печать последнего символа * в первой строке.
                System.out.print("*");
            }
        }
        System.out.println("\r");                                  // Возврат каретки после печати первой строки.

        for (int arg2 = 0; arg2 < widthFigure - 2; arg2++) {        // Цикл количеством строк между первой (свой отдельный цикл) и последней (свой отдельный цикл).
            for (int arg3 = 0; arg3 < arg5 - 2; arg3++) {           // Цикл для печати пробелов до "наклонной линии.
                System.out.print(" ");                          // Размер цикла с каждым шагом уменьшается управляясь переменной arg5.
            }                                                   // Таким образом получается наклонная линия
            arg5--;
            System.out.print("*");                              // Печать * в конце строки каждого уменьшающегося цикла. -> наклонная линия.

            if (valueFullEmpty == 0) {
                for (int arg4 = arg2 + 3; arg4 > 3; arg4--) {       // Печать пробела начиная с 3-й строки.
                    System.out.print(" ");                          // Можно подставить '*' для заполнения '*' внутреннее пространство треугольника.
                }
            } else {
                for (int arg4 = arg2 + 3; arg4 > 3; arg4--) {       // Печать пробела начиная с 3-й строки.
                    System.out.print("*");
                }
            }
            System.out.print("*\n");                            // Печать последнего символа '*' в строке
        }
        for (int arg6 = 0; arg6 < widthFigure; arg6++) {       // Печать последней строки символами '*'.
            System.out.print("*");
        }
    }
}

