// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spacestation.proto

package proto;

/**
 * Protobuf type {@code proto.SpaceStation}
 */
public  final class SpaceStation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.SpaceStation)
    SpaceStationOrBuilder {
  // Use SpaceStation.newBuilder() to construct.
  private SpaceStation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpaceStation() {
    spaceships_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpaceStation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            proto.Captain.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = captain_.toBuilder();
            }
            captain_ = input.readMessage(proto.Captain.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(captain_);
              captain_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              spaceships_ = new java.util.ArrayList<proto.SpaceShip>();
              mutable_bitField0_ |= 0x00000002;
            }
            spaceships_.add(
                input.readMessage(proto.SpaceShip.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        spaceships_ = java.util.Collections.unmodifiableList(spaceships_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.SpaceStationOuter.internal_static_proto_SpaceStation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.SpaceStationOuter.internal_static_proto_SpaceStation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.SpaceStation.class, proto.SpaceStation.Builder.class);
  }

  private int bitField0_;
  public static final int CAPTAIN_FIELD_NUMBER = 1;
  private proto.Captain captain_;
  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  public boolean hasCaptain() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  public proto.Captain getCaptain() {
    return captain_ == null ? proto.Captain.getDefaultInstance() : captain_;
  }
  /**
   * <code>required .proto.Captain captain = 1;</code>
   */
  public proto.CaptainOrBuilder getCaptainOrBuilder() {
    return captain_ == null ? proto.Captain.getDefaultInstance() : captain_;
  }

  public static final int SPACESHIPS_FIELD_NUMBER = 2;
  private java.util.List<proto.SpaceShip> spaceships_;
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  public java.util.List<proto.SpaceShip> getSpaceshipsList() {
    return spaceships_;
  }
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  public java.util.List<? extends proto.SpaceShipOrBuilder> 
      getSpaceshipsOrBuilderList() {
    return spaceships_;
  }
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  public int getSpaceshipsCount() {
    return spaceships_.size();
  }
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  public proto.SpaceShip getSpaceships(int index) {
    return spaceships_.get(index);
  }
  /**
   * <code>repeated .proto.SpaceShip spaceships = 2;</code>
   */
  public proto.SpaceShipOrBuilder getSpaceshipsOrBuilder(
      int index) {
    return spaceships_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasCaptain()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getCaptain().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getSpaceshipsCount(); i++) {
      if (!getSpaceships(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getCaptain());
    }
    for (int i = 0; i < spaceships_.size(); i++) {
      output.writeMessage(2, spaceships_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCaptain());
    }
    for (int i = 0; i < spaceships_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, spaceships_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.SpaceStation)) {
      return super.equals(obj);
    }
    proto.SpaceStation other = (proto.SpaceStation) obj;

    boolean result = true;
    result = result && (hasCaptain() == other.hasCaptain());
    if (hasCaptain()) {
      result = result && getCaptain()
          .equals(other.getCaptain());
    }
    result = result && getSpaceshipsList()
        .equals(other.getSpaceshipsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCaptain()) {
      hash = (37 * hash) + CAPTAIN_FIELD_NUMBER;
      hash = (53 * hash) + getCaptain().hashCode();
    }
    if (getSpaceshipsCount() > 0) {
      hash = (37 * hash) + SPACESHIPS_FIELD_NUMBER;
      hash = (53 * hash) + getSpaceshipsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.SpaceStation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.SpaceStation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.SpaceStation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.SpaceStation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.SpaceStation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.SpaceStation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.SpaceStation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.SpaceStation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.SpaceStation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.SpaceStation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.SpaceStation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.SpaceStation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.SpaceStation)
      proto.SpaceStationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.SpaceStationOuter.internal_static_proto_SpaceStation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.SpaceStationOuter.internal_static_proto_SpaceStation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.SpaceStation.class, proto.SpaceStation.Builder.class);
    }

    // Construct using proto.SpaceStation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCaptainFieldBuilder();
        getSpaceshipsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (captainBuilder_ == null) {
        captain_ = null;
      } else {
        captainBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (spaceshipsBuilder_ == null) {
        spaceships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        spaceshipsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.SpaceStationOuter.internal_static_proto_SpaceStation_descriptor;
    }

    public proto.SpaceStation getDefaultInstanceForType() {
      return proto.SpaceStation.getDefaultInstance();
    }

    public proto.SpaceStation build() {
      proto.SpaceStation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.SpaceStation buildPartial() {
      proto.SpaceStation result = new proto.SpaceStation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (captainBuilder_ == null) {
        result.captain_ = captain_;
      } else {
        result.captain_ = captainBuilder_.build();
      }
      if (spaceshipsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          spaceships_ = java.util.Collections.unmodifiableList(spaceships_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.spaceships_ = spaceships_;
      } else {
        result.spaceships_ = spaceshipsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.SpaceStation) {
        return mergeFrom((proto.SpaceStation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.SpaceStation other) {
      if (other == proto.SpaceStation.getDefaultInstance()) return this;
      if (other.hasCaptain()) {
        mergeCaptain(other.getCaptain());
      }
      if (spaceshipsBuilder_ == null) {
        if (!other.spaceships_.isEmpty()) {
          if (spaceships_.isEmpty()) {
            spaceships_ = other.spaceships_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSpaceshipsIsMutable();
            spaceships_.addAll(other.spaceships_);
          }
          onChanged();
        }
      } else {
        if (!other.spaceships_.isEmpty()) {
          if (spaceshipsBuilder_.isEmpty()) {
            spaceshipsBuilder_.dispose();
            spaceshipsBuilder_ = null;
            spaceships_ = other.spaceships_;
            bitField0_ = (bitField0_ & ~0x00000002);
            spaceshipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpaceshipsFieldBuilder() : null;
          } else {
            spaceshipsBuilder_.addAllMessages(other.spaceships_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasCaptain()) {
        return false;
      }
      if (!getCaptain().isInitialized()) {
        return false;
      }
      for (int i = 0; i < getSpaceshipsCount(); i++) {
        if (!getSpaceships(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.SpaceStation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.SpaceStation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private proto.Captain captain_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Captain, proto.Captain.Builder, proto.CaptainOrBuilder> captainBuilder_;
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public boolean hasCaptain() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public proto.Captain getCaptain() {
      if (captainBuilder_ == null) {
        return captain_ == null ? proto.Captain.getDefaultInstance() : captain_;
      } else {
        return captainBuilder_.getMessage();
      }
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public Builder setCaptain(proto.Captain value) {
      if (captainBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        captain_ = value;
        onChanged();
      } else {
        captainBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public Builder setCaptain(
        proto.Captain.Builder builderForValue) {
      if (captainBuilder_ == null) {
        captain_ = builderForValue.build();
        onChanged();
      } else {
        captainBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public Builder mergeCaptain(proto.Captain value) {
      if (captainBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            captain_ != null &&
            captain_ != proto.Captain.getDefaultInstance()) {
          captain_ =
            proto.Captain.newBuilder(captain_).mergeFrom(value).buildPartial();
        } else {
          captain_ = value;
        }
        onChanged();
      } else {
        captainBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public Builder clearCaptain() {
      if (captainBuilder_ == null) {
        captain_ = null;
        onChanged();
      } else {
        captainBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public proto.Captain.Builder getCaptainBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCaptainFieldBuilder().getBuilder();
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    public proto.CaptainOrBuilder getCaptainOrBuilder() {
      if (captainBuilder_ != null) {
        return captainBuilder_.getMessageOrBuilder();
      } else {
        return captain_ == null ?
            proto.Captain.getDefaultInstance() : captain_;
      }
    }
    /**
     * <code>required .proto.Captain captain = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Captain, proto.Captain.Builder, proto.CaptainOrBuilder> 
        getCaptainFieldBuilder() {
      if (captainBuilder_ == null) {
        captainBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Captain, proto.Captain.Builder, proto.CaptainOrBuilder>(
                getCaptain(),
                getParentForChildren(),
                isClean());
        captain_ = null;
      }
      return captainBuilder_;
    }

    private java.util.List<proto.SpaceShip> spaceships_ =
      java.util.Collections.emptyList();
    private void ensureSpaceshipsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        spaceships_ = new java.util.ArrayList<proto.SpaceShip>(spaceships_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.SpaceShip, proto.SpaceShip.Builder, proto.SpaceShipOrBuilder> spaceshipsBuilder_;

    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public java.util.List<proto.SpaceShip> getSpaceshipsList() {
      if (spaceshipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(spaceships_);
      } else {
        return spaceshipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public int getSpaceshipsCount() {
      if (spaceshipsBuilder_ == null) {
        return spaceships_.size();
      } else {
        return spaceshipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public proto.SpaceShip getSpaceships(int index) {
      if (spaceshipsBuilder_ == null) {
        return spaceships_.get(index);
      } else {
        return spaceshipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder setSpaceships(
        int index, proto.SpaceShip value) {
      if (spaceshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpaceshipsIsMutable();
        spaceships_.set(index, value);
        onChanged();
      } else {
        spaceshipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder setSpaceships(
        int index, proto.SpaceShip.Builder builderForValue) {
      if (spaceshipsBuilder_ == null) {
        ensureSpaceshipsIsMutable();
        spaceships_.set(index, builderForValue.build());
        onChanged();
      } else {
        spaceshipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder addSpaceships(proto.SpaceShip value) {
      if (spaceshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpaceshipsIsMutable();
        spaceships_.add(value);
        onChanged();
      } else {
        spaceshipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder addSpaceships(
        int index, proto.SpaceShip value) {
      if (spaceshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpaceshipsIsMutable();
        spaceships_.add(index, value);
        onChanged();
      } else {
        spaceshipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder addSpaceships(
        proto.SpaceShip.Builder builderForValue) {
      if (spaceshipsBuilder_ == null) {
        ensureSpaceshipsIsMutable();
        spaceships_.add(builderForValue.build());
        onChanged();
      } else {
        spaceshipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder addSpaceships(
        int index, proto.SpaceShip.Builder builderForValue) {
      if (spaceshipsBuilder_ == null) {
        ensureSpaceshipsIsMutable();
        spaceships_.add(index, builderForValue.build());
        onChanged();
      } else {
        spaceshipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder addAllSpaceships(
        java.lang.Iterable<? extends proto.SpaceShip> values) {
      if (spaceshipsBuilder_ == null) {
        ensureSpaceshipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, spaceships_);
        onChanged();
      } else {
        spaceshipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder clearSpaceships() {
      if (spaceshipsBuilder_ == null) {
        spaceships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        spaceshipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public Builder removeSpaceships(int index) {
      if (spaceshipsBuilder_ == null) {
        ensureSpaceshipsIsMutable();
        spaceships_.remove(index);
        onChanged();
      } else {
        spaceshipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public proto.SpaceShip.Builder getSpaceshipsBuilder(
        int index) {
      return getSpaceshipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public proto.SpaceShipOrBuilder getSpaceshipsOrBuilder(
        int index) {
      if (spaceshipsBuilder_ == null) {
        return spaceships_.get(index);  } else {
        return spaceshipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public java.util.List<? extends proto.SpaceShipOrBuilder> 
         getSpaceshipsOrBuilderList() {
      if (spaceshipsBuilder_ != null) {
        return spaceshipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(spaceships_);
      }
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public proto.SpaceShip.Builder addSpaceshipsBuilder() {
      return getSpaceshipsFieldBuilder().addBuilder(
          proto.SpaceShip.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public proto.SpaceShip.Builder addSpaceshipsBuilder(
        int index) {
      return getSpaceshipsFieldBuilder().addBuilder(
          index, proto.SpaceShip.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.SpaceShip spaceships = 2;</code>
     */
    public java.util.List<proto.SpaceShip.Builder> 
         getSpaceshipsBuilderList() {
      return getSpaceshipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.SpaceShip, proto.SpaceShip.Builder, proto.SpaceShipOrBuilder> 
        getSpaceshipsFieldBuilder() {
      if (spaceshipsBuilder_ == null) {
        spaceshipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.SpaceShip, proto.SpaceShip.Builder, proto.SpaceShipOrBuilder>(
                spaceships_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        spaceships_ = null;
      }
      return spaceshipsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.SpaceStation)
  }

  // @@protoc_insertion_point(class_scope:proto.SpaceStation)
  private static final proto.SpaceStation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.SpaceStation();
  }

  public static proto.SpaceStation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SpaceStation>
      PARSER = new com.google.protobuf.AbstractParser<SpaceStation>() {
    public SpaceStation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpaceStation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpaceStation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpaceStation> getParserForType() {
    return PARSER;
  }

  public proto.SpaceStation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
