/*Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        4. Если введено exit, то программа завершается
 */
package Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class z1{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String a = scanner.next();
            if ("exit".equals(a)) {
            System.out.println("Программа завершена.");
                break;
            }
            if ("revert".equals(a)) {
                if (!ll.isEmpty()){
                    ll.remove(0);
                } else {
                   System.out.println("Нечего удалять!");
                }
                continue;
            }
            if ("print".equals(a)){
                System.out.println(ll);
            } else {
                ll.addFirst(a);
            }
        }
    }
}
