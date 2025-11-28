class Graphics2GB extends ComponentDecorator {
    PC pc;
    public Graphics2GB(PC pc) { this.pc = pc; }
    public String getDescription() { return pc.getDescription() + ", 2GB Graphics Card"; }
    public double cost() { return pc.cost() + 6500; }
}