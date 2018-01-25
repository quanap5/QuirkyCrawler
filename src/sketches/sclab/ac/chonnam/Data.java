package sketches.sclab.ac.chonnam;



public class Data
{
    private Users[] users;

    private Abilities[] abilities;

    private Contribution_items[] contribution_items;

    private String[] embedly_extractions;

    private Attachments[] attachments;

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

    public String[] getEmbedly_extractions ()
    {
        return embedly_extractions;
    }

    public void setEmbedly_extractions (String[] embedly_extractions)
    {
        this.embedly_extractions = embedly_extractions;
    }

    public Attachments[] getAttachments ()
    {
        return attachments;
    }

    public void setAttachments (Attachments[] attachments)
    {
        this.attachments = attachments;
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
        return "ClassPojo [users = "+users+", abilities = "+abilities+", contribution_items = "+contribution_items+", embedly_extractions = "+embedly_extractions+", attachments = "+attachments+", contributions = "+contributions+"]";
    }
}
			
