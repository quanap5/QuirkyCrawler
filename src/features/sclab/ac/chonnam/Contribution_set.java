package features.sclab.ac.chonnam;

public class Contribution_set
{
    private String id;

    private String set_for_type;

    private String is_default;

    private Contribution_set_items[] contribution_set_items;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSet_for_type ()
    {
        return set_for_type;
    }

    public void setSet_for_type (String set_for_type)
    {
        this.set_for_type = set_for_type;
    }

    public String getIs_default ()
    {
        return is_default;
    }

    public void setIs_default (String is_default)
    {
        this.is_default = is_default;
    }

    public Contribution_set_items[] getContribution_set_items ()
    {
        return contribution_set_items;
    }

    public void setContribution_set_items (Contribution_set_items[] contribution_set_items)
    {
        this.contribution_set_items = contribution_set_items;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", set_for_type = "+set_for_type+", is_default = "+is_default+", contribution_set_items = "+contribution_set_items+"]";
    }
}