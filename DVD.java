public class DVD extends Disc
{
  private String country;
  private String title;
  
    public DVD (String i,int pt, String c, String t)
  {
      super (i,pt);
    title =t;
    country = c;
  }
  
  public String getCountry()
  {return country;}
  
  public String getTtitle()
  {return title;}
  
  public void setTitle(String t)
  { title =t;}
  
  public void setCountry(String c)
  { country = c;}
  
  public String toString()
  { return  "/nTitle: " + title + "/nCountry: " + country + super.toString();}
  
  public boolean equals (Object o)
 { boolean eq = false;
    if (o instanceof DVD)
    { DVD other = (DVD) o;
      eq = super.equals(other) && country.equals(other.country) && 
        title.equals(other.title);
    }
    return eq;
  }
}