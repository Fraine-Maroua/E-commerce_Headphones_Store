package ma.projet.headphones.Domain;

public class Popular {
    private String title;
    private String pri;
    private int Pic;


    public Popular(String title, String pri,int Pic) {
        this.title = title;
        this.pri = pri;
        this.Pic = Pic;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle2() {
        return pri;
    }

    public void setTitle2(String title) {
        this.pri = pri;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int Pic) {
        this.Pic = Pic;
    }
}

