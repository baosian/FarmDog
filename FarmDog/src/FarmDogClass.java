import java.util.ArrayList;




public class FarmDogClass {

    public static void main (String...args){
        Dogs dog1 = new Dogs("Жучка", 2);
        DogEnclosure dE1 = new DogEnclosure(dog1.getNickName());
        Dogs dog2 = new Dogs("Полкан", 4);
        DogEnclosure dE2 = new DogEnclosure(dog2.getNickName());
        Dogs dog3 = new Dogs("Звонкий", 6);
        DogEnclosure dE3 = new DogEnclosure(dog3.getNickName());
        Dogs dog4 = new Dogs("Мэйси", 1);
        DogEnclosure dE4 = new DogEnclosure(dog4.getNickName());
        Dogs dog5 = new Dogs("Гром", 9);
        DogEnclosure dE5 = new DogEnclosure(dog5.getNickName());
        ArrayList<Dogs> dogsList = new ArrayList<>();
        ArrayList<DogEnclosure> enclosures = new ArrayList<>();

        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);
        dogsList.add(dog4);
        dogsList.add(dog5);

        enclosures.add(dE1);
        enclosures.add(dE2);
        enclosures.add(dE3);
        enclosures.add(dE4);
        enclosures.add(dE5);

        Personnel personnel = new Personnel("Эй, ты");
        VetDoctor doctor = new VetDoctor("Айболит");

        for (Dogs dog : dogsList) {
            if (dog.isHungry()) {
                personnel.toFeed(dog);
                dog.setHungry(false);
            }
            System.out.println("Собака " + dog.getNickName() + " накормлена");
        }

        for (Dogs dog: dogsList){

            doctor.toExamine(dog);
        }

        for (DogEnclosure dE : enclosures) {

                personnel.toClean(dE);

        }
        for (Dogs dog: dogsList){
            if (dog.getAge()<=2) personnel.toTrain(dog);
            else if (dog.getAge()>8) personnel.transferTo(dog, "вольер");
                else personnel.transferTo(dog, "милицию");
            dog.setHungry(true);
        }

        for (Dogs dog : dogsList) {
            if (dog.isHungry()) {
                personnel.toFeed(dog);
                dog.setHungry(false);
            }
            System.out.println("Собака " + dog.getNickName() + " накормлена");
        }
    }
}
