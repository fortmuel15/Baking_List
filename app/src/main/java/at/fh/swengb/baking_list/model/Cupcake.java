package at.fh.swengb.baking_list.model;

import java.io.Serializable;

/**
 * Created by 2540p on 23.11.2016.
 */

public class Cupcake implements Serializable {

    private String Name;
    private String Taste;
    private String Calories;
    private String CaseColor;

    public Cupcake() {
    }

    public Cupcake(String name, String taste, String calories, String caseColor) {
        Name = name;
        Taste = taste;
        Calories = calories;
        CaseColor = caseColor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String taste) {
        Taste = taste;
    }

    public String getCalories() {
        return Calories;
    }

    public void setCalories(String calories) {
        Calories = calories;
    }

    public String getCaseColor() {
        return CaseColor;
    }

    public void setCaseColor(String caseColor) {
        CaseColor = caseColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cupcake cupcake = (Cupcake) o;

        if (Name != null ? !Name.equals(cupcake.Name) : cupcake.Name != null) return false;
        return Taste != null ? Taste.equals(cupcake.Taste) : cupcake.Taste == null;

    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (Taste != null ? Taste.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(Name).append(" ")
                .append(Taste)
                .append('\n')
                .append(Calories).append('\n')
                .append(CaseColor);
        return sb.toString();
    }
}
