class PCFactory {
    public static PC createPC(int type) {
        switch(type) {
            case 1: return new PCi5();
            case 2: return new PCi7();
            case 3: return new PCi9();
            default: return null;
        }
    }
}
