package ocp.chapter5.resourceExample;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Tax_en_US extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new Tax_en_US()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "ocp.chapter5.resourceExample.Tax_en_US", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}
