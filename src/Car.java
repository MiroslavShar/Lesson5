public class Car {
    int a;
    float b;


    public static void main(String[] args) {
        Car km = new Car(48, (float) 8.2);


        System.out.println(km.rasstojanie());
    }

    public Car(int a, float b) {
        this.a = a;
        this.b = b;
    }

    public float rasstojanie() {
        float result = (a / b) * 100;
        return result;
    }
}


