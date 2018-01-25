package inspiration.sclab.ac.chonnam;

public class Attachments
{
    private String id;

    private Asset asset;

    private String parent_type;

    private String created_at;

    private String parent_id;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Asset getAsset ()
    {
        return asset;
    }

    public void setAsset (Asset asset)
    {
        this.asset = asset;
    }

    public String getParent_type ()
    {
        return parent_type;
    }

    public void setParent_type (String parent_type)
    {
        this.parent_type = parent_type;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getParent_id ()
    {
        return parent_id;
    }

    public void setParent_id (String parent_id)
    {
        this.parent_id = parent_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", asset = "+asset+", parent_type = "+parent_type+", created_at = "+created_at+", parent_id = "+parent_id+"]";
    }
}