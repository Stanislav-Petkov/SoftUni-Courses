package domain.commands;

import domain.external.CurrencyValidator;
import domain.external.ExchangeService;
import domain.io.Logger;
import domain.repository.ConversionHistoryRepository;

public class ValidatedHistorySavingConvertCommand extends HistorySavingConvertCommand {

    private CurrencyValidator validator;
    private final Input input;

    public ValidatedHistorySavingConvertCommand(ExchangeService exchangeService,
                                                Logger logger,
                                                ConversionHistoryRepository repo,
                                                CurrencyValidator validator,
                                                Input input) {
        super(exchangeService, logger, repo, input);
        this.validator = validator;
        this.input = input;
    }

    @Override
    public void execute() {
        validator.validate(input.getFrom().getCurrency());
        validator.validate(input.getToCurrency());
        super.execute();
    }
}
