// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacestation.proto

package proto;

public interface SpaceStationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.SpaceStation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  boolean hasCaptain();
  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  proto.Captain getCaptain();
  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  proto.CaptainOrBuilder getCaptainOrBuilder();

  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  java.util.List<proto.SpaceShip> 
      getSpaceshipsList();
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  proto.SpaceShip getSpaceships(int index);
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  int getSpaceshipsCount();
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  java.util.List<? extends proto.SpaceShipOrBuilder> 
      getSpaceshipsOrBuilderList();
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  proto.SpaceShipOrBuilder getSpaceshipsOrBuilder(
      int index);
}