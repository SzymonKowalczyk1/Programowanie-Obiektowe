public class Book {
    public String title;
    public String author;
    public int numberofPages;

    public Book()
    {
        title="brakTytulu";
        author="brakAutora";

    }
    public Book(String title,String author,int numberofPages){
        this.title = title;
        this.author = author;
        this.numberofPages = numberofPages;
        if(this.numberofPages<0)
        {
            this.numberofPages = 1;
        }
        if(title.isEmpty()||title == null)
        {
            this.title = "";
        }
        if(author.isEmpty() || author == null)
        {
            this.author="";
        }

    }
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Book o)
        {
            return this.title.equals(o.title)&&this.author.equals(o.author)&&this.numberofPages==o.numberofPages;
        }
        else return false;
    }

}
