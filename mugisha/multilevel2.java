class Check{

public static void main(String args[]) {
Puppy d=new Puppy();

d.weep();
d.bark();
d.eat();

}
}
class Pets
{

void eat()
{
    System.out.println("eat");
}
}

class Dog extends Pets 
{

void bark()
{
    System.out.println("bark");
}
}

class Puppy extends Dog
{

void weep()
{
    System.out.println("weep\n");
}
}

