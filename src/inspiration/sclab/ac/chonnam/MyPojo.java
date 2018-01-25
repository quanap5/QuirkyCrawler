package inspiration.sclab.ac.chonnam;

import pageInspiration.sclab.ac.chonnam.Paginated_meta;

public class MyPojo
{
    private Paginated_meta paginated_meta;

    private Data data;

    public Paginated_meta getPaginated_meta ()
    {
        return paginated_meta;
    }

    public void setPaginated_meta (Paginated_meta paginated_meta)
    {
        this.paginated_meta = paginated_meta;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [paginated_meta = "+paginated_meta+", data = "+data+"]";
    }
}
			
			