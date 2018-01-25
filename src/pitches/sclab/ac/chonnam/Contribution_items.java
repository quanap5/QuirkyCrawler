package pitches.sclab.ac.chonnam;

public class Contribution_items
{
    protected String content;

    protected int id;

    protected String range_min;

    protected int contribution_id;

    protected String[] choices;

    protected String number;

    protected String type;

    protected String number_in_set;

    protected String range_max;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getRange_min ()
    {
        return range_min;
    }

    public void setRange_min (String range_min)
    {
        this.range_min = range_min;
    }

    public int getContribution_id ()
    {
        return contribution_id;
    }

    public void setContribution_id (int contribution_id)
    {
        this.contribution_id = contribution_id;
    }

    public String[] getChoices ()
    {
        return choices;
    }

    public void setChoices (String[] choices)
    {
        this.choices = choices;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getNumber_in_set ()
    {
        return number_in_set;
    }

    public void setNumber_in_set (String number_in_set)
    {
        this.number_in_set = number_in_set;
    }

    public String getRange_max ()
    {
        return range_max;
    }

    public void setRange_max (String range_max)
    {
        this.range_max = range_max;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", id = "+id+", range_min = "+range_min+", contribution_id = "+contribution_id+", choices = "+choices+", number = "+number+", type = "+type+", number_in_set = "+number_in_set+", range_max = "+range_max+"]";
    }
}