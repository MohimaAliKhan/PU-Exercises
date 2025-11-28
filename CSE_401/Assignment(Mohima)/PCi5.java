class PCi5 extends PC {
    public PCi5() {
        description = "PC with Core i5, CPU Cooler";
    }
    public double cost() {
        return 70000 + 36000 + 20000;  // base + cooler + processor price
    }
}
