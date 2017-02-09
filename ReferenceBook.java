public class ReferenceBook extends Book
{
    private String editor;

    public ReferenceBook (String i,String t, String a, String e)
    {
	super (i,t,a,0);
	editor =e;
    }

    public String getEditor()
    { return editor;}

    public void setEditor(String e)
    {editor = e;}

    public boolean equals (Object o)
    { boolean eq = false;
	if(o instanceof ReferenceBook)
	{ReferenceBook other = (ReferenceBook)(o);
         eq = super.equals(other)  && editor.equals(other.editor);
	}
	return eq;
    }

    public String toString()
    { return super.toString() + "/nEditor: " + editor;}

}
