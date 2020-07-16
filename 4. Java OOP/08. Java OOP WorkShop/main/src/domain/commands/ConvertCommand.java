package domain.commands;

import domain.entities.Money;
import domain.external.ExchangeService;
import domain.io.Logger;

public class ConvertCommand implements Command {
    private final ExchangeService exchangeService;
    private final Logger logger;
    private final Input input;

    public ConvertCommand(ExchangeService exchangeService,
                          Logger logger,
                          Input input) {
        this.exchangeService = exchangeService;
        this.logger = logger;
        this.input = input;
    }

    @Override
    public void execute() {
        exchangeAndLog(input);
    }

    protected Money exchangeAndLog(Input input) {
        Money converted = exchangeService.exchange(input.from, input.toCurrency);
        logger.logLine(converted.toString());
        return converted;
    }

    public static class Input extends EmptyInput {
        private final Money from;
        private final String toCurrency;

        public Input(Money from, String toCurrency) {
            this.from = from;
            this.toCurrency = toCurrency;
        }

        public Money getFrom() {
            return from;
        }

        public String getToCurrency() {
            return toCurrency;
        }
    }
}
