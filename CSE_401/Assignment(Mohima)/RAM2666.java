class RAM2666 extends ComponentDecorator {
    PC pc;
    public RAM2666(PC pc) { this.pc = pc; }
    public String getDescription() { return pc.getDescription() + ", 8GB RAM 2666MHz"; }
    public double cost() { return pc.cost() + 2620; }
}