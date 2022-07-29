// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: searcher.proto

package searchers;

public final class Searcher {
  private Searcher() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SearchRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:searchers.SearchRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string query = 1;</code>
     */
    boolean hasQuery();
    /**
     * <code>required string query = 1;</code>
     */
    java.lang.String getQuery();
    /**
     * <code>required string query = 1;</code>
     */
    com.google.protobuf.ByteString
        getQueryBytes();

    /**
     * <code>optional int32 page_number = 2;</code>
     */
    boolean hasPageNumber();
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    int getPageNumber();

    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    boolean hasResultPerPage();
    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    int getResultPerPage();
  }
  /**
   * Protobuf type {@code searchers.SearchRequest}
   */
  public  static final class SearchRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:searchers.SearchRequest)
      SearchRequestOrBuilder {
    // Use SearchRequest.newBuilder() to construct.
    private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SearchRequest() {
      query_ = "";
      pageNumber_ = 0;
      resultPerPage_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SearchRequest(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              query_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              pageNumber_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              resultPerPage_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return searchers.Searcher.internal_static_searchers_SearchRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return searchers.Searcher.internal_static_searchers_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              searchers.Searcher.SearchRequest.class, searchers.Searcher.SearchRequest.Builder.class);
    }

    private int bitField0_;
    public static final int QUERY_FIELD_NUMBER = 1;
    private volatile java.lang.Object query_;
    /**
     * <code>required string query = 1;</code>
     */
    public boolean hasQuery() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string query = 1;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          query_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string query = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
    private int pageNumber_;
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public boolean hasPageNumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }

    public static final int RESULT_PER_PAGE_FIELD_NUMBER = 3;
    private int resultPerPage_;
    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    public boolean hasResultPerPage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 result_per_page = 3;</code>
     */
    public int getResultPerPage() {
      return resultPerPage_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasQuery()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, pageNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, resultPerPage_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, pageNumber_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, resultPerPage_);
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
      if (!(obj instanceof searchers.Searcher.SearchRequest)) {
        return super.equals(obj);
      }
      searchers.Searcher.SearchRequest other = (searchers.Searcher.SearchRequest) obj;

      boolean result = true;
      result = result && (hasQuery() == other.hasQuery());
      if (hasQuery()) {
        result = result && getQuery()
            .equals(other.getQuery());
      }
      result = result && (hasPageNumber() == other.hasPageNumber());
      if (hasPageNumber()) {
        result = result && (getPageNumber()
            == other.getPageNumber());
      }
      result = result && (hasResultPerPage() == other.hasResultPerPage());
      if (hasResultPerPage()) {
        result = result && (getResultPerPage()
            == other.getResultPerPage());
      }
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
      if (hasQuery()) {
        hash = (37 * hash) + QUERY_FIELD_NUMBER;
        hash = (53 * hash) + getQuery().hashCode();
      }
      if (hasPageNumber()) {
        hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getPageNumber();
      }
      if (hasResultPerPage()) {
        hash = (37 * hash) + RESULT_PER_PAGE_FIELD_NUMBER;
        hash = (53 * hash) + getResultPerPage();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static searchers.Searcher.SearchRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static searchers.Searcher.SearchRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static searchers.Searcher.SearchRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static searchers.Searcher.SearchRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static searchers.Searcher.SearchRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static searchers.Searcher.SearchRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static searchers.Searcher.SearchRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static searchers.Searcher.SearchRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static searchers.Searcher.SearchRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static searchers.Searcher.SearchRequest parseFrom(
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
    public static Builder newBuilder(searchers.Searcher.SearchRequest prototype) {
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
     * Protobuf type {@code searchers.SearchRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:searchers.SearchRequest)
        searchers.Searcher.SearchRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return searchers.Searcher.internal_static_searchers_SearchRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return searchers.Searcher.internal_static_searchers_SearchRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                searchers.Searcher.SearchRequest.class, searchers.Searcher.SearchRequest.Builder.class);
      }

      // Construct using searchers.Searcher.SearchRequest.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        query_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        pageNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        resultPerPage_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return searchers.Searcher.internal_static_searchers_SearchRequest_descriptor;
      }

      public searchers.Searcher.SearchRequest getDefaultInstanceForType() {
        return searchers.Searcher.SearchRequest.getDefaultInstance();
      }

      public searchers.Searcher.SearchRequest build() {
        searchers.Searcher.SearchRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public searchers.Searcher.SearchRequest buildPartial() {
        searchers.Searcher.SearchRequest result = new searchers.Searcher.SearchRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.query_ = query_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.pageNumber_ = pageNumber_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.resultPerPage_ = resultPerPage_;
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
        if (other instanceof searchers.Searcher.SearchRequest) {
          return mergeFrom((searchers.Searcher.SearchRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(searchers.Searcher.SearchRequest other) {
        if (other == searchers.Searcher.SearchRequest.getDefaultInstance()) return this;
        if (other.hasQuery()) {
          bitField0_ |= 0x00000001;
          query_ = other.query_;
          onChanged();
        }
        if (other.hasPageNumber()) {
          setPageNumber(other.getPageNumber());
        }
        if (other.hasResultPerPage()) {
          setResultPerPage(other.getResultPerPage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasQuery()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        searchers.Searcher.SearchRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (searchers.Searcher.SearchRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object query_ = "";
      /**
       * <code>required string query = 1;</code>
       */
      public boolean hasQuery() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string query = 1;</code>
       */
      public java.lang.String getQuery() {
        java.lang.Object ref = query_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            query_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string query = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQueryBytes() {
        java.lang.Object ref = query_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          query_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string query = 1;</code>
       */
      public Builder setQuery(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        query_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string query = 1;</code>
       */
      public Builder clearQuery() {
        bitField0_ = (bitField0_ & ~0x00000001);
        query_ = getDefaultInstance().getQuery();
        onChanged();
        return this;
      }
      /**
       * <code>required string query = 1;</code>
       */
      public Builder setQueryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        query_ = value;
        onChanged();
        return this;
      }

      private int pageNumber_ ;
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public boolean hasPageNumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public int getPageNumber() {
        return pageNumber_;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder setPageNumber(int value) {
        bitField0_ |= 0x00000002;
        pageNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 page_number = 2;</code>
       */
      public Builder clearPageNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pageNumber_ = 0;
        onChanged();
        return this;
      }

      private int resultPerPage_ ;
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public boolean hasResultPerPage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public int getResultPerPage() {
        return resultPerPage_;
      }
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public Builder setResultPerPage(int value) {
        bitField0_ |= 0x00000004;
        resultPerPage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 result_per_page = 3;</code>
       */
      public Builder clearResultPerPage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        resultPerPage_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:searchers.SearchRequest)
    }

    // @@protoc_insertion_point(class_scope:searchers.SearchRequest)
    private static final searchers.Searcher.SearchRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new searchers.Searcher.SearchRequest();
    }

    public static searchers.Searcher.SearchRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SearchRequest>
        PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
      public SearchRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SearchRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SearchRequest> getParserForType() {
      return PARSER;
    }

    public searchers.Searcher.SearchRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_searchers_SearchRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_searchers_SearchRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016searcher.proto\022\tsearchers\"L\n\rSearchReq" +
      "uest\022\r\n\005query\030\001 \002(\t\022\023\n\013page_number\030\002 \001(\005" +
      "\022\027\n\017result_per_page\030\003 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_searchers_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_searchers_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_searchers_SearchRequest_descriptor,
        new java.lang.String[] { "Query", "PageNumber", "ResultPerPage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}