package abell.model

import java.net.InetAddress

import java.nio.ByteBuffer

import java.util.{Date,UUID}

case class Namespace(
  val name: String,
  val created: Date
)

case class Record(
  val id: UUID,
  val key: String,
  val value: ByteBuffer,
  val size: Long,
  val created: Date,
  val updated: Date
)

case class Node(
  val id: UUID,
  val name: String,
  val addr: InetAddress,
  val port: Int
)
