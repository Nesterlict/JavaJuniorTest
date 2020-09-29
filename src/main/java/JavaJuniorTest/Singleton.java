package JavaJuniorTest;

public class Singleton {

    /** Приведите пример потоко-безопасной реализации паттерна Одиночка (Singleton) **/

        private static volatile Singleton instance;

        public static Singleton getInstance() {
            Singleton localInstance = instance;
            if (localInstance == null) {
                synchronized (Singleton.class) {
                    localInstance = instance;
                    if (localInstance == null) {
                        instance = localInstance = new Singleton();
                    }
                }
            }
            return localInstance;
        }
}
