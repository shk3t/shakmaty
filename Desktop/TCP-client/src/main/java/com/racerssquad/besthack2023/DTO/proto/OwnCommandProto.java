// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OwnCommand.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class OwnCommandProto {
  private OwnCommandProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_OwnCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_OwnCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020OwnCommand.proto\022&com.racerssquad.best" +
      "hack2023.DTO.proto\032\017Parameter.proto\"\256\001\n\n" +
      "OwnCommand\022\r\n\005alias\030\001 \001(\t\022\024\n\007caption\030\002 \001" +
      "(\tH\000\210\001\001\022\030\n\013description\030\003 \001(\tH\001\210\001\001\022E\n\npar" +
      "ameters\030\004 \003(\01321.com.racerssquad.besthack" +
      "2023.DTO.proto.ParameterB\n\n\010_captionB\016\n\014" +
      "_descriptionB\025B\017OwnCommandProtoH\001P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.ParameterProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_OwnCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_OwnCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_OwnCommand_descriptor,
        new java.lang.String[] { "Alias", "Caption", "Description", "Parameters", "Caption", "Description", });
    com.racerssquad.besthack2023.DTO.proto.ParameterProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}