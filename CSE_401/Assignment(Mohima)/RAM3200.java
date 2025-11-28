class RAM3200 extends ComponentDecorator {
    PC pc;
    public RAM3200(PC pc) { this.pc = pc; }
    public String getDescription() { return pc.getDescription() + ", 8GB RAM 3200MHz"; }
    public double cost() { return pc.cost() + 2950; }
}
