package page3D.sclab.ac.chonnam;


public class Paginated_meta
{
    private Contributions contributions;

    public Contributions getContributions ()
    {
        return contributions;
    }

    public void setContributions (Contributions contributions)
    {
        this.contributions = contributions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contributions = "+contributions+"]";
    }
}
			