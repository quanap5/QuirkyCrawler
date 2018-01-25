package features.sclab.ac.chonnam;

public class Contributions
{
    private int likes_count;

    private String parent_class;

    private String state;

    private Contribution_set contribution_set;

    private int creator_id;

    private int id;

    private String updated_at;

    private String can_destroy;

    private String can_update;

    private String can_admin_update;

    private String created_at;

    private String can_change_pick;

    private String invention_id;

    private String contribution_set_id;

    private String parent_id;

    public int getLikes_count ()
    {
        return likes_count;
    }

    public void setLikes_count (int likes_count)
    {
        this.likes_count = likes_count;
    }

    public String getParent_class ()
    {
        return parent_class;
    }

    public void setParent_class (String parent_class)
    {
        this.parent_class = parent_class;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public Contribution_set getContribution_set ()
    {
        return contribution_set;
    }

    public void setContribution_set (Contribution_set contribution_set)
    {
        this.contribution_set = contribution_set;
    }

    public int getCreator_id ()
    {
        return creator_id;
    }

    public void setCreator_id (int creator_id)
    {
        this.creator_id = creator_id;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getCan_destroy ()
    {
        return can_destroy;
    }

    public void setCan_destroy (String can_destroy)
    {
        this.can_destroy = can_destroy;
    }

    public String getCan_update ()
    {
        return can_update;
    }

    public void setCan_update (String can_update)
    {
        this.can_update = can_update;
    }

    public String getCan_admin_update ()
    {
        return can_admin_update;
    }

    public void setCan_admin_update (String can_admin_update)
    {
        this.can_admin_update = can_admin_update;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getCan_change_pick ()
    {
        return can_change_pick;
    }

    public void setCan_change_pick (String can_change_pick)
    {
        this.can_change_pick = can_change_pick;
    }

    public String getInvention_id ()
    {
        return invention_id;
    }

    public void setInvention_id (String invention_id)
    {
        this.invention_id = invention_id;
    }

    public String getContribution_set_id ()
    {
        return contribution_set_id;
    }

    public void setContribution_set_id (String contribution_set_id)
    {
        this.contribution_set_id = contribution_set_id;
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
        return "ClassPojo [likes_count = "+likes_count+", parent_class = "+parent_class+", state = "+state+", contribution_set = "+contribution_set+", creator_id = "+creator_id+", id = "+id+", updated_at = "+updated_at+", can_destroy = "+can_destroy+", can_update = "+can_update+", can_admin_update = "+can_admin_update+", created_at = "+created_at+", can_change_pick = "+can_change_pick+", invention_id = "+invention_id+", contribution_set_id = "+contribution_set_id+", parent_id = "+parent_id+"]";
    }
}