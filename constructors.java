class ClassName{
    int a,b;
    ClassName(int x, int y)
    {
        a=x;
        b=y;
    }

    ClassName(int x)
    {
        a=b=x;
    }

    ClassName()
    {
        a=b=500;
    }
}


public class Constructors
{
        public static void main(String[] args) {
            ClassName myOBj = new ClassName(49,59);
            System.out.println(myOBj.a);
            System.out.println(myOBj.b);

                ClassName obj2 = new ClassName(69);
                System.out.println(obj2.a);
                System.out.println(obj2.b);

                ClassName obj3 = new ClassName();
                System.out.println(obj3.a);
                System.out.println(obj3.b);
        }
}
