import com.ib.client.Contract;

/**
 * Don't Ask Don't Tell.
 */
public class RfqContract extends Contract {

    RfqContract(int conId) {
        conid(conId);
        String symbol = "GOOG";
        symbol(symbol);
        String securityType = "OPT";
        secType(securityType);
        String exchange = "BOX";
        exchange(exchange);
        String currencyType = "USD";
        currency(currencyType);
        String contractMonth = "20170120";
        lastTradeDateOrContractMonth(contractMonth);
        int strikePrice = 615;
        strike(strikePrice);
        String cOrP = "C";
        right(cOrP);
        String mulitplier = "100";
        multiplier(mulitplier);
    }
}
