package inspiration.sclab.ac.chonnam;

public class Counters
{
    private String inventions_contributed_count;

    private String inventions_submitted_count;

    private String inventions_influenced_count;

    private String following_count;

    private String followers_count;

    private String contributions_count;

    public String getInventions_contributed_count ()
    {
        return inventions_contributed_count;
    }

    public void setInventions_contributed_count (String inventions_contributed_count)
    {
        this.inventions_contributed_count = inventions_contributed_count;
    }

    public String getInventions_submitted_count ()
    {
        return inventions_submitted_count;
    }

    public void setInventions_submitted_count (String inventions_submitted_count)
    {
        this.inventions_submitted_count = inventions_submitted_count;
    }

    public String getInventions_influenced_count ()
    {
        return inventions_influenced_count;
    }

    public void setInventions_influenced_count (String inventions_influenced_count)
    {
        this.inventions_influenced_count = inventions_influenced_count;
    }

    public String getFollowing_count ()
    {
        return following_count;
    }

    public void setFollowing_count (String following_count)
    {
        this.following_count = following_count;
    }

    public String getFollowers_count ()
    {
        return followers_count;
    }

    public void setFollowers_count (String followers_count)
    {
        this.followers_count = followers_count;
    }

    public String getContributions_count ()
    {
        return contributions_count;
    }

    public void setContributions_count (String contributions_count)
    {
        this.contributions_count = contributions_count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [inventions_contributed_count = "+inventions_contributed_count+", inventions_submitted_count = "+inventions_submitted_count+", inventions_influenced_count = "+inventions_influenced_count+", following_count = "+following_count+", followers_count = "+followers_count+", contributions_count = "+contributions_count+"]";
    }
}