package ru.avalon.vergentev.labwork1b;

public class BookParameters {
    private String titleOfBook;
    private int yearOfBook;
    private String authorBook;
    private int numberOfAuthors = 2;
    public String[] authorsBook = new String[getNumberOfAuthors()];
    PublishingHouseParameters publishingHouseParameters;





    //Constructors block
    public BookParameters(String titleOfBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        setTitleOfBook(titleOfBook);
        setYearOfBook(yearOfBook);
        this.publishingHouseParameters = publishingHouseParameters;
    }

    public BookParameters(String titleOfBook, String authorBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        this(titleOfBook, yearOfBook, publishingHouseParameters);
        setAuthorBook(authorBook);
    }

    public BookParameters(String titleOfBook, String[] authorsBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        this(titleOfBook, yearOfBook, publishingHouseParameters);
        setAuthorsBook(authorsBook);
    }


    //Methods block
    public void print() {
        System.out.print('\n');
        System.out.println("Название книги: " + getTitleOfBook());

        if (getAuthorBook() != null) {
            System.out.println("Автор книги: " + getAuthorBook());
        } else if (authorsBook[0] != null) {
            System.out.print("Авторы книги: ");
            for (int i = 0; i < authorsBook.length-1; i++) {
                System.out.print(authorsBook[i] + ", ");
            }
            System.out.println(authorsBook[authorsBook.length-1]);
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
                i.print();
            }
        }
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
        if (getAuthorsBook() == null)
            throw new IllegalArgumentException("Index out the diapason");
        return authorsBook;
    }

    public void setAuthorsBook(String [] authorsBook) {
        this.authorsBook = authorsBook;
    }


        public int getNumberOfAuthors () {
            return numberOfAuthors;
        }

        public void setNumberOfAuthors (int numberOfAuthors){
            this.numberOfAuthors = numberOfAuthors;
        }

        public String getAuthorBook () {
            return authorBook;
        }

        public void setAuthorBook (String authorBook){
            this.authorBook = authorBook;
        }
    }

