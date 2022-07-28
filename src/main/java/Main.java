import proto.Captain;
import proto.Captain.RaceType;
import proto.SpaceStationOuter;

public class Main {

    public static void main(String[] args) {
        Captain.Builder builder = Captain.newBuilder().setName("Joe").setRace(RaceType.VULCAN);


        System.out.println(builder.getName());
    }
}
