package console;

import domain.commands.*;
import domain.entities.Money;
import domain.external.CurrencyValidator;
import domain.external.ExchangeService;
import domain.io.Logger;
import domain.repository.ConversionHistoryRepository;

import java.math.BigDecimal;

public class ConsoleCommandExecutor {

    private ConversionHistoryRepository conversionHistoryRepository;
    private Logger logger;
    private ExchangeService exchangeService;
    private CurrencyValidator currencyValidator;

    public ConsoleCommandExecutor(
            ConversionHistoryRepository conversionHistoryRepository,
            Logger logger,
            ExchangeService exchangeService,
            CurrencyValidator currencyValidator) {
        this.conversionHistoryRepository = conversionHistoryRepository;
        this.logger = logger;
        this.exchangeService = exchangeService;
        this.currencyValidator = currencyValidator;
    }

    public void execute(String[] args) {
        switch (args[0]) {
            case "END":
                end();
                break;
            case "CONVERT":
                convert(args);
                break;
            case "HISTORY":
                history(args);
                break;
            default:
                logger.logLine("incorrect command");
        }
    }

    private void end() {
        new EndCommand().execute();
    }

    private void convert(String[] split) {
        BigDecimal fromValue = new BigDecimal(split[1]);
        String fromCurrency = split[2];
        String toCurrency = split[3];

        ConvertCommand.Input input = new ConvertCommand.Input(
                new Money(fromValue, fromCurrency),
                toCurrency);
        new ValidatedHistorySavingConvertCommand(
                exchangeService,
                logger,
                conversionHistoryRepository,
                currencyValidator,
                input).execute();
    }

    private void history(String[] split) {
        HistoryCommand.Input input = new HistoryCommand.Input(Integer.parseInt(split[1]));
        Command cmd = new HistoryCommand(conversionHistoryRepository, logger, input);
        cmd.execute();
    }
}
