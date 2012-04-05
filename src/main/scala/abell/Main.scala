package abell

import org.apache.zookeeper.server.quorum.QuorumPeerMain

object Main extends App {
  (new Thread() {
    override def run() {
      val zkConfigFile = "zoo.cfg"
      QuorumPeerMain.main(Array(zkConfigFile))
    }
  }).start

  println("Zookeeper Started")
}
