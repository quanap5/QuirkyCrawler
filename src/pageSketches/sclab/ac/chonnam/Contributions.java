package pageSketches.sclab.ac.chonnam;

public class Contributions
{
    private String has_next_page;

    public String getHas_next_page ()
    {
        return has_next_page;
    }

    public void setHas_next_page (String has_next_page)
    {
        this.has_next_page = has_next_page;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [has_next_page = "+has_next_page+"]";
    }

	
}