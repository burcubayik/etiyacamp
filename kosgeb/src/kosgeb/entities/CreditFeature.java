package kosgeb.entities;
public class CreditFeature {
    private int id;
    private Credit credit;
    private  Feature feature;

    public CreditFeature(int id, Credit credit, Feature feature) {
        this.id = id;
        this.credit = credit;
        this.feature = feature;
    }

    public CreditFeature() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
}
