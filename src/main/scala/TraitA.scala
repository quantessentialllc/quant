import java.util

import com.ib.client.{CommissionReport, Execution, OrderState, _}

/**
  * Copyright 2016
  *
  * @author albert
  */
trait TraitA extends EWrapper {

  override def bondContractDetails(reqId: Int, contractDetails: ContractDetails): Unit = ???

  override def managedAccounts(accountsList: String): Unit = ???

  override def verifyAndAuthMessageAPI(apiData: String, xyzChallange: String): Unit = ???

  override def displayGroupList(reqId: Int, groups: String): Unit = ???

  override def securityDefinitionOptionalParameter(reqId: Int, exchange: String, underlyingConId: Int, tradingClass: String, multiplier: String, expirations: util.Set[String], strikes: util.Set[java.lang.Double]) = ???

  override def receiveFA(faDataType: Int, xml: String): Unit = ???

  override def tickSnapshotEnd(reqId: Int): Unit = ???

  override def marketDataType(reqId: Int, marketDataType: Int): Unit = ???

  override def verifyCompleted(isSuccessful: Boolean, errorText: String): Unit = ???

  override def scannerDataEnd(reqId: Int): Unit = ???

  override def deltaNeutralValidation(reqId: Int, underComp: DeltaNeutralContract): Unit = ???

  override def execDetailsEnd(reqId: Int): Unit = ???

  override def tickString(tickerId: Int, tickType: Int, value: String): Unit = ???

  override def error(e: Exception): Unit = ???

  override def error(str: String): Unit = ???

  override def error(id: Int, errorCode: Int, errorMsg: String): Unit = ???

  override def tickSize(tickerId: Int, field: Int, size: Int): Unit = ???

  override def accountSummaryEnd(reqId: Int): Unit = ???

  override def currentTime(time: Long): Unit = ???

  override def updateNewsBulletin(msgId: Int, msgType: Int, message: String, origExchange: String): Unit = ???

  override def openOrder(orderId: Int, contract: Contract, order: Order, orderState: OrderState): Unit = ???

  override def positionMultiEnd(reqId: Int): Unit = ???

  override def contractDetailsEnd(reqId: Int): Unit = ???

  override def scannerParameters(xml: String): Unit = ???

  override def contractDetails(reqId: Int, contractDetails: ContractDetails): Unit = ???

  override def connectAck(): Unit = ???

  override def updateAccountTime(timeStamp: String): Unit = ???

  override def connectionClosed(): Unit = ???

  override def verifyAndAuthCompleted(isSuccessful: Boolean, errorText: String): Unit = ???

  override def accountUpdateMulti(reqId: Int, account: String, modelCode: String, key: String, value: String, currency: String): Unit = ???

  override def updateAccountValue(key: String, value: String, currency: String, accountName: String): Unit = ???

  override def positionEnd(): Unit = ???

  override def accountUpdateMultiEnd(reqId: Int): Unit = ???

  override def verifyMessageAPI(apiData: String): Unit = ???

  override def openOrderEnd(): Unit = ???

  override def nextValidId(orderId: Int): Unit = ???

  override def fundamentalData(reqId: Int, data: String): Unit = ???

  override def securityDefinitionOptionalParameterEnd(reqId: Int): Unit = ???

  override def execDetails(reqId: Int, contract: Contract, execution: Execution): Unit = ???

  override def accountDownloadEnd(accountName: String): Unit = ???

  override def accountSummary(reqId: Int, account: String, tag: String, value: String, currency: String): Unit = ???

  override def commissionReport(commissionReport: CommissionReport): Unit = ???

  override def tickPrice(tickerId: Int, field: Int, price: Double, canAutoExecute: Int): Unit = ???

  override def scannerData(reqId: Int, rank: Int, contractDetails: ContractDetails, distance: String, benchmark: String, projection: String, legsStr: String): Unit = ???

  override def displayGroupUpdated(reqId: Int, contractInfo: String): Unit = ???
}
