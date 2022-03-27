package ru.avalon.vergentev.labwork1b;

public class Main {
    static public void main (String[] args) {
        BookParameters [] books = new BookParameters[5];
        books[0] = new BookParameters("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"},  2018, new PublishingHouseParameters("Питер", "Санкт-Петербург"));
        books[1] = new BookParameters("Разработка требований к программному обеспечению. 3-е издание, дополненное", new String[]{"Вигерс Карл"},2019, new PublishingHouseParameters("БХВ", "Санкт-ПЕТЕБУРГ"));
        books[2] = new BookParameters("Java. Полное руководство, 10-е издание", new String[]{"Шилдт Герберт"}, 2018, new PublishingHouseParameters("Диалектика", "Киев"));
        books[3] = new BookParameters("C/C++. Процедурное программирование", new String[]{"Полубенцева М.И."},  2017, new PublishingHouseParameters("БХВ", "Санкт-ПЕТЕБУРГ"));
        books[4] = new BookParameters("Конституция РФ", new String[]{},2020, new PublishingHouseParameters("Питер", "Санкт-Петербург"));


        BookParameters.printAll(books);
    }
}
