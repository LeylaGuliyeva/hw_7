package Hw7;

public class Fish extends Pet implements Foulable {
    public Fish() {
        super();
    }
    public Fish(String nickname) {
        super(nickname);}

    public Fish(String nickname, int age, int trickLevel, String habits[]) {
            super(nickname, age, trickLevel, habits);
        }

        @Override
        public void respond() {
            System.out.println("Hi my dear friend, my name is "+this.nickname+" and I am a fish");
        }


    }
