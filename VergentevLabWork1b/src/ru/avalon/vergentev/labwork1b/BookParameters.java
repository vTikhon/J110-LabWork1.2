package ru.avalon.vergentev.labwork1b;

public class BookParameters {
    private String titleOfBook;
    private int yearOfBook;
    private String[] authorsBook;
    PublishingHouseParameters publishingHouseParameters;





    //Constructors block
    public BookParameters(String titleOfBook, String[] authorsBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        setTitleOfBook(titleOfBook);
        setAuthorsBook(authorsBook);
        setYearOfBook(yearOfBook);
        this.publishingHouseParameters = publishingHouseParameters;
    }


    //Methods block
    public void print() {
        System.out.print('\n');
        System.out.println("Название книги: " + getTitleOfBook());

        if (getNumberOfAuthors() >= 2) {
            System.out.print("Авторы книги: ");
            for (int i = 0; i < authorsBook.length-1; i++) {
                System.out.print(authorsBook[i] + ", ");
            }
            System.out.println(authorsBook[authorsBook.length-1]);
        } else if (getNumberOfAuthors() == 1) {
            System.out.print("Автор книги: ");
            for (int i = 0; i < authorsBook.length; i++) {
                System.out.println(authorsBook[i]);
            }
        }

        System.out.println("Издательство книги: " + publishingHouseParameters.getHouseName() + ", " + publishingHouseParameters.getCityName());
        System.out.println("Год издания: " + getYearOfBook());
    }


    public static void printAll(BookParameters [] books) {
        for (BookParameters i : books) {
            i.print();
        }
        System.out.print('\n');
        System.out.println("ДАЛЕЕ ЗАПУСТИТСЯ ВТОРОЙ МЕТОД С ПРОВЕРКОЙ ОШИБКИ В НАЗВАНИИ ГОРОДА САНКТ-ПЕТЕРБУРГ");
        for (BookParameters i : books) {
            if (i.publishingHouseParameters.getCityName().contains("Санкт-")) {
                i.publishingHouseParameters.setCityName("Санкт-Петербург");
            }
            i.print();
        }
    }

    public int getNumberOfAuthors() {
        return authorsBook.length;
    }


    //Getters and Setters block
    public String getTitleOfBook () {
        return titleOfBook;
    }

    public void setTitleOfBook (String titleOfBook){
        if (titleOfBook == null)
                throw new IllegalArgumentException("Name of book must have the title");
        this.titleOfBook = titleOfBook;
    }

    public int getYearOfBook () {
            return yearOfBook;
        }

    public void setYearOfBook (int yearOfBook){
        if (yearOfBook < 0)
                throw new IllegalArgumentException("Year publishing can't less than zero");
        this.yearOfBook = yearOfBook;
    }

    public String [] getAuthorsBook() {
//        if (getAuthorsBook() == null)
//            throw new IllegalArgumentException("Index out the diapason");
        return authorsBook;
    }

    public void setAuthorsBook(String [] authorsBook) {
        this.authorsBook = authorsBook;
    }

//    public String getAuthorBook () {
//            return authorBook;
//    }
//
//    public void setAuthorBook (String authorBook){
//            this.authorBook = authorBook;
//    }



}

