public class TrainingRoom {

    public void toSeat(Dogs dog) {
        System.out.println(dog.getNickName() + " тренируется выполнять команду \"Сидеть\"");
    }

    public void toFind(Dogs dog) {
        System.out.println(dog.getNickName() + " тренируется выполнять команду \"Искать\"");
    }

    public void toBring(Dogs dog) {
        System.out.println(dog.getNickName() + " тренируется выполнять команду \"Принеси\"");
    }
}
