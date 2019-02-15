public class VetDoctor {
    private String name;

    public VetDoctor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toTreat(Dogs dog){
        System.out.println("Собака " + dog.getNickName() + " вылечена");
        dog.setHealthy(true);
    }

    public void toExamine(Dogs dog){
        System.out.println("Собака " + dog.getNickName() + " осмотрена");
        if (!dog.isHealthy()) {
            toTreat(dog);
        }
        System.out.println("Собака " + dog.getNickName() + " здорова");
    }
}
