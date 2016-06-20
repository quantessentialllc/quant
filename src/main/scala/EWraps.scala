import com.ib.client.Contract
/**
  * Copyright 2016
  *
  * @author albert
  */
class EWraps extends TraitA {

  override def updateMktDepthL2(tickerId: Int, position: Int, marketMaker: String, operation: Int, side: Int, price: Double, size: Int): Unit = ???

  override def position(account: String, contract: Contract, pos: Double, avgCost: Double): Unit = ???

  override def orderStatus(orderId: Int, status: String, filled: Double, remaining: Double, avgFillPrice: Double, permId: Int, parentId: Int, lastFillPrice: Double, clientId: Int, whyHeld: String): Unit = ???

  override def tickOptionComputation(tickerId: Int, field: Int, impliedVol: Double, delta: Double, optPrice: Double, pvDividend: Double, gamma: Double, vega: Double, theta: Double, undPrice: Double): Unit = ???

  override def updateMktDepth(tickerId: Int, position: Int, operation: Int, side: Int, price: Double, size: Int): Unit = ???

  override def realtimeBar(reqId: Int, time: Long, open: Double, high: Double, low: Double, close: Double, volume: Long, wap: Double, count: Int): Unit = ???

  override def tickGeneric(tickerId: Int, tickType: Int, value: Double): Unit = ???

  override def updatePortfolio(contract: Contract, position: Double, marketPrice: Double, marketValue: Double, averageCost: Double, unrealizedPNL: Double, realizedPNL: Double, accountName: String): Unit = ???

  override def tickEFP(tickerId: Int, tickType: Int, basisPoints: Double, formattedBasisPoints: String, impliedFuture: Double, holdDays: Int, futureLastTradeDate: String, dividendImpact: Double, dividendsToLastTradeDate: Double): Unit = ???

  override def historicalData(reqId: Int, date: String, open: Double, high: Double, low: Double, close: Double, volume: Int, count: Int, WAP: Double, hasGaps: Boolean): Unit = ???

  override def positionMulti(reqId: Int, account: String, modelCode: String, contract: Contract, pos: Double, avgCost: Double): Unit = ???

  override def tickPrice(tickerId: Int, field: Int, price: Double, canAutoExecute: Int): Unit = ???

}
