public class Main {
    public static void main(String[] args) { // Получаем доступ к разным тягам

        // 1 - Публичные тяги
        PublicModifiers Modifiers_1 = new PublicModifiers();
        Modifiers_1.publicValue = "Публичне тяги!";

        Modifiers_1.publicMethod();

        // 2 - Защищенные тяги
        ProtectedModifiers Modifiers_2 = new ProtectedModifiers();
        Modifiers_2.protectedValue = "Защищенные тяги!";
        Modifiers_2.protectedMethod();

        // 2 - Защищенный подкласс
        SubProtected Modifiers_2_1 = new SubProtected();
        Modifiers_2_1.protectedMethod();

        // 3 - Приватные тяги
        PrivateModifiers Modifiers_3 = new PrivateModifiers();
        Modifiers_3.PrivateMethod();

        // 4 - Дефолтные тяги
        DefaultModifiers Modifiers_4 = new DefaultModifiers();
        Modifiers_4.defaultValue = "Дефолтные тяги!";
        Modifiers_4.defaultMethod();

        // 4 - Дефолтный подкласс
        SubDefault Modifiers_4_1 = new SubDefault();
        Modifiers_4_1.defaultMethod();
    }
}