import com.ib.client.EReader
import testbed.EWrapperImpl

object HotBed {

  def main(args: Array[String]) {
    val wrapper = new EWrapperImpl()
    val m_client = wrapper.getClient
    val m_signal = wrapper.getSignal

    m_client.eConnect("127.0.0.1", 7497, 0)

    val reader = new EReader(m_client, m_signal)

    reader.start()

    new Thread() {
      override def run() {
        while (m_client.isConnected) {
          m_signal.waitForSignal()
          try {
            reader.processMsgs()
          }
          catch {
            case e: Exception =>
              System.out.println("Exception: " + e.getMessage)
          }
        }
      }
    }.start()
    wrapper.getClient.reqAccountUpdates(true, "U1592819")
    Thread.sleep(1000)
    m_client.eDisconnect()
  }

}