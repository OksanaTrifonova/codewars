package org.example;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    private static final Map<String, String> languageDatabase = new HashMap<>();
    static {
        languageDatabase.put("english", "Welcome");
        languageDatabase.put("czech", "Vitejte");
        languageDatabase.put("danish", "Velkomst");
        languageDatabase.put("dutch", "Welkom");
        languageDatabase.put("estonian", "Tere tulemast");
        languageDatabase.put("finnish", "Tervetuloa");
        languageDatabase.put("flemish", "Welgekomen");
        languageDatabase.put("french", "Bienvenue");
        languageDatabase.put("german", "Willkommen");
        languageDatabase.put("irish", "Failte");
        languageDatabase.put("italian", "Benvenuto");
        languageDatabase.put("latvian", "Gaidits");
        languageDatabase.put("lithuanian", "Laukiamas");
        languageDatabase.put("polish", "Witamy");
        languageDatabase.put("spanish", "Bienvenido");
        languageDatabase.put("swedish", "Valkommen");
        languageDatabase.put("welsh", "Croeso");
    }

    public static String greet(String language) {
        String lang = language.toLowerCase();

        if (languageDatabase.containsKey(lang)) {
            return languageDatabase.get(lang);
        }
        return languageDatabase.getOrDefault("english", "Welcome");
    }

}