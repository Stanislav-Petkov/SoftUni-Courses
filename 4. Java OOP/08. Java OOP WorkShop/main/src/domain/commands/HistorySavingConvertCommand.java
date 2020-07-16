package domain.commands;

import domain.entities.Money;
import domain.external.ExchangeService;
import domain.io.Logger;
import domain.repository.ConversionHistoryRepository;

public class HistorySavingConvertCommand extends ConvertCommand {

    private final ConversionHistoryRepository repo;
    private final Input input;

    public HistorySavingConvertCommand(ExchangeService exchangeService,
                                       Logger logger,
                                       ConversionHistoryRepository repo,
                                       Input input) {
        super(exchangeService, logger, input);
        this.repo = repo;
        this.input = input;
    }

    @Override
    public void execute() {
        Money converted = exchangeAndLog(input);
        repo.save(input.getFrom(), converted);
    }
}








