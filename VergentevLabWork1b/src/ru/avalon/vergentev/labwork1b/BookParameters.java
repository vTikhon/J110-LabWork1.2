package ru.avalon.vergentev.labwork1b;

public class BookParameters {
    private String titleOfBook;
    private int yearOfBook;
    private String authorBook;
    private int numberOfAuthors = 2;
    public String[] authorsBook = new String[getNumberOfAuthors()];
    PublishingHouseParameters publishingHouseParameters;





    //Constructors block
    public BookParameters(String titleOfBook, String[] authorsBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        this.publishingHouseParameters = publishingHouseParameters;
        setTitleOfBook(titleOfBook);
        setAuthorsBook(authorsBook);
        setYearOfBook(yearOfBook);
    }

    public BookParameters(String titleOfBook, String authorBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        this.publishingHouseParameters = publishingHouseParameters;
        setTitleOfBook(titleOfBook);
        setAuthorBook(authorBook);
        setYearOfBook(yearOfBook);
    }

    public BookParameters(String titleOfBook, int yearOfBook, PublishingHouseParameters publishingHouseParameters) {
        this.publishingHouseParameters = publishingHouseParameters;
        setTitleOfBook(titleOfBook);
        setYearOfBook(yearOfBook);
    }


    //Methods block
    public void print() {
        System.out.print('\n');
        System.out.println("Название книги: " + getTitleOfBook());

        if (getAuthorBook() != null) {
            System.out.println("Автор книги: " + getAuthorBook());
        } else if (getAuthorBook() == null && authorsBook[0] == null) {
        } else {
            System.out.print("Авторы книги: ");
            for (int i = 0; i < authorsBook.length-1; i++) {
                System.out.print(authorsBook[i] + ", ");
            }
            System.out.println(authorsBook[authorsBook.length-1]);
        }

        System.out.println("Издательство книги: " + publishingHouseParameters.getHouseName() + ", " + publishingHouseParameters.getCityName());
        System.out.println("Год издания: " + getYearOfBook());
        }

    public void print2() {
        System.out.print('\n');
        System.out.println("Название книги: " + getTitleOfBook());

        if (getAuthorBook() != null) {
            System.out.println("Автор книги: " + getAuthorBook());
        } else if (getAuthorBook() == null && authorsBook[0] == null) {
        } else {
            System.out.print("Авторы книги: ");
            for (int i = 0; i < authorsBook.length-1; i++) {
                System.out.print(authorsBook[i] + ", ");
            }
            System.out.println(authorsBook[authorsBook.length-1]);
        }
        if (publishingHouseParameters.getCityName().contains("Санкт-")) {
            publishingHouseParameters.setCityName("Санкт-Петербург");
            System.out.println("Издательство книги: " + publishingHouseParameters.getHouseName() + ", " + publishingHouseParameters.getCityName());
        } else {
            System.out.println("Издательство книги: " + publishingHouseParameters.getHouseName() + ", " + publishingHouseParameters.getCityName());
            System.out.println("Год издания: " + getYearOfBook());
        }
    }

    public static void printAll(BookParameters [] books) {
        books[0].print();
        books[1].print();
        books[2].print();
        books[3].print();
        books[4].print();
    }

    public static void printAll2(BookParameters [] books) {
        books[0].print2();
        books[1].print2();
        books[2].print2();
        books[3].print2();
        books[4].print2();
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

