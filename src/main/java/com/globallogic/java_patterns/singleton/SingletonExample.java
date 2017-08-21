package com.globallogic.java_patterns.singleton;

// created at the time of access to the SingletonEnum class
enum SingletonEnum {
    INSTANCE
}

// not lazy initialization
class SingletonStaticField {
    public static final SingletonStaticField INSTANCE = new SingletonStaticField();
}

// lazy initialization (all three below)
class SingletonSynchronizedAccessor {
    private static SingletonSynchronizedAccessor instance;

    public static synchronized SingletonSynchronizedAccessor getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedAccessor();
        }
        return instance;
    }
}

// only for static field
class SingletonStaticClass {

    public static SingletonStaticClass getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private static class SingletonHolder {
        private static final SingletonStaticClass HOLDER_INSTANCE = new SingletonStaticClass();
    }
}

// JDK >= 1.5
class SingletonDoubleCheckedLocking {

    // can have problems without volatile
    private static volatile SingletonDoubleCheckedLocking instance;

    public static SingletonDoubleCheckedLocking getInstance() {
        SingletonDoubleCheckedLocking localInstance = instance;

        if (localInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                localInstance = instance;

                if (localInstance == null) {
                    instance = localInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }

        return localInstance;
    }
}