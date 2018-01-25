package pitches.sclab.ac.chonnam;

public class Data
{
    private Users[] users;

    private Abilities[] abilities;

    private Contribution_items[] contribution_items;

    private Embedly_extractions[] embedly_extractions;

    private Contributions[] contributions;

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    public Abilities[] getAbilities ()
    {
        return abilities;
    }

    public void setAbilities (Abilities[] abilities)
    {
        this.abilities = abilities;
    }

    public Contribution_items[] getContribution_items ()
    {
        return contribution_items;
    }

    public void setContribution_items (Contribution_items[] contribution_items)
    {
        this.contribution_items = contribution_items;
    }

    public Embedly_extractions[] getEmbedly_extractions ()
    {
        return embedly_extractions;
    }

    public void setEmbedly_extractions (Embedly_extractions[] embedly_extractions)
    {
        this.embedly_extractions = embedly_extractions;
    }

    public Contributions[] getContributions ()
    {
        return contributions;
    }

    public void setContributions (Contributions[] contributions)
    {
        this.contributions = contributions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [users = "+users+", abilities = "+abilities+", contribution_items = "+contribution_items+", embedly_extractions = "+embedly_extractions+", contributions = "+contributions+"]";
    }
}