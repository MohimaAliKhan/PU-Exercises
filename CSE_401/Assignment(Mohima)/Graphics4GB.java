class Graphics4GB extends ComponentDecorator {
    PC pc;
    public Graphics4GB(PC pc) { this.pc = pc; }
    public String getDescription() { return pc.getDescription() + ", 4GB Graphics Card"; }
    public double cost() { return pc.cost() + 7600; }
}
