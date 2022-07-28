import proto.Captain;
import proto.Captain.RaceType;
import proto.SpaceShip;
import proto.SpaceStation;

public class Main {

    public static void main(String[] args) {
        Captain.Builder builder = Captain.newBuilder();

        Captain joe = builder
            .setName("Joe")
            .setRace(RaceType.VULCAN)
            .build();

        System.out.println(joe.getName());
        SpaceStation.Builder ds9 = SpaceStation.newBuilder();

        System.out.println(ds9.getCaptain());
        SpaceShip.Builder boeing = SpaceShip.newBuilder();
        boeing.setCrew(3).setCargo("gold").setName("Orion").build();

        ds9.setCaptain(joe).addSpaceships(boeing).build();

        System.out.println( ds9);
    }
}
