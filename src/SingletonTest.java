public class SingletonTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println("lazySingleton:" + lazySingleton);
        System.out.println("hungrySingleton: " + hungrySingleton);
    }
}


// 懒汉
class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() { }

    public static synchronized LazySingleton getInstance() {
        if (instance==null) instance = new LazySingleton();
        return instance;
    }
}

// 饿汉
class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
