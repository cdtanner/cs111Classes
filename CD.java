public class CD extends Disc
{
  private String artist;
  private String title;
  
    public CD (String i,int pt, String a, String t)
  {
      super (i,pt);
    title =t;
    artist = a;
  }
  
  public String getArtist()
  {return artist;}
  
  public String getTtitle()
  {return title;}
  
  public void setTitle(String t)
  { title =t;}
  
  public void setArtist(String a)
  { artist = a;}
  
  public String toString()
  { return "/nArtist: " + artist + "/nTitle: " + title + super.toString();}
  
  public boolean equals (Object o)
 { boolean eq = false;
    if (o instanceof CD)
    { CD other = (CD) o;
      eq = super.equals(other) && artist.equals(other.artist) && 
        title.equals(other.title);
    }
    return eq;
  }
}