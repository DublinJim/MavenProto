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

        SpaceStation.Builder stationMaker = SpaceStation.newBuilder();
        SpaceShip.Builder shipMaker = SpaceShip.newBuilder();
        Captain.Builder capMaker = Captain.newBuilder();




      




    }
}
