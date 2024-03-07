package javaa;

abstract class Actor {
    abstract void act();
}
class HappyActor extends Actor {
    public void act() { }
}
class SadActor extends Actor {
    public void act() { }
}
class Stage {
    Actor a = new HappyActor();
    void change() { 
        a = new SadActor(); 
    }
    void go() { 
        a.act();
    }
}
public class Transmogrify {
    public static void main(String[] args){
       Stage s = new Stage();
       s.go(); //happy actor
       s.change();
       s.go(); // sad actor
    }
}