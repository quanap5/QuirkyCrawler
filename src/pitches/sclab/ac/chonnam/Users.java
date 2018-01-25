package pitches.sclab.ac.chonnam;

public class Users
{
    private String id;

    private String username;

    private String over_18;

    private String name;

    private String term_id;

    private String pusher_channel_name;

    private String avatar_card;

    private String avatar_thumb;

    private Counters counters;

    private String primary_skill;

    private String hide_real_name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public String getTerm_id ()
    {
        return term_id;
    }

    public void setTerm_id (String term_id)
    {
        this.term_id = term_id;
    }

    public String getPusher_channel_name ()
    {
        return pusher_channel_name;
    }

    public void setPusher_channel_name (String pusher_channel_name)
    {
        this.pusher_channel_name = pusher_channel_name;
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
        return "ClassPojo [id = "+id+", username = "+username+", over_18 = "+over_18+", name = "+name+", term_id = "+term_id+", pusher_channel_name = "+pusher_channel_name+", avatar_card = "+avatar_card+", avatar_thumb = "+avatar_thumb+", counters = "+counters+", primary_skill = "+primary_skill+", hide_real_name = "+hide_real_name+"]";
    }
}
		