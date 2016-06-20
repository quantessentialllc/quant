import com.ib.client._

class trying extends EWrapper {

  protected var currentOrderId: Int = -1
  private var readerSignal: EReaderSignal = null
  readerSignal = new EJavaSignal
  clientSocket = new EClientSocket(this, readerSignal)
  private var clientSocket: EClientSocket = null

  def getClient: EClientSocket = {
    clientSocket
  }

  def getSignal: EReaderSignal = {
    readerSignal
  }

  def getCurrentOrderId: Int = currentOrderId

  def tickPrice(tickerId: Int, field: Int, price: Double, canAutoExecute: Int) {
    println("Tick Price. Ticker Id:" + tickerId + ", Field: " + field + ", Price: " + price + ", CanAutoExecute: " + canAutoExecute)
  }

  def tickSize(tickerId: Int, field: Int, size: Int) {
    println("Tick Size. Ticker Id:" + tickerId + ", Field: " + field + ", Size: " + size)
  }

  def tickOptionComputation(tickerId: Int, field: Int, impliedVol: Double, delta: Double, optPrice: Double, pvDividend: Double, gamma: Double, vega: Double, theta: Double, undPrice: Double) {
    println("TickOptionComputation. TickerId: " + tickerId + ", field: " + field + ", ImpliedVolatility: " + impliedVol + ", Delta: " + delta + ", OptionPrice: " + optPrice + ", pvDividend: " + pvDividend + ", Gamma: " + gamma + ", Vega: " + vega + ", Theta: " + theta + ", UnderlyingPrice: " + undPrice)
  }

  def tickGeneric(tickerId: Int, tickType: Int, value: Double) {
    println("Tick Generic. Ticker Id:" + tickerId + ", Field: " + TickType.getField(tickType) + ", Value: " + value)
  }

  def tickString(tickerId: Int, tickType: Int, value: String) {
    println("Tick string. Ticker Id:" + tickerId + ", Type: " + tickType + ", Value: " + value)
  }

  def tickEFP(tickerId: Int, tickType: Int, basisPoints: Double, formattedBasisPoints: String, impliedFuture: Double, holdDays: Int, futureLastTradeDate: String, dividendImpact: Double, dividendsToLastTradeDate: Double) {
    println("TickEFP. " + tickerId + ", Type: " + tickType + ", BasisPoints: " + basisPoints + ", FormattedBasisPoints: " + formattedBasisPoints + ", ImpliedFuture: " + impliedFuture + ", HoldDays: " + holdDays + ", FutureLastTradeDate: " + futureLastTradeDate + ", DividendImpact: " + dividendImpact + ", DividendsToLastTradeDate: " + dividendsToLastTradeDate)
  }

  def orderStatus(orderId: Int, status: String, filled: Double, remaining: Double, avgFillPrice: Double, permId: Int, parentId: Int, lastFillPrice: Double, clientId: Int, whyHeld: String) {
    println("OrderStatus. Id: " + orderId + ", Status: " + status + ", Filled" + filled + ", Remaining: " + remaining + ", AvgFillPrice: " + avgFillPrice + ", PermId: " + permId + ", ParentId: " + parentId + ", LastFillPrice: " + lastFillPrice + ", ClientId: " + clientId + ", WhyHeld: " + whyHeld)
  }

  def openOrder(orderId: Int, contract: Contract, order: Order, orderState: OrderState) {
    println("OpenOrder. ID: " + orderId + ", " + contract.symbol + ", " + contract.secType + " @ " + contract.exchange + ": " + order.action + ", " + order.orderType + " " + order.totalQuantity + ", " + orderState.status)
  }

  def openOrderEnd() {
    println("OpenOrderEnd")
  }

  def updateAccountValue(key: String, value: String, currency: String, accountName: String) {
    println("UpdateAccountValue. Key: " + key + ", Value: " + value + ", Currency: " + currency + ", AccountName: " + accountName)
  }

  def updatePortfolio(contract: Contract, position: Double, marketPrice: Double, marketValue: Double, averageCost: Double, unrealizedPNL: Double, realizedPNL: Double, accountName: String) {
    println("contract = " + contract.toString)
    println("UpdatePortfolio. " + contract.symbol + ", " + contract.secType + " @ " + contract.exchange + ": Position: " + position + ", MarketPrice: " + marketPrice + ", MarketValue: " + marketValue + ", AverageCost: " + averageCost + ", UnrealisedPNL: " + unrealizedPNL + ", RealisedPNL: " + realizedPNL + ", AccountName: " + accountName)
  }

  def updateAccountTime(timeStamp: String) {
    println("UpdateAccountTime. Time: " + timeStamp + "\n")
  }

  def accountDownloadEnd(accountName: String) {
    println("Account download finished: " + accountName + "\n")
  }

  def nextValidId(orderId: Int) {
    println("Next Valid Id: [" + orderId + "]")
    currentOrderId = orderId
  }

  def contractDetails(reqId: Int, contractDetails: ContractDetails) {
    val contract: Contract = contractDetails.contract
    println(contract.toString)
  }

  def bondContractDetails(reqId: Int, contractDetails: ContractDetails) {
    println("bondContractDetails")
  }

  def contractDetailsEnd(reqId: Int) {
    println("ContractDetailsEnd. " + reqId + "\n")
  }

  def execDetails(reqId: Int, contract: Contract, execution: Execution) {
    println("asdfsdf")
    println("ExecDetails. " + reqId + " - [" + contract.symbol + "], [" + contract.secType + "], [" + contract.currency + "], [" + execution.execId + "], [" + execution.orderId + "], [" + execution.shares + "]")
  }

  def execDetailsEnd(reqId: Int) {
    println("ExecDetailsEnd. " + reqId + "\n")
  }

  def updateMktDepth(tickerId: Int, position: Int, operation: Int, side: Int, price: Double, size: Int) {
    println("UpdateMarketDepth. " + tickerId + " - Position: " + position + ", Operation: " + operation + ", Side: " + side + ", Price: " + price + ", Size: " + size + "")
  }

  def updateMktDepthL2(tickerId: Int, position: Int, marketMaker: String, operation: Int, side: Int, price: Double, size: Int) {
    println("updateMktDepthL2")
  }

  def updateNewsBulletin(msgId: Int, msgType: Int, message: String, origExchange: String) {
    println("News Bulletins. " + msgId + " - Type: " + msgType + ", Message: " + message + ", Exchange of Origin: " + origExchange + "\n")
  }

  def managedAccounts(accountsList: String) {
    println("Account list: " + accountsList)
  }

  def receiveFA(faDataType: Int, xml: String) {
    println("Receing FA: " + faDataType + " - " + xml)
  }

  def historicalData(reqId: Int, date: String, open: Double, high: Double, low: Double, close: Double, volume: Int, count: Int, WAP: Double, hasGaps: Boolean) {
    println("HistoricalData. " + reqId + " - Date: " + date + ", Open: " + open + ", High: " + high + ", Low: " + low + ", Close: " + close + ", Volume: " + volume + ", Count: " + count + ", WAP: " + WAP + ", HasGaps: " + hasGaps)
  }

  def scannerParameters(xml: String) {
    println("ScannerParameters. " + xml + "\n")
  }

  def scannerData(reqId: Int, rank: Int, contractDetails: ContractDetails, distance: String, benchmark: String, projection: String, legsStr: String) {
    println("ScannerData. " + reqId + " - Rank: " + rank + ", Symbol: " + contractDetails.contract.symbol + ", SecType: " + contractDetails.contract.secType + ", Currency: " + contractDetails.contract.currency + ", Distance: " + distance + ", Benchmark: " + benchmark + ", Projection: " + projection + ", Legs String: " + legsStr)
  }

  def scannerDataEnd(reqId: Int) {
    println("ScannerDataEnd. " + reqId)
  }

  def realtimeBar(reqId: Int, time: Long, open: Double, high: Double, low: Double, close: Double, volume: Long, wap: Double, count: Int) {
    println("RealTimeBars. " + reqId + " - Time: " + time + ", Open: " + open + ", High: " + high + ", Low: " + low + ", Close: " + close + ", Volume: " + volume + ", Count: " + count + ", WAP: " + wap)
  }

  def currentTime(time: Long) {
    println("currentTime")
  }

  def fundamentalData(reqId: Int, data: String) {
    println("FundamentalData. ReqId: [" + reqId + "] - Data: [" + data + "]")
  }

  def deltaNeutralValidation(reqId: Int, underComp: DeltaNeutralContract) {
    println("deltaNeutralValidation")
  }

  def tickSnapshotEnd(reqId: Int) {
    println("TickSnapshotEnd: " + reqId)
  }

  def marketDataType(reqId: Int, marketDataType: Int) {
    println("MarketDataType. [" + reqId + "], Type: [" + marketDataType + "]\n")
  }

  def commissionReport(commissionReport: CommissionReport) {
    println("CommissionReport. [" + commissionReport.m_execId + "] - [" + commissionReport.m_commission + "] [" + commissionReport.m_currency + "] RPNL [" + commissionReport.m_realizedPNL + "]")
  }

  def position(account: String, contract: Contract, pos: Double, avgCost: Double) {
    println("contract = " + contract.toString)
    println("Position. " + account + " - Symbol: " + contract.symbol + ", SecType: " + contract.secType + ", Currency: " + contract.currency + ", Position: " + pos + ", Avg cost: " + avgCost)
  }

  def positionEnd() {
    println("PositionEnd \n")
  }

  def accountSummary(reqId: Int, account: String, tag: String, value: String, currency: String) {
    println("Acct Summary. ReqId: " + reqId + ", Acct: " + account + ", Tag: " + tag + ", Value: " + value + ", Currency: " + currency)
  }

  def accountSummaryEnd(reqId: Int) {
    println("AccountSummaryEnd. Req Id: " + reqId + "\n")
  }

  def verifyMessageAPI(apiData: String) {
    println("verifyMessageAPI")
  }

  def verifyCompleted(isSuccessful: Boolean, errorText: String) {
    println("verifyCompleted")
  }

  def verifyAndAuthMessageAPI(apiData: String, xyzChallange: String) {
    println("verifyAndAuthMessageAPI")
  }

  def verifyAndAuthCompleted(isSuccessful: Boolean, errorText: String) {
    println("verifyAndAuthCompleted")
  }

  def displayGroupList(reqId: Int, groups: String) {
    println("Display Group List. ReqId: " + reqId + ", Groups: " + groups + "\n")
  }

  def displayGroupUpdated(reqId: Int, contractInfo: String) {
    println("Display Group Updated. ReqId: " + reqId + ", Contract info: " + contractInfo + "\n")
  }

  def error(e: Exception) {
    println("Exception: " + e.getMessage)
  }

  def error(str: String) {
    println("Error STR")
  }

  def error(id: Int, errorCode: Int, errorMsg: String) {
    println("Error. Id: " + id + ", Code: " + errorCode + ", Msg: " + errorMsg + "\n")
  }

  def connectionClosed() {
    println("Connection closed")
  }

  def connectAck() {
    if (clientSocket.isAsyncEConnect) {
      println("Acknowledging connection")
      clientSocket.startAPI
    }
  }

  def positionMulti(reqId: Int, account: String, modelCode: String, contract: Contract, pos: Double, avgCost: Double) {
    println("Position Multi. Request: " + reqId + ", Account: " + account + ", ModelCode: " + modelCode + ", Symbol: " + contract.symbol + ", SecType: " + contract.secType + ", Currency: " + contract.currency + ", Position: " + pos + ", Avg cost: " + avgCost + "\n")
  }

  def positionMultiEnd(reqId: Int) {
    println("Position Multi End. Request: " + reqId + "\n")
  }

  def accountUpdateMulti(reqId: Int, account: String, modelCode: String, key: String, value: String, currency: String) {
    println("Account Update Multi. Request: " + reqId + ", Account: " + account + ", ModelCode: " + modelCode + ", Key: " + key + ", Value: " + value + ", Currency: " + currency + "\n")
  }

  def accountUpdateMultiEnd(reqId: Int) {
    println("Account Update Multi End. Request: " + reqId + "\n")
  }

  def securityDefinitionOptionalParameter(reqId: Int, exchange: String, underlyingConId: Int, tradingClass: String, multiplier: String, expirations: util.Set[String], strikes: util.Set[Double]) {
    println("Security Definition Optional Parameter. Request: " + reqId + ", Trading Class: " + tradingClass + ", Multiplier: " + multiplier + " \n")
  }

  def securityDefinitionOptionalParameterEnd(reqId: Int) {
  }
}
