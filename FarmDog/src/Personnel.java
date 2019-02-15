public class Personnel {
    private String name;

    public Personnel(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toFeed(Dogs dog){
        if (dog.getAge()>0 &&dog.getAge()<=2) System.out.println("Насыпать корм для щенков собаке " + dog.getNickName());
        if (dog.getAge()>2 && dog.getAge()<=8) System.out.println("Насыпать корм для взрослых собак собаке " + dog.getNickName());
        if (dog.getAge()>8) System.out.println("Насыпать корм для пожилых собак собаке " + dog.getNickName());
    }

    public void toClean(DogEnclosure dogEnclosure) {
        dogEnclosure.setCleaned(true);
        System.out.println("Вольер собаки " + dogEnclosure.getDogNicknameTag() + " почищен");
    }

    public void toTrain(Dogs dog) {
        System.out.println(dog.getNickName() + " тренируется");
        TrainingRoom trainingRoom = new TrainingRoom();
        trainingRoom.toBring(dog);
        trainingRoom.toFind(dog);
        trainingRoom.toSeat(dog);
    }

    public void transferTo(Dogs dog, String workSpace) {
        System.out.println(dog.getNickName() + " отправлена в " + workSpace);
    }


}
