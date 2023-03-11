
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */
import java.util.*;

public class Program {
    public static void main(String[] args) {

        HashSet<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Asus", "silver", "8", "500"));
        notebooks.add(new NoteBook("MacBook", "silver", "8", "250"));
        notebooks.add(new NoteBook("Huawei", "silver", "8", "500"));
        notebooks.add(new NoteBook("HP", "black", "8", "500"));
        notebooks.add(new NoteBook("Huawei", "silver", "8", "250"));
        notebooks.add(new NoteBook("Huawei", "silver", "16", "250"));

        // Пример коллекции с критериями фильтра
        HashMap<String, String> filter = new HashMap<>();
        filter.put("ram", "8");
        filter.put("hdd", "250");
        filter.put("model", "Huawei");
        filter.put("color", "silver");

        HashSet<NoteBook> filtered = new HashSet<NoteBook>();
        HashMap<String, String> filer = AskForCriteria();
        for (NoteBook notebook : notebooks) {
            
            if (CheckCriterias(notebook, filter))
                filtered.add(notebook);
        }

        System.out.println(filtered);

        // for (Map.Entry<String, String> set : filter.entrySet()) {

        // // Printing all elements of a Map
        // System.out.println(set.getKey() + " = " + set.getValue());
        // }
    }

    public static HashMap<String, String> AskForCriteria() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> filter = new HashMap<>();

        System.out.println(
                "Введите цифру, соответствующую необходимому критерию:\n1 - ram\n2 - hdd\n3 - model\n4 - color\n5 - star searching");

        String a = sc.nextLine();

        while (Integer.parseInt(a) != 5) {
            if (Integer.parseInt(a) == 1) {
                filter.put("ram", sc.nextLine());
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:\n1 - ram\n2 - hdd\n3 - model\n4 - color\n5 - star searching");
                a = sc.nextLine();
            }
            if (Integer.parseInt(a) == 2) {
                filter.put("hdd", sc.nextLine());
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:\n1 - ram\n2 - hdd\n3 - model\n4 - color\n5 - star searching");
                a = sc.nextLine();
            }
            if (Integer.parseInt(a) == 3) {
                filter.put("model", sc.nextLine());
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:\n1 - ram\n2 - hdd\n3 - model\n4 - color\n5 - star searching");
                a = sc.nextLine();
            }
            if (Integer.parseInt(a) == 4) {
                filter.put("color", sc.nextLine());
                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию:\n1 - ram\n2 - hdd\n3 - model\n4 - color\n5 - star searching");
                a = sc.nextLine();
            }
        }
        
        return filter;
    }

    // Проверка критериев
    public static Boolean CheckCriterias(NoteBook notebook, HashMap<String, String> filter) {
        if (notebook.getColor().equals(filter.get("color"))) {

            if (Integer.parseInt(notebook.getMemory()) >= Integer.parseInt(filter.get("hdd"))) {
                if (notebook.getModel().equals(filter.get("model"))) {
                    if (Integer.parseInt(notebook.getRam()) >= Integer.parseInt(filter.get("ram"))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}