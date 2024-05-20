import java.util.ArrayList;
public class Book
{
   private String author;
   private String title;
   private int[] pages;
   private int page;
   
   public Book(String title, String author, int pages, int page)
   {
        this.author = author;
        this.title = title;
        this.pages = new int[pages];
        this.page = page;
    }
    
    public void printPage()
    {
        for (int i = 0; i<page; i++){
            pages[i] = i;
        }
        for (int page : pages){
            System.out.println(page);
        }
    }
    public void printPages()
    {
        for (int i = 0; i<=page; i++){
            System.out.println(i);
        }
    }
}
