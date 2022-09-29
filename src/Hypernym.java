import java.util.ArrayList;
import java.util.List;

/**
 * class.
 */
public class Hypernym {

    private String fieldName;
    private List<Hyponym> hyponymList;

    /**
     * constructor.
     *
     * @param fieldName name
     */
    public Hypernym(String fieldName) {
        this.fieldName = fieldName;
        this.hyponymList = new ArrayList<>();
    }

    /**
     * adding appearance.
     *
     * @param hyponym app
     */
    public void setAppearanceList(Hyponym hyponym) {
        if (hyponymList.contains(hyponym)) {
            this.hyponymList.get(this.hyponymList.indexOf(hyponym)).increase();
        }
        hyponymList.add(hyponym);

    }

    /**
     * @return name
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @return list
     */
    public List<Hyponym> getAppearanceList() {
        return hyponymList;
    }

    /**
     * list string.
     *
     * @return string
     */
    public String appearanceListString() {
        String s = null;
        for (int i = 0; i < this.hyponymList.size(); i++) {
            s = s + this.hyponymList.get(i).toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return this.fieldName + appearanceListString();
    }
}
