package ocp.chapter5.resourceExample;

import java.util.ListResourceBundle;

public class Zoo_ua extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Добрий день"},
                {"open", "Зоопарк відкритий"}};
    }
}
