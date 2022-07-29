package kosgeb.entities;

import java.util.List;

public class Feature {
    private int id;
    private String name;
    private String value;
    private List<CreditFeature> creditFeatures;

    public Feature() {
    }

  

    public Feature(int id, String name, String value, List<CreditFeature> creditFeatures) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.creditFeatures = creditFeatures;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



	public List<CreditFeature> getCreditFeatures() {
		return creditFeatures;
	}



	public void setCreditFeatures(List<CreditFeature> creditFeatures) {
		this.creditFeatures = creditFeatures;
	}
    
}
