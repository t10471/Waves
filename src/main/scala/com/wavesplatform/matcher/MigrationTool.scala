package com.wavesplatform.matcher

import com.google.common.base.Charsets.UTF_8

object MigrationTool {
  private val OrdersPrefix                = "orders".getBytes(UTF_8)
  private val OrdersInfoPrefix            = "infos".getBytes(UTF_8)
  private val AddressToOrdersPrefix       = "addr-orders".getBytes(UTF_8)
  private val AddressToActiveOrdersPrefix = "a-addr-orders".getBytes(UTF_8)
  private val AddressPortfolioPrefix      = "portfolios".getBytes(UTF_8)
  private val TransactionsPrefix          = "transactions".getBytes(UTF_8)
  private val OrdersToTxIdsPrefix         = "ord-to-tx-ids".getBytes(UTF_8)

  def main(args: Array[String]): Unit = {}
}
