public class SunClass {
    private static SunClass instance;

    private SunClass() {
        System.out.println("Вы вызвали солцне!");
    }

    public static SunClass getInstance() {
        if (instance == null) {
            instance = new SunClass();
        }
        return instance;
    }
}
