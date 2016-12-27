public class Disc extends LibraryItem
{
    private int playingTime;
    
    public Disc (String i,int pt)
    { super (i,7);
      playingTime = pt;
    }

    public int getPlayingTime ()
    {return playingTime;}

    public void setPlayingTime(int pt)
    {playingTime = pt;}

    public String toString()
    {  return "/nPlayingTime: " + playingTime + super.toString();}

    public boolean equals(Object o)
    { boolean eq = false;

    if (o instanceof Disc)
	{ Disc other = (Disc) o;
	eq = super.equals(other) && playingTime == other.playingTime;
	}
    return eq;
    }
}
