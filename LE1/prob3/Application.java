class Mother {
    static void show() {
        System.out.println("hello Mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("hello Child");
    }
}

class Application {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show(); 
    }
}

/* 
    Mother      Child       result
    Non-static  Non-static  hello Mother
    Non-static  static      error
    static      Non-static  error
    static      static      hello Mother
    
*/