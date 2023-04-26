// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfo.proto

package com.racerssquad.besthack2023.DTO.proto;

public interface AdvInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.racerssquad.besthack2023.DTO.proto.AdvInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Заголовок
   * </pre>
   *
   * <code>string caption = 1;</code>
   * @return The caption.
   */
  java.lang.String getCaption();
  /**
   * <pre>
   * Заголовок
   * </pre>
   *
   * <code>string caption = 1;</code>
   * @return The bytes for caption.
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef fields = 2;</code>
   */
  java.util.List<com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef> 
      getFieldsList();
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef fields = 2;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef getFields(int index);
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef fields = 2;</code>
   */
  java.util.List<? extends com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Список описания полей
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRef fields = 2;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.AdvInfoFieldRefOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .com.racerssquad.besthack2023.DTO.proto.AdvInfoData data = 3;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .com.racerssquad.besthack2023.DTO.proto.AdvInfoData data = 3;</code>
   * @return The data.
   */
  com.racerssquad.besthack2023.DTO.proto.AdvInfoData getData();
  /**
   * <pre>
   * Данные
   * </pre>
   *
   * <code>optional .com.racerssquad.besthack2023.DTO.proto.AdvInfoData data = 3;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.AdvInfoDataOrBuilder getDataOrBuilder();
}
