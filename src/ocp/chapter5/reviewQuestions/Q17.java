package ocp.chapter5.reviewQuestions;

import java.util.Properties;

public class Q17 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("veggies", "brontosaurus");
        properties.setProperty("meat", "velociraptor");
        print(properties);

    }

    private static void print(Properties props) {
        props.keySet().stream().map(k -> k) .forEach(System.out::println);
        props.keySet().stream().map(k -> props.get(k))
                .forEach(System.out::println);

        System.out.println(props.getOrDefault("veggies", "none")
                + " " + props.getOrDefault("omni", "none"));
    }
}
