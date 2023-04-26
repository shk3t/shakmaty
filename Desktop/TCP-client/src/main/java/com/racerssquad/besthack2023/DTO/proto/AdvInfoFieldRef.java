// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfoFieldRef.proto

package com.racerssquad.besthack2023.DTO.proto;

/**
 * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef}
 */
public final class AdvInfoFieldRef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)
    AdvInfoFieldRefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvInfoFieldRef.newBuilder() to construct.
  private AdvInfoFieldRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvInfoFieldRef() {
    alias_ = "";
    caption_ = "";
    dataType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvInfoFieldRef();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoFieldRef_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoFieldRef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.class, com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.Builder.class);
  }

  private int bitField0_;
  public static final int ALIAS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alias_ = "";
  /**
   * <pre>
   * Идентификатор поля
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Идентификатор поля
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object caption_ = "";
  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return Whether the caption field is set.
   */
  @java.lang.Override
  public boolean hasCaption() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return The caption.
   */
  @java.lang.Override
  public java.lang.String getCaption() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      caption_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return The bytes for caption.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCaptionBytes() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      caption_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATATYPE_FIELD_NUMBER = 3;
  private int dataType_ = 0;
  /**
   * <pre>
   * Тип данных поля
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
   * @return The enum numeric value on the wire for dataType.
   */
  @java.lang.Override public int getDataTypeValue() {
    return dataType_;
  }
  /**
   * <pre>
   * Тип данных поля
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
   * @return The dataType.
   */
  @java.lang.Override public com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType getDataType() {
    com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType result = com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.forNumber(dataType_);
    return result == null ? com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alias_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, caption_);
    }
    if (dataType_ != com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.dtString.getNumber()) {
      output.writeEnum(3, dataType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alias_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, caption_);
    }
    if (dataType_ != com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.dtString.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dataType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)) {
      return super.equals(obj);
    }
    com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef other = (com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef) obj;

    if (!getAlias()
        .equals(other.getAlias())) return false;
    if (hasCaption() != other.hasCaption()) return false;
    if (hasCaption()) {
      if (!getCaption()
          .equals(other.getCaption())) return false;
    }
    if (dataType_ != other.dataType_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    if (hasCaption()) {
      hash = (37 * hash) + CAPTION_FIELD_NUMBER;
      hash = (53 * hash) + getCaption().hashCode();
    }
    hash = (37 * hash) + DATATYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)
      com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoFieldRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoFieldRef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.class, com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.Builder.class);
    }

    // Construct using com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      alias_ = "";
      caption_ = "";
      dataType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoFieldRef_descriptor;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef getDefaultInstanceForType() {
      return com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.getDefaultInstance();
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef build() {
      com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef buildPartial() {
      com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef result = new com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.alias_ = alias_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.caption_ = caption_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataType_ = dataType_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef) {
        return mergeFrom((com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef other) {
      if (other == com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef.getDefaultInstance()) return this;
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCaption()) {
        caption_ = other.caption_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              alias_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              caption_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              dataType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object alias_ = "";
    /**
     * <pre>
     * Идентификатор поля
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор поля
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор поля
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alias_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор поля
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      alias_ = getDefaultInstance().getAlias();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор поля
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alias_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object caption_ = "";
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @return Whether the caption field is set.
     */
    public boolean hasCaption() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @return The caption.
     */
    public java.lang.String getCaption() {
      java.lang.Object ref = caption_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        caption_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @return The bytes for caption.
     */
    public com.google.protobuf.ByteString
        getCaptionBytes() {
      java.lang.Object ref = caption_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        caption_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @param value The caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaption(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      caption_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaption() {
      caption_ = getDefaultInstance().getCaption();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок поля
     * </pre>
     *
     * <code>optional string caption = 2;</code>
     * @param value The bytes for caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      caption_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     * <pre>
     * Тип данных поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
     * @return The enum numeric value on the wire for dataType.
     */
    @java.lang.Override public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <pre>
     * Тип данных поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
     * @param value The enum numeric value on the wire for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeValue(int value) {
      dataType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип данных поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
     * @return The dataType.
     */
    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType getDataType() {
      com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType result = com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.forNumber(dataType_);
      return result == null ? com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Тип данных поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип данных поля
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.DataType dataType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dataType_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)
  }

  // @@protoc_insertion_point(class_scope:com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef)
  private static final com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef();
  }

  public static com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvInfoFieldRef>
      PARSER = new com.google.protobuf.AbstractParser<AdvInfoFieldRef>() {
    @java.lang.Override
    public AdvInfoFieldRef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AdvInfoFieldRef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvInfoFieldRef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

