class Mother {
    void show() {
        System.out.println("hello Mother");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("hello Child");
    }
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
