public class Books
extends Publications{
    private String author;
    private String title;
    private int ISBN;
    private int quantityCopies;
    protected int copy=1; //Ejemplar=copy

    /*
    Con protetcted las demas clases pueden haceder a una
    clase pero con private no pueden haceder a otras clases a no
    ser de que le pongamos seters y geters
     */
public Books(String author,String title,int ISBN,int quantityCopies,int copy,String editorial,int numPage,Color color){
    super(editorial,numPage,color);
this.author=author;
this.color=color;
this.title=title;
this.ISBN=ISBN;
this.quantityCopies=quantityCopies;
this.copy=copy;
this.editorial=editorial;
this.numPage=numPage;


}

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", ISBN=" + ISBN +
                ", quantityCopies=" + quantityCopies +
                ", copy=" + copy +
                '}';
    }
}
