public class Book {
    public String title;
    public String author;
    public int numberofPages;

    public Book(String title, String author, int numberofPages){
        if(title.isEmpty()){
            this.title = "";
        }
        else {
            this.title = title;
        }
        if (author.isEmpty()){
            this.author = "";
        }
        else {
            this.author = author;
        }
        if (numberofPages<0){
            this.numberofPages = 1;
        }
        else {
            this.numberofPages = numberofPages;
        }
    }

@Override
public String toString(){
    return "Book: "+ title + " by " + author + "Pages: " + numberofPages;
}
@Override
    public boolean equals(Object o ){
        if(o instanceof Book obj){
            return this.title.equals(obj.title)&&
                    this.author.equals(obj.author)&&
                    this.numberofPages == obj.numberofPages;
        }
        else {
            return false;
        }
}
}