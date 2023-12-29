public class System {
    private static System instance;
    private Settings settings;
    private Mediator mediator;
    private CaseManager caseManager;

    private System() {
        this.settings = Settings.getInstance();
        this.mediator = new Mediator();
        this.caseManager = new CaseManager();
    }

    public static System getInstance() {
        if (instance == null) {
            instance = new System();
        }
        return instance;
    }

    public Settings getSettings() {
        return settings;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public CaseManager getCaseManager() {
        return caseManager;
    }
}
