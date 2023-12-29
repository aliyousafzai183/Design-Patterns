public class Settings {
    private static Settings instance;

    private Settings() {
        // Private constructor to prevent instantiation
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
