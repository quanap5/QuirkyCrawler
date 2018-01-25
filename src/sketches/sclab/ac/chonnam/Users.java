package sketches.sclab.ac.chonnam;

public class Users
{
    private String term_id;

    private String avatar_card;

    private String avatar_thumb;

    private Counters counters;

    private String id;

    private String first_name;

    private String username;

    private String over_18;

    private String name;

    private String last_name;

    private String pusher_channel_name;

    private String primary_skill;

    private String hide_real_name;

    public String getTerm_id ()
    {
        return term_id;
    }

    public void setTerm_id (String term_id)
    {
        this.term_id = term_id;
    }

    public String getAvatar_card ()
    {
        return avatar_card;
    }

    public void setAvatar_card (String avatar_card)
    {
        this.avatar_card = avatar_card;
    }

    public String getAvatar_thumb ()
    {
        return avatar_thumb;
    }

    public void setAvatar_thumb (String avatar_thumb)
    {
        this.avatar_thumb = avatar_thumb;
    }

    public Counters getCounters ()
    {
        return counters;
    }

    public void setCounters (Counters counters)
    {
        this.counters = counters;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getOver_18 ()
    {
        return over_18;
    }

    public void setOver_18 (String over_18)
    {
        this.over_18 = over_18;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    public String getPusher_channel_name ()
    {
        return pusher_channel_name;
    }

    public void setPusher_channel_name (String pusher_channel_name)
    {
        this.pusher_channel_name = pusher_channel_name;
    }

    public String getPrimary_skill ()
    {
        return primary_skill;
    }

    public void setPrimary_skill (String primary_skill)
    {
        this.primary_skill = primary_skill;
    }

    public String getHide_real_name ()
    {
        return hide_real_name;
    }

    public void setHide_real_name (String hide_real_name)
    {
        this.hide_real_name = hide_real_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [term_id = "+term_id+", avatar_card = "+avatar_card+", avatar_thumb = "+avatar_thumb+", counters = "+counters+", id = "+id+", first_name = "+first_name+", username = "+username+", over_18 = "+over_18+", name = "+name+", last_name = "+last_name+", pusher_channel_name = "+pusher_channel_name+", primary_skill = "+primary_skill+", hide_real_name = "+hide_real_name+"]";
    }
}