class Cat {

    // write static and instance variables
    String m_name;
    int m_age;
    static int counter;
    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
            this.m_name = name;
            this.m_age = age;
            counter ++;
            if (counter > 5){
                System.out.println("You have too many cats");
            }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return  Cat.counter;
    }
}