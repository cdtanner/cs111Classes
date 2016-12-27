public class Book extends LibraryItem
{
    private String title;
    private String author;

    public Book (String i, String t, String a)
    { 
	super (i,14); 
	System.err.println("in Book");
	title=t;
      author=a;
    }
    
    public Book (String i, String t, String a, int lp)
    {   super (i,lp);
        title =t;
        author =a;
    }
    
    public Book (Book b)
    {
	super(b.getIsbn(),14);
      title= b.title;
      author = b.author;
    }

    public String getTitle()
    {return title;}
    
    public String getAuthor()
    {return author;}

    public void setTitle(String t)
    {title=t;}

    public void setAuthor(String a)
    {author = a;}

    public String toString()
    { return ("Title: " + title + "\nAuthor: " + author 
       + "\n" + super.toString());}

    public boolean equals (Object o)
    { boolean eq = false;
    if (o instanceof Book)
 { Book other = (Book) o;
 eq = super.equals(other) && author.equals(other.author) && 
     title.equals(other.title);
 }
    return eq;
    }
}
    
