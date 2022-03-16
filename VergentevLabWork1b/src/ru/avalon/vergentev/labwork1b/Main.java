package ru.avalon.vergentev.labwork1b;

public class Main {
    static public void main (String[] args) {
        PublishingHouseParameters [] house = new PublishingHouseParameters[4];
        house[0] = new PublishingHouseParameters("Проспект", "Москва");
        house[1] = new PublishingHouseParameters("Питер", "Санкт-Петербург");
        house[2] = new PublishingHouseParameters("БХВ", "Санкт-ПЕТЕБУРГ");
        house[3] = new PublishingHouseParameters("Диалектика", "Киев");

        BookParameters [] books = new BookParameters[5];
        books[0] = new BookParameters("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"},  2018, house[1].getHouseName());
        books[1] = new BookParameters("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл",2019, house[2].getHouseName());
        books[2] = new BookParameters("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, house[3].getHouseName());
        books[3] = new BookParameters("C/C++. Процедурное программирование", "Полубенцева М.И.",  2017, house[2].getHouseName());
        books[4] = new BookParameters("Конституция РФ", 2020, house[0].getHouseName());


//        System.out.println(house[1].getCityName());
//        house[0].printCity();
//        PublishingHouseParameters.printCity(house);
//        books[0].print();
//        books[1].print();
//        books[2].print();
//        books[3].print();
//        books[4].print();
        PublishingHouseParameters.printAll(books);












    }

}
