abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour "+ qty+" ml of beverage into a glass");
    }
    
    protected abstract void addContiment();
    
    protected void stir(){};
    
    private void serve(){
        System.out.println("serve thorugh waiter");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addContiment();
        stir();
        serve();
    }
}

class Whiskey extends Beverage{
    public void addContiment(){
        System.out.println("add Soda");
    }
    
    public void stir(){
        System.out.println("stir for 30 secs.");
    }
}

class Beer extends Beverage{
    public void addContiment(){
        System.out.println("add nothing");
    }
}