class GoodDog {

    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size =s;
    }


    void bark(){
        if (size < 60){
            System.out.printf("Woof-Woof");
        }else if (size < 14){
            System.out.printf("Ruff-Ruuf");
        }else {
            System.out.println("Yiup-Yiup");
        }


    }

}

class GoodDogTestDrive{

public static void main (String[]args) {
    GoodDog one = new GoodDog();
    one.setSize(70);

    GoodDog two = new GoodDog();
    two.setSize(8);

    System.out.println("Dog one:" + one.getSize());
    System.out.println("Dog two:" + two.getSize());

    one.bark();
    two.bark();

}
}
