package sketches.sclab.ac.chonnam;

public class Asset
{
    private Card card;

    private Avatar_thumb avatar_thumb;

    private Large large;

    private String url;

    public Card getCard ()
    {
        return card;
    }

    public void setCard (Card card)
    {
        this.card = card;
    }

    public Avatar_thumb getAvatar_thumb ()
    {
        return avatar_thumb;
    }

    public void setAvatar_thumb (Avatar_thumb avatar_thumb)
    {
        this.avatar_thumb = avatar_thumb;
    }

    public Large getLarge ()
    {
        return large;
    }

    public void setLarge (Large large)
    {
        this.large = large;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [card = "+card+", avatar_thumb = "+avatar_thumb+", large = "+large+", url = "+url+"]";
    }
}