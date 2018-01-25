package inspiration.sclab.ac.chonnam;

public class Abilities
{
    private String object_type;

    private String id;

    private String object_id;

    private String[] actions;

    public String getObject_type ()
    {
        return object_type;
    }

    public void setObject_type (String object_type)
    {
        this.object_type = object_type;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getObject_id ()
    {
        return object_id;
    }

    public void setObject_id (String object_id)
    {
        this.object_id = object_id;
    }

    public String[] getActions ()
    {
        return actions;
    }

    public void setActions (String[] actions)
    {
        this.actions = actions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [object_type = "+object_type+", id = "+id+", object_id = "+object_id+", actions = "+actions+"]";
    }
}