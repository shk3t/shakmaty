// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfo.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class AdvInfoProto {
  private AdvInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rAdvInfo.proto\022&com.racerssquad.besthac" +
      "k2023.DTO.proto\032\021AdvInfoData.proto\032\025AdvI" +
      "nfoFieldRef.proto\"\264\001\n\007AdvInfo\022\017\n\007caption" +
      "\030\001 \001(\t\022G\n\006fields\030\002 \003(\01327.com.racerssquad" +
      ".besthack2023.DTO.proto.AdvInfoFieldRef\022" +
      "F\n\004data\030\003 \001(\01323.com.racerssquad.besthack" +
      "2023.DTO.proto.AdvInfoDataH\000\210\001\001B\007\n\005_data" +
      "B\022B\014AdvInfoProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfo_descriptor,
        new java.lang.String[] { "Caption", "Fields", "Data", "Data", });
    com.racerssquad.besthack2023.DTO.proto.AdvInfoDataProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
