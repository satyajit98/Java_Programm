class Book
{
    String bookName;
    double price;
    String autherName;
    public void reading()
    {
        System.out.println("Reading Book");
    }
    public void knowledge()
    {
        System.out.println("It provides knowledge");
    }
}

class BookMain
{
    public static void main(String [] args)
    {
        Book b = new Book();
    System.out.println(b.bookName);
    System.out.println(b.price);
    System.out.println(b.autherName);
    b.reading();
    b.knowledge();
    }
}